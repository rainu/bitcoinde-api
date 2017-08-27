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
import de.rainu.bitcoinde.model.BankList;
import de.rainu.bitcoinde.model.TrustLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * InlineResponse2004TradingPartnerInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T12:15:09.755+02:00")
public class InlineResponse2004TradingPartnerInformation {
  @JsonProperty("username")
  private String username = null;

  @JsonProperty("is_kyc_full")
  private Boolean isKycFull = null;

  @JsonProperty("trust_level")
  private TrustLevel trustLevel = null;

  @JsonProperty("bank_name")
  private String bankName = null;

  @JsonProperty("bic")
  private String bic = null;

  @JsonProperty("seat_of_bank")
  private BankList seatOfBank = null;

  @JsonProperty("amount_trades")
  private Integer amountTrades = null;

  @JsonProperty("rating")
  private Integer rating = null;

  public InlineResponse2004TradingPartnerInformation username(String username) {
    this.username = username;
    return this;
  }

   /**
   * User-Name
   * @return username
  **/
  @ApiModelProperty(example = "null", value = "User-Name")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public InlineResponse2004TradingPartnerInformation isKycFull(Boolean isKycFull) {
    this.isKycFull = isKycFull;
    return this;
  }

   /**
   * Vollständig identifizierter User
   * @return isKycFull
  **/
  @ApiModelProperty(example = "null", value = "Vollständig identifizierter User")
  public Boolean getIsKycFull() {
    return isKycFull;
  }

  public void setIsKycFull(Boolean isKycFull) {
    this.isKycFull = isKycFull;
  }

  public InlineResponse2004TradingPartnerInformation trustLevel(TrustLevel trustLevel) {
    this.trustLevel = trustLevel;
    return this;
  }

   /**
   * Get trustLevel
   * @return trustLevel
  **/
  @ApiModelProperty(example = "null", value = "")
  public TrustLevel getTrustLevel() {
    return trustLevel;
  }

  public void setTrustLevel(TrustLevel trustLevel) {
    this.trustLevel = trustLevel;
  }

  public InlineResponse2004TradingPartnerInformation bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

   /**
   * Name der Bank
   * @return bankName
  **/
  @ApiModelProperty(example = "null", value = "Name der Bank")
  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public InlineResponse2004TradingPartnerInformation bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * BIC der Bank
   * @return bic
  **/
  @ApiModelProperty(example = "null", value = "BIC der Bank")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public InlineResponse2004TradingPartnerInformation seatOfBank(BankList seatOfBank) {
    this.seatOfBank = seatOfBank;
    return this;
  }

   /**
   * Get seatOfBank
   * @return seatOfBank
  **/
  @ApiModelProperty(example = "null", value = "")
  public BankList getSeatOfBank() {
    return seatOfBank;
  }

  public void setSeatOfBank(BankList seatOfBank) {
    this.seatOfBank = seatOfBank;
  }

  public InlineResponse2004TradingPartnerInformation amountTrades(Integer amountTrades) {
    this.amountTrades = amountTrades;
    return this;
  }

   /**
   * Anzahl bereits getätigten Trades
   * @return amountTrades
  **/
  @ApiModelProperty(example = "null", value = "Anzahl bereits getätigten Trades")
  public Integer getAmountTrades() {
    return amountTrades;
  }

  public void setAmountTrades(Integer amountTrades) {
    this.amountTrades = amountTrades;
  }

  public InlineResponse2004TradingPartnerInformation rating(Integer rating) {
    this.rating = rating;
    return this;
  }

   /**
   * Prozentualer Anteil an positiven Bewertungen durch die Handelspartner
   * @return rating
  **/
  @ApiModelProperty(example = "null", value = "Prozentualer Anteil an positiven Bewertungen durch die Handelspartner")
  public Integer getRating() {
    return rating;
  }

  public void setRating(Integer rating) {
    this.rating = rating;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004TradingPartnerInformation inlineResponse2004TradingPartnerInformation = (InlineResponse2004TradingPartnerInformation) o;
    return Objects.equals(this.username, inlineResponse2004TradingPartnerInformation.username) &&
        Objects.equals(this.isKycFull, inlineResponse2004TradingPartnerInformation.isKycFull) &&
        Objects.equals(this.trustLevel, inlineResponse2004TradingPartnerInformation.trustLevel) &&
        Objects.equals(this.bankName, inlineResponse2004TradingPartnerInformation.bankName) &&
        Objects.equals(this.bic, inlineResponse2004TradingPartnerInformation.bic) &&
        Objects.equals(this.seatOfBank, inlineResponse2004TradingPartnerInformation.seatOfBank) &&
        Objects.equals(this.amountTrades, inlineResponse2004TradingPartnerInformation.amountTrades) &&
        Objects.equals(this.rating, inlineResponse2004TradingPartnerInformation.rating);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, isKycFull, trustLevel, bankName, bic, seatOfBank, amountTrades, rating);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004TradingPartnerInformation {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    isKycFull: ").append(toIndentedString(isKycFull)).append("\n");
    sb.append("    trustLevel: ").append(toIndentedString(trustLevel)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    seatOfBank: ").append(toIndentedString(seatOfBank)).append("\n");
    sb.append("    amountTrades: ").append(toIndentedString(amountTrades)).append("\n");
    sb.append("    rating: ").append(toIndentedString(rating)).append("\n");
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

