package com.mera.borisgk98.autoshowroom.server.rest.api;

import com.mera.borisgk98.autoshowroom.server.exceptions.ModelNotFound;
import com.mera.borisgk98.autoshowroom.server.models.AutoModel;
import com.mera.borisgk98.autoshowroom.server.rest.api.AutomodelApi;
import com.mera.borisgk98.autoshowroom.server.services.AutoModelService;
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
@RequestMapping("${openapi.automodelshowroom.base-path:}")
public class AutoModelApiController implements AutomodelApi {

    private final NativeWebRequest request;
    @Autowired
    protected AutoModelService automodelService;
    @Value("${defaultoffset}")
    protected Integer defaultOffset;

    @org.springframework.beans.factory.annotation.Autowired
    public AutoModelApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    @Timed(value = "rest")
    public ResponseEntity<AutoModel> automodelAutomodelIdGet(Integer automodelId) {
        try {
            AutoModel automodel = automodelService.read(automodelId);
            return ResponseEntity.ok(automodel);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<AutoModel>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Timed(value = "rest")
    public ResponseEntity<AutoModel> automodelPost(@Valid AutoModel automodel) {
        return ResponseEntity.ok(automodelService.create(automodel));
    }

    @Override
    @Timed(value = "rest")
    public ResponseEntity<Void> automodelAutomodelIdDelete(Integer automodelId) {
        try {
            automodelService.delete(automodelId);
            return new ResponseEntity<Void>(HttpStatus.OK);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Timed(value = "rest")
    public ResponseEntity<AutoModel> automodelAutomodelIdPut(@Valid AutoModel automodel) {
        try {
            AutoModel newAutoModel = automodelService.update(automodel);
            return ResponseEntity.ok(newAutoModel);
        }
        catch (ModelNotFound e) {
            return new ResponseEntity<AutoModel>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    @Timed(value = "rest")
    public ResponseEntity<List<AutoModel>> automodelGet(Integer limit, Integer offset) {
        if (limit == null) {
            return ResponseEntity.ok(automodelService.getAll());
        }
        if (offset == null) {
            offset = defaultOffset;
        }
        return ResponseEntity.ok(automodelService.getRange(offset, limit));
    }
}
