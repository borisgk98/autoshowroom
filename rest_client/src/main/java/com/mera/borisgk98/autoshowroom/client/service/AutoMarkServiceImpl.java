package com.mera.borisgk98.autoshowroom.client.service;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.model.AutoMark;
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
public class AutoMarkServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.AutoMarkService {

    @Autowired
    private DefaultApi api;

    @Override
    public AutoMark create(AutoMark m) {
        try {
            com.mera.borisgk98.autoshowroom.client.rest.model.AutoMark dto =
                    Converter.convert(m, com.mera.borisgk98.autoshowroom.client.rest.model.AutoMark.class);
            return Converter.convert(api.automarkPost(dto), AutoMark.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public AutoMark read(Integer id) throws ModelNotFound {
        try {
            return Converter.convert(api.automarkAutomarkIdGet(id), AutoMark.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public AutoMark update(AutoMark m) throws ModelNotFound {
        try {
            com.mera.borisgk98.autoshowroom.client.rest.model.AutoMark dto =
                    Converter.convert(m, com.mera.borisgk98.autoshowroom.client.rest.model.AutoMark.class);
            return Converter.convert(api.automarkAutomarkIdPut(dto), AutoMark.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {
        try {
            api.automarkAutomarkIdDelete(id);
        }
        catch (ApiException exc) {
            System.err.println(exc);
        }
    }

    @Override
    public List<AutoMark> getAll() {
        try {
            return api.automarkGet(null, null)
                    .stream()
                    .map(x -> Converter.convert(x, AutoMark.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public List<AutoMark> getRange(Integer limit, Integer offset) {
        try {
            return api.automarkGet(limit, offset)
                    .stream()
                    .map(x -> Converter.convert(x, AutoMark.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }
}
