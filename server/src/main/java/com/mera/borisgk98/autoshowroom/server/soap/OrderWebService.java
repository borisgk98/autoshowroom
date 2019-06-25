package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Order;
import com.mera.borisgk98.autoshowroom.server.models.OrderStatus;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface OrderWebService {
    Order createOrder(Order m);
    Order readOrder(Integer id) throws ModelNotFound;
    Order updateOrder(Order m) throws ModelNotFound;
    void deleteOrder(Integer id) throws ModelNotFound;
    List<Order> getAllOrder();
    List<Order> getRangeOrder(Integer offset, Integer limit);
    List<Order> filterByOrderStatus(OrderStatus status);
}
