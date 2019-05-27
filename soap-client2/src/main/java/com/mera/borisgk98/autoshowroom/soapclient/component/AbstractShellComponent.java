package com.mera.borisgk98.autoshowroom.soapclient.component;

import com.mera.borisgk98.autoshowroom.server.soap.ModelNotFound_Exception;
import com.mera.borisgk98.autoshowroom.soapclient.services.CrudService;
import com.mera.borisgk98.autoshowroom.soapclient.tool.TableBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.table.Table;

public abstract class AbstractShellComponent<T> implements ReadDeleteShellComponent<T> {
    @Autowired
    protected CrudService<T, Integer> crudService;
    protected Class<T> modelClass;

    public AbstractShellComponent(Class<T> modelClass) {
        this.modelClass = modelClass;
    }

    @Override
    public Table readAll() {
        return TableBuilder.build(crudService.getAll(), modelClass);
    }

    @Override
    public Table readWithLimitAndOffset(Integer limit, Integer offset) {
        return TableBuilder.build(crudService.getRange(offset, limit), modelClass);
    }

    @Override
    public String read(Integer id) {
        try {
            return crudService.read(id).toString();
        }
        catch (ModelNotFound_Exception modelNotFound) {
            return "Not found";
        }
    }

    @Override
    public String delete(Integer id) {
        try {
            crudService.delete(id);
            return "Successful deleting";
        }
        catch (ModelNotFound_Exception e) {
            return "Not found";
        }
    }
}
