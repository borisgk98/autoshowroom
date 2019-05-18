package com.mera.borisgk98.autoshowroom.server.rest.api;

import com.mera.borisgk98.autoshowroom.server.models.AutoMark;
import com.mera.borisgk98.autoshowroom.server.services.AutoMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T17:15:41.019+03:00[Europe/Moscow]")

@Controller
@RequestMapping("${openapi.autoshowroom.base-path:}")
public class AutoMarkApiController implements AutoMarkApi {

    @Autowired
    protected AutoMarkService autoMarkService;
    private final NativeWebRequest request;

    @Override
    public ResponseEntity<AutoMark> autoMarkAutoMarkIdGet(Integer autoMarkId) {
        Optional<AutoMark> autoMark = autoMarkService.read(autoMarkId);
        return autoMark.isPresent() ? ResponseEntity.ok(autoMark.get()) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public ResponseEntity<AutoMark> autoMarkPost(@Valid AutoMark autoMark) {
        return ResponseEntity.ok(autoMarkService.create(autoMark));
    }

    @org.springframework.beans.factory.annotation.Autowired
    public AutoMarkApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}

