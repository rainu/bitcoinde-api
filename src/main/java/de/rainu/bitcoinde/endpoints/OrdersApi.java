package de.rainu.bitcoinde.endpoints;

import de.rainu.bitcoinde.ApiClient;
import de.rainu.bitcoinde.ApiException;
import de.rainu.bitcoinde.Configuration;
import de.rainu.bitcoinde.Pair;
import de.rainu.bitcoinde.model.BuyOrSell;
import de.rainu.bitcoinde.model.CreateOrderResponse;
import de.rainu.bitcoinde.model.DeleteOrderResponse;
import de.rainu.bitcoinde.model.OrderState;
import de.rainu.bitcoinde.model.PaymentOption;
import de.rainu.bitcoinde.model.ShowMyOrderDetailsResponse;
import de.rainu.bitcoinde.model.ShowMyOrdersResponse;
import de.rainu.bitcoinde.model.ShowOrderbookCompactResponse;
import de.rainu.bitcoinde.model.ShowOrderbookResponse;
import de.rainu.bitcoinde.model.TradingPair;
import de.rainu.bitcoinde.model.TrustLevel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;
import org.joda.time.DateTime;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T20:05:46.672+02:00")
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
   * Anlegen einer neuen Order
   *
   * @param type (optional)
   * @param tradingPair Handelspaar (optional)
   * @param maxAmount Maximale Menge der zu handelnden Bitcoins (optional)
   * @param price Preis pro Bitcoin in Euro (optional)
   * @param minAmount Mindest-Menge der zu handelnden Bitcoins (optional)
   * @param endDatetime Enddatum (mindestens 5 Tage in der Zukunft) des Angebots. Format gemäß RFC
   * 3339 (Bsp: 2015-01-20T15:00:00+02:00). Zulässige Werte für die Minuten sind: 00, 15 , 30, 45
   * (optional, default to aktuelles Datum + 5 Tage)
   * @param newOrderForRemainingAmount Neues Angebot mit Restmenge anlegen, wenn nur eine Teilmenge
   * aus dem Angebot bedient wurde. (optional, default to 0)
   * @param minTrustLevel (optional)
   * @param onlyKycFull Handelspartner muss vollständig identifiziert sein. (optional, default to
   * 0)
   * @param paymentOption (optional)
   * @param seatOfBank Erlaubte Länder, in denen die Bank des Handelspartners ihren Sitz haben darf
   * (ISO 3166-2 (optional)
   * @return CreateOrderResponse
   * @throws ApiException if fails to make API call
   */
  public CreateOrderResponse createOrder(BuyOrSell type, TradingPair tradingPair, Float maxAmount,
      Float price, Float minAmount, DateTime endDatetime, Integer newOrderForRemainingAmount,
      TrustLevel minTrustLevel, Integer onlyKycFull, PaymentOption paymentOption, String seatOfBank)
      throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    String localVarPath = "/orders";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (type != null) {
      localVarFormParams.put("type", type);
    }
    if (tradingPair != null) {
      localVarFormParams.put("trading_pair", tradingPair);
    }
    if (maxAmount != null) {
      localVarFormParams.put("max_amount", maxAmount);
    }
    if (price != null) {
      localVarFormParams.put("price", price);
    }
    if (minAmount != null) {
      localVarFormParams.put("min_amount", minAmount);
    }
    if (endDatetime != null) {
      localVarFormParams.put("end_datetime", endDatetime);
    }
    if (newOrderForRemainingAmount != null) {
      localVarFormParams.put("new_order_for_remaining_amount", newOrderForRemainingAmount);
    }
    if (minTrustLevel != null) {
      localVarFormParams.put("min_trust_level", minTrustLevel);
    }
    if (onlyKycFull != null) {
      localVarFormParams.put("only_kyc_full", onlyKycFull);
    }
    if (paymentOption != null) {
      localVarFormParams.put("payment_option", paymentOption);
    }
    if (seatOfBank != null) {
      localVarFormParams.put("seat_of_bank", seatOfBank);
    }

    final String[] localVarAccepts = { "application/json" };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = { "application/x-www-form-urlencoded" };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[]{"apiSignature", "apiKey", "apiNonce"};

    GenericType<CreateOrderResponse> localVarReturnType = new GenericType<CreateOrderResponse>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody,
        localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,
        localVarAuthNames, localVarReturnType);
  }

  /**
   * Löschen einer Order
   *
   * @param orderId Die id der Order, die gelöscht werden soll. (required)
   * @param tradingPair Handelspaar (required)
   * @return DeleteOrderResponse
   * @throws ApiException if fails to make API call
   */
  public DeleteOrderResponse deleteOrder(String orderId, TradingPair tradingPair) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400,
          "Missing the required parameter 'orderId' when calling deleteOrder");
    }

    // verify the required parameter 'tradingPair' is set
    if (tradingPair == null) {
      throw new ApiException(400,
          "Missing the required parameter 'tradingPair' when calling deleteOrder");
    }

    // create path and map variables
    final String localVarPath = "/orders/{order_id}/{trading_pair}"
        .replaceAll("\\{" + "order_id" + "\\}", apiClient.escapeString(orderId.toString()))
        .replaceAll("\\{" + "trading_pair" + "\\}", apiClient.escapeString(tradingPair.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = { "application/json" };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[]{"apiSignature", "apiKey", "apiNonce"};

    GenericType<DeleteOrderResponse> localVarReturnType = new GenericType<DeleteOrderResponse>() {};
    return apiClient.invokeAPI(localVarPath, "DELETE", localVarQueryParams, localVarPostBody,
        localVarHeaderParams, localVarFormParams, localVarAccept, localVarContentType,
        localVarAuthNames, localVarReturnType);
  }

  /**
   * Details zu einer meiner Order abrufen
   *
   * @param orderId ID des abzufragenden Angebots (required)
   * @return ShowMyOrderDetailsResponse
   * @throws ApiException if fails to make API call
   */
  public ShowMyOrderDetailsResponse showMyOrderDetails(String orderId) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'orderId' is set
    if (orderId == null) {
      throw new ApiException(400,
          "Missing the required parameter 'orderId' when calling showMyOrderDetails");
    }

    // create path and map variables
    final String localVarPath = "/orders/{order_id}"
        .replaceAll("\\{" + "order_id" + "\\}", apiClient.escapeString(orderId.toString()));

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    final String[] localVarAccepts = { "application/json" };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[]{"apiSignature", "apiKey", "apiNonce"};

    GenericType<ShowMyOrderDetailsResponse> localVarReturnType = new GenericType<ShowMyOrderDetailsResponse>() {};

    return apiClient
        .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody,
            localVarHeaderParams,
            localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames,
            localVarReturnType);
  }

  /**
   * Abrufen und Filtern meiner Orders
   *
   * @param type Angebots-Typ (optional)
   * @param tradingPair Handelspaar (optional)
   * @param state Aktueller Status (optional, default to 0)
   * @param dateStart Startzeitpunkt, ab dem die Orders zurückgeliefert werden. Format gemäß RFC
   * 3339 (Bsp: 2015-01-20T15:00:00+02:00). (optional)
   * @param dateEnd Endzeitpunkt, bis zu dem die Orders zurückgeliefert werden. Format gemäß RFC
   * 3339 (Bsp: 2015-01-20T15:00:00+02:00). (optional)
   * @param page Seitenzahl zum Blättern innerhalb der Ergebnisseiten (optional, default to 1)
   * @return ShowMyOrdersResponse
   * @throws ApiException if fails to make API call
   */
  public ShowMyOrdersResponse showMyOrders(BuyOrSell type, TradingPair tradingPair, OrderState state,
      DateTime dateStart, DateTime dateEnd, Integer page) throws ApiException {
    Object localVarPostBody = null;

    // create path and map variables
    final String localVarPath = "/orders/my_own";

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

    final String[] localVarAccepts = { "application/json" };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[]{"apiSignature", "apiKey", "apiNonce"};

    GenericType<ShowMyOrdersResponse> localVarReturnType = new GenericType<ShowMyOrdersResponse>() {};
    return apiClient
        .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
            localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames,
            localVarReturnType);
  }

  /**
   * Durchsuchen des Orderbooks nach passenden Angeboten
   *
   * @param type Angebots-Typ. &#39;buy&#39; liefert Verkaufsangebote, &#39;sell&#39; Kaufangebote
   * (required)
   * @param tradingPair Handelspaar (required)
   * @param amount Menge der Bitcoins (optional)
   * @param price Preis pro Bitcoin in Euro. Entspricht bei &#39;buy&#39; dem maximalen Kaufpreis
   * und bei &#39;sell&#39; dem minimalen Verkaufspreis. (optional)
   * @param orderRequirementsFullfilled Nur Angebote anzeigen, deren Anforderungen ich erfülle
   * (bspw. Legitimationsstatus, Trust-Level, Sitz der Bank, Zahlungsart). (optional, default to 0)
   * @param onlyKycFull Nur Angebote von vollständig identifizierten Usern anzeigen. (optional,
   * default to 0)
   * @param onlyExpressOrders Nur Angebote anzeigen, die über Express-Handel gehandelt werden
   * können. (optional, default to 1)
   * @param onlySameBankgroup Nur Angebote von Handelspartner anzeigen, die ein Bankkonto bei
   * derselben Bankgruppe (BIC-Nummernkreis) wie ich haben. (optional, default to 0)
   * @param onlySameBic Nur Angebote von Handelspartnern anzeigen, die ein Bankkonto bei derselben
   * Bank wie ich haben. (optional, default to 0)
   * @param seatOfBank Nur Angebote mit bestimmtem Sitz der Bank anzeigen. (ISO 3166-2). (optional)
   * @return ShowOrderbookResponse
   * @throws ApiException if fails to make API call
   */
  public ShowOrderbookResponse showOrderbook(BuyOrSell type, TradingPair tradingPair, Float amount,
      Float price, Integer orderRequirementsFullfilled, Integer onlyKycFull,
      Integer onlyExpressOrders, Integer onlySameBankgroup, Integer onlySameBic,
      List<String> seatOfBank) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'type' is set
    if (type == null) {
      throw new ApiException(400,
          "Missing the required parameter 'type' when calling showOrderbook");
    }

    // verify the required parameter 'tradingPair' is set
    if (tradingPair == null) {
      throw new ApiException(400,
          "Missing the required parameter 'tradingPair' when calling showOrderbook");
    }

    // create path and map variables
    final String localVarPath = "/orders";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trading_pair", tradingPair));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "amount", amount));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "price", price));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "order_requirements_fullfilled", orderRequirementsFullfilled));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "only_kyc_full", onlyKycFull));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "only_express_orders", onlyExpressOrders));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "only_same_bankgroup", onlySameBankgroup));
    localVarQueryParams.addAll(apiClient.parameterToPairs("", "only_same_bic", onlySameBic));
    localVarQueryParams.addAll(apiClient.parameterToPairs("multi", "seat_of_bank", seatOfBank));

    final String[] localVarAccepts = { "application/json" };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[]{"apiSignature", "apiKey", "apiNonce"};

    GenericType<ShowOrderbookResponse> localVarReturnType = new GenericType<ShowOrderbookResponse>() {};
    return apiClient
        .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
            localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames,
            localVarReturnType);
  }

  /**
   * Kauf- und Verkaufsangebote (bids und asks) in kompakter Form.
   *
   * @param tradingPair Handelspaar (required)
   * @return ShowOrderbookCompactResponse
   * @throws ApiException if fails to make API call
   */
  public ShowOrderbookCompactResponse showOrderbookCompact(TradingPair tradingPair) throws ApiException {
    Object localVarPostBody = null;

    // verify the required parameter 'tradingPair' is set
    if (tradingPair == null) {
      throw new ApiException(400,
          "Missing the required parameter 'tradingPair' when calling showOrderbookCompact");
    }

    // create path and map variables
    final String localVarPath = "/orders/compact";

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    localVarQueryParams.addAll(apiClient.parameterToPairs("", "trading_pair", tradingPair));

    final String[] localVarAccepts = { "application/json" };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {};
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[]{"apiSignature", "apiKey", "apiNonce"};

    GenericType<ShowOrderbookCompactResponse> localVarReturnType = new GenericType<ShowOrderbookCompactResponse>() {};
    return apiClient
        .invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams,
            localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames,
            localVarReturnType);
  }
}
