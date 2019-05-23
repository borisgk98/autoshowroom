package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Seller;
import com.mera.borisgk98.autoshowroom.server.services.SellerService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "sellerService", portName = "sellerServicePort")
public class SellerWebServiceImpl implements SellerWebService {

    @Autowired
    protected SellerService service;

    @Override
    public Seller create(Seller m) {
        return service.create(m);
    }

    @Override
    public Seller read(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    public Seller update(Seller m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    public List<Seller> getAll() {
        return service.getAll();
    }

    @Override
    public List<Seller> getRange(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
