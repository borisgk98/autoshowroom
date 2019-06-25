package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoModel;
import com.mera.borisgk98.autoshowroom.server.services.AutoModelService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mera.borisgk98.autoshowroom.server.prometheus.annotations.Counter;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "automodelService", portName = "automodelServicePort")
public class AutoModelWebServiceImpl implements AutoModelWebService {

    @Autowired
    protected AutoModelService service;

    @Override
    @Counter(metrics = { "soap_requests", "requests" } )
    public AutoModel createAutoModel(AutoModel m) {
        return service.create(m);
    }

    @Override
    @Counter(metrics = { "soap_requests", "requests" } )
    public AutoModel readAutoModel(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    @Counter(metrics = { "soap_requests", "requests" } )
    public AutoModel updateAutoModel(AutoModel m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    @Counter(metrics = { "soap_requests", "requests" } )
    public void deleteAutoModel(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    @Counter(metrics = { "soap_requests", "requests" } )
    public List<AutoModel> getAllAutoModel() {
        return service.getAll();
    }

    @Override
    @Counter(metrics = { "soap_requests", "requests" } )
    public List<AutoModel> getRangeAutoModel(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
