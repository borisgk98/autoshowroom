package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Seller;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface SellerWebService {
    Seller createSeller(Seller m);
    Seller readSeller(Integer id) throws ModelNotFound;
    Seller updateSeller(Seller m) throws ModelNotFound;
    void deleteSeller(Integer id) throws ModelNotFound;
    List<Seller> getAllSeller();
    List<Seller> getRangeSeller(Integer offset, Integer limit);
}
