package com.mera.borisgk98.autoshowroom.server.services;

public interface CrudService<T, F> {
    T create(T m);
    T read(F id);
    T update(T m);
    void delete(T m);
}
