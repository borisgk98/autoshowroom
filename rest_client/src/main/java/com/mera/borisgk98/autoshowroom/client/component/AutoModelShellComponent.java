package com.mera.borisgk98.autoshowroom.client.component;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.AutoModel;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.table.Table;


@ShellComponent
public class AutoModelShellComponent extends AbstractShellComponent<AutoModel> implements ReadDeleteShellComponent<AutoModel> {

    public AutoModelShellComponent() {
        super(AutoModel.class);
    }

    @ShellMethod(
            prefix = "--",
            value = "Create new automodel",
            key = "automodel create"
    )
    public String create(
			@ShellOption String name
) {
        AutoModel automodel = new AutoModel();
        automodel.setName(name);

        return crudService.create(automodel).toString();
    }

    @ShellMethod(
            prefix = "--",
            value = "Update automodel",
            key = "automodel update"
    )
    public String update(
            @ShellOption Integer id, 
			@ShellOption String name
) {
        try {
            AutoModel automodel = new AutoModel();
            automodel.setId(id);
            automodel.setName(name);

            return crudService.update(automodel).toString();
        }
        catch (ModelNotFound e) {
            return "Not found";
        }
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read all values of automodel",
            key = "automodel readall"
    )
    public Table readAll() {
        return super.readAll();
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read some values of automodel with pagination",
            key = "automodel readrange"
    )
    public Table readWithLimitAndOffset(
            @ShellOption(
                    help = "Limit for number of returning values"
            ) Integer limit,
            @ShellOption(
                    help = "Offset for number of returning values"
            ) Integer offset
    ) {
        return super.readWithLimitAndOffset(limit, offset);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read information about automodel by id",
            key = "automodel read"
    )
    public String read(@ShellOption Integer id) {
        return super.read(id);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Delete automodel by id",
            key = "automodel delete"
    )
    public String delete(@ShellOption Integer id) {
        return super.delete(id);
    }
}
