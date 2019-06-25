package com.mera.borisgk98.autoshowroom.client.service.impldefault;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.model.AutoModel;
import com.mera.borisgk98.autoshowroom.client.objectfabric.Fabric;
import com.mera.borisgk98.autoshowroom.client.service.AutoModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@org.springframework.core.annotation.Order(org.springframework.core.Ordered.LOWEST_PRECEDENCE)
public class AutoModelDefaultImpl implements AutoModelService {

    @Autowired
    protected Fabric fabric;

    @Override
    public AutoModel create(AutoModel m) {
        return fabric.getObject(AutoModel.class);
    }

    @Override
    public AutoModel read(Integer id) throws ModelNotFound {
        return fabric.getObject(AutoModel.class);
    }

    @Override
    public AutoModel update(AutoModel m) throws ModelNotFound {
        return fabric.getObject(AutoModel.class);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {

    }

    @Override
    public List<AutoModel> getAll() {
        return fabric.getList(AutoModel.class);
    }

    @Override
    public List<AutoModel> getRange(Integer offset, Integer limit) {
        return fabric.getList(AutoModel.class);
    }
}
