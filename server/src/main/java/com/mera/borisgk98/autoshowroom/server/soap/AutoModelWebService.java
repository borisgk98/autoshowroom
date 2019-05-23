package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoModel;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface AutoModelWebService {
    AutoModel create(AutoModel m);
    AutoModel read(Integer id) throws ModelNotFound;
    AutoModel update(AutoModel m) throws ModelNotFound;
    void delete(Integer id) throws ModelNotFound;
    List<AutoModel> getAll();
    List<AutoModel> getRange(Integer offset, Integer limit);
}
