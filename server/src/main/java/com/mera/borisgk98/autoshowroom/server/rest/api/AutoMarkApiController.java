package com.mera.borisgk98.autoshowroom.server.rest.api;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoMark;
import com.mera.borisgk98.autoshowroom.server.rest.api.AutomarkApi;
import com.mera.borisgk98.autoshowroom.server.services.AutoMarkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import io.micrometer.core.annotation.Timed;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T17:15:41.019+03:00[Europe/Moscow]")

@Controller
@RequestMapping("${openapi.automarkshowroom.base-path:}")
public class AutoMarkApiController implements AutomarkApi {

    private final NativeWebRequest request;
    @Autowired
    protected AutoMarkService automarkService;
    @Value("${defaultoffset}")
    protected Integer defaultOffset;

    @org.springframework.beans.factory.annotation.Autowired
    public AutoMarkApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    @Timed(value = "rest")
    public ResponseEntity<AutoMark> automarkAutomarkIdGet(Integer automarkId) {
        try {
            AutoMark automark = automarkService.read(automarkId);
            return ResponseEntity.ok(automark);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<AutoMark>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Timed(value = "rest")
    public ResponseEntity<AutoMark> automarkPost(@Valid AutoMark automark) {
        return ResponseEntity.ok(automarkService.create(automark));
    }

    @Override
    @Timed(value = "rest")
    public ResponseEntity<Void> automarkAutomarkIdDelete(Integer automarkId) {
        try {
            automarkService.delete(automarkId);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Timed(value = "rest")
    public ResponseEntity<AutoMark> automarkAutomarkIdPut(@Valid AutoMark automark) {
        try {
            AutoMark newAutoMark = automarkService.update(automark);
            return ResponseEntity.ok(newAutoMark);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<AutoMark>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Timed(value = "rest")
    public ResponseEntity<List<AutoMark>> automarkGet(Integer limit, Integer offset) {
        if (limit == null) {
            return ResponseEntity.ok(automarkService.getAll());
        }
        if (offset == null) {
            offset = defaultOffset;
        }
        return ResponseEntity.ok(automarkService.getRange(offset, limit));
    }
}
