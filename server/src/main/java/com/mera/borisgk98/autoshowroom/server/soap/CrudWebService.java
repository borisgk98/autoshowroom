package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;

import java.util.List;

public interface CrudWebService<T, F> {
//    T create(T m);
    T read(F id);
//    T update(T m);
//    void delete(F id);
//    List<T> getAll();
//    List<T> getRange(F offset, F limit);
}
