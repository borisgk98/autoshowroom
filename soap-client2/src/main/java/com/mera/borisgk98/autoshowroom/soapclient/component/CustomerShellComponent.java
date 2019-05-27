package com.mera.borisgk98.autoshowroom.soapclient.component;

import com.mera.borisgk98.autoshowroom.server.soap.*;
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
        Customer customer = new Customer();
        customer.setName(name);
        customer.setSurname(surname);

        return crudService.create(customer).toString();
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
            Customer customer = new Customer();
            customer.setId(id);
            customer.setName(name);
            customer.setSurname(surname);

            return crudService.update(customer).toString();
        }
        catch (ModelNotFound_Exception e) {
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
