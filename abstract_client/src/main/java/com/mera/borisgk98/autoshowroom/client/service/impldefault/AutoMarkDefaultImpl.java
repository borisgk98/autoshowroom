package com.mera.borisgk98.autoshowroom.client.service.impldefault;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.model.AutoMark;
import com.mera.borisgk98.autoshowroom.client.objectfabric.Fabric;
import com.mera.borisgk98.autoshowroom.client.service.AutoMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@org.springframework.core.annotation.Order(org.springframework.core.Ordered.LOWEST_PRECEDENCE)
public class AutoMarkDefaultImpl implements AutoMarkService {

    @Autowired
    protected Fabric fabric;

    @Override
    public AutoMark create(AutoMark m) {
        return fabric.getObject(AutoMark.class);
    }

    @Override
    public AutoMark read(Integer id) throws ModelNotFound {
        return fabric.getObject(AutoMark.class);
    }

    @Override
    public AutoMark update(AutoMark m) throws ModelNotFound {
        return fabric.getObject(AutoMark.class);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {

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
