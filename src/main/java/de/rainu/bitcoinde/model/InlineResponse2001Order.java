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
import de.rainu.bitcoinde.model.BuyOrSell;
import de.rainu.bitcoinde.model.OrderRequirement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * InlineResponse2001Order
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-27T13:21:29.350+02:00")
public class InlineResponse2001Order {
  @JsonProperty("order_id")
  private String orderId = null;

  @JsonProperty("type")
  private BuyOrSell type = null;

  @JsonProperty("max_amount")
  private Float maxAmount = null;

  @JsonProperty("min_amount")
  private Float minAmount = null;

  @JsonProperty("price")
  private Float price = null;

  @JsonProperty("max_volume")
  private Float maxVolume = null;

  @JsonProperty("min_volume")
  private Float minVolume = null;

  @JsonProperty("end_datetime")
  private DateTime endDatetime = null;

  @JsonProperty("new_order_for_remaining_amount")
  private Boolean newOrderForRemainingAmount = null;

  @JsonProperty("state")
  private Integer state = null;

  @JsonProperty("order_requirements")
  private List<OrderRequirement> orderRequirements = new ArrayList<OrderRequirement>();

  @JsonProperty("created_at")
  private DateTime createdAt = null;

  public InlineResponse2001Order orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * ID des Angebots
   * @return orderId
  **/
  @ApiModelProperty(example = "null", value = "ID des Angebots")
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public InlineResponse2001Order type(BuyOrSell type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public BuyOrSell getType() {
    return type;
  }

  public void setType(BuyOrSell type) {
    this.type = type;
  }

  public InlineResponse2001Order maxAmount(Float maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * Maximal handelbare BTC-Menge
   * @return maxAmount
  **/
  @ApiModelProperty(example = "null", value = "Maximal handelbare BTC-Menge")
  public Float getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(Float maxAmount) {
    this.maxAmount = maxAmount;
  }

  public InlineResponse2001Order minAmount(Float minAmount) {
    this.minAmount = minAmount;
    return this;
  }

   /**
   * Mindestens handelbare BTC-Menge
   * @return minAmount
  **/
  @ApiModelProperty(example = "null", value = "Mindestens handelbare BTC-Menge")
  public Float getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(Float minAmount) {
    this.minAmount = minAmount;
  }

  public InlineResponse2001Order price(Float price) {
    this.price = price;
    return this;
  }

   /**
   * Preis pro BTC in Euro
   * @return price
  **/
  @ApiModelProperty(example = "null", value = "Preis pro BTC in Euro")
  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public InlineResponse2001Order maxVolume(Float maxVolume) {
    this.maxVolume = maxVolume;
    return this;
  }

   /**
   * Max. Euro-Volumen der Order
   * @return maxVolume
  **/
  @ApiModelProperty(example = "null", value = "Max. Euro-Volumen der Order")
  public Float getMaxVolume() {
    return maxVolume;
  }

  public void setMaxVolume(Float maxVolume) {
    this.maxVolume = maxVolume;
  }

  public InlineResponse2001Order minVolume(Float minVolume) {
    this.minVolume = minVolume;
    return this;
  }

   /**
   * Min. Euro-Volumen der Order
   * @return minVolume
  **/
  @ApiModelProperty(example = "null", value = "Min. Euro-Volumen der Order")
  public Float getMinVolume() {
    return minVolume;
  }

  public void setMinVolume(Float minVolume) {
    this.minVolume = minVolume;
  }

  public InlineResponse2001Order endDatetime(DateTime endDatetime) {
    this.endDatetime = endDatetime;
    return this;
  }

   /**
   * Ablaufzeitpunkt des Angebots. Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00).
   * @return endDatetime
  **/
  @ApiModelProperty(example = "null", value = "Ablaufzeitpunkt des Angebots. Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00).")
  public DateTime getEndDatetime() {
    return endDatetime;
  }

  public void setEndDatetime(DateTime endDatetime) {
    this.endDatetime = endDatetime;
  }

  public InlineResponse2001Order newOrderForRemainingAmount(Boolean newOrderForRemainingAmount) {
    this.newOrderForRemainingAmount = newOrderForRemainingAmount;
    return this;
  }

   /**
   * Neues Angebot mit Restmenge anlegen, wenn nur eine Teilmenge aus dem Angebot bedient wurde.
   * @return newOrderForRemainingAmount
  **/
  @ApiModelProperty(example = "null", value = "Neues Angebot mit Restmenge anlegen, wenn nur eine Teilmenge aus dem Angebot bedient wurde.")
  public Boolean getNewOrderForRemainingAmount() {
    return newOrderForRemainingAmount;
  }

  public void setNewOrderForRemainingAmount(Boolean newOrderForRemainingAmount) {
    this.newOrderForRemainingAmount = newOrderForRemainingAmount;
  }

  public InlineResponse2001Order state(Integer state) {
    this.state = state;
    return this;
  }

   /**
   * Aktueller Status
   * @return state
  **/
  @ApiModelProperty(example = "null", value = "Aktueller Status")
  public Integer getState() {
    return state;
  }

  public void setState(Integer state) {
    this.state = state;
  }

  public InlineResponse2001Order orderRequirements(List<OrderRequirement> orderRequirements) {
    this.orderRequirements = orderRequirements;
    return this;
  }

  public InlineResponse2001Order addOrderRequirementsItem(OrderRequirement orderRequirementsItem) {
    this.orderRequirements.add(orderRequirementsItem);
    return this;
  }

   /**
   * Get orderRequirements
   * @return orderRequirements
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<OrderRequirement> getOrderRequirements() {
    return orderRequirements;
  }

  public void setOrderRequirements(List<OrderRequirement> orderRequirements) {
    this.orderRequirements = orderRequirements;
  }

  public InlineResponse2001Order createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Erstellzeitpunkt des Angebots. Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00)
   * @return createdAt
  **/
  @ApiModelProperty(example = "null", value = "Erstellzeitpunkt des Angebots. Format gemäß RFC 3339 (Bsp: 2015-01-20T15:00:00+02:00)")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2001Order inlineResponse2001Order = (InlineResponse2001Order) o;
    return Objects.equals(this.orderId, inlineResponse2001Order.orderId) &&
        Objects.equals(this.type, inlineResponse2001Order.type) &&
        Objects.equals(this.maxAmount, inlineResponse2001Order.maxAmount) &&
        Objects.equals(this.minAmount, inlineResponse2001Order.minAmount) &&
        Objects.equals(this.price, inlineResponse2001Order.price) &&
        Objects.equals(this.maxVolume, inlineResponse2001Order.maxVolume) &&
        Objects.equals(this.minVolume, inlineResponse2001Order.minVolume) &&
        Objects.equals(this.endDatetime, inlineResponse2001Order.endDatetime) &&
        Objects.equals(this.newOrderForRemainingAmount, inlineResponse2001Order.newOrderForRemainingAmount) &&
        Objects.equals(this.state, inlineResponse2001Order.state) &&
        Objects.equals(this.orderRequirements, inlineResponse2001Order.orderRequirements) &&
        Objects.equals(this.createdAt, inlineResponse2001Order.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, type, maxAmount, minAmount, price, maxVolume, minVolume, endDatetime, newOrderForRemainingAmount, state, orderRequirements, createdAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2001Order {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    maxVolume: ").append(toIndentedString(maxVolume)).append("\n");
    sb.append("    minVolume: ").append(toIndentedString(minVolume)).append("\n");
    sb.append("    endDatetime: ").append(toIndentedString(endDatetime)).append("\n");
    sb.append("    newOrderForRemainingAmount: ").append(toIndentedString(newOrderForRemainingAmount)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    orderRequirements: ").append(toIndentedString(orderRequirements)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

