package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoMark;
import com.mera.borisgk98.autoshowroom.server.services.AutoMarkService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "automarkService", portName = "automarkServicePort")
public class AutoMarkWebServiceImpl implements AutoMarkWebService {

    @Autowired
    protected AutoMarkService service;

    @Override
    public AutoMark createAutoMark(AutoMark m) {
        return service.create(m);
    }

    @Override
    public AutoMark readAutoMark(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    public AutoMark updateAutoMark(AutoMark m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    public void deleteAutoMark(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    public List<AutoMark> getAllAutoMark() {
        return service.getAll();
    }

    @Override
    public List<AutoMark> getRangeAutoMark(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
