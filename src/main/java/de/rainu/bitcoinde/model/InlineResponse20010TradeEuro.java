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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Euro-Summen
 */
@ApiModel(description = "Euro-Summen")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T13:21:29.350+02:00")
public class InlineResponse20010TradeEuro {
  @JsonProperty("before_fee")
  private String beforeFee = null;

  @JsonProperty("after_fee")
  private String afterFee = null;

  public InlineResponse20010TradeEuro beforeFee(String beforeFee) {
    this.beforeFee = beforeFee;
    return this;
  }

   /**
   * Summe in Euro vor Gebühr
   * @return beforeFee
  **/
  @ApiModelProperty(example = "null", value = "Summe in Euro vor Gebühr")
  public String getBeforeFee() {
    return beforeFee;
  }

  public void setBeforeFee(String beforeFee) {
    this.beforeFee = beforeFee;
  }

  public InlineResponse20010TradeEuro afterFee(String afterFee) {
    this.afterFee = afterFee;
    return this;
  }

   /**
   * Summe in Euro nach Gebühr
   * @return afterFee
  **/
  @ApiModelProperty(example = "null", value = "Summe in Euro nach Gebühr")
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
    InlineResponse20010TradeEuro inlineResponse20010TradeEuro = (InlineResponse20010TradeEuro) o;
    return Objects.equals(this.beforeFee, inlineResponse20010TradeEuro.beforeFee) &&
        Objects.equals(this.afterFee, inlineResponse20010TradeEuro.afterFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beforeFee, afterFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse20010TradeEuro {\n");
    
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
