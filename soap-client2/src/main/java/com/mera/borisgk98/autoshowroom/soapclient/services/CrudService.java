package com.mera.borisgk98.autoshowroom.soapclient.services;

import com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound_Exception;

import java.util.List;

public interface CrudService<T, F> {
    T create(T m);
    T read(F id) throws ModelNotFound_Exception;
    T update(T m) throws ModelNotFound_Exception;
    void delete(F id) throws ModelNotFound_Exception;
    List<T> getAll();
    List<T> getRange(F limit, F offset);
}
