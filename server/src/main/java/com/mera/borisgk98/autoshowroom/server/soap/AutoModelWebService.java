package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoModel;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface AutoModelWebService {
    AutoModel createAutoModel(AutoModel m);
    AutoModel readAutoModel(Integer id) throws ModelNotFound;
    AutoModel updateAutoModel(AutoModel m) throws ModelNotFound;
    void deleteAutoModel(Integer id) throws ModelNotFound;
    List<AutoModel> getAllAutoModel();
    List<AutoModel> getRangeAutoModel(Integer offset, Integer limit);
}
