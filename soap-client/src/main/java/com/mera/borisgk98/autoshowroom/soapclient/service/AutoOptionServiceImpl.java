package com.mera.borisgk98.autoshowroom.soapclient.service;

import com.mera.borisgk98.autoshowroom.client.model.AutoOption;
import com.mera.borisgk98.autoshowroom.client.tool.Converter;
import com.mera.borisgk98.autoshowroom.server.soap.AutoOptionWebService;
import com.mera.borisgk98.autoshowroom.server.soap.AutooptionService;
import com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound_Exception;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Primary
public class AutoOptionServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.AutoOptionService {

    AutoOptionWebService port;

    {
        AutooptionService ss = new AutooptionService(AutooptionService.WSDL_LOCATION,
                new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "autooptionService")
        );
        port = ss.getAutooptionServicePort();
    }

    @Override
    public AutoOption create(AutoOption m) {
        com.mera.borisgk98.autoshowroom.server.soap.AutoOption dto
                = Converter.convert(m, com.mera.borisgk98.autoshowroom.server.soap.AutoOption.class);
        return Converter.convert(port.createAutoOption(dto), AutoOption.class);
    }

    @Override
    public AutoOption read(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return Converter.convert(port.readAutoOption(id), AutoOption.class);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public AutoOption update(AutoOption m) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            com.mera.borisgk98.autoshowroom.server.soap.AutoOption dto
                    = Converter.convert(m, com.mera.borisgk98.autoshowroom.server.soap.AutoOption.class);
            return Converter.convert(port.updateAutoOption(dto), AutoOption.class);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public void delete(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            port.deleteAutoOption(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public List<AutoOption> getAll() {
        return port.getAllAutoOption()
                .stream()
                .map(x -> Converter.convert(x, AutoOption.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<AutoOption> getRange(Integer offset, Integer limit) {

        return port.getRangeAutoOption(offset, limit)
                .stream()
                .map(x -> Converter.convert(x, AutoOption.class))
                .collect(Collectors.toList());
    }
}
