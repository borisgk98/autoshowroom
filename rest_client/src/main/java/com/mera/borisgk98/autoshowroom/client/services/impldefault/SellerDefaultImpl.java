package com.mera.borisgk98.autoshowroom.client.services.impldefault;


import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.*;
import com.mera.borisgk98.autoshowroom.client.objectfabric.Fabric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@org.springframework.core.annotation.Order(org.springframework.core.Ordered.LOWEST_PRECEDENCE)
public class SellerDefaultImpl implements com.mera.borisgk98.autoshowroom.client.service.SellerService {

    @Autowired
    protected Fabric fabric;

    @Override
    public Seller create(Seller m) {
        return fabric.getObject(Seller.class);
    }

    @Override
    public Seller read(Integer id) throws ModelNotFound {
        return fabric.getObject(Seller.class);
    }

    @Override
    public Seller update(Seller m) throws ModelNotFound {
        return fabric.getObject(Seller.class);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {

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
