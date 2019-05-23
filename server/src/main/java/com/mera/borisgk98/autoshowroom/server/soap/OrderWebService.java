package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Order;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface OrderWebService {
    Order create(Order m);
    Order read(Integer id) throws ModelNotFound;
    Order update(Order m) throws ModelNotFound;
    void delete(Integer id) throws ModelNotFound;
    List<Order> getAll();
    List<Order> getRange(Integer offset, Integer limit);
}
