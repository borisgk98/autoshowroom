package com.mera.borisgk98.autoshowroom.client.shell.components;

import com.mera.borisgk98.autoshowroom.client.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.HasId;

import java.util.List;

public abstract class AbstractCrudShellComponent<T extends HasId<Integer>, F> implements CrudShellComponent<T, F>{

}
