package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoModel;
import com.mera.borisgk98.autoshowroom.server.services.AutoModelService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import io.micrometer.core.annotation.Timed;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "automodelService", portName = "automodelServicePort")
public class AutoModelWebServiceImpl implements AutoModelWebService {

    @Autowired
    protected AutoModelService service;

    @Override
    @Timed(value = "soap")
    public AutoModel createAutoModel(AutoModel m) {
        return service.create(m);
    }

    @Override
    @Timed(value = "soap")
    public AutoModel readAutoModel(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    @Timed(value = "soap")
    public AutoModel updateAutoModel(AutoModel m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    @Timed(value = "soap")
    public void deleteAutoModel(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    @Timed(value = "soap")
    public List<AutoModel> getAllAutoModel() {
        return service.getAll();
    }

    @Override
    @Timed(value = "soap")
    public List<AutoModel> getRangeAutoModel(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
