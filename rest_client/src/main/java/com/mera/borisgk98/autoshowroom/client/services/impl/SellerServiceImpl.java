package com.mera.borisgk98.autoshowroom.client.services.impl;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.Auto;
import com.mera.borisgk98.autoshowroom.client.models.Seller;
import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;
import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class SellerServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.SellerService {

    @Autowired
    private DefaultApi api;

    @Override
    public Seller create(Seller m) {
        try {
            return api.sellerPost(m);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public Seller read(Integer id) throws ModelNotFound {
        try {
            return api.sellerSellerIdGet(id);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public Seller update(Seller m) throws ModelNotFound {
        try {
            return api.sellerSellerIdPut(m);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {
        try {
            api.sellerSellerIdDelete(id);
        }
        catch (ApiException exc) {
            System.err.println(exc);
        }
    }

    @Override
    public List<Seller> getAll() {
        try {
            return api.sellerGet(null, null);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public List<Seller> getRange(Integer limit, Integer offset) {
        try {
            return api.sellerGet(limit, offset);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }
}
