package de.rainu.bitcoinde.endpoints;

import de.rainu.bitcoinde.ApiClient;
import de.rainu.bitcoinde.ApiException;
import de.rainu.bitcoinde.Configuration;
import de.rainu.bitcoinde.Pair;
import de.rainu.bitcoinde.model.ShowRatesResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T15:01:02.402+02:00")
public class RatesApi {
  private ApiClient apiClient;

  public RatesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RatesApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * 
   * Abfrage des gewichteten Durchschnittskurses der letzten 3 Stunden und der letzten 12 Stunden.
   * @return ShowRatesResponse
   * @throws ApiException if fails to make API call
   */
  public ShowRatesResponse showRates() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/rates".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiSignature", "apiKey", "apiNonce" };

    GenericType<ShowRatesResponse> localVarReturnType = new GenericType<ShowRatesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
