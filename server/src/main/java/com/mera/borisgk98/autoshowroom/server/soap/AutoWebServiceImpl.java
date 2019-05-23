package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Auto;
import com.mera.borisgk98.autoshowroom.server.services.AutoService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "autoService", portName = "autoServicePort")
public class AutoWebServiceImpl implements AutoWebService {

    @Autowired
    protected AutoService service;

    @Override
    public Auto create(Auto m) {
        return service.create(m);
    }

    @Override
    public Auto read(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    public Auto update(Auto m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    public List<Auto> getAll() {
        return service.getAll();
    }

    @Override
    public List<Auto> getRange(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
