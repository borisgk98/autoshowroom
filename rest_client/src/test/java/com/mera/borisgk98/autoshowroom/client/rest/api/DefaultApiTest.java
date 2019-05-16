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


package com.mera.borisgk98.autoshowroom.client.rest.api;

import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
import com.mera.borisgk98.autoshowroom.client.models.Auto;
import com.mera.borisgk98.autoshowroom.client.models.AutoMark;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    
    /**
     * 
     *
     * Get information about auto by auto id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void autoAutoIdGetTest() throws ApiException {
        Integer autoId = null;
        Auto response = api.autoAutoIdGet(autoId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get information about auto by auto_mark id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void autoMarkAutoMarkIdGetTest() throws ApiException {
        Integer autoMarkId = null;
        AutoMark response = api.autoMarkAutoMarkIdGet(autoMarkId);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add new auto_mark
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void autoMarkPostTest() throws ApiException {
        AutoMark autoMark = null;
        AutoMark response = api.autoMarkPost(autoMark);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add new auto
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void autoPostTest() throws ApiException {
        Auto auto = null;
        Auto response = api.autoPost(auto);

        // TODO: test validations
    }
    
}
