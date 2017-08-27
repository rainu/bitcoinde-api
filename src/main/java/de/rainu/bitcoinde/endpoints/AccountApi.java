package de.rainu.bitcoinde.endpoints;

import de.rainu.bitcoinde.ApiException;
import de.rainu.bitcoinde.ApiClient;
import de.rainu.bitcoinde.Configuration;
import de.rainu.bitcoinde.Pair;

import javax.ws.rs.core.GenericType;

import org.joda.time.DateTime;
import de.rainu.bitcoinde.model.InlineResponse20010;
import de.rainu.bitcoinde.model.InlineResponse2006;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T13:21:29.350+02:00")
public class AccountApi {
  private ApiClient apiClient;

  public AccountApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AccountApi(ApiClient apiClient) {
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
   * Abruf von Account Infos
   * @return InlineResponse2006
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2006 showAccountInfo() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/account".replaceAll("\\{format\\}","json");

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

    GenericType<InlineResponse2006> localVarReturnType = new GenericType<InlineResponse2006>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Abruf des Kontoauszuges Bitte beachten Sie, dass im Kontoauzug nur Transaktionen aufgelistet werden, die bis zum Vortag ausgeführt wurden. Transaktionen von heute sind also erst morgen im Kontoauszug aufgeführt.
   * @param type Positions-Typ (optional, default to all)
   * @param datetimeStart Buchungsdatum, ab dem die Positionen aufgelistet werden. Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00). (optional, default to akt. Datum -10 Tage)
   * @param datetimeEnd Buchungsdatum, bis zu dem die Positionen aufgelistet werden. Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00). (optional, default to akt. Datum -1 Tag)
   * @param page Seitenzahl zum Blättern innerhalb der Ergebnisseiten (optional, default to 1)
   * @return InlineResponse20010
   * @throws ApiException if fails to make API call
   */
  public InlineResponse20010 showAccountLedger(String type, DateTime datetimeStart, DateTime datetimeEnd, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/account/ledger".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetime_start", datetimeStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "datetime_end", datetimeEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiSignature", "apiKey", "apiNonce" };

    GenericType<InlineResponse20010> localVarReturnType = new GenericType<InlineResponse20010>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
