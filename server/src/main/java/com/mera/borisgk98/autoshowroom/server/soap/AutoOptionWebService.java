package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoOption;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface AutoOptionWebService {
    AutoOption create(AutoOption m);
    AutoOption read(Integer id) throws ModelNotFound;
    AutoOption update(AutoOption m) throws ModelNotFound;
    void delete(Integer id) throws ModelNotFound;
    List<AutoOption> getAll();
    List<AutoOption> getRange(Integer offset, Integer limit);
}
