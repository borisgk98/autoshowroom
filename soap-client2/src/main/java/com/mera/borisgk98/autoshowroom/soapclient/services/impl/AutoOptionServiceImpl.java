package com.mera.borisgk98.autoshowroom.soapclient.services.impl;

import com.mera.borisgk98.autoshowroom.server.soap.*;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import java.util.List;

@Component
public class AutoOptionServiceImpl implements com.mera.borisgk98.autoshowroom.soapclient.services.AutoOptionService {

    AutoOptionWebService port;

    {
        AutooptionService ss = new AutooptionService(AutooptionService.WSDL_LOCATION,
                new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "autooptionService")
        );
        port = ss.getAutooptionServicePort();
    }

    @Override
    public AutoOption create(AutoOption m) {
        return port.createAutoOption(m);
    }

    @Override
    public AutoOption read(Integer id) throws ModelNotFound_Exception {
        return port.readAutoOption(id);
    }

    @Override
    public AutoOption update(AutoOption m) throws ModelNotFound_Exception {
        return port.updateAutoOption(m);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound_Exception {
        port.deleteAutoOption(id);
    }

    @Override
    public List<AutoOption> getAll() {
        return port.getAllAutoOption();
    }

    @Override
    public List<AutoOption> getRange(Integer offset, Integer limit) {
        return port.getRangeAutoOption(offset, limit);
    }
}
