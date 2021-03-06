/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (3.3.4).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.mera.borisgk98.autoshowroom.server.rest.api;

import com.mera.borisgk98.autoshowroom.server.models.Seller;
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
@Api(value = "seller", description = "the seller API")
public interface SellerApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    @ApiOperation(value = "", nickname = "sellerGet", notes = "", response = Seller.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of sellers", response = Seller.class, responseContainer = "List") })
    @RequestMapping(value = "/seller",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Seller>> sellerGet(@ApiParam(value = "Limit for number of returnig values") @Valid @RequestParam(value = "limit", required = false) Integer limit,@ApiParam(value = "Offset for number of returnig values") @Valid @RequestParam(value = "offset", required = false) Integer offset) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"name\" : \"SallerName\",  \"orders\" : [ null, null ],  \"id\" : 6}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "sellerPost", notes = "Create information about seller", response = Seller.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful adding", response = Seller.class) })
    @RequestMapping(value = "/seller",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Seller> sellerPost(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Seller seller) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"name\" : \"SallerName\",  \"orders\" : [ null, null ],  \"id\" : 6}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "sellerSellerIdDelete", notes = "Delate information about seller by seller id", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful deletting"),
        @ApiResponse(code = 404, message = "Not found seller by this seller_id") })
    @RequestMapping(value = "/seller/{seller_id}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> sellerSellerIdDelete(@ApiParam(value = "",required=true) @PathVariable("seller_id") Integer sellerId) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "sellerSellerIdGet", notes = "Get information about seller by seller id", response = Seller.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful getting", response = Seller.class),
        @ApiResponse(code = 404, message = "Not found seller by this seller_id") })
    @RequestMapping(value = "/seller/{seller_id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Seller> sellerSellerIdGet(@ApiParam(value = "",required=true) @PathVariable("seller_id") Integer sellerId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"name\" : \"SallerName\",  \"orders\" : [ null, null ],  \"id\" : 6}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    @ApiOperation(value = "", nickname = "sellerSellerIdPut", notes = "Change information about seller", response = Seller.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful changing", response = Seller.class) })
    @RequestMapping(value = "/seller/{seller_id}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Seller> sellerSellerIdPut(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Seller seller) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    ApiUtil.setExampleResponse(request, "application/json", "{  \"name\" : \"SallerName\",  \"orders\" : [ null, null ],  \"id\" : 6}");
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
