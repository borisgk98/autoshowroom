package com.mera.borisgk98.autoshowroom.client.service;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.model.HasId;

import java.util.List;

public interface CrudService<T extends HasId<Integer>, F> {
    T create(T m);
    T read(F id) throws ModelNotFound;
    T update(T m) throws ModelNotFound;
    void delete(F id) throws ModelNotFound;
    boolean existById(F id);
    boolean exist(T m);
    List<T> getAll();
    List<T> getRange(F offset, F limit);
}
