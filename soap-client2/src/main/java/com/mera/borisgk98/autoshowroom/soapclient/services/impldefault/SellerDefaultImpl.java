package com.mera.borisgk98.autoshowroom.soapclient.services.impldefault;

import com.mera.borisgk98.autoshowroom.server.soap.*;
import com.mera.borisgk98.autoshowroom.soapclient.objectfabric.Fabric;
import com.mera.borisgk98.autoshowroom.soapclient.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SellerDefaultImpl implements SellerService {

    @Autowired
    protected Fabric fabric;

    @Override
    public Seller create(Seller m) {
        return fabric.getObject(Seller.class);
    }

    @Override
    public Seller read(Integer id) throws ModelNotFound_Exception {
        return fabric.getObject(Seller.class);
    }

    @Override
    public Seller update(Seller m) throws ModelNotFound_Exception {
        return fabric.getObject(Seller.class);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound_Exception {

    }

    @Override
    public List<Seller> getAll() {
        return fabric.getList(Seller.class);
    }

    @Override
    public List<Seller> getRange(Integer offset, Integer limit) {
        return fabric.getList(Seller.class);
    }
}
