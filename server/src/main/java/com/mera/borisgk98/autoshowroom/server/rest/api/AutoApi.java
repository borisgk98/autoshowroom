/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mera.borisgk98.autoshowroom.server.rest.api;

import com.mera.borisgk98.autoshowroom.server.models.Auto;
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
@Api(value = "auto", description = "the auto API")
public interface AutoApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "autoAutoIdDelete", notes = "Delate information about auto by auto id", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful deletting"),
        @ApiResponse(code = 404, message = "Not found auto by this auto_id") })
    @RequestMapping(value = "/auto/{auto_id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> autoAutoIdDelete(@ApiParam(value = "",required=true) @PathVariable("auto_id") Integer autoId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "autoAutoIdGet", notes = "Get information about auto by auto id", response = Auto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful getting", response = Auto.class),
        @ApiResponse(code = 404, message = "Not found auto by this auto_id") })
    @RequestMapping(value = "/auto/{auto_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Auto> autoAutoIdGet(@ApiParam(value = "",required=true) @PathVariable("auto_id") Integer autoId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"options\" : [ {    \"name\" : \"4x4\",    \"autos\" : [ null, null ],    \"id\" : 5  }, {    \"name\" : \"4x4\",    \"autos\" : [ null, null ],    \"id\" : 5  } ],  \"model\" : {    \"name\" : \"q5\",    \"autos\" : [ null, null ],    \"id\" : 1  },  \"id\" : 0,  \"mark\" : {    \"name\" : \"audi\",    \"autos\" : [ null, null ],    \"id\" : 6  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "autoAutoIdPut", notes = "Change information about auto", response = Auto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful changing", response = Auto.class) })
    @RequestMapping(value = "/auto/{auto_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Auto> autoAutoIdPut(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auto auto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"options\" : [ {    \"name\" : \"4x4\",    \"autos\" : [ null, null ],    \"id\" : 5  }, {    \"name\" : \"4x4\",    \"autos\" : [ null, null ],    \"id\" : 5  } ],  \"model\" : {    \"name\" : \"q5\",    \"autos\" : [ null, null ],    \"id\" : 1  },  \"id\" : 0,  \"mark\" : {    \"name\" : \"audi\",    \"autos\" : [ null, null ],    \"id\" : 6  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "autoGet", notes = "", response = Auto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of autos", response = Auto.class, responseContainer = "List") })
    @RequestMapping(value = "/auto",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Auto>> autoGet(@ApiParam(value = "Limit for number of returnig values") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "Offset for number of returnig values") @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"options\" : [ {    \"name\" : \"4x4\",    \"autos\" : [ null, null ],    \"id\" : 5  }, {    \"name\" : \"4x4\",    \"autos\" : [ null, null ],    \"id\" : 5  } ],  \"model\" : {    \"name\" : \"q5\",    \"autos\" : [ null, null ],    \"id\" : 1  },  \"id\" : 0,  \"mark\" : {    \"name\" : \"audi\",    \"autos\" : [ null, null ],    \"id\" : 6  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "autoPost", notes = "Create information about auto", response = Auto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful adding", response = Auto.class) })
    @RequestMapping(value = "/auto",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Auto> autoPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Auto auto) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"options\" : [ {    \"name\" : \"4x4\",    \"autos\" : [ null, null ],    \"id\" : 5  }, {    \"name\" : \"4x4\",    \"autos\" : [ null, null ],    \"id\" : 5  } ],  \"model\" : {    \"name\" : \"q5\",    \"autos\" : [ null, null ],    \"id\" : 1  },  \"id\" : 0,  \"mark\" : {    \"name\" : \"audi\",    \"autos\" : [ null, null ],    \"id\" : 6  }}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
