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
 * GeneralResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-10T20:05:46.672+02:00")
public class GeneralResponse {
  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("credits")
  private Integer credits = null;

  @JsonProperty("maintenance")
  private List<Maintenance> maintenance = new ArrayList<Maintenance>();

  public GeneralResponse errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public GeneralResponse addErrorsItem(Error errorsItem) {
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

  public GeneralResponse credits(Integer credits) {
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

  public GeneralResponse maintenance(List<Maintenance> maintenance) {
    this.maintenance = maintenance;
    return this;
  }

  public GeneralResponse addMaintenanceItem(Maintenance maintenanceItem) {
    this.maintenance.add(maintenanceItem);
    return this;
  }

   /**
   * Get maintenance
   * @return maintenance
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<Maintenance> getMaintenance() {
    return maintenance;
  }

  public void setMaintenance(List<Maintenance> maintenance) {
    this.maintenance = maintenance;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralResponse generalResponse = (GeneralResponse) o;
    return Objects.equals(this.errors, generalResponse.errors) &&
        Objects.equals(this.credits, generalResponse.credits) &&
        Objects.equals(this.maintenance, generalResponse.maintenance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, credits, maintenance);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
    sb.append("    maintenance: ").append(toIndentedString(maintenance)).append("\n");
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

