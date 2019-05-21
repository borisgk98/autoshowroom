/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mera.borisgk98.autoshowroom.server.rest.api;

import com.mera.borisgk98.autoshowroom.server.models.AutoOption;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-05-21T18:27:24.365+03:00[Europe/Moscow]")

@Validated
@Api(value = "autooption", description = "the autooption API")
public interface AutooptionApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "autooptionAutooptionIdDelete", notes = "Delate information about autooption by autooption id", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful deletting"),
        @ApiResponse(code = 404, message = "Not found autooption by this autooption_id") })
    @RequestMapping(value = "/autooption/{autooption_id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> autooptionAutooptionIdDelete(@ApiParam(value = "",required=true) @PathVariable("autooption_id") Integer autooptionId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "autooptionAutooptionIdGet", notes = "Get information about autooption by autooption id", response = AutoOption.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful getting", response = AutoOption.class),
        @ApiResponse(code = 404, message = "Not found autooption by this autooption_id") })
    @RequestMapping(value = "/autooption/{autooption_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<AutoOption> autooptionAutooptionIdGet(@ApiParam(value = "",required=true) @PathVariable("autooption_id") Integer autooptionId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"name\" : \"4x4\",  \"autos\" : [ null, null ],  \"id\" : 5}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "autooptionAutooptionIdPut", notes = "Change information about autooption", response = AutoOption.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful changing", response = AutoOption.class) })
    @RequestMapping(value = "/autooption/{autooption_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<AutoOption> autooptionAutooptionIdPut(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutoOption autoOption) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"name\" : \"4x4\",  \"autos\" : [ null, null ],  \"id\" : 5}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "autooptionGet", notes = "", response = AutoOption.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of autooptions", response = AutoOption.class, responseContainer = "List") })
    @RequestMapping(value = "/autooption",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<AutoOption>> autooptionGet(@ApiParam(value = "Limit for number of returnig values") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "Offset for number of returnig values") @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"name\" : \"4x4\",  \"autos\" : [ null, null ],  \"id\" : 5}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "autooptionPost", notes = "Create information about autooption", response = AutoOption.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful adding", response = AutoOption.class) })
    @RequestMapping(value = "/autooption",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<AutoOption> autooptionPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody AutoOption autoOption) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"name\" : \"4x4\",  \"autos\" : [ null, null ],  \"id\" : 5}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
