package com.mera.borisgk98.autoshowroom.client.objectfabric;

import java.util.List;

public interface Fabric {
    <T> T getObject(Class<T> c);
    <T> List<T> getList(Class<T> c);
}
