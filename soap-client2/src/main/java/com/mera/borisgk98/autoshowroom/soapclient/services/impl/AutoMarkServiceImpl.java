package com.mera.borisgk98.autoshowroom.soapclient.services.impl;

import com.mera.borisgk98.autoshowroom.server.soap.*;
import com.mera.borisgk98.autoshowroom.soapclient.services.AutoMarkService;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import java.util.List;

@Component
public class AutoMarkServiceImpl implements AutoMarkService {

    AutoMarkWebService port;

    {
        AutomarkService ss = new AutomarkService(AutomarkService.WSDL_LOCATION,
                new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "automarkService")
        );
        port = ss.getAutomarkServicePort();
    }

    @Override
    public AutoMark create(AutoMark m) {
        return port.createAutoMark(m);
    }

    @Override
    public AutoMark read(Integer id) throws ModelNotFound_Exception {
        return port.readAutoMark(id);
    }

    @Override
    public AutoMark update(AutoMark m) throws ModelNotFound_Exception {
        return port.updateAutoMark(m);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound_Exception {
        port.deleteAutoMark(id);
    }

    @Override
    public List<AutoMark> getAll() {
        return port.getAllAutoMark();
    }

    @Override
    public List<AutoMark> getRange(Integer offset, Integer limit) {
        return port.getRangeAutoMark(offset, limit);
    }
}
