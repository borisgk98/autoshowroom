package com.mera.borisgk98.autoshowroom.server.rest.api;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.Auto;
import com.mera.borisgk98.autoshowroom.server.rest.api.AutoApi;
import com.mera.borisgk98.autoshowroom.server.services.AutoService;
import io.micrometer.core.annotation.Timed;
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
@RequestMapping("${openapi.autoshowroom.base-path:}")
public class AutoApiController implements AutoApi {

    private final NativeWebRequest request;
    @Autowired
    protected AutoService autoService;
    @Value("${defaultoffset}")
    protected Integer defaultOffset;

    @org.springframework.beans.factory.annotation.Autowired
    public AutoApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    @Timed(percentiles = {0.5, 0.95, 0.999}, histogram = true)
    public ResponseEntity<Auto> autoAutoIdGet(Integer autoId) {
        try {
            Auto auto = autoService.read(autoId);
            return ResponseEntity.ok(auto);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Auto>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Auto> autoPost(@Valid Auto auto) {
        return ResponseEntity.ok(autoService.create(auto));
    }

    @Override
    public ResponseEntity<Void> autoAutoIdDelete(Integer autoId) {
        try {
            autoService.delete(autoId);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<Auto> autoAutoIdPut(@Valid Auto auto) {
        try {
            Auto newAuto = autoService.update(auto);
            return ResponseEntity.ok(newAuto);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Auto>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<List<Auto>> autoGet(Integer limit, Integer offset) {
        if (limit == null) {
            return ResponseEntity.ok(autoService.getAll());
        }
        if (offset == null) {
            offset = defaultOffset;
        }
        return ResponseEntity.ok(autoService.getRange(offset, limit));
    }
}
