package com.mera.borisgk98.autoshowroom.client.service;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.model.Customer;
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
public class CustomerServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.CustomerService {

    @Autowired
    private DefaultApi api;

    @Override
    public Customer create(Customer m) {
        try {
            com.mera.borisgk98.autoshowroom.client.rest.model.Customer dto =
                    Converter.convert(m, com.mera.borisgk98.autoshowroom.client.rest.model.Customer.class);
            return Converter.convert(api.customerPost(dto), Customer.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public Customer read(Integer id) throws ModelNotFound {
        try {
            return Converter.convert(api.customerCustomerIdGet(id), Customer.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public Customer update(Customer m) throws ModelNotFound {
        try {
            com.mera.borisgk98.autoshowroom.client.rest.model.Customer dto =
                    Converter.convert(m, com.mera.borisgk98.autoshowroom.client.rest.model.Customer.class);
            return Converter.convert(api.customerCustomerIdPut(dto), Customer.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {
        try {
            api.customerCustomerIdDelete(id);
        }
        catch (ApiException exc) {
            System.err.println(exc);
        }
    }

    @Override
    public List<Customer> getAll() {
        try {
            return api.customerGet(null, null)
                    .stream()
                    .map(x -> Converter.convert(x, Customer.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public List<Customer> getRange(Integer limit, Integer offset) {
        try {
            return api.customerGet(limit, offset)
                    .stream()
                    .map(x -> Converter.convert(x, Customer.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }
}
