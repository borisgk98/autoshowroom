package com.mera.borisgk98.autoshowroom.soapclient.objectfabric;

import com.mera.borisgk98.autoshowroom.soapclient.model.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class FabricImpl implements Fabric {

    private Map<Class, Object> values;
    private final Integer listSize = 5;

    public FabricImpl() {
        values = new HashMap<>();
        values.put(AutoMark.class, new AutoMark(){{
            setName("BMV");
        }});
    }

    @Override
    public <T> T getObject(Class<T> c) {
        if (values.containsKey(c)) {
            return (T) values.get(c);
        }
        try {
            Constructor<T> constructor = c.getConstructor(null);
            return constructor.newInstance(null);
        }
        catch (
                NoSuchMethodException |
                IllegalAccessException |
                InvocationTargetException |
                InstantiationException e
        ) {
            return null;
        }
    }

    @Override
    public <T> List<T> getList(Class<T> c) {
        return new ArrayList<T>(){{
            for (int i = 0; i < listSize; i++) {
                add(getObject(c));
            }
        }};
    }
}
