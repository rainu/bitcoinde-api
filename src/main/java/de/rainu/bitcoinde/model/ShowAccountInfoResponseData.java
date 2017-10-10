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
 * ShowAccountInfoResponseData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T20:05:46.672+02:00")
public class ShowAccountInfoResponseData {
  @JsonProperty("balances")
  private ShowAccountInfoResponseDataBalances balances = null;

  @JsonProperty("fidor_reservation")
  private ShowAccountInfoResponseDataFidorReservation fidorReservation = null;

  @JsonProperty("encrypted_information")
  private ShowAccountInfoResponseDataEncryptedInformation encryptedInformation = null;

  public ShowAccountInfoResponseData btcBalances(ShowAccountInfoResponseDataBalances btcBalances) {
    this.balances = btcBalances;
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  @ApiModelProperty(example = "null", value = "")
  public ShowAccountInfoResponseDataBalances getBalances() {
    return balances;
  }

  public void setBalances(ShowAccountInfoResponseDataBalances balances) {
    this.balances = balances;
  }

  public ShowAccountInfoResponseData fidorReservation(ShowAccountInfoResponseDataFidorReservation fidorReservation) {
    this.fidorReservation = fidorReservation;
    return this;
  }

   /**
   * Get fidorReservation
   * @return fidorReservation
  **/
  @ApiModelProperty(example = "null", value = "")
  public ShowAccountInfoResponseDataFidorReservation getFidorReservation() {
    return fidorReservation;
  }

  public void setFidorReservation(ShowAccountInfoResponseDataFidorReservation fidorReservation) {
    this.fidorReservation = fidorReservation;
  }

  public ShowAccountInfoResponseData encryptedInformation(ShowAccountInfoResponseDataEncryptedInformation encryptedInformation) {
    this.encryptedInformation = encryptedInformation;
    return this;
  }

   /**
   * Get encryptedInformation
   * @return encryptedInformation
  **/
  @ApiModelProperty(example = "null", value = "")
  public ShowAccountInfoResponseDataEncryptedInformation getEncryptedInformation() {
    return encryptedInformation;
  }

  public void setEncryptedInformation(ShowAccountInfoResponseDataEncryptedInformation encryptedInformation) {
    this.encryptedInformation = encryptedInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShowAccountInfoResponseData showAccountInfoResponseData = (ShowAccountInfoResponseData) o;
    return Objects.equals(this.balances, showAccountInfoResponseData.balances) &&
        Objects.equals(this.fidorReservation, showAccountInfoResponseData.fidorReservation) &&
        Objects.equals(this.encryptedInformation, showAccountInfoResponseData.encryptedInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances, fidorReservation, encryptedInformation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowAccountInfoResponseData {\n");
    
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
    sb.append("    fidorReservation: ").append(toIndentedString(fidorReservation)).append("\n");
    sb.append("    encryptedInformation: ").append(toIndentedString(encryptedInformation)).append("\n");
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

