/*
 * bitcoin.de API
 * This specification describe the public api of bitcoin.de
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package de.rainu.bitcoinde.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import de.rainu.bitcoinde.model.BuyOrSell;
import de.rainu.bitcoinde.model.TradingPartner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * InlineResponse2004Trade
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T13:21:29.350+02:00")
public class InlineResponse2004Trade {
  @JsonProperty("trade_id")
  private String tradeId = null;

  /**
   * Handelspaar
   */
  public enum TradingPairEnum {
    BTCEUR("btceur"),
    
    BCHEUR("bcheur");

    private String value;

    TradingPairEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TradingPairEnum fromValue(String text) {
      for (TradingPairEnum b : TradingPairEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("trading_pair")
  private TradingPairEnum tradingPair = null;

  @JsonProperty("type")
  private BuyOrSell type = null;

  @JsonProperty("max_amount")
  private Float maxAmount = null;

  @JsonProperty("amount")
  private Float amount = null;

  @JsonProperty("price")
  private Float price = null;

  @JsonProperty("volume")
  private Float volume = null;

  @JsonProperty("fee_eur")
  private Float feeEur = null;

  @JsonProperty("fee_btc")
  private Float feeBtc = null;

  @JsonProperty("fee_currency")
  private Float feeCurrency = null;

  @JsonProperty("new_order_id_for_remaining_amount")
  private String newOrderIdForRemainingAmount = null;

  @JsonProperty("state")
  private Integer state = null;

  /**
   * Bewertung vom Handelspartner
   */
  public enum MyRatingForTradingPartnerEnum {
    PENDING("pending"),
    
    NEGATIVE("negative"),
    
    NEUTRAL("neutral"),
    
    POSITIVE("positive");

    private String value;

    MyRatingForTradingPartnerEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MyRatingForTradingPartnerEnum fromValue(String text) {
      for (MyRatingForTradingPartnerEnum b : MyRatingForTradingPartnerEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("my_rating_for_trading_partner")
  private MyRatingForTradingPartnerEnum myRatingForTradingPartner = null;

  @JsonProperty("trading_partner_information")
  private TradingPartner tradingPartnerInformation = null;

  @JsonProperty("created_at")
  private DateTime createdAt = null;

  @JsonProperty("successfully_finished_at")
  private DateTime successfullyFinishedAt = null;

  @JsonProperty("cancelled_at")
  private DateTime cancelledAt = null;

  @JsonProperty("payment_method")
  private Integer paymentMethod = null;

  public InlineResponse2004Trade tradeId(String tradeId) {
    this.tradeId = tradeId;
    return this;
  }

   /**
   * ID des Trades
   * @return tradeId
  **/
  @ApiModelProperty(example = "null", value = "ID des Trades")
  public String getTradeId() {
    return tradeId;
  }

  public void setTradeId(String tradeId) {
    this.tradeId = tradeId;
  }

  public InlineResponse2004Trade tradingPair(TradingPairEnum tradingPair) {
    this.tradingPair = tradingPair;
    return this;
  }

   /**
   * Handelspaar
   * @return tradingPair
  **/
  @ApiModelProperty(example = "null", value = "Handelspaar")
  public TradingPairEnum getTradingPair() {
    return tradingPair;
  }

  public void setTradingPair(TradingPairEnum tradingPair) {
    this.tradingPair = tradingPair;
  }

  public InlineResponse2004Trade type(BuyOrSell type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public BuyOrSell getType() {
    return type;
  }

  public void setType(BuyOrSell type) {
    this.type = type;
  }

  public InlineResponse2004Trade maxAmount(Float maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * Maximal handelbare BTC-Menge
   * @return maxAmount
  **/
  @ApiModelProperty(example = "null", value = "Maximal handelbare BTC-Menge")
  public Float getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(Float maxAmount) {
    this.maxAmount = maxAmount;
  }

  public InlineResponse2004Trade amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Gekaufe/verkaufte Coin-Menge
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "Gekaufe/verkaufte Coin-Menge")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }

  public InlineResponse2004Trade price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * Preis pro BTC in Euro
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "Preis pro BTC in Euro")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public InlineResponse2004Trade volume(Float volume) {
    this.volume = volume;
    return this;
  }

   /**
   * Euro-Volumen des Trades
   * @return volume
  **/
  @ApiModelProperty(example = "null", value = "Euro-Volumen des Trades")
  public Float getVolume() {
    return volume;
  }

  public void setVolume(Float volume) {
    this.volume = volume;
  }

  public InlineResponse2004Trade feeEur(Float feeEur) {
    this.feeEur = feeEur;
    return this;
  }

   /**
   * Gebühr in Euro
   * @return feeEur
  **/
  @ApiModelProperty(example = "null", value = "Gebühr in Euro")
  public Float getFeeEur() {
    return feeEur;
  }

  public void setFeeEur(Float feeEur) {
    this.feeEur = feeEur;
  }

  public InlineResponse2004Trade feeBtc(Float feeBtc) {
    this.feeBtc = feeBtc;
    return this;
  }

   /**
   * Gebühr in BTC (Gebühren-Wert wird nur bei Trades mit dem Handelspaar 'btceur' angegeben, andernfalls beträgt der Gebühren-Wert 0)
   * @return feeBtc
  **/
  @ApiModelProperty(example = "null", value = "Gebühr in BTC (Gebühren-Wert wird nur bei Trades mit dem Handelspaar 'btceur' angegeben, andernfalls beträgt der Gebühren-Wert 0)")
  public Float getFeeBtc() {
    return feeBtc;
  }

  public void setFeeBtc(Float feeBtc) {
    this.feeBtc = feeBtc;
  }

  public InlineResponse2004Trade feeCurrency(Float feeCurrency) {
    this.feeCurrency = feeCurrency;
    return this;
  }

   /**
   * Gebühr in Kryptowährung des jeweiligen Handelspaars
   * @return feeCurrency
  **/
  @ApiModelProperty(example = "null", value = "Gebühr in Kryptowährung des jeweiligen Handelspaars")
  public Float getFeeCurrency() {
    return feeCurrency;
  }

  public void setFeeCurrency(Float feeCurrency) {
    this.feeCurrency = feeCurrency;
  }

  public InlineResponse2004Trade newOrderIdForRemainingAmount(String newOrderIdForRemainingAmount) {
    this.newOrderIdForRemainingAmount = newOrderIdForRemainingAmount;
    return this;
  }

   /**
   * ID des neuen Angebots, das automatisch für die Rest-Coin-Menge erstellt wurde.
   * @return newOrderIdForRemainingAmount
  **/
  @ApiModelProperty(example = "null", value = "ID des neuen Angebots, das automatisch für die Rest-Coin-Menge erstellt wurde.")
  public String getNewOrderIdForRemainingAmount() {
    return newOrderIdForRemainingAmount;
  }

  public void setNewOrderIdForRemainingAmount(String newOrderIdForRemainingAmount) {
    this.newOrderIdForRemainingAmount = newOrderIdForRemainingAmount;
  }

  public InlineResponse2004Trade state(Integer state) {
    this.state = state;
    return this;
  }

   /**
   * Aktueller Status
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "Aktueller Status")
  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public InlineResponse2004Trade myRatingForTradingPartner(MyRatingForTradingPartnerEnum myRatingForTradingPartner) {
    this.myRatingForTradingPartner = myRatingForTradingPartner;
    return this;
  }

   /**
   * Bewertung vom Handelspartner
   * @return myRatingForTradingPartner
  **/
  @ApiModelProperty(example = "null", value = "Bewertung vom Handelspartner")
  public MyRatingForTradingPartnerEnum getMyRatingForTradingPartner() {
    return myRatingForTradingPartner;
  }

  public void setMyRatingForTradingPartner(MyRatingForTradingPartnerEnum myRatingForTradingPartner) {
    this.myRatingForTradingPartner = myRatingForTradingPartner;
  }

  public InlineResponse2004Trade tradingPartnerInformation(TradingPartner tradingPartnerInformation) {
    this.tradingPartnerInformation = tradingPartnerInformation;
    return this;
  }

   /**
   * Get tradingPartnerInformation
   * @return tradingPartnerInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public TradingPartner getTradingPartnerInformation() {
    return tradingPartnerInformation;
  }

  public void setTradingPartnerInformation(TradingPartner tradingPartnerInformation) {
    this.tradingPartnerInformation = tradingPartnerInformation;
  }

  public InlineResponse2004Trade createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Erstellzeitpunkt des Trades. Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00)
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "Erstellzeitpunkt des Trades. Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00)")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public InlineResponse2004Trade successfullyFinishedAt(DateTime successfullyFinishedAt) {
    this.successfullyFinishedAt = successfullyFinishedAt;
    return this;
  }

   /**
   * Nur beim State 1 (Successful). Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00)
   * @return successfullyFinishedAt
  **/
  @ApiModelProperty(example = "null", value = "Nur beim State 1 (Successful). Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00)")
  public DateTime getSuccessfullyFinishedAt() {
    return successfullyFinishedAt;
  }

  public void setSuccessfullyFinishedAt(DateTime successfullyFinishedAt) {
    this.successfullyFinishedAt = successfullyFinishedAt;
  }

  public InlineResponse2004Trade cancelledAt(DateTime cancelledAt) {
    this.cancelledAt = cancelledAt;
    return this;
  }

   /**
   * Nur beim State -1 (Cancelled). Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00)
   * @return cancelledAt
  **/
  @ApiModelProperty(example = "null", value = "Nur beim State -1 (Cancelled). Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00)")
  public DateTime getCancelledAt() {
    return cancelledAt;
  }

  public void setCancelledAt(DateTime cancelledAt) {
    this.cancelledAt = cancelledAt;
  }

  public InlineResponse2004Trade paymentMethod(Integer paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * 1 => SEPA; 2 Express
   * @return paymentMethod
  **/
  @ApiModelProperty(example = "null", value = "1 => SEPA; 2 Express")
  public Integer getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(Integer paymentMethod) {
    this.paymentMethod = paymentMethod;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004Trade inlineResponse2004Trade = (InlineResponse2004Trade) o;
    return Objects.equals(this.tradeId, inlineResponse2004Trade.tradeId) &&
        Objects.equals(this.tradingPair, inlineResponse2004Trade.tradingPair) &&
        Objects.equals(this.type, inlineResponse2004Trade.type) &&
        Objects.equals(this.maxAmount, inlineResponse2004Trade.maxAmount) &&
        Objects.equals(this.amount, inlineResponse2004Trade.amount) &&
        Objects.equals(this.price, inlineResponse2004Trade.price) &&
        Objects.equals(this.volume, inlineResponse2004Trade.volume) &&
        Objects.equals(this.feeEur, inlineResponse2004Trade.feeEur) &&
        Objects.equals(this.feeBtc, inlineResponse2004Trade.feeBtc) &&
        Objects.equals(this.feeCurrency, inlineResponse2004Trade.feeCurrency) &&
        Objects.equals(this.newOrderIdForRemainingAmount, inlineResponse2004Trade.newOrderIdForRemainingAmount) &&
        Objects.equals(this.state, inlineResponse2004Trade.state) &&
        Objects.equals(this.myRatingForTradingPartner, inlineResponse2004Trade.myRatingForTradingPartner) &&
        Objects.equals(this.tradingPartnerInformation, inlineResponse2004Trade.tradingPartnerInformation) &&
        Objects.equals(this.createdAt, inlineResponse2004Trade.createdAt) &&
        Objects.equals(this.successfullyFinishedAt, inlineResponse2004Trade.successfullyFinishedAt) &&
        Objects.equals(this.cancelledAt, inlineResponse2004Trade.cancelledAt) &&
        Objects.equals(this.paymentMethod, inlineResponse2004Trade.paymentMethod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradeId, tradingPair, type, maxAmount, amount, price, volume, feeEur, feeBtc, feeCurrency, newOrderIdForRemainingAmount, state, myRatingForTradingPartner, tradingPartnerInformation, createdAt, successfullyFinishedAt, cancelledAt, paymentMethod);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004Trade {\n");
    
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    tradingPair: ").append(toIndentedString(tradingPair)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
    sb.append("    feeEur: ").append(toIndentedString(feeEur)).append("\n");
    sb.append("    feeBtc: ").append(toIndentedString(feeBtc)).append("\n");
    sb.append("    feeCurrency: ").append(toIndentedString(feeCurrency)).append("\n");
    sb.append("    newOrderIdForRemainingAmount: ").append(toIndentedString(newOrderIdForRemainingAmount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    myRatingForTradingPartner: ").append(toIndentedString(myRatingForTradingPartner)).append("\n");
    sb.append("    tradingPartnerInformation: ").append(toIndentedString(tradingPartnerInformation)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    successfullyFinishedAt: ").append(toIndentedString(successfullyFinishedAt)).append("\n");
    sb.append("    cancelledAt: ").append(toIndentedString(cancelledAt)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
