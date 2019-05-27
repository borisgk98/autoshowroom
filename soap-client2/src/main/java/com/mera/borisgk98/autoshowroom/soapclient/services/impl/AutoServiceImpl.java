package com.mera.borisgk98.autoshowroom.soapclient.services.impl;

import com.mera.borisgk98.autoshowroom.server.soap.*;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import java.util.List;

@Component
public class AutoServiceImpl implements com.mera.borisgk98.autoshowroom.soapclient.services.AutoService {

    AutoWebService port;

    {
        AutoService ss = new AutoService(AutoService.WSDL_LOCATION,
                new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "autoService")
        );
        port = ss.getAutoServicePort();
    }

    @Override
    public Auto create(Auto m) {
        return port.createAuto(m);
    }

    @Override
    public Auto read(Integer id) throws ModelNotFound_Exception {
        return port.readAuto(id);
    }

    @Override
    public Auto update(Auto m) throws ModelNotFound_Exception {
        return port.updateAuto(m);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound_Exception {
        port.deleteAuto(id);
    }

    @Override
    public List<Auto> getAll() {
        return port.getAllAuto();
    }

    @Override
    public List<Auto> getRange(Integer offset, Integer limit) {
        return port.getRangeAuto(offset, limit);
    }
}
