package com.mera.borisgk98.autoshowroom.server.services;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoModel;

import java.util.List;

public interface AutoModelService extends CrudService<AutoModel, Integer>{
    @Override
    AutoModel create(AutoModel m);

    @Override
    AutoModel read(Integer id) throws ModelNotFound;

    @Override
    AutoModel update(AutoModel m) throws ModelNotFound;

    @Override
    void delete(Integer id) throws ModelNotFound;

    @Override
    boolean existById(Integer id);

    @Override
    boolean exist(AutoModel m);

    @Override
    List<AutoModel> getAll();

    @Override
    List<AutoModel> getRange(Integer offset, Integer limit);
}
