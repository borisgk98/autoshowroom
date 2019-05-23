package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Seller;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface SellerWebService {
    Seller create(Seller m);
    Seller read(Integer id) throws ModelNotFound;
    Seller update(Seller m) throws ModelNotFound;
    void delete(Integer id) throws ModelNotFound;
    List<Seller> getAll();
    List<Seller> getRange(Integer offset, Integer limit);
}
