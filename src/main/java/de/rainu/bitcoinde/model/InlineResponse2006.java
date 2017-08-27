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
import de.rainu.bitcoinde.model.Error;
import de.rainu.bitcoinde.model.InlineResponse2006Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2006
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T13:21:29.350+02:00")
public class InlineResponse2006 {
  @JsonProperty("data")
  private InlineResponse2006Data data = null;

  @JsonProperty("errors")
  private List<Error> errors = new ArrayList<Error>();

  @JsonProperty("credits")
  private Integer credits = null;

  public InlineResponse2006 data(InlineResponse2006Data data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(example = "null", value = "")
  public InlineResponse2006Data getData() {
    return data;
  }

  public void setData(InlineResponse2006Data data) {
    this.data = data;
  }

  public InlineResponse2006 errors(List<Error> errors) {
    this.errors = errors;
    return this;
  }

  public InlineResponse2006 addErrorsItem(Error errorsItem) {
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

  public InlineResponse2006 credits(Integer credits) {
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
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(this.data, inlineResponse2006.data) &&
        Objects.equals(this.errors, inlineResponse2006.errors) &&
        Objects.equals(this.credits, inlineResponse2006.credits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, errors, credits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

