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
import de.rainu.bitcoinde.model.InlineResponse20010Trade;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;

/**
 * InlineResponse20010AccountLedger
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T13:21:29.350+02:00")
public class InlineResponse20010AccountLedger {
  @JsonProperty("date")
  private DateTime date = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("reference")
  private String reference = null;

  @JsonProperty("trade")
  private InlineResponse20010Trade trade = null;

  @JsonProperty("cashflow")
  private String cashflow = null;

  @JsonProperty("balance")
  private String balance = null;

  public InlineResponse20010AccountLedger date(DateTime date) {
    this.date = date;
    return this;
  }

   /**
   * Buchungsdatum (Format: 2015-04-07T12:23:04+02:00 gemäß RFC 3339)
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "Buchungsdatum (Format: 2015-04-07T12:23:04+02:00 gemäß RFC 3339)")
  public DateTime getDate() {
    return date;
  }

  public void setDate(DateTime date) {
    this.date = date;
  }

  public InlineResponse20010AccountLedger type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Typ der Position
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "Typ der Position")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public InlineResponse20010AccountLedger reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Referenz zu der Position (trade_id bei buy/sell oder txid bei einer Einzahlung/Auszahlung)
   * @return reference
  **/
  @ApiModelProperty(example = "null", value = "Referenz zu der Position (trade_id bei buy/sell oder txid bei einer Einzahlung/Auszahlung)")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public InlineResponse20010AccountLedger trade(InlineResponse20010Trade trade) {
    this.trade = trade;
    return this;
  }

   /**
   * Get trade
   * @return trade
  **/
  @ApiModelProperty(example = "null", value = "")
  public InlineResponse20010Trade getTrade() {
    return trade;
  }

  public void setTrade(InlineResponse20010Trade trade) {
    this.trade = trade;
  }

  public InlineResponse20010AccountLedger cashflow(String cashflow) {
    this.cashflow = cashflow;
    return this;
  }

   /**
   * Zu- / Abgang
   * @return cashflow
  **/
  @ApiModelProperty(example = "null", value = "Zu- / Abgang")
  public String getCashflow() {
    return cashflow;
  }

  public void setCashflow(String cashflow) {
    this.cashflow = cashflow;
  }

  public InlineResponse20010AccountLedger balance(String balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Kontostand
   * @return balance
  **/
  @ApiModelProperty(example = "null", value = "Kontostand")
  public String getBalance() {
    return balance;
  }

  public void setBalance(String balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010AccountLedger inlineResponse20010AccountLedger = (InlineResponse20010AccountLedger) o;
    return Objects.equals(this.date, inlineResponse20010AccountLedger.date) &&
        Objects.equals(this.type, inlineResponse20010AccountLedger.type) &&
        Objects.equals(this.reference, inlineResponse20010AccountLedger.reference) &&
        Objects.equals(this.trade, inlineResponse20010AccountLedger.trade) &&
        Objects.equals(this.cashflow, inlineResponse20010AccountLedger.cashflow) &&
        Objects.equals(this.balance, inlineResponse20010AccountLedger.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, type, reference, trade, cashflow, balance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010AccountLedger {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    trade: ").append(toIndentedString(trade)).append("\n");
    sb.append("    cashflow: ").append(toIndentedString(cashflow)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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

