package com.mera.borisgk98.autoshowroom.client.shell.components;

import com.mera.borisgk98.autoshowroom.client.models.AutoOption;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.table.Table;

@ShellComponent
public class AutoOptionShellComponent extends AbstractShellComponent<AutoOption> implements ReadDeleteShellComponent<AutoOption> {

    public AutoOptionShellComponent() {
        super(AutoOption.class);
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
