package com.mera.borisgk98.autoshowroom.client.shell.components;

import com.mera.borisgk98.autoshowroom.client.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.AutoMark;
import com.mera.borisgk98.autoshowroom.client.services.AutoMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.table.Table;
import org.springframework.shell.table.TableBuilder;
import org.springframework.shell.table.TableModel;
import org.springframework.shell.table.TableModelBuilder;

@ShellComponent
public class AutoMarkShellComponent extends AbstractReadShellComponent<AutoMark> implements ReadShellComponent<AutoMark> {

    public AutoMarkShellComponent() {
        super(AutoMark.class);
    }

    @ShellMethod(
            prefix = "--",
            value = "automark",
            key = "automark create"
    )
    public String create(@ShellOption("name") String name) {
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
    public String read(@ShellOption("id") Integer id) {
        return super.read(id);
    }
}
