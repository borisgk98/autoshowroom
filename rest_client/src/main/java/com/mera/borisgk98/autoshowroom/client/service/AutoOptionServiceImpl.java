package com.mera.borisgk98.autoshowroom.client.service;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.model.AutoOption;
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
public class AutoOptionServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.AutoOptionService {

    @Autowired
    private DefaultApi api;

    @Override
    public AutoOption create(AutoOption m) {
        try {
            com.mera.borisgk98.autoshowroom.client.rest.model.AutoOption dto =
                    Converter.convert(m, com.mera.borisgk98.autoshowroom.client.rest.model.AutoOption.class);
            return Converter.convert(api.autooptionPost(dto), AutoOption.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public AutoOption read(Integer id) throws ModelNotFound {
        try {
            return Converter.convert(api.autooptionAutooptionIdGet(id), AutoOption.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public AutoOption update(AutoOption m) throws ModelNotFound {
        try {
            com.mera.borisgk98.autoshowroom.client.rest.model.AutoOption dto =
                    Converter.convert(m, com.mera.borisgk98.autoshowroom.client.rest.model.AutoOption.class);
            return Converter.convert(api.autooptionAutooptionIdPut(dto), AutoOption.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {
        try {
            api.autooptionAutooptionIdDelete(id);
        }
        catch (ApiException exc) {
            System.err.println(exc);
        }
    }

    @Override
    public List<AutoOption> getAll() {
        try {
            return api.autooptionGet(null, null)
                    .stream()
                    .map(x -> Converter.convert(x, AutoOption.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public List<AutoOption> getRange(Integer limit, Integer offset) {
        try {
            return api.autooptionGet(limit, offset)
                    .stream()
                    .map(x -> Converter.convert(x, AutoOption.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }
}
