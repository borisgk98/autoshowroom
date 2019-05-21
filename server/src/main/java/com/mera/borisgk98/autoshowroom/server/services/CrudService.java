package com.mera.borisgk98.autoshowroom.server.services;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;

import java.util.Optional;

public interface CrudService<T, F> {
    T create(T m);
    T read(F id) throws ModelNotFound;
    T update(T m) throws ModelNotFound;
    void delete(F id) throws ModelNotFound;
    boolean existById(F id);
    boolean exist(T m);
}
