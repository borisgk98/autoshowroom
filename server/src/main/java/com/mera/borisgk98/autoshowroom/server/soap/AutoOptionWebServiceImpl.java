package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoOption;
import com.mera.borisgk98.autoshowroom.server.services.AutoOptionService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mera.borisgk98.autoshowroom.server.prometheus.annotations.Counter;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "autooptionService", portName = "autooptionServicePort")
public class AutoOptionWebServiceImpl implements AutoOptionWebService {

    @Autowired
    protected AutoOptionService service;

    @Override
    @Counter(metric = "soap_requests")
    public AutoOption createAutoOption(AutoOption m) {
        return service.create(m);
    }

    @Override
    @Counter(metric = "soap_requests")
    public AutoOption readAutoOption(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    @Counter(metric = "soap_requests")
    public AutoOption updateAutoOption(AutoOption m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    @Counter(metric = "soap_requests")
    public void deleteAutoOption(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    @Counter(metric = "soap_requests")
    public List<AutoOption> getAllAutoOption() {
        return service.getAll();
    }

    @Override
    @Counter(metric = "soap_requests")
    public List<AutoOption> getRangeAutoOption(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
