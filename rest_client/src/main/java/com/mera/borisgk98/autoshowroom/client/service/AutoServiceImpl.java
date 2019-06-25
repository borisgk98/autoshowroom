package com.mera.borisgk98.autoshowroom.client.service;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.model.Auto;
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
public class AutoServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.AutoService {

    @Autowired
    private DefaultApi api;

    @Override
    public Auto create(Auto m) {
        try {
            com.mera.borisgk98.autoshowroom.client.rest.model.Auto dto =
                    Converter.convert(m, com.mera.borisgk98.autoshowroom.client.rest.model.Auto.class);
            return Converter.convert(api.autoPost(dto), Auto.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public Auto read(Integer id) throws ModelNotFound {
        try {
            return Converter.convert(api.autoAutoIdGet(id), Auto.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public Auto update(Auto m) throws ModelNotFound {
        try {
            com.mera.borisgk98.autoshowroom.client.rest.model.Auto dto =
                    Converter.convert(m, com.mera.borisgk98.autoshowroom.client.rest.model.Auto.class);
            return Converter.convert(api.autoAutoIdPut(dto), Auto.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {
        try {
            api.autoAutoIdDelete(id);
        }
        catch (ApiException exc) {
            System.err.println(exc);
        }
    }

    @Override
    public List<Auto> getAll() {
        try {
            return api.autoGet(null, null)
                    .stream()
                    .map(x -> Converter.convert(x, Auto.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public List<Auto> getRange(Integer limit, Integer offset) {
        try {
            return api.autoGet(limit, offset)
                    .stream()
                    .map(x -> Converter.convert(x, Auto.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }
}
