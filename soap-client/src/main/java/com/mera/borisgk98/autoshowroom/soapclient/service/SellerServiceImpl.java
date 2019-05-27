package com.mera.borisgk98.autoshowroom.soapclient.service;

import com.mera.borisgk98.autoshowroom.client.model.Seller;
import com.mera.borisgk98.autoshowroom.client.tool.Converter;
import com.mera.borisgk98.autoshowroom.server.soap.SellerWebService;
import com.mera.borisgk98.autoshowroom.server.soap.SellerService;
import com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound_Exception;
import org.springframework.stereotype.Component;
import com.mera.borisgk98.autoshowroom.client.service.*;
import org.springframework.context.annotation.Primary;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Primary
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
        com.mera.borisgk98.autoshowroom.server.soap.Seller dto
                = Converter.convert(m, com.mera.borisgk98.autoshowroom.server.soap.Seller.class);
        return Converter.convert(port.createSeller(dto), Seller.class);
    }

    @Override
    public Seller read(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return Converter.convert(port.readSeller(id), Seller.class);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public Seller update(Seller m) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            com.mera.borisgk98.autoshowroom.server.soap.Seller dto
                    = Converter.convert(m, com.mera.borisgk98.autoshowroom.server.soap.Seller.class);
            return Converter.convert(port.updateSeller(dto), Seller.class);
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
        return port.getAllSeller()
                .stream()
                .map(x -> Converter.convert(x, Seller.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<Seller> getRange(Integer offset, Integer limit) {

        return port.getRangeSeller(offset, limit)
                .stream()
                .map(x -> Converter.convert(x, Seller.class))
                .collect(Collectors.toList());
    }
}
