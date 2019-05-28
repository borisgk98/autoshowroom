package com.mera.borisgk98.autoshowroom.server.services;

import com.mera.borisgk98.autoshowroom.server.models.Order;
import com.mera.borisgk98.autoshowroom.server.models.OrderStatus;

import java.util.List;

public interface OrderService extends CrudService<Order, Integer>{
    List<Order> filterByOrderStatus(OrderStatus status);
}
