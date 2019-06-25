package com.mera.borisgk98.autoshowroom.client.component;

import com.mera.borisgk98.autoshowroom.client.exception.ModelNotFound;
import com.mera.borisgk98.autoshowroom.client.model.*;
import com.mera.borisgk98.autoshowroom.client.service.OrderService;
import com.mera.borisgk98.autoshowroom.client.tool.TableBuilder;
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
			@ShellOption Integer sellerId,
            @ShellOption String orderStatus) {
        try {
            OrderStatus status;
            try {
                status  = OrderStatus.valueOf(orderStatus);
            }
            catch (IllegalArgumentException e) {
                throw new IllegalArgumentException("Incorrect --order-status");
            }

            Order order = new Order();
            order.setStatus(status);
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

    @ShellMethod(
            prefix = "--",
            value = "Read all values of order by order status",
            key = "order filter"
    )
    public Table filter(@ShellOption String orderStatus) {
        OrderStatus status = null;
        try {
            status  = OrderStatus.valueOf(orderStatus);
        }
        catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Incorrect --order-status");
        }
        return TableBuilder.build(((OrderService) crudService).filter(status), Order.class);
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
