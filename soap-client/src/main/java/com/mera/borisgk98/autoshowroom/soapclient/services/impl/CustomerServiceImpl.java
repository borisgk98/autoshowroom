package com.mera.borisgk98.autoshowroom.soapclient.services.impl;

import com.mera.borisgk98.autoshowroom.server.soap.*;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import java.util.List;

@Component
public class CustomerServiceImpl implements com.mera.borisgk98.autoshowroom.soapclient.services.CustomerService {

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
    public Customer read(Integer id) throws ModelNotFound_Exception {
        return port.readCustomer(id);
    }

    @Override
    public Customer update(Customer m) throws ModelNotFound_Exception {
        return port.updateCustomer(m);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound_Exception {
        port.deleteCustomer(id);
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
