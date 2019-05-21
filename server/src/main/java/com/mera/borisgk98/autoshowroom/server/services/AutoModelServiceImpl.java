package com.mera.borisgk98.autoshowroom.server.services;

import com.mera.borisgk98.autoshowroom.server.models.AutoModel;
import com.mera.borisgk98.autoshowroom.server.repositories.AutoModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoModelServiceImpl
        extends AbstractPaginableService<AutoModel>
        implements AutoModelService {

    @Autowired
    public AutoModelServiceImpl(AutoModelRepository repository) {
        this.repository = repository;
    }
}
