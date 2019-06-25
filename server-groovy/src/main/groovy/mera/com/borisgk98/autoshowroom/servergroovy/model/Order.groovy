package mera.com.borisgk98.autoshowroom.servergroovy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Order implements HasId<Integer> {
  @JsonProperty("id")
  private Integer id;

  @JsonProperty("seller")
  private Seller seller = null;

  @JsonProperty("customer")
  private Customer customer = null;

  @JsonProperty("auto")
  private Auto auto = null;

  @JsonProperty("status")
  private OrderStatus status = null;

  public Order id(Integer id) {
    this.id = id;
    return this;
  }



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


  public OrderStatus getStatus() {
    return status;
  }

  public void setStatus(OrderStatus status) {
    this.status = status;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

