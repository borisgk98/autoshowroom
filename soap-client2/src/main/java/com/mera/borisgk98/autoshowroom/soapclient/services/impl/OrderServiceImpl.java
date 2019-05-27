package com.mera.borisgk98.autoshowroom.soapclient.services.impl;

import com.mera.borisgk98.autoshowroom.server.soap.*;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import java.util.List;

@Component
public class OrderServiceImpl implements com.mera.borisgk98.autoshowroom.soapclient.services.OrderService {

    OrderWebService port;

    {
        OrderService ss = new OrderService(OrderService.WSDL_LOCATION,
                new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "orderService")
        );
        port = ss.getOrderServicePort();
    }

    @Override
    public Order create(Order m) {
        return port.createOrder(m);
    }

    @Override
    public Order read(Integer id) throws ModelNotFound_Exception {
        return port.readOrder(id);
    }

    @Override
    public Order update(Order m) throws ModelNotFound_Exception {
        return port.updateOrder(m);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound_Exception {
        port.deleteOrder(id);
    }

    @Override
    public List<Order> getAll() {
        return port.getAllOrder();
    }

    @Override
    public List<Order> getRange(Integer offset, Integer limit) {
        return port.getRangeOrder(offset, limit);
    }
}
