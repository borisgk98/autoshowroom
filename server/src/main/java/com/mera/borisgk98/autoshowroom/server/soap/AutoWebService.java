package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Auto;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface AutoWebService {
    Auto create(Auto m);
    Auto read(Integer id) throws ModelNotFound;
    Auto update(Auto m) throws ModelNotFound;
    void delete(Integer id) throws ModelNotFound;
    List<Auto> getAll();
    List<Auto> getRange(Integer offset, Integer limit);
}
