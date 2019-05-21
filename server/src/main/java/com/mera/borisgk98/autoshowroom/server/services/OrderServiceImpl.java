package com.mera.borisgk98.autoshowroom.server.services;

import com.mera.borisgk98.autoshowroom.server.models.Order;
import com.mera.borisgk98.autoshowroom.server.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl
        extends AbstractPaginableService<Order>
        implements OrderService {

    @Autowired
    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }
}
