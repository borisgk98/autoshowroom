package com.mera.borisgk98.autoshowroom.client.shell.components;

import com.mera.borisgk98.autoshowroom.client.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.HasId;
import com.mera.borisgk98.autoshowroom.client.services.CrudService;
import com.mera.borisgk98.autoshowroom.client.tool.TableBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.table.Table;

public abstract class AbstractReadShellComponent<T extends HasId<Integer>> implements ReadShellComponent<T> {
    @Autowired
    protected CrudService<T, Integer> crudService;
    protected Class<T> modelClass;

    public AbstractReadShellComponent(Class<T> modelClass) {
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
}
