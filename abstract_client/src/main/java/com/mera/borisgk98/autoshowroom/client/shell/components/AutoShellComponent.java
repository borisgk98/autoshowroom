package com.mera.borisgk98.autoshowroom.client.shell.components;

import com.mera.borisgk98.autoshowroom.client.models.Auto;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.table.Table;

@ShellComponent
public class AutoShellComponent extends AbstractShellComponent<Auto> implements ReadDeleteShellComponent<Auto> {

    public AutoShellComponent() {
        super(Auto.class);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read all values of auto",
            key = "auto readall"
    )
    public Table readAll() {
        return super.readAll();
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read some values of auto with pagination",
            key = "auto readrange"
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
            value = "Read information about auto by id",
            key = "auto read"
    )
    public String read(@ShellOption Integer id) {
        return super.read(id);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Delete auto by id",
            key = "auto delete"
    )
    public String delete(@ShellOption Integer id) {
        return super.delete(id);
    }
}
