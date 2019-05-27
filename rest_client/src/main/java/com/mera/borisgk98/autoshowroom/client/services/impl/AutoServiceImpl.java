package com.mera.borisgk98.autoshowroom.client.services.impl;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.Auto;
import com.mera.borisgk98.autoshowroom.client.models.Auto;
import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;
import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class AutoServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.AutoService {

    @Autowired
    private DefaultApi api;

    @Override
    public Auto create(Auto m) {
        try {
            return api.autoPost(m);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public Auto read(Integer id) throws ModelNotFound {
        try {
            return api.autoAutoIdGet(id);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public Auto update(Auto m) throws ModelNotFound {
        try {
            return api.autoAutoIdPut(m);
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
            return api.autoGet(null, null);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }

    @Override
    public List<Auto> getRange(Integer limit, Integer offset) {
        try {
            return api.autoGet(limit, offset);
        }
        catch (ApiException exc) {
            System.err.println(exc);
            return null;
        }
    }
}
