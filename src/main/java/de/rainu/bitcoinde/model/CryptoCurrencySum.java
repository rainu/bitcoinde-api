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

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * (Krypto) Währung-Summen
 */
@ApiModel(description = "(Krypto) Währung-Summen")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T20:05:46.672+02:00")
public class CryptoCurrencySum {
  /**
   * (Krypto) Währung
   */
  public enum CurrencyEnum {
    BITCOIN("btc"),
    
    BITCOIN_CASH("bch"),
    
    ETHEREUM("eth"),
    
    EURO("euro");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CurrencyEnum fromValue(String text) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("currency")
  private CurrencyEnum currency = null;

  @JsonProperty("before_fee")
  private String beforeFee = null;

  @JsonProperty("after_fee")
  private String afterFee = null;

  public CryptoCurrencySum currency(CurrencyEnum currency) {
    this.currency = currency;
    return this;
  }

   /**
   * (Krypto) Währung
   * @return currency
  **/
  @ApiModelProperty(example = "null", value = "(Krypto) Währung")
  public CurrencyEnum getCurrency() {
    return currency;
  }

  public void setCurrency(CurrencyEnum currency) {
    this.currency = currency;
  }

  public CryptoCurrencySum beforeFee(String beforeFee) {
    this.beforeFee = beforeFee;
    return this;
  }

   /**
   * Summe vor Gebühr
   * @return beforeFee
  **/
  @ApiModelProperty(example = "null", value = "Summe vor Gebühr")
  public String getBeforeFee() {
    return beforeFee;
  }

  public void setBeforeFee(String beforeFee) {
    this.beforeFee = beforeFee;
  }

  public CryptoCurrencySum afterFee(String afterFee) {
    this.afterFee = afterFee;
    return this;
  }

   /**
   * Summe nach Gebühr
   * @return afterFee
  **/
  @ApiModelProperty(example = "null", value = "Summe nach Gebühr")
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
    CryptoCurrencySum cryptoCurrencySum = (CryptoCurrencySum) o;
    return Objects.equals(this.currency, cryptoCurrencySum.currency) &&
        Objects.equals(this.beforeFee, cryptoCurrencySum.beforeFee) &&
        Objects.equals(this.afterFee, cryptoCurrencySum.afterFee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, beforeFee, afterFee);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CryptoCurrencySum {\n");
    
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

