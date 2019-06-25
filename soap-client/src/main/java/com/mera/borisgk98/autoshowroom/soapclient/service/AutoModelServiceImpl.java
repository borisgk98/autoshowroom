package com.mera.borisgk98.autoshowroom.soapclient.service;

import com.mera.borisgk98.autoshowroom.client.model.AutoModel;
import com.mera.borisgk98.autoshowroom.client.tool.Converter;
import com.mera.borisgk98.autoshowroom.server.soap.AutoModelWebService;
import com.mera.borisgk98.autoshowroom.server.soap.AutomodelService;
import com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound_Exception;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;
import javax.xml.namespace.QName;
import java.util.List;
import java.util.stream.Collectors;

@Component
@Primary
public class AutoModelServiceImpl implements com.mera.borisgk98.autoshowroom.client.service.AutoModelService {

    AutoModelWebService port;

    {
        AutomodelService ss = new AutomodelService(AutomodelService.WSDL_LOCATION,
                new QName("http://soap.server.autoshowroom.borisgk98.mera.com/", "automodelService")
        );
        port = ss.getAutomodelServicePort();
    }

    @Override
    public AutoModel create(AutoModel m) {
        com.mera.borisgk98.autoshowroom.server.soap.AutoModel dto
                = Converter.convert(m, com.mera.borisgk98.autoshowroom.server.soap.AutoModel.class);
        return Converter.convert(port.createAutoModel(dto), AutoModel.class);
    }

    @Override
    public AutoModel read(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            return Converter.convert(port.readAutoModel(id), AutoModel.class);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public AutoModel update(AutoModel m) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            com.mera.borisgk98.autoshowroom.server.soap.AutoModel dto
                    = Converter.convert(m, com.mera.borisgk98.autoshowroom.server.soap.AutoModel.class);
            return Converter.convert(port.updateAutoModel(dto), AutoModel.class);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public void delete(Integer id) throws com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound {
        try {
            port.deleteAutoModel(id);
        }
        catch(ModelNotFound_Exception exc) {
            throw new com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound();
        }
    }

    @Override
    public List<AutoModel> getAll() {
        return port.getAllAutoModel()
                .stream()
                .map(x -> Converter.convert(x, AutoModel.class))
                .collect(Collectors.toList());
    }

    @Override
    public List<AutoModel> getRange(Integer offset, Integer limit) {

        return port.getRangeAutoModel(offset, limit)
                .stream()
                .map(x -> Converter.convert(x, AutoModel.class))
                .collect(Collectors.toList());
    }
}
