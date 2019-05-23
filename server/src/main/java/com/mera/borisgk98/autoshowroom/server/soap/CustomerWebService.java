package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Customer;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface CustomerWebService {
    Customer create(Customer m);
    Customer read(Integer id) throws ModelNotFound;
    Customer update(Customer m) throws ModelNotFound;
    void delete(Integer id) throws ModelNotFound;
    List<Customer> getAll();
    List<Customer> getRange(Integer offset, Integer limit);
}
