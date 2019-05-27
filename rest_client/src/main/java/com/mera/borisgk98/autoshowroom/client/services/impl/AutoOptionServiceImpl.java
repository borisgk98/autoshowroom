package com.mera.borisgk98.autoshowroom.client.services.impl;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.Auto;
import com.mera.borisgk98.autoshowroom.client.models.AutoOption;
import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;
import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class AutoOptionServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.AutoOptionService {

    @Autowired
    private DefaultApi api;

    @Override
    public AutoOption create(AutoOption m) {
        try {
            return api.autooptionPost(m);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public AutoOption read(Integer id) throws ModelNotFound {
        try {
            return api.autooptionAutooptionIdGet(id);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public AutoOption update(AutoOption m) throws ModelNotFound {
        try {
            return api.autooptionAutooptionIdPut(m);
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
            return api.autooptionGet(null, null);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public List<AutoOption> getRange(Integer limit, Integer offset) {
        try {
            return api.autooptionGet(limit, offset);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }
}
