/*
 * Autoshowroom API
 * An API that allows clients to obtain existing information of orders, create, edit and delete orders
 *
 * OpenAPI spec version: 0.1
 * Contact: borisgk98@ya.ru
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mera.borisgk98.autoshowroom.client.rest.model;

import java.util.Objects;
import java.util.Arrays;
import io.swagger.annotations.ApiModel;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Contains information about
 */
@JsonAdapter(OrderStatus.Adapter.class)
public enum OrderStatus {
  
  ACCEPTED("ACCEPTED"),
  
  IN_PROCESSING("IN_PROCESSING"),
  
  DONE("DONE");

  private String value;

  OrderStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OrderStatus fromValue(String text) {
    for (OrderStatus b : OrderStatus.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + text + "'");
  }

  public static class Adapter extends TypeAdapter<OrderStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final OrderStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public OrderStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return OrderStatus.fromValue(String.valueOf(value));
    }
  }
}

