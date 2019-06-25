package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoMark;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface AutoMarkWebService {
    AutoMark createAutoMark(AutoMark m);
    AutoMark readAutoMark(Integer id) throws ModelNotFound;
    AutoMark updateAutoMark(AutoMark m) throws ModelNotFound;
    void deleteAutoMark(Integer id) throws ModelNotFound;
    List<AutoMark> getAllAutoMark();
    List<AutoMark> getRangeAutoMark(Integer offset, Integer limit);
}
