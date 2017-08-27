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
import de.rainu.bitcoinde.model.InlineResponse20010TradeBtc;
import de.rainu.bitcoinde.model.InlineResponse20010TradeEuro;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Tradedetails (nur bei Typ sell/buy)
 */
@ApiModel(description = "Tradedetails (nur bei Typ sell/buy)")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T13:21:29.350+02:00")
public class InlineResponse20010Trade {
  @JsonProperty("trade_id")
  private String tradeId = null;

  @JsonProperty("price")
  private String price = null;

  @JsonProperty("btc")
  private InlineResponse20010TradeBtc btc = null;

  @JsonProperty("euro")
  private InlineResponse20010TradeEuro euro = null;

  public InlineResponse20010Trade tradeId(String tradeId) {
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

  public InlineResponse20010Trade price(String price) {
    this.price = price;
    return this;
  }

   /**
   * Preis pro Bitcoin in Euro
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "Preis pro Bitcoin in Euro")
  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public InlineResponse20010Trade btc(InlineResponse20010TradeBtc btc) {
    this.btc = btc;
    return this;
  }

   /**
   * Get btc
   * @return btc
  **/
  @ApiModelProperty(example = "null", value = "")
  public InlineResponse20010TradeBtc getBtc() {
    return btc;
  }

  public void setBtc(InlineResponse20010TradeBtc btc) {
    this.btc = btc;
  }

  public InlineResponse20010Trade euro(InlineResponse20010TradeEuro euro) {
    this.euro = euro;
    return this;
  }

   /**
   * Get euro
   * @return euro
  **/
  @ApiModelProperty(example = "null", value = "")
  public InlineResponse20010TradeEuro getEuro() {
    return euro;
  }

  public void setEuro(InlineResponse20010TradeEuro euro) {
    this.euro = euro;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse20010Trade inlineResponse20010Trade = (InlineResponse20010Trade) o;
    return Objects.equals(this.tradeId, inlineResponse20010Trade.tradeId) &&
        Objects.equals(this.price, inlineResponse20010Trade.price) &&
        Objects.equals(this.btc, inlineResponse20010Trade.btc) &&
        Objects.equals(this.euro, inlineResponse20010Trade.euro);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradeId, price, btc, euro);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010Trade {\n");
    
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    btc: ").append(toIndentedString(btc)).append("\n");
    sb.append("    euro: ").append(toIndentedString(euro)).append("\n");
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
