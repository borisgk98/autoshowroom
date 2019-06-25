package com.mera.borisgk98.autoshowroom.server.services;

import com.mera.borisgk98.autoshowroom.server.models.Seller;
import com.mera.borisgk98.autoshowroom.server.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerServiceImpl
        extends AbstractCrudService<Seller>
        implements SellerService {

    @Autowired
    public SellerServiceImpl(SellerRepository repository) {
        this.repository = repository;
    }
}
