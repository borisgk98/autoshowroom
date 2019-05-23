package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoModel;
import com.mera.borisgk98.autoshowroom.server.services.AutoModelService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

@Component
@WebService(serviceName = "autoModelService", portName = "autoModelServicePort")
public class AutoModelWebServiceImpl implements AutoModelWebService {

    @Autowired
    protected AutoModelService service;

    public AutoModel read(Integer id) {
        AutoModel m = null;
        try {
            m = service.read(id);
        }
        catch (ModelNotFound e) {
            return null;
        }
        return m;
    }
}
