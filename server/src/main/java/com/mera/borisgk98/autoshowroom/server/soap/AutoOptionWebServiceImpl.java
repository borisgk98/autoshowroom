package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoOption;
import com.mera.borisgk98.autoshowroom.server.services.AutoOptionService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import io.micrometer.core.annotation.Timed;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "autooptionService", portName = "autooptionServicePort")
public class AutoOptionWebServiceImpl implements AutoOptionWebService {

    @Autowired
    protected AutoOptionService service;

    @Override
    @Timed(value = "soap")
    public AutoOption createAutoOption(AutoOption m) {
        return service.create(m);
    }

    @Override
    @Timed(value = "soap")
    public AutoOption readAutoOption(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    @Timed(value = "soap")
    public AutoOption updateAutoOption(AutoOption m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    @Timed(value = "soap")
    public void deleteAutoOption(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    @Timed(value = "soap")
    public List<AutoOption> getAllAutoOption() {
        return service.getAll();
    }

    @Override
    @Timed(value = "soap")
    public List<AutoOption> getRangeAutoOption(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
