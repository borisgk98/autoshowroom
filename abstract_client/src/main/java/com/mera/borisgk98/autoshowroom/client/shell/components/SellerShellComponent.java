package com.mera.borisgk98.autoshowroom.client.shell.components;

import com.mera.borisgk98.autoshowroom.client.models.Seller;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.table.Table;

@ShellComponent
public class SellerShellComponent extends AbstractShellComponent<Seller> implements ReadDeleteShellComponent<Seller> {

    public SellerShellComponent() {
        super(Seller.class);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read all values of seller",
            key = "seller readall"
    )
    public Table readAll() {
        return super.readAll();
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read some values of seller with pagination",
            key = "seller readrange"
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
            value = "Read information about seller by id",
            key = "seller read"
    )
    public String read(@ShellOption Integer id) {
        return super.read(id);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Delete seller by id",
            key = "seller delete"
    )
    public String delete(@ShellOption Integer id) {
        return super.delete(id);
    }
}
