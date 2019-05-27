package com.mera.borisgk98.autoshowroom.soapclient.services;

import com.mera.borisgk98.autoshowroom.soapclient.generated.ModelNotFound;

import java.util.List;

public interface CrudService<T, F> {
    T create(T m);
    T read(F id) throws ModelNotFound;
    T update(T m) throws ModelNotFound;
    void delete(F id) throws ModelNotFound;
    List<T> getAll();
    List<T> getRange(F limit, F offset);
}
