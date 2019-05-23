package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoOption;
import com.mera.borisgk98.autoshowroom.server.services.AutoOptionService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "autooptionService", portName = "autooptionServicePort")
public class AutoOptionWebServiceImpl implements AutoOptionWebService {

    @Autowired
    protected AutoOptionService service;

    @Override
    public AutoOption create(AutoOption m) {
        return service.create(m);
    }

    @Override
    public AutoOption read(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    public AutoOption update(AutoOption m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    public List<AutoOption> getAll() {
        return service.getAll();
    }

    @Override
    public List<AutoOption> getRange(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
