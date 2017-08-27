package de.rainu.bitcoinde.auth;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.junit.Test;

public class ApiSignatureBuilderTest {

  @Test
  public void buildSignaturePost() throws Exception {
    //given
    Map<String, Object> postParameter = new HashMap<>();
    postParameter.put("type", "buy");
    postParameter.put("max_amount", 5.3);
    postParameter.put("price", 255.50);

    String apiKey = "MY_API_KEY";
    Long nonce = 1234567L;
    String apiSecret = "MY_API_SECRET";
    String httpMethod = "POST";
    String uri = "https://api.bitcoin.de/v1/orders";

    //when
    final String result = new ApiSignatureBuilder().buildSignature(httpMethod, uri,
        new LinkedHashMap<>(), postParameter, apiKey, apiSecret, nonce);

    //then
    assertEquals("fd7c4c3af90524af1723bf89773904f87afdeaab2b87161799ee65f864aa9e96", result);
  }

  @Test
  public void buildSignatureGet() throws Exception {
    //given
    LinkedHashMap<String, Object> getParameter = new LinkedHashMap<>();
    getParameter.put("type", "buy");
    getParameter.put("amount", 5.3);
    getParameter.put("price", 255.50);

    String apiKey = "MY_API_KEY";
    Long nonce = 1234567L;
    String apiSecret = "MY_API_SECRET";
    String httpMethod = "GET";
    String uri = "https://api.bitcoin.de/v1/orders";

    //when
    final String result = new ApiSignatureBuilder().buildSignature(httpMethod, uri,
        getParameter, Collections.emptyMap(), apiKey, apiSecret, nonce);

    //then
    assertEquals("d4222390f524969b72ebe817409019067968614ad8ff45c27f203e2755a5042f", result);
  }
}