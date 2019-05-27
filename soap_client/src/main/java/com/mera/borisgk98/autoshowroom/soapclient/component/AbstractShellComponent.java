package com.mera.borisgk98.autoshowroom.soapclient.component;

import com.mera.borisgk98.autoshowroom.soapclient.generated.ModelNotFound;
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
        catch (ModelNotFound modelNotFound) {
            return "Not found";
        }
    }

    @Override
    public String delete(Integer id) {
        try {
            crudService.delete(id);
            return "Successful deleting";
        }
        catch (ModelNotFound e) {
            return "Not found";
        }
    }
}
