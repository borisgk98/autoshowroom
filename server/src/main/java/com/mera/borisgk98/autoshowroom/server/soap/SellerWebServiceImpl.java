package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Seller;
import com.mera.borisgk98.autoshowroom.server.services.SellerService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mera.borisgk98.autoshowroom.server.prometheus.annotations.Counter;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "sellerService", portName = "sellerServicePort")
public class SellerWebServiceImpl implements SellerWebService {

    @Autowired
    protected SellerService service;

    @Override
    @Counter(metrics = { "soap_requests", "requests" } )
    public Seller createSeller(Seller m) {
        return service.create(m);
    }

    @Override
    @Counter(metrics = { "soap_requests", "requests" } )
    public Seller readSeller(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    @Counter(metrics = { "soap_requests", "requests" } )
    public Seller updateSeller(Seller m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    @Counter(metrics = { "soap_requests", "requests" } )
    public void deleteSeller(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    @Counter(metrics = { "soap_requests", "requests" } )
    public List<Seller> getAllSeller() {
        return service.getAll();
    }

    @Override
    @Counter(metrics = { "soap_requests", "requests" } )
    public List<Seller> getRangeSeller(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
