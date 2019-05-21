package com.mera.borisgk98.autoshowroom.server.services;

import com.mera.borisgk98.autoshowroom.server.models.AutoMark;
import com.mera.borisgk98.autoshowroom.server.repositories.AutoMarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutoMarkServiceImpl
        extends AbstractPaginableService<AutoMark>
        implements AutoMarkService {

    @Autowired
    public AutoMarkServiceImpl(AutoMarkRepository repository) {
        this.repository = repository;
    }
}
