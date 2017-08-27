package de.rainu.bitcoinde.endpoints;

import de.rainu.bitcoinde.ApiException;
import de.rainu.bitcoinde.ApiClient;
import de.rainu.bitcoinde.Configuration;
import de.rainu.bitcoinde.Pair;

import javax.ws.rs.core.GenericType;

import org.joda.time.DateTime;
import de.rainu.bitcoinde.model.Error;
import de.rainu.bitcoinde.model.InlineResponse200;
import de.rainu.bitcoinde.model.InlineResponse2001;
import de.rainu.bitcoinde.model.InlineResponse2002;
import de.rainu.bitcoinde.model.InlineResponse2003;
import de.rainu.bitcoinde.model.InlineResponse2007;
import de.rainu.bitcoinde.model.InlineResponse201;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T13:21:29.350+02:00")
public class OrdersApi {
  private ApiClient apiClient;

  public OrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrdersApi(ApiClient apiClient) {
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
   * Anlegen einer neuen Order
   * @param type  (optional)
   * @param maxAmount Maximale Menge der zu handelnden Bitcoins (optional)
   * @param price Preis pro Bitcoin in Euro (optional)
   * @param minAmount Mindest-Menge der zu handelnden Bitcoins (optional)
   * @param endDatetime Enddatum (mindestens 5 Tage in der Zukunft) des Angebots. Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00). Zulässige Werte für die Minuten sind: 00, 15 , 30, 45 (optional, default to aktuelles Datum + 5 Tage)
   * @param newOrderForRemainingAmount Neues Angebot mit Restmenge anlegen, wenn nur eine Teilmenge aus dem Angebot bedient wurde. (optional, default to 0)
   * @param minTrustLevel  (optional)
   * @param onlyKycFull Handelspartner muss vollständig identifiziert sein. (optional, default to 0)
   * @param paymentOption  (optional)
   * @param seatOfBank Erlaubte Länder, in denen die Bank des Handelspartners ihren Sitz haben darf (ISO 3166-2 (optional)
   * @return InlineResponse201
   * @throws ApiException if fails to make API call
   */
  public InlineResponse201 createOrder(String type, Float maxAmount, Float price, Float minAmount, DateTime endDatetime, Integer newOrderForRemainingAmount, String minTrustLevel, Integer onlyKycFull, String paymentOption, String seatOfBank) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/orders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    
    if (type != null)
      localVarFormParams.put("type", type);
if (maxAmount != null)
      localVarFormParams.put("max_amount", maxAmount);
if (price != null)
      localVarFormParams.put("price", price);
if (minAmount != null)
      localVarFormParams.put("min_amount", minAmount);
if (endDatetime != null)
      localVarFormParams.put("end_datetime", endDatetime);
if (newOrderForRemainingAmount != null)
      localVarFormParams.put("new_order_for_remaining_amount", newOrderForRemainingAmount);
if (minTrustLevel != null)
      localVarFormParams.put("min_trust_level", minTrustLevel);
if (onlyKycFull != null)
      localVarFormParams.put("only_kyc_full", onlyKycFull);
if (paymentOption != null)
      localVarFormParams.put("payment_option", paymentOption);
if (seatOfBank != null)
      localVarFormParams.put("seat_of_bank", seatOfBank);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/x-www-form-urlencoded"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiSignature", "apiKey", "apiNonce" };

    GenericType<InlineResponse201> localVarReturnType = new GenericType<InlineResponse201>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Löschen einer Order
   * @param orderId Die id der Order, die gelöscht werden soll. (required)
   * @return InlineResponse2002
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2002 deleteOrder(String orderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderId' when calling deleteOrder");
    }
    
    // create path and map variables
    String localVarPath = "/orders/{order_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "order_id" + "\\}", apiClient.escapeString(orderId.toString()));

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

    GenericType<InlineResponse2002> localVarReturnType = new GenericType<InlineResponse2002>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Details zu einer meiner Order abrufen
   * @param orderId ID des abzufragenden Angebots (required)
   * @return InlineResponse2001
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2001 showMyOrderDetails(String orderId) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400, "Missing the required parameter 'orderId' when calling showMyOrderDetails");
    }
    
    // create path and map variables
    String localVarPath = "/orders/{order_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "order_id" + "\\}", apiClient.escapeString(orderId.toString()));

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

    GenericType<InlineResponse2001> localVarReturnType = new GenericType<InlineResponse2001>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Abrufen und Filtern meiner Orders
   * @param type Angebots-Typ (optional)
   * @param state Aktueller Status (optional, default to 0)
   * @param dateStart Startzeitpunkt, ab dem die Orders zurückgeliefert werden. Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00). (optional)
   * @param dateEnd Endzeitpunkt, bis zu dem die Orders zurückgeliefert werden. Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00). (optional)
   * @param page Seitenzahl zum Blättern innerhalb der Ergebnisseiten (optional, default to 1)
   * @return InlineResponse2003
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2003 showMyOrders(String type, Integer state, DateTime dateStart, DateTime dateEnd, Integer page) throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/orders/my_own".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
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

    GenericType<InlineResponse2003> localVarReturnType = new GenericType<InlineResponse2003>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Durchsuchen des Orderbooks nach passenden Angeboten
   * @param type Angebots-Typ. &#39;buy&#39; liefert Verkaufsangebote, &#39;sell&#39; Kaufangebote (required)
   * @param amount Menge der Bitcoins (optional)
   * @param price Preis pro Bitcoin in Euro. Entspricht bei &#39;buy&#39; dem maximalen Kaufpreis und bei &#39;sell&#39; dem minimalen Verkaufspreis. (optional)
   * @param orderRequirementsFullfilled Nur Angebote anzeigen, deren Anforderungen ich erfülle (bspw. Legitimationsstatus, Trust-Level, Sitz der Bank, Zahlungsart). (optional, default to 0)
   * @param onlyKycFull Nur Angebote von vollständig identifizierten Usern anzeigen. (optional, default to 0)
   * @param onlyExpressOrders Nur Angebote anzeigen, die über Express-Handel gehandelt werden können. (optional, default to 1)
   * @param onlySameBankgroup Nur Angebote von Handelspartner anzeigen, die ein Bankkonto bei derselben Bankgruppe (BIC-Nummernkreis) wie ich haben. (optional, default to 0)
   * @param onlySameBic Nur Angebote von Handelspartnern anzeigen, die ein Bankkonto bei derselben Bank wie ich haben. (optional, default to 0)
   * @param seatOfBank Nur Angebote mit bestimmtem Sitz der Bank anzeigen. (ISO 3166-2). (optional)
   * @return InlineResponse200
   * @throws ApiException if fails to make API call
   */
  public InlineResponse200 showOrderbook(String type, Float amount, Float price, Integer orderRequirementsFullfilled, Integer onlyKycFull, Integer onlyExpressOrders, Integer onlySameBankgroup, Integer onlySameBic, List<String> seatOfBank) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400, "Missing the required parameter 'type' when calling showOrderbook");
    }
    
    // create path and map variables
    String localVarPath = "/orders".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "price", price));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_requirements_fullfilled", orderRequirementsFullfilled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "only_kyc_full", onlyKycFull));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "only_express_orders", onlyExpressOrders));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "only_same_bankgroup", onlySameBankgroup));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "only_same_bic", onlySameBic));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "seat_of_bank", seatOfBank));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "apiSignature", "apiKey", "apiNonce" };

    GenericType<InlineResponse200> localVarReturnType = new GenericType<InlineResponse200>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * 
   * Kauf- und Verkaufsangebote (bids und asks) in kompakter Form.
   * @return InlineResponse2007
   * @throws ApiException if fails to make API call
   */
  public InlineResponse2007 showOrderbookCompact() throws ApiException {
    Object localVarPostBody = null;
    
    // create path and map variables
    String localVarPath = "/orders/compact".replaceAll("\\{format\\}","json");

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

    GenericType<InlineResponse2007> localVarReturnType = new GenericType<InlineResponse2007>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
