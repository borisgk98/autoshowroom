package com.mera.borisgk98.autoshowroom.soapclient.services.impldefault;

import com.mera.borisgk98.autoshowroom.server.soap.*;
import com.mera.borisgk98.autoshowroom.soapclient.objectfabric.Fabric;
import com.mera.borisgk98.autoshowroom.soapclient.services.AutoModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AutoModelDefaultImpl implements AutoModelService {

    @Autowired
    protected Fabric fabric;

    @Override
    public AutoModel create(AutoModel m) {
        return fabric.getObject(AutoModel.class);
    }

    @Override
    public AutoModel read(Integer id) throws ModelNotFound_Exception {
        return fabric.getObject(AutoModel.class);
    }

    @Override
    public AutoModel update(AutoModel m) throws ModelNotFound_Exception {
        return fabric.getObject(AutoModel.class);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound_Exception {

    }

    @Override
    public List<AutoModel> getAll() {
        return fabric.getList(AutoModel.class);
    }

    @Override
    public List<AutoModel> getRange(Integer offset, Integer limit) {
        return fabric.getList(AutoModel.class);
    }
}
