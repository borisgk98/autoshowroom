package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoOption;

import javax.jws.WebService;
import java.util.List;

@WebService
public interface AutoOptionWebService {
    AutoOption createAutoOption(AutoOption m);
    AutoOption readAutoOption(Integer id) throws ModelNotFound;
    AutoOption updateAutoOption(AutoOption m) throws ModelNotFound;
    void deleteAutoOption(Integer id) throws ModelNotFound;
    List<AutoOption> getAllAutoOption();
    List<AutoOption> getRangeAutoOption(Integer offset, Integer limit);
}
