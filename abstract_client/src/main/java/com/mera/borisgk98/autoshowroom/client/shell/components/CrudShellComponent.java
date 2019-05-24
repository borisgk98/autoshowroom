package com.mera.borisgk98.autoshowroom.client.shell.components;

import com.mera.borisgk98.autoshowroom.client.models.HasId;
import com.mera.borisgk98.autoshowroom.client.services.CrudService;

public interface CrudShellComponent<T extends HasId<Integer>, F> extends CrudService<T, F> {
}
