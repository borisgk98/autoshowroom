package com.mera.borisgk98.autoshowroom.server.services;

import java.util.Optional;

public interface CrudService<T, F> {
    T create(T m);
    Optional<T> read(F id);
    T update(T m);
    void delete(T m);
}
