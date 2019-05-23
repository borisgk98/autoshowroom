package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoModel;
import com.mera.borisgk98.autoshowroom.server.services.AutoModelService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "automodelService", portName = "automodelServicePort")
public class AutoModelWebServiceImpl implements AutoModelWebService {

    @Autowired
    protected AutoModelService service;

    @Override
    public AutoModel create(AutoModel m) {
        return service.create(m);
    }

    @Override
    public AutoModel read(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    public AutoModel update(AutoModel m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    public List<AutoModel> getAll() {
        return service.getAll();
    }

    @Override
    public List<AutoModel> getRange(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
