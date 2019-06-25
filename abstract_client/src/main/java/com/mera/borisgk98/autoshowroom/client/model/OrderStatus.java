package com.mera.borisgk98.autoshowroom.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Contains information about
 */
public enum OrderStatus {
  
  ACCEPTED("ACCEPTED"),
  
  IN_PROCESSING("IN_PROCESSING"),
  
  DONE("DONE");

  private String value;

  OrderStatus(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static OrderStatus fromValue(String text) {
    for (OrderStatus b : OrderStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }
}

