package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Customer;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface CustomerWebService {
    Customer createCustomer(Customer m);
    Customer readCustomer(Integer id) throws ModelNotFound;
    Customer updateCustomer(Customer m) throws ModelNotFound;
    void deleteCustomer(Integer id) throws ModelNotFound;
    List<Customer> getAllCustomer();
    List<Customer> getRangeCustomer(Integer offset, Integer limit);
}
