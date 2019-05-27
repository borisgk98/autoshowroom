package com.mera.borisgk98.autoshowroom.client.services.impldefault;


import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.*;
import com.mera.borisgk98.autoshowroom.client.objectfabric.Fabric;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
@org.springframework.core.annotation.Order(org.springframework.core.Ordered.LOWEST_PRECEDENCE)
public class AutoOptionDefaultImpl implements com.mera.borisgk98.autoshowroom.client.service.AutoOptionService {

    @Autowired
    protected Fabric fabric;

    @Override
    public AutoOption create(AutoOption m) {
        return fabric.getObject(AutoOption.class);
    }

    @Override
    public AutoOption read(Integer id) throws ModelNotFound {
        return fabric.getObject(AutoOption.class);
    }

    @Override
    public AutoOption update(AutoOption m) throws ModelNotFound {
        return fabric.getObject(AutoOption.class);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {

    }

    @Override
    public List<AutoOption> getAll() {
        return fabric.getList(AutoOption.class);
    }

    @Override
    public List<AutoOption> getRange(Integer offset, Integer limit) {
        return fabric.getList(AutoOption.class);
    }
}
