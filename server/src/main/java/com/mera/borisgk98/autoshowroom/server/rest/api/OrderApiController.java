package com.mera.borisgk98.autoshowroom.server.rest.api;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Order;
import com.mera.borisgk98.autoshowroom.server.rest.api.OrderApi;
import com.mera.borisgk98.autoshowroom.server.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T17:15:41.019+03:00[Europe/Moscow]")

@Controller
@RequestMapping("${openapi.ordershowroom.base-path:}")
public class OrderApiController implements OrderApi {

    private final NativeWebRequest request;
    @Autowired
    protected OrderService orderService;
    @Value("${defaultoffset}")
    protected Integer defaultOffset;

    @org.springframework.beans.factory.annotation.Autowired
    public OrderApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Order> orderOrderIdGet(Integer orderId) {
        try {
            Order order = orderService.read(orderId);
            return ResponseEntity.ok(order);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Order> orderPost(@Valid Order order) {
        return ResponseEntity.ok(orderService.create(order));
    }

    @Override
    public ResponseEntity<Void> orderOrderIdDelete(Integer orderId) {
        try {
            orderService.delete(orderId);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Order> orderOrderIdPut(@Valid Order order) {
        try {
            Order newOrder = orderService.update(order);
            return ResponseEntity.ok(newOrder);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Order>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<List<Order>> orderGet(Integer limit, Integer offset) {
        if (limit == null) {
            return ResponseEntity.ok(orderService.getAll());
        }
        if (offset == null) {
            offset = defaultOffset;
        }
        return ResponseEntity.ok(orderService.getRange(offset, limit));
    }
}