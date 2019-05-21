package com.mera.borisgk98.autoshowroom.server.services;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public abstract class AbstractPaginableService<T> extends AbstractCrudService<T, Integer> {

    @Override
    public List<T> getRange(Integer offset, Integer limit) {
        Pageable request = PageRequest.of(offset, limit);
        return repository.findAll(request).getContent();
    }
}
