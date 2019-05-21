package com.mera.borisgk98.autoshowroom.server.services;

import com.mera.borisgk98.autoshowroom.server.models.AutoOption;
import com.mera.borisgk98.autoshowroom.server.repositories.AutoOptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoOptionServiceImpl
        extends AbstractPaginableService<AutoOption>
        implements AutoOptionService {

    @Autowired
    public AutoOptionServiceImpl(AutoOptionRepository repository) {
        this.repository = repository;
    }
}
