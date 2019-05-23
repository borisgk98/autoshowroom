package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoMark;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface AutoMarkWebService {
    AutoMark create(AutoMark m);
    AutoMark read(Integer id) throws ModelNotFound;
    AutoMark update(AutoMark m) throws ModelNotFound;
    void delete(Integer id) throws ModelNotFound;
    List<AutoMark> getAll();
    List<AutoMark> getRange(Integer offset, Integer limit);
}
