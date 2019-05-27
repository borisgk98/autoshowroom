package com.mera.borisgk98.autoshowroom.client.shell.components;


import com.mera.borisgk98.autoshowroom.client.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.*;
import com.mera.borisgk98.autoshowroom.client.shell.components.AbstractShellComponent;
import com.mera.borisgk98.autoshowroom.client.shell.components.ReadDeleteShellComponent;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.table.Table;
import java.util.List;


@ShellComponent
public class AutoOptionShellComponent extends AbstractShellComponent<AutoOption> implements ReadDeleteShellComponent<AutoOption> {

    public AutoOptionShellComponent() {
        super(AutoOption.class);
    }

    @ShellMethod(
            prefix = "--",
            value = "Create new autooption",
            key = "autooption create"
    )
    public String create(
			@ShellOption String name
) {
        return crudService.create(new AutoOption(){{
               setName(name);

        }}).toString();
    }

    @ShellMethod(
            prefix = "--",
            value = "Update autooption",
            key = "autooption update"
    )
    public String update(
            @ShellOption Integer id, 
			@ShellOption String name
) {
        try {
            return crudService.update(new AutoOption(){{
                setId(id);
                setName(name);

            }}).toString();
        }
        catch (ModelNotFound e) {
            return "Not found";
        }
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read all values of autooption",
            key = "autooption readall"
    )
    public Table readAll() {
        return super.readAll();
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read some values of autooption with pagination",
            key = "autooption readrange"
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
            value = "Read information about autooption by id",
            key = "autooption read"
    )
    public String read(@ShellOption Integer id) {
        return super.read(id);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Delete autooption by id",
            key = "autooption delete"
    )
    public String delete(@ShellOption Integer id) {
        return super.delete(id);
    }
}
