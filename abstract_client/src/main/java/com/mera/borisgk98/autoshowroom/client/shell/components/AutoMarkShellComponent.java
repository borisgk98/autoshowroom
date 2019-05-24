package com.mera.borisgk98.autoshowroom.client.shell.components;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.table.Table;
import org.springframework.shell.table.TableBuilder;
import org.springframework.shell.table.TableModel;
import org.springframework.shell.table.TableModelBuilder;

@ShellComponent
public class AutoMarkShellComponent {

    @ShellMethod(prefix = "--", value = "automark", key = "automark create")
    public Table create(String[] args) {
        TableModelBuilder<String> builder = new TableModelBuilder<>();
        for (String s : args) {
            builder.addRow();
            builder.addValue(s);
        }
        return (new TableBuilder(builder.build())).build();
    }
}
