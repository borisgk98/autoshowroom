package com.mera.borisgk98.autoshowroom.soapclient.service;

import com.mera.borisgk98.autoshowroom.client.model.Auto;
import com.mera.borisgk98.autoshowroom.server.soap.AutoWebService;
import com.mera.borisgk98.autoshowroom.server.soap.AutoService;
import com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound_Exception;
import org.springframework.stereotype.Component;
import com.mera.borisgk98.autoshowroom.client.service.*;
import javax.xml.namespace.QName;
import java.util.List;

@Component
public class AutoServiceImpl implements AutoService {

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
    public Auto read(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return port.readAuto(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public Auto update(Auto m) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return port.updateAuto(m);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public void delete(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            port.deleteAuto(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
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
