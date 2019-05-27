package com.mera.borisgk98.autoshowroom.soapclient.services.impldefault;

import com.mera.borisgk98.autoshowroom.server.soap.*;
import com.mera.borisgk98.autoshowroom.soapclient.objectfabric.Fabric;
import com.mera.borisgk98.autoshowroom.soapclient.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AutoDefaultImpl implements AutoService {

    @Autowired
    protected Fabric fabric;

    @Override
    public Auto create(Auto m) {
        return fabric.getObject(Auto.class);
    }

    @Override
    public Auto read(Integer id) throws ModelNotFound_Exception {
        return fabric.getObject(Auto.class);
    }

    @Override
    public Auto update(Auto m) throws ModelNotFound_Exception {
        return fabric.getObject(Auto.class);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound_Exception {

    }

    @Override
    public List<Auto> getAll() {
        return fabric.getList(Auto.class);
    }

    @Override
    public List<Auto> getRange(Integer offset, Integer limit) {
        return fabric.getList(Auto.class);
    }
}
