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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * BTC-Summen
 */
@ApiModel(description = "BTC-Summen")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T15:01:02.402+02:00")
public class ShowAccountLedgerResponseTradeBtc {
  @JsonProperty("before_fee")
  private String beforeFee = null;

  @JsonProperty("after_fee")
  private String afterFee = null;

  public ShowAccountLedgerResponseTradeBtc beforeFee(String beforeFee) {
    this.beforeFee = beforeFee;
    return this;
  }

   /**
   * Summe in BTC vor Gebühr
   * @return beforeFee
  **/
  @ApiModelProperty(example = "null", value = "Summe in BTC vor Gebühr")
  public String getBeforeFee() {
    return beforeFee;
  }

  public void setBeforeFee(String beforeFee) {
    this.beforeFee = beforeFee;
  }

  public ShowAccountLedgerResponseTradeBtc afterFee(String afterFee) {
    this.afterFee = afterFee;
    return this;
  }

   /**
   * Summe in BTC nach Gebühr
   * @return afterFee
  **/
  @ApiModelProperty(example = "null", value = "Summe in BTC nach Gebühr")
  public String getAfterFee() {
    return afterFee;
  }

  public void setAfterFee(String afterFee) {
    this.afterFee = afterFee;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShowAccountLedgerResponseTradeBtc showAccountLedgerResponseTradeBtc = (ShowAccountLedgerResponseTradeBtc) o;
    return Objects.equals(this.beforeFee, showAccountLedgerResponseTradeBtc.beforeFee) &&
        Objects.equals(this.afterFee, showAccountLedgerResponseTradeBtc.afterFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beforeFee, afterFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowAccountLedgerResponseTradeBtc {\n");
    
    sb.append("    beforeFee: ").append(toIndentedString(beforeFee)).append("\n");
    sb.append("    afterFee: ").append(toIndentedString(afterFee)).append("\n");
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

