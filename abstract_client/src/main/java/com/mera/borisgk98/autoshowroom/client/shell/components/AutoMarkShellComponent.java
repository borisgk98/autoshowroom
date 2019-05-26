package com.mera.borisgk98.autoshowroom.client.shell.components;

import com.mera.borisgk98.autoshowroom.client.models.AutoMark;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.table.Table;

@ShellComponent
public class AutoMarkShellComponent extends AbstractShellComponent<AutoMark> implements ReadDeleteShellComponent<AutoMark> {

    public AutoMarkShellComponent() {
        super(AutoMark.class);
    }

    @ShellMethod(
            prefix = "--",
            value = "automark",
            key = "automark create"
    )
    public String create(@ShellOption String name) {
        return crudService.create(new AutoMark(){{
            setName(name);
        }}).toString();
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "automark",
            key = "automark readall"
    )
    public Table readAll() {
        return super.readAll();
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "automark",
            key = "automark readrange"
    )
    public Table readWithLimitAndOffset(@ShellOption Integer limit, @ShellOption Integer offset) {
        return super.readWithLimitAndOffset(limit, offset);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "automark",
            key = "automark read"
    )
    public String read(@ShellOption Integer id) {
        return super.read(id);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "automark",
            key = "automark delete"
    )
    public String delete(@ShellOption Integer id) {
        return super.delete(id);
    }
}
