package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Customer;
import com.mera.borisgk98.autoshowroom.server.services.CustomerService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "customerService", portName = "customerServicePort")
public class CustomerWebServiceImpl implements CustomerWebService {

    @Autowired
    protected CustomerService service;

    @Override
    public Customer create(Customer m) {
        return service.create(m);
    }

    @Override
    public Customer read(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    public Customer update(Customer m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    public List<Customer> getAll() {
        return service.getAll();
    }

    @Override
    public List<Customer> getRange(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
