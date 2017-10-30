package de.rainu.bitcoinde.auth;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.net.URLEncoder;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Formatter;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.stream.Collectors;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class ApiSignatureBuilder {

  /**
   * Die Signatur repräsentiert eine HMAC-SHA256 verschlüsselte Nachricht, welche
   * <ul>
   *   <li>die HTTP-Methode,</li>
   *   <li>die aufzurufende URI,</li>
   *   <li>Ihren API-Key,</li>
   *   <li>das Nonce,</li>
   *   <li>als auch mögliche POST-Parameter</li>
   * </ul>
   * beinhaltet und mit Ihrem API-Secret verschlüsselt wird.
   * Es wird die hexadezimale Repräsentation des HMACs in Kleinschreibung benötigt!
   */
  public String buildSignature(String method, String uri,
      LinkedHashMap<String, ?> getParameters, Map<String, ?> postParameters,
      String apiKey, String apiSecret, Long nonce){

    String md5mergedPostParameters = "d41d8cd98f00b204e9800998ecf8427e";  //md5 hash of "" (empty string)

    if(postParameters != null && !postParameters.isEmpty()) {
      SortedMap<String, Object> sortedPostParameters = sortByName(postParameters);
      String mergedPostParameters = concatParamters(sortedPostParameters);
      md5mergedPostParameters = md5(mergedPostParameters);
    }

    if(getParameters != null && !getParameters.isEmpty()) {
      String mergedGetParameters = concatParamters(getParameters);
      uri = uri + "?" + mergedGetParameters;
    }
    String hmacData = concat("#", method, uri, apiKey, nonce, md5mergedPostParameters);
    String hmac = genHmac(hmacData, apiSecret);

    return hmac;
  }

  private SortedMap<String, Object> sortByName(Map<String, ?> parameter) {
    return parameter.entrySet().stream()
        .sorted(Map.Entry.comparingByKey())
        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
            (oldValue, newValue) -> oldValue, TreeMap::new));
  }

  private String concatParamters(Map<String, ?> parameters) {
    return parameters.entrySet().stream()
        .map(this::urlEncode)
        .collect(Collectors.joining("&"));
  }

  private String urlEncode(Entry<String, ?> entry) {
    try {
      return entry.getKey() + "=" + URLEncoder.encode(String.valueOf(entry.getValue()), "UTF-8");
    } catch (UnsupportedEncodingException e) {
      throw new IllegalStateException("UTF-8 should be wel known!", e);
    }
  }

  private synchronized String md5(String...values) {
    MessageDigest md5 = null;
    try {
      md5 = MessageDigest.getInstance("MD5");
    } catch (NoSuchAlgorithmException e) {
      throw new IllegalStateException("MD5-Algorithm should be well known!", e);
    }

    for(String value : values){
      md5.update(value.getBytes());
    }

    BigInteger bigInt = new BigInteger(1, md5.digest());
    String hashtext = bigInt.toString(16);

    // Now we need to zero pad it if you actually want the full 32 chars.
    while(hashtext.length() < 32 ){
      hashtext = "0"+hashtext;
    }

    return hashtext.toLowerCase();
  }

  private String concat(String glue, Object...values) {
    return Arrays.asList(values).stream()
        .map(String::valueOf)
        .collect(Collectors.joining(glue));
  }

  private String genHmac(String hmacData, String apiSecret) {
    try {
      Mac hmac = Mac.getInstance("HmacSHA256");
      SecretKeySpec secret_key = new SecretKeySpec(apiSecret.getBytes("UTF-8"), "HmacSHA256");
      hmac.init(secret_key);

      return toHexString(hmac.doFinal(hmacData.getBytes("UTF-8")));
    } catch (NoSuchAlgorithmException e) {
      throw new IllegalStateException("The hmac-sha256 algorithm should be well known!", e);
    } catch (UnsupportedEncodingException e) {
      throw new IllegalStateException("The utf-8 encoding should be well known!", e);
    } catch (InvalidKeyException e) {
      throw new IllegalStateException("The key should be valid!", e);
    }
  }

  private static String toHexString(byte[] bytes) {
    Formatter formatter = new Formatter();
    for (byte b : bytes) {
      formatter.format("%02x", b);
    }
    return formatter.toString();
  }
}
