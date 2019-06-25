package com.mera.borisgk98.autoshowroom.client.service;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.model.Order;
import com.mera.borisgk98.autoshowroom.client.model.OrderStatus;
import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;
import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
import com.mera.borisgk98.autoshowroom.client.tool.Converter;
import org.springframework.context.annotation.Primary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;
import java.util.stream.Collectors;

@Component
@Primary
public class OrderServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.OrderService {

    @Autowired
    private DefaultApi api;

    @Override
    public Order create(Order m) {
        try {
            com.mera.borisgk98.autoshowroom.client.rest.model.Order dto =
                    Converter.convert(m, com.mera.borisgk98.autoshowroom.client.rest.model.Order.class);
            return Converter.convert(api.orderPost(dto), Order.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public Order read(Integer id) throws ModelNotFound {
        try {
            return Converter.convert(api.orderOrderIdGet(id), Order.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public Order update(Order m) throws ModelNotFound {
        try {
            com.mera.borisgk98.autoshowroom.client.rest.model.Order dto =
                    Converter.convert(m, com.mera.borisgk98.autoshowroom.client.rest.model.Order.class);
            return Converter.convert(api.orderOrderIdPut(dto), Order.class);
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
            return api.orderGet(null, null, null)
                    .stream()
                    .map(x -> Converter.convert(x, Order.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public List<Order> getRange(Integer limit, Integer offset) {
        try {
            return api.orderGet(limit, offset, null)
                    .stream()
                    .map(x -> Converter.convert(x, Order.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public List<Order> filter(OrderStatus status) {
        try {
            return api.orderGet(null, null, status.toString())
                    .stream()
                    .map(x -> Converter.convert(x, Order.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }
}
