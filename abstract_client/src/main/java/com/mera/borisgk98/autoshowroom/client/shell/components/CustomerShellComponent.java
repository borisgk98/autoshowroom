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
public class CustomerShellComponent extends AbstractShellComponent<Customer> implements ReadDeleteShellComponent<Customer> {

    public CustomerShellComponent() {
        super(Customer.class);
    }

    @ShellMethod(
            prefix = "--",
            value = "Create new customer",
            key = "customer create"
    )
    public String create(
			@ShellOption String name,
			@ShellOption String surname
) {
        return crudService.create(new Customer(){{
               setName(name);
               setSurname(surname);

        }}).toString();
    }

    @ShellMethod(
            prefix = "--",
            value = "Update customer",
            key = "customer update"
    )
    public String update(
            @ShellOption Integer id, 
			@ShellOption String name,
			@ShellOption String surname
) {
        try {
            return crudService.update(new Customer(){{
                setId(id);
                setName(name);
                setSurname(surname);

            }}).toString();
        }
        catch (ModelNotFound e) {
            return "Not found";
        }
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read all values of customer",
            key = "customer readall"
    )
    public Table readAll() {
        return super.readAll();
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Read some values of customer with pagination",
            key = "customer readrange"
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
            value = "Read information about customer by id",
            key = "customer read"
    )
    public String read(@ShellOption Integer id) {
        return super.read(id);
    }

    @Override
    @ShellMethod(
            prefix = "--",
            value = "Delete customer by id",
            key = "customer delete"
    )
    public String delete(@ShellOption Integer id) {
        return super.delete(id);
    }
}
