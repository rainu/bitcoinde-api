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
 * Rate-Infos
 */
@ApiModel(description = "Rate-Infos")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T12:15:09.755+02:00")
public class InlineResponse2008Rates {
  @JsonProperty("rate_weighted")
  private String rateWeighted = null;

  @JsonProperty("rate_weighted_3h")
  private String rateWeighted3h = null;

  @JsonProperty("rate_weighted_12h")
  private String rateWeighted12h = null;

  public InlineResponse2008Rates rateWeighted(String rateWeighted) {
    this.rateWeighted = rateWeighted;
    return this;
  }

   /**
   * gibt in der Regel den gewichtete Durchschnittskurs der letzten 3 Stunden an. Wird eine kritische Masse an Trades in den letzten 3 Stunden unterschritten, dann wird hier der 12 Stunden Durchschnitt zurückgegeben.
   * @return rateWeighted
  **/
  @ApiModelProperty(example = "null", value = "gibt in der Regel den gewichtete Durchschnittskurs der letzten 3 Stunden an. Wird eine kritische Masse an Trades in den letzten 3 Stunden unterschritten, dann wird hier der 12 Stunden Durchschnitt zurückgegeben.")
  public String getRateWeighted() {
    return rateWeighted;
  }

  public void setRateWeighted(String rateWeighted) {
    this.rateWeighted = rateWeighted;
  }

  public InlineResponse2008Rates rateWeighted3h(String rateWeighted3h) {
    this.rateWeighted3h = rateWeighted3h;
    return this;
  }

   /**
   * Durchschnittskurs der letzten 3 Stunden
   * @return rateWeighted3h
  **/
  @ApiModelProperty(example = "null", value = "Durchschnittskurs der letzten 3 Stunden")
  public String getRateWeighted3h() {
    return rateWeighted3h;
  }

  public void setRateWeighted3h(String rateWeighted3h) {
    this.rateWeighted3h = rateWeighted3h;
  }

  public InlineResponse2008Rates rateWeighted12h(String rateWeighted12h) {
    this.rateWeighted12h = rateWeighted12h;
    return this;
  }

   /**
   * Durchschnittskurs der letzten 12 Stunden
   * @return rateWeighted12h
  **/
  @ApiModelProperty(example = "null", value = "Durchschnittskurs der letzten 12 Stunden")
  public String getRateWeighted12h() {
    return rateWeighted12h;
  }

  public void setRateWeighted12h(String rateWeighted12h) {
    this.rateWeighted12h = rateWeighted12h;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008Rates inlineResponse2008Rates = (InlineResponse2008Rates) o;
    return Objects.equals(this.rateWeighted, inlineResponse2008Rates.rateWeighted) &&
        Objects.equals(this.rateWeighted3h, inlineResponse2008Rates.rateWeighted3h) &&
        Objects.equals(this.rateWeighted12h, inlineResponse2008Rates.rateWeighted12h);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateWeighted, rateWeighted3h, rateWeighted12h);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008Rates {\n");
    
    sb.append("    rateWeighted: ").append(toIndentedString(rateWeighted)).append("\n");
    sb.append("    rateWeighted3h: ").append(toIndentedString(rateWeighted3h)).append("\n");
    sb.append("    rateWeighted12h: ").append(toIndentedString(rateWeighted12h)).append("\n");
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

