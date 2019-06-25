package com.mera.borisgk98.autoshowroom.server.rest.api;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Seller;
import com.mera.borisgk98.autoshowroom.server.rest.api.SellerApi;
import com.mera.borisgk98.autoshowroom.server.services.SellerService;
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
@RequestMapping("${openapi.sellershowroom.base-path:}")
public class SellerApiController implements SellerApi {

    private final NativeWebRequest request;
    @Autowired
    protected SellerService sellerService;
    @Value("${defaultoffset}")
    protected Integer defaultOffset;

    @org.springframework.beans.factory.annotation.Autowired
    public SellerApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    @Counter(metrics = { "rest_requests", "requests" } )
    public ResponseEntity<Seller> sellerSellerIdGet(Integer sellerId) {
        try {
            Seller seller = sellerService.read(sellerId);
            return ResponseEntity.ok(seller);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Seller>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Counter(metrics = { "rest_requests", "requests" } )
    public ResponseEntity<Seller> sellerPost(@Valid Seller seller) {
        return ResponseEntity.ok(sellerService.create(seller));
    }

    @Override
    @Counter(metrics = { "rest_requests", "requests" } )
    public ResponseEntity<Void> sellerSellerIdDelete(Integer sellerId) {
        try {
            sellerService.delete(sellerId);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Counter(metrics = { "rest_requests", "requests" } )
    public ResponseEntity<Seller> sellerSellerIdPut(@Valid Seller seller) {
        try {
            Seller newSeller = sellerService.update(seller);
            return ResponseEntity.ok(newSeller);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Seller>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Counter(metrics = { "rest_requests", "requests" } )
    public ResponseEntity<List<Seller>> sellerGet(Integer limit, Integer offset) {
        if (limit == null) {
            return ResponseEntity.ok(sellerService.getAll());
        }
        if (offset == null) {
            offset = defaultOffset;
        }
        return ResponseEntity.ok(sellerService.getRange(offset, limit));
    }
}
