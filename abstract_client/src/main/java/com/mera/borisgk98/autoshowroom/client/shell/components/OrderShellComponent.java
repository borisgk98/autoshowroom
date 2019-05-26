package com.mera.borisgk98.autoshowroom.client.shell.components;

import com.mera.borisgk98.autoshowroom.client.models.Order;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.table.Table;

@ShellComponent
public class OrderShellComponent extends AbstractShellComponent<Order> implements ReadDeleteShellComponent<Order> {

    public OrderShellComponent() {
        super(Order.class);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read all values of order",
            key = "order readall"
    )
    public Table readAll() {
        return super.readAll();
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read some values of order with pagination",
            key = "order readrange"
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
            value = "Read information about order by id",
            key = "order read"
    )
    public String read(@ShellOption Integer id) {
        return super.read(id);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Delete order by id",
            key = "order delete"
    )
    public String delete(@ShellOption Integer id) {
        return super.delete(id);
    }
}
