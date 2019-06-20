package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Auto;
import com.mera.borisgk98.autoshowroom.server.services.AutoService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import io.micrometer.core.annotation.Timed;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "autoService", portName = "autoServicePort")
public class AutoWebServiceImpl implements AutoWebService {

    @Autowired
    protected AutoService service;

    @Override
    @Timed(value = "soap")
    public Auto createAuto(Auto m) {
        return service.create(m);
    }

    @Override
    @Timed(value = "soap")
    public Auto readAuto(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    @Timed(value = "soap")
    public Auto updateAuto(Auto m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    @Timed(value = "soap")
    public void deleteAuto(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    @Timed(value = "soap")
    public List<Auto> getAllAuto() {
        return service.getAll();
    }

    @Override
    @Timed(value = "soap")
    public List<Auto> getRangeAuto(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
