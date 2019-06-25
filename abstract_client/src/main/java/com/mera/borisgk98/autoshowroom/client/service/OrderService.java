package com.mera.borisgk98.autoshowroom.client.service;

import com.mera.borisgk98.autoshowroom.client.model.Order;
import com.mera.borisgk98.autoshowroom.client.model.OrderStatus;

import java.util.List;

public interface OrderService extends CrudService<Order, Integer>{
    List<Order> filter(OrderStatus status);
}
