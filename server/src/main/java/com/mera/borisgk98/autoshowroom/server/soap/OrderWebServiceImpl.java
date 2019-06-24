package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Order;
import com.mera.borisgk98.autoshowroom.server.models.OrderStatus;
import com.mera.borisgk98.autoshowroom.server.prometheus.annotations.Counter;
import com.mera.borisgk98.autoshowroom.server.services.OrderService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "orderService", portName = "orderServicePort")
public class OrderWebServiceImpl implements OrderWebService {

    @Autowired
    protected OrderService service;

    @Override
    @Counter(metric = "soap_requests")
    public Order createOrder(Order m) {
        return service.create(m);
    }

    @Override
    @Counter(metric = "soap_requests")
    public Order readOrder(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    @Counter(metric = "soap_requests")
    public Order updateOrder(Order m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    @Counter(metric = "soap_requests")
    public void deleteOrder(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    @Counter(metric = "soap_requests")
    public List<Order> getAllOrder() {
        return service.getAll();
    }

    @Override
    @Counter(metric = "soap_requests")
    public List<Order> getRangeOrder(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }

    @Override
    @Counter(metric = "soap_requests")
    public List<Order> filterByOrderStatus(OrderStatus status) {
        return service.filterByOrderStatus(status);
    }
}
