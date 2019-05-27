package com.mera.borisgk98.autoshowroom.soapclient.service;

import com.mera.borisgk98.autoshowroom.client.model.Customer;
import com.mera.borisgk98.autoshowroom.server.soap.CustomerWebService;
import com.mera.borisgk98.autoshowroom.server.soap.CustomerService;
import com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound_Exception;
import org.springframework.stereotype.Component;
import com.mera.borisgk98.autoshowroom.client.service.*;
import javax.xml.namespace.QName;
import java.util.List;

@Component
public class CustomerServiceImpl implements CustomerService {

    CustomerWebService port;

    {
        CustomerService ss = new CustomerService(CustomerService.WSDL_LOCATION,
                new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "customerService")
        );
        port = ss.getCustomerServicePort();
    }

    @Override
    public Customer create(Customer m) {
        return port.createCustomer(m);
    }

    @Override
    public Customer read(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return port.readCustomer(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public Customer update(Customer m) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return port.updateCustomer(m);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public void delete(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            port.deleteCustomer(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public List<Customer> getAll() {
        return port.getAllCustomer();
    }

    @Override
    public List<Customer> getRange(Integer offset, Integer limit) {
        return port.getRangeCustomer(offset, limit);
    }
}
