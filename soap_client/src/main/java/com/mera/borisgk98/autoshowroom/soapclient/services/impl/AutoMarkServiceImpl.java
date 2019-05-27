package com.mera.borisgk98.autoshowroom.soapclient.services.impl;

import com.mera.borisgk98.autoshowroom.soapclient.generated.AutoMarkWebService;
import com.mera.borisgk98.autoshowroom.soapclient.generated.AutoMarkWebService_AutomarkServicePort_Client;
import com.mera.borisgk98.autoshowroom.soapclient.generated.AutomarkService;
import com.mera.borisgk98.autoshowroom.soapclient.generated.ModelNotFound;
import com.mera.borisgk98.autoshowroom.soapclient.model.AutoMark;
import com.mera.borisgk98.autoshowroom.soapclient.services.AutoMarkService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AutoMarkServiceImpl implements AutoMarkService {

    AutoMarkWebService port;

    {
        AutomarkService ss = new AutomarkService(AutomarkService.WSDL_LOCATION,
                AutoMarkWebService_AutomarkServicePort_Client.SERVICE_NAME
        );
        port = ss.getAutomarkServicePort();
    }

    @Override
    public AutoMark create(AutoMark m) {
        return port.createAutoMark(m);
    }

    @Override
    public AutoMark read(Integer id) throws ModelNotFound {
        return port.readAutoMark(id);
    }

    @Override
    public AutoMark update(AutoMark m) throws ModelNotFound {
        return port.updateAutoMark(m);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {
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
