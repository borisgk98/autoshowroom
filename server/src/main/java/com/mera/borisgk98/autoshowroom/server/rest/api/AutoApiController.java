package com.mera.borisgk98.autoshowroom.server.rest.api;

import com.mera.borisgk98.autoshowroom.server.models.Auto;
import com.mera.borisgk98.autoshowroom.server.services.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-16T18:25:16.054+03:00[Europe/Moscow]")

@Controller
@RequestMapping("${openapi.autoshowroom.base-path:}")
public class AutoApiController implements AutoApi {

    private final NativeWebRequest request;
    @Autowired
    protected AutoService autoService;

    @org.springframework.beans.factory.annotation.Autowired
    public AutoApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public ResponseEntity<Auto> autoAutoIdGet(Integer autoId) {
        return ResponseEntity.ok(autoService.read(autoId));
    }

    @Override
    public ResponseEntity<Auto> autoPost(@Valid Auto auto) {
        return ResponseEntity.ok(autoService.create(auto));
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
