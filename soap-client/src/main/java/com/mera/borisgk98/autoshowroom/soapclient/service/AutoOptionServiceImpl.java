package com.mera.borisgk98.autoshowroom.soapclient.service;

import com.mera.borisgk98.autoshowroom.client.model.AutoOption;
import com.mera.borisgk98.autoshowroom.server.soap.AutoOptionWebService;
import com.mera.borisgk98.autoshowroom.server.soap.AutooptionService;
import com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound_Exception;
import org.springframework.stereotype.Component;
import com.mera.borisgk98.autoshowroom.client.service.*;
import javax.xml.namespace.QName;
import java.util.List;

@Component
public class AutoOptionServiceImpl implements AutoOptionService {

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
    public AutoOption read(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return port.readAutoOption(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public AutoOption update(AutoOption m) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return port.updateAutoOption(m);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public void delete(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            port.deleteAutoOption(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
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
