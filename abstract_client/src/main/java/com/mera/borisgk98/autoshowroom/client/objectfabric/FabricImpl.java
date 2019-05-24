package com.mera.borisgk98.autoshowroom.client.objectfabric;

import com.mera.borisgk98.autoshowroom.client.models.AutoMark;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class FabricImpl implements Fabric {

    private Map<Class, Object> values;

    public FabricImpl() {
        values = new HashMap<>();
        values.put(AutoMark.class, new AutoMark(){{
            name("BMV");
        }});
    }

    @Override
    public <T> T getObject(Class<T> c) {
        if (values.containsKey(c)) {
            return (T) values.get(c);
        }
        return null;
    }

    @Override
    public <T> List<T> getList(Class<T> c) {
        return new ArrayList<>();
    }
}
