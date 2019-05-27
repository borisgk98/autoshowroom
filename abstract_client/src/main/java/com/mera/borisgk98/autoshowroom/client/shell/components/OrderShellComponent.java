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
public class OrderShellComponent extends AbstractShellComponent<Order> implements ReadDeleteShellComponent<Order> {

    public OrderShellComponent() {
        super(Order.class);
    }

    @ShellMethod(
            prefix = "--",
            value = "Create new order",
            key = "order create"
    )
    public String create(
			@ShellOption Integer seller,
			@ShellOption Integer customer,
			@ShellOption Integer auto) {
        return crudService.create(new Order(){{
               setSeller(new Seller(){{ setId(seller); }});
               setCustomer(new Customer(){{ setId(customer); }});
               setAuto(new Auto(){{ setId(auto); }});

        }}).toString();
    }

    @ShellMethod(
            prefix = "--",
            value = "Update order",
            key = "order update"
    )
    public String update(
            @ShellOption Integer id, 
			@ShellOption Integer seller,
			@ShellOption Integer customer,
			@ShellOption Integer auto) {
        try {
            return crudService.update(new Order(){{
                setId(id);
                setSeller(new Seller(){{ setId(seller); }});
                setCustomer(new Customer(){{ setId(customer); }});
                setAuto(new Auto(){{ setId(auto); }});

            }}).toString();
        }
        catch (ModelNotFound e) {
            return "Not found";
        }
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
