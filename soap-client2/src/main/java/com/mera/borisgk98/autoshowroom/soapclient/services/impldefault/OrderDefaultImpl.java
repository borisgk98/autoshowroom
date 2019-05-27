package com.mera.borisgk98.autoshowroom.soapclient.services.impldefault;

import com.mera.borisgk98.autoshowroom.server.soap.*;
import com.mera.borisgk98.autoshowroom.soapclient.objectfabric.Fabric;
import com.mera.borisgk98.autoshowroom.soapclient.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderDefaultImpl implements OrderService {

    @Autowired
    protected Fabric fabric;

    @Override
    public Order create(Order m) {
        return fabric.getObject(Order.class);
    }

    @Override
    public Order read(Integer id) throws ModelNotFound_Exception {
        return fabric.getObject(Order.class);
    }

    @Override
    public Order update(Order m) throws ModelNotFound_Exception {
        return fabric.getObject(Order.class);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound_Exception {

    }

    @Override
    public List<Order> getAll() {
        return fabric.getList(Order.class);
    }

    @Override
    public List<Order> getRange(Integer offset, Integer limit) {
        return fabric.getList(Order.class);
    }
}
