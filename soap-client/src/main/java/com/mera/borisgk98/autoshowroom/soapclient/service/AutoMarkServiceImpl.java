package com.mera.borisgk98.autoshowroom.soapclient.service;

import com.mera.borisgk98.autoshowroom.client.model.AutoMark;
import com.mera.borisgk98.autoshowroom.server.soap.AutoMarkWebService;
import com.mera.borisgk98.autoshowroom.server.soap.AutomarkService;
import com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound_Exception;
import org.springframework.stereotype.Component;
import com.mera.borisgk98.autoshowroom.client.service.*;
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
    public AutoMark read(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return port.readAutoMark(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public AutoMark update(AutoMark m) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return port.updateAutoMark(m);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public void delete(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            port.deleteAutoMark(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
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
