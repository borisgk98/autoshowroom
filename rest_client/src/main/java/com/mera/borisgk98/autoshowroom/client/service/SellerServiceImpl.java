package com.mera.borisgk98.autoshowroom.client.service;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.model.Seller;
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
public class SellerServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.SellerService {

    @Autowired
    private DefaultApi api;

    @Override
    public Seller create(Seller m) {
        try {
            com.mera.borisgk98.autoshowroom.client.rest.model.Seller dto =
                    Converter.convert(m, com.mera.borisgk98.autoshowroom.client.rest.model.Seller.class);
            return Converter.convert(api.sellerPost(dto), Seller.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public Seller read(Integer id) throws ModelNotFound {
        try {
            return Converter.convert(api.sellerSellerIdGet(id), Seller.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public Seller update(Seller m) throws ModelNotFound {
        try {
            com.mera.borisgk98.autoshowroom.client.rest.model.Seller dto =
                    Converter.convert(m, com.mera.borisgk98.autoshowroom.client.rest.model.Seller.class);
            return Converter.convert(api.sellerSellerIdPut(dto), Seller.class);
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
            return api.sellerGet(null, null)
                    .stream()
                    .map(x -> Converter.convert(x, Seller.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public List<Seller> getRange(Integer limit, Integer offset) {
        try {
            return api.sellerGet(limit, offset)
                    .stream()
                    .map(x -> Converter.convert(x, Seller.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }
}
