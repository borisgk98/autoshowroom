package com.mera.borisgk98.autoshowroom.client.services.impldefault;

import com.mera.borisgk98.autoshowroom.client.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.AutoMark;
import com.mera.borisgk98.autoshowroom.client.objectfabric.Fabric;
import com.mera.borisgk98.autoshowroom.client.services.AutoMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Order(Ordered.LOWEST_PRECEDENCE)
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
    public boolean existById(Integer id) {
        return false;
    }

    @Override
    public boolean exist(AutoMark m) {
        return false;
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
