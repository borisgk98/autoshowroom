package com.mera.borisgk98.autoshowroom.server.services;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Auto;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

public abstract class AbstractCrudService<T, F> implements CrudService<T, F> {
    protected JpaRepository<T, F> repository;

    public AbstractCrudService() {
    }

    @Override
    public T create(T m) {
        return repository.save(m);
    }

    @Override
    public T read(F id) throws ModelNotFound{
        Optional<T> m = repository.findById(id);
        if (!m.isPresent()) {
            throw new ModelNotFound();
        }
        return m.get();
    }

    @Override
    public T update(T m) throws ModelNotFound{
        if (!exist(m)) {
            throw new ModelNotFound();
        }
        return repository.save(m);
    }

    @Override
    public void delete(F id) throws ModelNotFound {
        if (!existById(id)) {
            throw new ModelNotFound();
        }
        repository.deleteById(id);
    }

    @Override
    public boolean exist(T m) {
        return repository.exists(Example.of(m));
    }

    @Override
    public boolean existById(F id) {
        return repository.existsById(id);
    }
}

