package com.mera.borisgk98.autoshowroom.server.soap;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Seller;
import com.mera.borisgk98.autoshowroom.server.services.SellerService;
import com.mera.borisgk98.autoshowroom.server.services.CrudService;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import io.micrometer.core.annotation.Timed;

import javax.jws.WebService;
import java.util.List;

@Component
@WebService(serviceName = "sellerService", portName = "sellerServicePort")
public class SellerWebServiceImpl implements SellerWebService {

    @Autowired
    protected SellerService service;

    @Override
    @Timed(value = "soap")
    public Seller createSeller(Seller m) {
        return service.create(m);
    }

    @Override
    @Timed(value = "soap")
    public Seller readSeller(Integer id) throws ModelNotFound {
        return service.read(id);
    }

    @Override
    @Timed(value = "soap")
    public Seller updateSeller(Seller m) throws ModelNotFound {
        return service.update(m);
    }

    @Override
    @Timed(value = "soap")
    public void deleteSeller(Integer id) throws ModelNotFound {
        service.delete(id);
    }

    @Override
    @Timed(value = "soap")
    public List<Seller> getAllSeller() {
        return service.getAll();
    }

    @Override
    @Timed(value = "soap")
    public List<Seller> getRangeSeller(Integer offset, Integer limit) {
        return service.getRange(offset, limit);
    }
}
