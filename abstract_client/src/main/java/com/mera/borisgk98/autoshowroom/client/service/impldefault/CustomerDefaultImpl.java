package com.mera.borisgk98.autoshowroom.client.service.impldefault;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.model.Customer;
import com.mera.borisgk98.autoshowroom.client.objectfabric.Fabric;
import com.mera.borisgk98.autoshowroom.client.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@org.springframework.core.annotation.Order(org.springframework.core.Ordered.LOWEST_PRECEDENCE)
public class CustomerDefaultImpl implements CustomerService {

    @Autowired
    protected Fabric fabric;

    @Override
    public Customer create(Customer m) {
        return fabric.getObject(Customer.class);
    }

    @Override
    public Customer read(Integer id) throws ModelNotFound {
        return fabric.getObject(Customer.class);
    }

    @Override
    public Customer update(Customer m) throws ModelNotFound {
        return fabric.getObject(Customer.class);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {

    }

    @Override
    public List<Customer> getAll() {
        return fabric.getList(Customer.class);
    }

    @Override
    public List<Customer> getRange(Integer offset, Integer limit) {
        return fabric.getList(Customer.class);
    }
}
