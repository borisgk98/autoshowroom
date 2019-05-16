package com.mera.borisgk98.autoshowroom.server.services;

import com.mera.borisgk98.autoshowroom.server.models.Order;
import com.mera.borisgk98.autoshowroom.server.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderServiceImpl extends AbstractCrudService<Order, Long> {

    @Autowired
    protected OrderRepository repository;
}
