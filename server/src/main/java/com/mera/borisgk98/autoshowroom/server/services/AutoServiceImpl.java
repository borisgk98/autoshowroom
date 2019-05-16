package com.mera.borisgk98.autoshowroom.server.services;

import com.mera.borisgk98.autoshowroom.server.models.Auto;
import com.mera.borisgk98.autoshowroom.server.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoServiceImpl
        extends AbstractCrudService<Auto, Long>
        implements AutoService {

    @Autowired
    public AutoServiceImpl(AutoRepository repository) {
        this.repository = repository;
    }
}
