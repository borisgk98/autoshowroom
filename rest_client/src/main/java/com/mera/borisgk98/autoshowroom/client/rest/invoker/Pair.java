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


package com.mera.borisgk98.autoshowroom.client.rest.invoker;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-06-03T11:37:35.434+03:00[Europe/Moscow]")
public class Pair {
    private String name = "";
    private String value = "";

    public Pair (String name, String value) {
        setName(name);
        setValue(value);
    }

    private void setName(String name) {
        if (!isValidString(name)) {
            return;
        }

        this.name = name;
    }

    private void setValue(String value) {
        if (!isValidString(value)) {
            return;
        }

        this.value = value;
    }

    public String getName() {
        return this.name;
    }

    public String getValue() {
        return this.value;
    }

    private boolean isValidString(String arg) {
        if (arg == null) {
            return false;
        }

        if (arg.trim().isEmpty()) {
            return false;
        }

        return true;
    }
}
