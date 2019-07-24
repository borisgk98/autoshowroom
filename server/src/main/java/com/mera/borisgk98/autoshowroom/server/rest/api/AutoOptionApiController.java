package com.mera.borisgk98.autoshowroom.server.rest.api;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoOption;
import com.mera.borisgk98.autoshowroom.server.rest.api.AutooptionApi;
import com.mera.borisgk98.autoshowroom.server.services.AutoOptionService;
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
@RequestMapping("${openapi.autooptionshowroom.base-path:}")
public class AutoOptionApiController implements AutooptionApi {

    private final NativeWebRequest request;
    @Autowired
    protected AutoOptionService autooptionService;
    @Value("${defaultoffset}")
    protected Integer defaultOffset;

    @org.springframework.beans.factory.annotation.Autowired
    public AutoOptionApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    @Counter(metrics = { "rest_requests", "requests" } )
    public ResponseEntity<AutoOption> autooptionAutooptionIdGet(Integer autooptionId) {
        try {
            AutoOption autooption = autooptionService.read(autooptionId);
            return ResponseEntity.ok(autooption);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<AutoOption>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Counter(metrics = { "rest_requests", "requests" } )
    public ResponseEntity<AutoOption> autooptionPost(@Valid AutoOption autooption) {
        return ResponseEntity.ok(autooptionService.create(autooption));
    }

    @Override
    @Counter(metrics = { "rest_requests", "requests" } )
    public ResponseEntity<Void> autooptionAutooptionIdDelete(Integer autooptionId) {
        try {
            autooptionService.delete(autooptionId);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Counter(metrics = { "rest_requests", "requests" } )
    public ResponseEntity<AutoOption> autooptionAutooptionIdPut(@Valid AutoOption autooption) {
        try {
            AutoOption newAutoOption = autooptionService.update(autooption);
            return ResponseEntity.ok(newAutoOption);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<AutoOption>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Counter(metrics = { "rest_requests", "requests" } )
    public ResponseEntity<List<AutoOption>> autooptionGet(Integer limit, Integer offset) {
        if (limit == null) {
            return ResponseEntity.ok(autooptionService.getAll());
        }
        if (offset == null) {
            offset = defaultOffset;
        }
        return ResponseEntity.ok(autooptionService.getRange(offset, limit));
    }
}
