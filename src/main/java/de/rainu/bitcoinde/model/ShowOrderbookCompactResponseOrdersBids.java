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

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * ShowOrderbookCompactResponseOrdersBids
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T15:01:02.402+02:00")
public class ShowOrderbookCompactResponseOrdersBids {
  @JsonProperty("price")
  private Float price = null;

  @JsonProperty("amount")
  private Float amount = null;

  public ShowOrderbookCompactResponseOrdersBids price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * Preis pro Bitcoin (Euro)
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "Preis pro Bitcoin (Euro)")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public ShowOrderbookCompactResponseOrdersBids amount(Float amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Anzahl BTC
   * @return amount
  **/
  @ApiModelProperty(example = "null", value = "Anzahl BTC")
  public Float getAmount() {
    return amount;
  }

  public void setAmount(Float amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShowOrderbookCompactResponseOrdersBids showOrderbookCompactResponseOrdersBids = (ShowOrderbookCompactResponseOrdersBids) o;
    return Objects.equals(this.price, showOrderbookCompactResponseOrdersBids.price) &&
        Objects.equals(this.amount, showOrderbookCompactResponseOrdersBids.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, amount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowOrderbookCompactResponseOrdersBids {\n");
    
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

