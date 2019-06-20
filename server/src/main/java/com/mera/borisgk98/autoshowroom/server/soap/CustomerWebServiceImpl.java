package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Customer;
import com.mera.borisgk98.autoshowroom.server.services.CustomerService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import io.micrometer.core.annotation.Timed;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "customerService", portName = "customerServicePort")
public class CustomerWebServiceImpl implements CustomerWebService {

    @Autowired
    protected CustomerService service;

    @Override
    @Timed(value = "soap")
    public Customer createCustomer(Customer m) {
        return service.create(m);
    }

    @Override
    @Timed(value = "soap")
    public Customer readCustomer(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    @Timed(value = "soap")
    public Customer updateCustomer(Customer m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    @Timed(value = "soap")
    public void deleteCustomer(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    @Timed(value = "soap")
    public List<Customer> getAllCustomer() {
        return service.getAll();
    }

    @Override
    @Timed(value = "soap")
    public List<Customer> getRangeCustomer(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
