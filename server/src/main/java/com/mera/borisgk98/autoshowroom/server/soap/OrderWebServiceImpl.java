package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Order;
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
    public Order create(Order m) {
        return service.create(m);
    }

    @Override
    public Order read(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    public Order update(Order m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    public List<Order> getAll() {
        return service.getAll();
    }

    @Override
    public List<Order> getRange(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
