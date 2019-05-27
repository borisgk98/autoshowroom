package com.mera.borisgk98.autoshowroom.client.services.impl;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.Auto;
import com.mera.borisgk98.autoshowroom.client.models.Order;
import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;
import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class OrderServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.OrderService {

    @Autowired
    private DefaultApi api;

    @Override
    public Order create(Order m) {
        try {
            return api.orderPost(m);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public Order read(Integer id) throws ModelNotFound {
        try {
            return api.orderOrderIdGet(id);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public Order update(Order m) throws ModelNotFound {
        try {
            return api.orderOrderIdPut(m);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {
        try {
            api.orderOrderIdDelete(id);
        }
        catch (ApiException exc) {
            System.err.println(exc);
        }
    }

    @Override
    public List<Order> getAll() {
        try {
            return api.orderGet(null, null);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public List<Order> getRange(Integer limit, Integer offset) {
        try {
            return api.orderGet(limit, offset);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }
}
