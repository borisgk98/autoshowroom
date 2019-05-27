package com.mera.borisgk98.autoshowroom.soapclient.component;

import com.mera.borisgk98.autoshowroom.soapclient.generated.ModelNotFound;
import com.mera.borisgk98.autoshowroom.soapclient.model.*;
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
			@ShellOption Integer autoId,
			@ShellOption Integer customerId,
			@ShellOption Integer sellerId) {
        Order order = new Order();
        Auto auto = new Auto();
        		auto.setId(autoId);
        order.setAuto(auto);
        Customer customer = new Customer();
        		customer.setId(customerId);
        order.setCustomer(customer);
        Seller seller = new Seller();
        		seller.setId(sellerId);
        order.setSeller(seller);

        return crudService.create(order).toString();
    }

    @ShellMethod(
            prefix = "--",
            value = "Update order",
            key = "order update"
    )
    public String update(
            @ShellOption Integer id, 
			@ShellOption Integer autoId,
			@ShellOption Integer customerId,
			@ShellOption Integer sellerId) {
        try {
            Order order = new Order();
            order.setId(id);
            Auto auto = new Auto();
            		auto.setId(autoId);
            order.setAuto(auto);
            Customer customer = new Customer();
            		customer.setId(customerId);
            order.setCustomer(customer);
            Seller seller = new Seller();
            		seller.setId(sellerId);
            order.setSeller(seller);

            return crudService.update(order).toString();
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
