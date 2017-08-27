package de.rainu.bitcoinde.endpoints;

import de.rainu.bitcoinde.ApiClient;
import de.rainu.bitcoinde.ApiException;
import de.rainu.bitcoinde.Configuration;
import de.rainu.bitcoinde.Pair;
import de.rainu.bitcoinde.model.ExecuteTradeResponse;
import de.rainu.bitcoinde.model.ShowMyTradeDetailsResponse;
import de.rainu.bitcoinde.model.ShowMyTradesResponse;
import de.rainu.bitcoinde.model.ShowPublicTradeHistoryResponse;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;
import org.joda.time.DateTime;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T15:01:02.402+02:00")
public class TradesApi {
  private ApiClient apiClient;

  public TradesApi() {
    this(Configuration.getDefaultApiClient());
  }

  public TradesApi(ApiClient apiClient) {
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
   * Kaufen/Verkaufen einer konkreten Order
   * @param tradeId ID des Angebots. (required)
   * @param type Angebots-Typ (required)
   * @param amount Menge der Bitcoins (required)
   * @return ExecuteTradeResponse
   * @throws ApiException if fails to make API call
   */
  public ExecuteTradeResponse executeTrade(String tradeId, String type, Float amount) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tradeId' is set
    if (tradeId == null) {
      throw new ApiException(400, "Missing the required parameter 'tradeId' when calling executeTrade");
    }
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling executeTrade");
    }
    
    // verify the required parameter 'amount' is set
    if (amount == null) {
      throw new ApiException(400, "Missing the required parameter 'amount' when calling executeTrade");
    }
    
    // create path and map variables
    String localVarPath = "/trades/{trade_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trade_id" + "\\}", apiClient.escapeString(tradeId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (type != null)
      localVarFormParams.put("type", type);
if (amount != null)
      localVarFormParams.put("amount", amount);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiSignature", "apiKey", "apiNonce" };

    GenericType<ExecuteTradeResponse> localVarReturnType = new GenericType<ExecuteTradeResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Details eines meiner Trades abrufen
   * @param tradeId ID des abzufragendenden Trades (required)
   * @return ShowMyTradeDetailsResponse
   * @throws ApiException if fails to make API call
   */
  public ShowMyTradeDetailsResponse showMyTradeDetails(String tradeId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'tradeId' is set
    if (tradeId == null) {
      throw new ApiException(400, "Missing the required parameter 'tradeId' when calling showMyTradeDetails");
    }
    
    // create path and map variables
    String localVarPath = "/trades/{trade_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "trade_id" + "\\}", apiClient.escapeString(tradeId.toString()));

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

    GenericType<ShowMyTradeDetailsResponse> localVarReturnType = new GenericType<ShowMyTradeDetailsResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Abrufen und Filtern meiner getätigten Trades
   * @param type Trade-Typ (optional)
   * @param tradingPair Handelspaar (optional)
   * @param state Aktueller Trade-Status (optional, default to 0)
   * @param dateStart Startzeitpunkt, ab dem Trades zurückgeliefert werden. Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00). (optional)
   * @param dateEnd Endzeitpunkt, bis zu dem Trades zurückgeliefert werden. Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00). (optional)
   * @param page Seitenzahl zum Blättern innerhalb der Ergebnisseiten (optional, default to 1)
   * @return ShowMyTradesResponse
   * @throws ApiException if fails to make API call
   */
  public ShowMyTradesResponse showMyTrades(String type, String tradingPair, Integer state, DateTime dateStart, DateTime dateEnd, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/trades".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trading_pair", tradingPair));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "state", state));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date_start", dateStart));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "date_end", dateEnd));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "page", page));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiSignature", "apiKey", "apiNonce" };

    GenericType<ShowMyTradesResponse> localVarReturnType = new GenericType<ShowMyTradesResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Erfolgreich abgeschlossene Trades. Wenn kein Parameter gesetzt wird, werden alle erfolgreich abgeschlossenen Trades der letzten 7 Tage zurückgeliefert. Die Liste ist absteigend nach Datum sortiert.
   * @param sinceTid inkrementelle Daten ab einer bestimmten TID anzeigen. (optional)
   * @return ShowPublicTradeHistoryResponse
   * @throws ApiException if fails to make API call
   */
  public ShowPublicTradeHistoryResponse showPublicTradeHistory(Integer sinceTid) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/trades/history".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "since_tid", sinceTid));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiSignature", "apiKey", "apiNonce" };

    GenericType<ShowPublicTradeHistoryResponse> localVarReturnType = new GenericType<ShowPublicTradeHistoryResponse>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
