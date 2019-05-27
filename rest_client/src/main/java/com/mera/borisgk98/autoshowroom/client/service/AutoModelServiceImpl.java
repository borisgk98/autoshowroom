package com.mera.borisgk98.autoshowroom.client.service;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.model.AutoModel;
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
public class AutoModelServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.AutoModelService {

    @Autowired
    private DefaultApi api;

    @Override
    public AutoModel create(AutoModel m) {
        try {
            com.mera.borisgk98.autoshowroom.client.rest.model.AutoModel dto =
                    Converter.convert(m, com.mera.borisgk98.autoshowroom.client.rest.model.AutoModel.class);
            return Converter.convert(api.automodelPost(dto), AutoModel.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public AutoModel read(Integer id) throws ModelNotFound {
        try {
            return Converter.convert(api.automodelAutomodelIdGet(id), AutoModel.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public AutoModel update(AutoModel m) throws ModelNotFound {
        try {
            com.mera.borisgk98.autoshowroom.client.rest.model.AutoModel dto =
                    Converter.convert(m, com.mera.borisgk98.autoshowroom.client.rest.model.AutoModel.class);
            return Converter.convert(api.automodelAutomodelIdPut(dto), AutoModel.class);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {
        try {
            api.automodelAutomodelIdDelete(id);
        }
        catch (ApiException exc) {
            System.err.println(exc);
        }
    }

    @Override
    public List<AutoModel> getAll() {
        try {
            return api.automodelGet(null, null)
                    .stream()
                    .map(x -> Converter.convert(x, AutoModel.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public List<AutoModel> getRange(Integer limit, Integer offset) {
        try {
            return api.automodelGet(limit, offset)
                    .stream()
                    .map(x -> Converter.convert(x, AutoModel.class))
                    .collect(Collectors.toList());
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }
}
