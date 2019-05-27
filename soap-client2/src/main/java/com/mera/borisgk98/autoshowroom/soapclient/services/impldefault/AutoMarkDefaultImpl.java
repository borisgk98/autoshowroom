package com.mera.borisgk98.autoshowroom.soapclient.services.impldefault;

import com.mera.borisgk98.autoshowroom.server.soap.*;
import com.mera.borisgk98.autoshowroom.soapclient.objectfabric.Fabric;
import com.mera.borisgk98.autoshowroom.soapclient.services.AutoMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AutoMarkDefaultImpl implements AutoMarkService {

    @Autowired
    protected Fabric fabric;

    @Override
    public AutoMark create(AutoMark m) {
        return fabric.getObject(AutoMark.class);
    }

    @Override
    public AutoMark read(Integer id) throws ModelNotFound_Exception {
        return fabric.getObject(AutoMark.class);
    }

    @Override
    public AutoMark update(AutoMark m) throws ModelNotFound_Exception {
        return fabric.getObject(AutoMark.class);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound_Exception {

    }

    @Override
    public List<AutoMark> getAll() {
        return fabric.getList(AutoMark.class);
    }

    @Override
    public List<AutoMark> getRange(Integer offset, Integer limit) {
        return fabric.getList(AutoMark.class);
    }
}
