package com.mera.borisgk98.autoshowroom.server.rest.api;

import com.mera.borisgk98.autoshowroom.server.models.Kek;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

import javax.validation.Valid;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-18T19:14:00.253+03:00[Europe/Moscow]")

@Controller
@RequestMapping("${openapi.autoshowroom.base-path:}")
public class TestApiController implements TestApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TestApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<Kek> testPost(@Valid String body) {
        return ResponseEntity.ok().body(new Kek(){{ setKek(body); }});
    }
}
