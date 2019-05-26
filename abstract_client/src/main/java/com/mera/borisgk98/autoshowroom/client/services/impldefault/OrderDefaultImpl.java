package com.mera.borisgk98.autoshowroom.client.services.impldefault;

import com.mera.borisgk98.autoshowroom.client.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.Order;
import com.mera.borisgk98.autoshowroom.client.objectfabric.Fabric;
import com.mera.borisgk98.autoshowroom.client.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@org.springframework.core.annotation.Order(org.springframework.core.Ordered.LOWEST_PRECEDENCE)
public class OrderDefaultImpl implements OrderService {

    @Autowired
    protected Fabric fabric;

    @Override
    public Order create(Order m) {
        return fabric.getObject(Order.class);
    }

    @Override
    public Order read(Integer id) throws ModelNotFound {
        return fabric.getObject(Order.class);
    }

    @Override
    public Order update(Order m) throws ModelNotFound {
        return fabric.getObject(Order.class);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {

    }

    @Override
    public boolean existById(Integer id) {
        return false;
    }

    @Override
    public boolean exist(Order m) {
        return false;
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
