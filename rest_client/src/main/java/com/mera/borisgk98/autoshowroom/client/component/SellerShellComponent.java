package com.mera.borisgk98.autoshowroom.client.component;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.models.*;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;
import org.springframework.shell.table.Table;
import java.util.List;


@ShellComponent
public class SellerShellComponent extends AbstractShellComponent<Seller> implements ReadDeleteShellComponent<Seller> {

    public SellerShellComponent() {
        super(Seller.class);
    }

    @ShellMethod(
            prefix = "--",
            value = "Create new seller",
            key = "seller create"
    )
    public String create(
			@ShellOption String name
) {
        Seller seller = new Seller();
        seller.setName(name);

        return crudService.create(seller).toString();
    }

    @ShellMethod(
            prefix = "--",
            value = "Update seller",
            key = "seller update"
    )
    public String update(
            @ShellOption Integer id, 
			@ShellOption String name
) {
        try {
            Seller seller = new Seller();
            seller.setId(id);
            seller.setName(name);

            return crudService.update(seller).toString();
        }
        catch (ModelNotFound e) {
            return "Not found";
        }
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
