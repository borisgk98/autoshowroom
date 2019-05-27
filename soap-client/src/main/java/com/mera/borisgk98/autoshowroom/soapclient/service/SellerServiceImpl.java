package com.mera.borisgk98.autoshowroom.soapclient.service;

import com.mera.borisgk98.autoshowroom.client.model.Seller;
import com.mera.borisgk98.autoshowroom.server.soap.SellerWebService;
import com.mera.borisgk98.autoshowroom.server.soap.SellerService;
import com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound_Exception;
import org.springframework.stereotype.Component;
import com.mera.borisgk98.autoshowroom.client.service.*;
import javax.xml.namespace.QName;
import java.util.List;

@Component
public class SellerServiceImpl implements SellerService {

    SellerWebService port;

    {
        SellerService ss = new SellerService(SellerService.WSDL_LOCATION,
                new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "sellerService")
        );
        port = ss.getSellerServicePort();
    }

    @Override
    public Seller create(Seller m) {
        return port.createSeller(m);
    }

    @Override
    public Seller read(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return port.readSeller(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public Seller update(Seller m) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return port.updateSeller(m);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public void delete(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            port.deleteSeller(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public List<Seller> getAll() {
        return port.getAllSeller();
    }

    @Override
    public List<Seller> getRange(Integer offset, Integer limit) {
        return port.getRangeSeller(offset, limit);
    }
}
