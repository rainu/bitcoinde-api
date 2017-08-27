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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ShowAccountLedgerResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T15:01:02.402+02:00")
public class ShowAccountLedgerResponse {
  @JsonProperty("account_ledger")
  private List<ShowAccountLedgerResponseAccountLedger> accountLedger = new ArrayList<ShowAccountLedgerResponseAccountLedger>();

  @JsonProperty("page")
  private Page page = null;

  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("credits")
  private Integer credits = null;

  public ShowAccountLedgerResponse accountLedger(List<ShowAccountLedgerResponseAccountLedger> accountLedger) {
    this.accountLedger = accountLedger;
    return this;
  }

  public ShowAccountLedgerResponse addAccountLedgerItem(ShowAccountLedgerResponseAccountLedger accountLedgerItem) {
    this.accountLedger.add(accountLedgerItem);
    return this;
  }

   /**
   * Details zur Position
   * @return accountLedger
  **/
  @ApiModelProperty(example = "null", value = "Details zur Position")
  public List<ShowAccountLedgerResponseAccountLedger> getAccountLedger() {
    return accountLedger;
  }

  public void setAccountLedger(List<ShowAccountLedgerResponseAccountLedger> accountLedger) {
    this.accountLedger = accountLedger;
  }

  public ShowAccountLedgerResponse page(Page page) {
    this.page = page;
    return this;
  }

   /**
   * Get page
   * @return page
  **/
  @ApiModelProperty(example = "null", value = "")
  public Page getPage() {
    return page;
  }

  public void setPage(Page page) {
    this.page = page;
  }

  public ShowAccountLedgerResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public ShowAccountLedgerResponse addErrorsItem(Error errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Error> getErrors() {
    return errors;
  }

  public void setErrors(List<Error> errors) {
    this.errors = errors;
  }

  public ShowAccountLedgerResponse credits(Integer credits) {
    this.credits = credits;
    return this;
  }

   /**
   * Restliches Credit-Kontingent
   * @return credits
  **/
  @ApiModelProperty(example = "null", value = "Restliches Credit-Kontingent")
  public Integer getCredits() {
    return credits;
  }

  public void setCredits(Integer credits) {
    this.credits = credits;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShowAccountLedgerResponse showAccountLedgerResponse = (ShowAccountLedgerResponse) o;
    return Objects.equals(this.accountLedger, showAccountLedgerResponse.accountLedger) &&
        Objects.equals(this.page, showAccountLedgerResponse.page) &&
        Objects.equals(this.errors, showAccountLedgerResponse.errors) &&
        Objects.equals(this.credits, showAccountLedgerResponse.credits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountLedger, page, errors, credits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShowAccountLedgerResponse {\n");
    
    sb.append("    accountLedger: ").append(toIndentedString(accountLedger)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
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
