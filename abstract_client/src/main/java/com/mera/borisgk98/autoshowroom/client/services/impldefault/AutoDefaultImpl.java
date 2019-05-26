package com.mera.borisgk98.autoshowroom.client.services.impldefault;

import com.mera.borisgk98.autoshowroom.client.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.Auto;
import com.mera.borisgk98.autoshowroom.client.objectfabric.Fabric;
import com.mera.borisgk98.autoshowroom.client.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@org.springframework.core.annotation.Order(org.springframework.core.Ordered.LOWEST_PRECEDENCE)
public class AutoDefaultImpl implements AutoService {

    @Autowired
    protected Fabric fabric;

    @Override
    public Auto create(Auto m) {
        return fabric.getObject(Auto.class);
    }

    @Override
    public Auto read(Integer id) throws ModelNotFound {
        return fabric.getObject(Auto.class);
    }

    @Override
    public Auto update(Auto m) throws ModelNotFound {
        return fabric.getObject(Auto.class);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {

    }

    @Override
    public boolean existById(Integer id) {
        return false;
    }

    @Override
    public boolean exist(Auto m) {
        return false;
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
