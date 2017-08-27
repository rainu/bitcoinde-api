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
 * Page
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T15:01:02.402+02:00")
public class Page {
  @JsonProperty("current")
  private Integer current = null;

  @JsonProperty("last")
  private Integer last = null;

  public Page current(Integer current) {
    this.current = current;
    return this;
  }

   /**
   * Aktuell zurückgelieferte Seite
   * @return current
  **/
  @ApiModelProperty(example = "null", value = "Aktuell zurückgelieferte Seite")
  public Integer getCurrent() {
    return current;
  }

  public void setCurrent(Integer current) {
    this.current = current;
  }

  public Page last(Integer last) {
    this.last = last;
    return this;
  }

   /**
   * Letzte verfügbare Seite zu den Suchkriterien
   * @return last
  **/
  @ApiModelProperty(example = "null", value = "Letzte verfügbare Seite zu den Suchkriterien")
  public Integer getLast() {
    return last;
  }

  public void setLast(Integer last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Page page = (Page) o;
    return Objects.equals(this.current, page.current) &&
        Objects.equals(this.last, page.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(current, last);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Page {\n");
    
    sb.append("    current: ").append(toIndentedString(current)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

