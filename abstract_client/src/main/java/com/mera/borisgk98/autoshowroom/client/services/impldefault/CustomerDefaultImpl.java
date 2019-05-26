package com.mera.borisgk98.autoshowroom.client.services.impldefault;

import com.mera.borisgk98.autoshowroom.client.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.Customer;
import com.mera.borisgk98.autoshowroom.client.objectfabric.Fabric;
import com.mera.borisgk98.autoshowroom.client.services.CustomerService;
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
    public boolean existById(Integer id) {
        return false;
    }

    @Override
    public boolean exist(Customer m) {
        return false;
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
