package com.mera.borisgk98.autoshowroom.soapclient.service;

import com.mera.borisgk98.autoshowroom.client.model.Order;
import com.mera.borisgk98.autoshowroom.client.model.OrderStatus;
import com.mera.borisgk98.autoshowroom.client.tool.Converter;
import com.mera.borisgk98.autoshowroom.server.soap.OrderWebService;
import com.mera.borisgk98.autoshowroom.server.soap.OrderService;
import com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound_Exception;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Primary
public class OrderServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.OrderService {

    OrderWebService port;

    {
        OrderService ss = new OrderService(OrderService.WSDL_LOCATION,
                new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "orderService")
        );
        port = ss.getOrderServicePort();
    }

    @Override
    public Order create(Order m) {
        com.mera.borisgk98.autoshowroom.server.soap.Order dto
                = Converter.convert(m, com.mera.borisgk98.autoshowroom.server.soap.Order.class);
        return Converter.convert(port.createOrder(dto), Order.class);
    }

    @Override
    public Order read(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return Converter.convert(port.readOrder(id), Order.class);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public Order update(Order m) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            com.mera.borisgk98.autoshowroom.server.soap.Order dto
                    = Converter.convert(m, com.mera.borisgk98.autoshowroom.server.soap.Order.class);
            return Converter.convert(port.updateOrder(dto), Order.class);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public void delete(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            port.deleteOrder(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public List<Order> getAll() {
        return port.getAllOrder()
                .stream()
                .map(x -> Converter.convert(x, Order.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<Order> getRange(Integer offset, Integer limit) {

        return port
                .getRangeOrder(offset, limit)
                .stream()
                .map(x -> Converter.convert(x, Order.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<Order> filter(OrderStatus status) {
        return port
                .filterByOrderStatus(
                    Converter.convert(status, com.mera.borisgk98.autoshowroom.server.soap.OrderStatus.class)
                )
                .stream()
                .map(x -> Converter.convert(x, Order.class))
                .collect(Collectors.toList());
    }
}
