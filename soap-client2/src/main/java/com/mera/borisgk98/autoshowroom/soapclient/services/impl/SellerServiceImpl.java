package com.mera.borisgk98.autoshowroom.soapclient.services.impl;

import com.mera.borisgk98.autoshowroom.server.soap.*;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import java.util.List;

@Component
public class SellerServiceImpl implements com.mera.borisgk98.autoshowroom.soapclient.services.SellerService {

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
    public Seller read(Integer id) throws ModelNotFound_Exception {
        return port.readSeller(id);
    }

    @Override
    public Seller update(Seller m) throws ModelNotFound_Exception {
        return port.updateSeller(m);
    }

    @Override
    public void delete(Integer id) throws ModelNotFound_Exception {
        port.deleteSeller(id);
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
