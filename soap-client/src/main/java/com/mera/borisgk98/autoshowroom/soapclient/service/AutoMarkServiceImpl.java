package com.mera.borisgk98.autoshowroom.soapclient.service;

import com.mera.borisgk98.autoshowroom.client.model.AutoMark;
import com.mera.borisgk98.autoshowroom.client.tool.Converter;
import com.mera.borisgk98.autoshowroom.server.soap.AutoMarkWebService;
import com.mera.borisgk98.autoshowroom.server.soap.AutomarkService;
import com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound_Exception;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Primary
public class AutoMarkServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.AutoMarkService {

    AutoMarkWebService port;

    {
        AutomarkService ss = new AutomarkService(AutomarkService.WSDL_LOCATION,
                new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "automarkService")
        );
        port = ss.getAutomarkServicePort();
    }

    @Override
    public AutoMark create(AutoMark m) {
        com.mera.borisgk98.autoshowroom.server.soap.AutoMark dto
                = Converter.convert(m, com.mera.borisgk98.autoshowroom.server.soap.AutoMark.class);
        return Converter.convert(port.createAutoMark(dto), AutoMark.class);
    }

    @Override
    public AutoMark read(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return Converter.convert(port.readAutoMark(id), AutoMark.class);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public AutoMark update(AutoMark m) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            com.mera.borisgk98.autoshowroom.server.soap.AutoMark dto
                    = Converter.convert(m, com.mera.borisgk98.autoshowroom.server.soap.AutoMark.class);
            return Converter.convert(port.updateAutoMark(dto), AutoMark.class);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public void delete(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            port.deleteAutoMark(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public List<AutoMark> getAll() {
        return port.getAllAutoMark()
                .stream()
                .map(x -> Converter.convert(x, AutoMark.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<AutoMark> getRange(Integer offset, Integer limit) {

        return port.getRangeAutoMark(offset, limit)
                .stream()
                .map(x -> Converter.convert(x, AutoMark.class))
                .collect(Collectors.toList());
    }
}
