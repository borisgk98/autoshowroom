package com.mera.borisgk98.autoshowroom.server.rest.api;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Customer;
import com.mera.borisgk98.autoshowroom.server.rest.api.CustomerApi;
import com.mera.borisgk98.autoshowroom.server.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import com.mera.borisgk98.autoshowroom.server.prometheus.annotations.Counter;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T17:15:41.019+03:00[Europe/Moscow]")

@Controller
@RequestMapping("${openapi.customershowroom.base-path:}")
public class CustomerApiController implements CustomerApi {

    private final NativeWebRequest request;
    @Autowired
    protected CustomerService customerService;
    @Value("${defaultoffset}")
    protected Integer defaultOffset;

    @org.springframework.beans.factory.annotation.Autowired
    public CustomerApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    @Counter(metric = "rest_requests")
    public ResponseEntity<Customer> customerCustomerIdGet(Integer customerId) {
        try {
            Customer customer = customerService.read(customerId);
            return ResponseEntity.ok(customer);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Counter(metric = "rest_requests")
    public ResponseEntity<Customer> customerPost(@Valid Customer customer) {
        return ResponseEntity.ok(customerService.create(customer));
    }

    @Override
    @Counter(metric = "rest_requests")
    public ResponseEntity<Void> customerCustomerIdDelete(Integer customerId) {
        try {
            customerService.delete(customerId);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Counter(metric = "rest_requests")
    public ResponseEntity<Customer> customerCustomerIdPut(@Valid Customer customer) {
        try {
            Customer newCustomer = customerService.update(customer);
            return ResponseEntity.ok(newCustomer);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Customer>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Counter(metric = "rest_requests")
    public ResponseEntity<List<Customer>> customerGet(Integer limit, Integer offset) {
        if (limit == null) {
            return ResponseEntity.ok(customerService.getAll());
        }
        if (offset == null) {
            offset = defaultOffset;
        }
        return ResponseEntity.ok(customerService.getRange(offset, limit));
    }
}
