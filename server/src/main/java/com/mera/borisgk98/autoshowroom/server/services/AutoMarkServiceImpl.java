package com.mera.borisgk98.autoshowroom.server.services;

import com.mera.borisgk98.autoshowroom.server.models.AutoMark;
import com.mera.borisgk98.autoshowroom.server.repositories.AutoMarkRepository;
import com.mera.borisgk98.autoshowroom.server.repositories.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AutoMarkServiceImpl extends AbstractCrudService<AutoMark, Integer> implements AutoMarkService {

    @Autowired
    public AutoMarkServiceImpl(AutoMarkRepository repository) {
        this.repository = repository;
    }
}
