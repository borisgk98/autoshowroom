package com.mera.borisgk98.autoshowroom.soapclient.services.impl;

import com.mera.borisgk98.autoshowroom.server.soap.*;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import java.util.List;

@Component
public class AutoModelServiceImpl implements com.mera.borisgk98.autoshowroom.soapclient.services.AutoModelService {

    AutoModelWebService port;

    {
        AutomodelService ss = new AutomodelService(AutomodelService.WSDL_LOCATION,
                new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "automodelService")
        );
        port = ss.getAutomodelServicePort();
    }

    @Override
    public AutoModel create(AutoModel m) {
        return port.createAutoModel(m);
    }

    @Override
    public AutoModel read(Integer id) throws ModelNotFound_Exception {
        return port.readAutoModel(id);
    }

    @Override
    public AutoModel update(AutoModel m) throws ModelNotFound_Exception {
        return port.updateAutoModel(m);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound_Exception {
        port.deleteAutoModel(id);
    }

    @Override
    public List<AutoModel> getAll() {
        return port.getAllAutoModel();
    }

    @Override
    public List<AutoModel> getRange(Integer offset, Integer limit) {
        return port.getRangeAutoModel(offset, limit);
    }
}
