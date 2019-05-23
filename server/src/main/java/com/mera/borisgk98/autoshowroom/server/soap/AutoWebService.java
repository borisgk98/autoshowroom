package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Auto;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface AutoWebService {
    Auto createAuto(Auto m);
    Auto readAuto(Integer id) throws ModelNotFound;
    Auto updateAuto(Auto m) throws ModelNotFound;
    void deleteAuto(Integer id) throws ModelNotFound;
    List<Auto> getAllAuto();
    List<Auto> getRangeAuto(Integer offset, Integer limit);
}
