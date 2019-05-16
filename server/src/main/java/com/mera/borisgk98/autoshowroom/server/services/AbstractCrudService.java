package com.mera.borisgk98.autoshowroom.server.services;

import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractCrudService<T, F> implements CrudService<T, F> {
    protected JpaRepository<T, F> repository;

    public AbstractCrudService() {
    }

    @Override
    public T create(T m) {
        return repository.save(m);
    }

    @Override
    public T read(F id) {
        return repository.getOne(id);
    }

    @Override
    public T update(T m) {
        return repository.save(m);
    }

    @Override
    public void delete(T m) {
        repository.delete(m);
    }
}
