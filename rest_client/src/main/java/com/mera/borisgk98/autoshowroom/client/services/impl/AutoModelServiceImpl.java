package com.mera.borisgk98.autoshowroom.client.services.impl;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.Auto;
import com.mera.borisgk98.autoshowroom.client.models.AutoModel;
import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;
import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class AutoModelServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.AutoModelService {

    @Autowired
    private DefaultApi api;

    @Override
    public AutoModel create(AutoModel m) {
        try {
            return api.automodelPost(m);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public AutoModel read(Integer id) throws ModelNotFound {
        try {
            return api.automodelAutomodelIdGet(id);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public AutoModel update(AutoModel m) throws ModelNotFound {
        try {
            return api.automodelAutomodelIdPut(m);
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
            return api.automodelGet(null, null);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public List<AutoModel> getRange(Integer limit, Integer offset) {
        try {
            return api.automodelGet(limit, offset);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }
}
