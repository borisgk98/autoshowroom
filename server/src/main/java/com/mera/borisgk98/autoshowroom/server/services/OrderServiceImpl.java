package com.mera.borisgk98.autoshowroom.server.services;

import com.mera.borisgk98.autoshowroom.server.models.Order;
import com.mera.borisgk98.autoshowroom.server.models.OrderStatus;
import com.mera.borisgk98.autoshowroom.server.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl
        extends AbstractCrudService<Order>
        implements OrderService {

    @Autowired
    public OrderServiceImpl(OrderRepository repository) {
        this.repository = repository;
    }

    @Override
    public Order create(Order m) {
        return super.create(m);
    }

    public List<Order> filterByOrderStatus(OrderStatus status) {
        
    }
}
