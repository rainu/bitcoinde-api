package de.rainu.bitcoinde;

import de.rainu.bitcoinde.auth.ApiSignatureBuilder;
import java.util.AbstractMap.SimpleEntry;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.ws.rs.core.GenericType;
import org.glassfish.jersey.filter.LoggingFilter;
import org.joda.time.DateTime;
import org.joda.time.format.ISODateTimeFormat;

public class BitcoinApi extends ApiClient {
  private static final Logger LOGGER = Logger.getLogger(BitcoinApi.class.getName());

  private static final String HEADER_API_KEY = "X-API-KEY";
  private static final String HEADER_API_NONCE = "X-API-NONCE";
  private static final String HEADER_API_SIGNATURE = "X-API-SIGNATURE";

  private final String apiKey;
  private final String apiSecret;

  public BitcoinApi(final String apiKey, final String apiSecret){
    this.apiKey = apiKey;
    this.apiSecret = apiSecret;
    this.getHttpClient().register(new LoggingFilter(LOGGER, true));
  }

  @Override
  public String parameterToString(Object param) {
    //fix issue with dateTime converting!
    if(param instanceof DateTime) {
      return ((DateTime)param).toString(ISODateTimeFormat.dateTimeNoMillis());
    }else {
      return super.parameterToString(param);
    }
  }

  @Override
  public <T> T invokeAPI(String path, String method, List<Pair> queryParams, Object body,
      Map<String, String> headerParams, Map<String, Object> formParams, String accept,
      String contentType, String[] authNames, GenericType<T> returnType) throws ApiException {

    //enrich Header
    enrichHeader(method, path, queryParams, formParams, headerParams);

    return super.invokeAPI(
        path, method, queryParams, body,
        headerParams, formParams, accept, contentType,
        authNames, returnType);
  }

  private void enrichHeader(String method, String path, List<Pair> queryParams,
      Map<String, Object> formParams,
      Map<String, String> headerParams) {

    final long nonce = DateTime.now().getMillis();
    final String uri = getBasePath() + path;
    final LinkedHashMap collectedGetParams = queryParams.stream()
        .collect(Collectors.toMap(
            p -> p.getName(),
            p -> p.getValue(),
            (oldValue, newValue) -> oldValue,
            LinkedHashMap::new));

    //at this point: form parameters are not serialized (for the signature we need to serialize them)
    final Map<String, String> serializedFormParameters = formParams.entrySet().stream()
        .map(e -> new SimpleEntry<String, String>(e.getKey(), parameterToString(e.getValue())))
        .collect(Collectors.toMap(
            e -> e.getKey(),
            e -> e.getValue(),
            (oldValue, newValue) -> oldValue,
            HashMap::new));

    final String signature = new ApiSignatureBuilder()
        .buildSignature(method, uri, collectedGetParams, serializedFormParameters, apiKey, apiSecret, nonce);

    headerParams.put(HEADER_API_KEY, apiKey);
    headerParams.put(HEADER_API_NONCE, String.valueOf(nonce));
    headerParams.put(HEADER_API_SIGNATURE, signature);
  }
}
