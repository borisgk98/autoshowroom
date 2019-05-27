package com.mera.borisgk98.autoshowroom.client.component;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.*;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.table.Table;
import java.util.List;


@ShellComponent
public class AutoMarkShellComponent extends AbstractShellComponent<AutoMark> implements ReadDeleteShellComponent<AutoMark> {

    public AutoMarkShellComponent() {
        super(AutoMark.class);
    }

    @ShellMethod(
            prefix = "--",
            value = "Create new automark",
            key = "automark create"
    )
    public String create(
			@ShellOption String name
) {
        AutoMark automark = new AutoMark();
        automark.setName(name);

        return crudService.create(automark).toString();
    }

    @ShellMethod(
            prefix = "--",
            value = "Update automark",
            key = "automark update"
    )
    public String update(
            @ShellOption Integer id, 
			@ShellOption String name
) {
        try {
            AutoMark automark = new AutoMark();
            automark.setId(id);
            automark.setName(name);

            return crudService.update(automark).toString();
        }
        catch (ModelNotFound e) {
            return "Not found";
        }
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read all values of automark",
            key = "automark readall"
    )
    public Table readAll() {
        return super.readAll();
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read some values of automark with pagination",
            key = "automark readrange"
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
            value = "Read information about automark by id",
            key = "automark read"
    )
    public String read(@ShellOption Integer id) {
        return super.read(id);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Delete automark by id",
            key = "automark delete"
    )
    public String delete(@ShellOption Integer id) {
        return super.delete(id);
    }
}
