package com.mera.borisgk98.autoshowroom.soapclient.service;

import com.mera.borisgk98.autoshowroom.client.model.Auto;
import com.mera.borisgk98.autoshowroom.client.tool.Converter;
import com.mera.borisgk98.autoshowroom.server.soap.AutoWebService;
import com.mera.borisgk98.autoshowroom.server.soap.AutoService;
import com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound_Exception;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Primary
public class AutoServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.AutoService {

    AutoWebService port;

    {
        AutoService ss = new AutoService(AutoService.WSDL_LOCATION,
                new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "autoService")
        );
        port = ss.getAutoServicePort();
    }

    @Override
    public Auto create(Auto m) {
        com.mera.borisgk98.autoshowroom.server.soap.Auto dto
                = Converter.convert(m, com.mera.borisgk98.autoshowroom.server.soap.Auto.class);
        return Converter.convert(port.createAuto(dto), Auto.class);
    }

    @Override
    public Auto read(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return Converter.convert(port.readAuto(id), Auto.class);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public Auto update(Auto m) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            com.mera.borisgk98.autoshowroom.server.soap.Auto dto
                    = Converter.convert(m, com.mera.borisgk98.autoshowroom.server.soap.Auto.class);
            return Converter.convert(port.updateAuto(dto), Auto.class);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public void delete(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            port.deleteAuto(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public List<Auto> getAll() {
        return port.getAllAuto()
                .stream()
                .map(x -> Converter.convert(x, Auto.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<Auto> getRange(Integer offset, Integer limit) {

        return port.getRangeAuto(offset, limit)
                .stream()
                .map(x -> Converter.convert(x, Auto.class))
                .collect(Collectors.toList());
    }
}
