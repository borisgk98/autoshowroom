package com.mera.borisgk98.autoshowroom.server.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.mera.borisgk98.autoshowroom.server.models.Auto;
import com.mera.borisgk98.autoshowroom.server.models.Customer;
import com.mera.borisgk98.autoshowroom.server.models.OrderStatus;
import com.mera.borisgk98.autoshowroom.server.models.Seller;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Contains information about
 */
@ApiModel(description = "Contains information about")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T17:07:29.290+03:00[Europe/Moscow]")
@Entity
public class Order implements HasId<Integer> {
  @JsonProperty("id")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @JsonProperty("seller")
  @OneToOne
  private Seller seller = null;

  @JsonProperty("customer")
  @OneToOne
  private Customer customer = null;

  @JsonProperty("auto")
  @OneToOne
  private Auto auto = null;

  @JsonProperty("status")
  private OrderStatus status = OrderStatus.ACCEPTED;

  public Order id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  @ApiModelProperty(value = "")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Order seller(Seller seller) {
    this.seller = seller;
    return this;
  }

  /**
   * Get seller
   * @return seller
  */
  @ApiModelProperty(value = "")


  public Seller getSeller() {
    return seller;
  }

  public void setSeller(Seller seller) {
    this.seller = seller;
  }

  public Order customer(Customer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Get customer
   * @return customer
  */
  @ApiModelProperty(value = "")


  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Order auto(Auto auto) {
    this.auto = auto;
    return this;
  }

  /**
   * Get auto
   * @return auto
  */
  @ApiModelProperty(value = "")


  public Auto getAuto() {
    return auto;
  }

  public void setAuto(Auto auto) {
    this.auto = auto;
  }

  public Order status(OrderStatus status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.id, order.id) &&
        Objects.equals(this.seller, order.seller) &&
        Objects.equals(this.customer, order.customer) &&
        Objects.equals(this.auto, order.auto) &&
        Objects.equals(this.status, order.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, seller, customer, auto, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Order {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    seller: ").append(toIndentedString(seller)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    auto: ").append(toIndentedString(auto)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

