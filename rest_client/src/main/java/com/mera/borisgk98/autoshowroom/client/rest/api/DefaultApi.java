package com.mera.borisgk98.autoshowroom.client.rest.api;

import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiClient;

import com.mera.borisgk98.autoshowroom.client.models.Auto;
import com.mera.borisgk98.autoshowroom.client.models.AutoMark;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-16T22:06:49.880+03:00[Europe/Moscow]")
public class DefaultApi {
    private ApiClient apiClient;

    public DefaultApi() {
        this(new ApiClient());
    }

    @Autowired
    public DefaultApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * Get information about auto by auto id
     * <p><b>200</b> - Successful getting
     * <p><b>404</b> - Not found auto by this auto_id
     * @param autoId The autoId parameter
     * @return Auto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Auto> autoAutoIdGet(Integer autoId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'autoId' is set
        if (autoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoId' when calling autoAutoIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("auto_id", autoId);
        String path = UriComponentsBuilder.fromPath("/auto/{auto_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Auto> returnType = new ParameterizedTypeReference<Auto>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get information about auto by auto_mark id
     * <p><b>200</b> - Successful getting
     * <p><b>404</b> - Not found auto_mark by this auto_mark_id
     * @param autoMarkId The autoMarkId parameter
     * @return AutoMark
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<AutoMark> autoMarkAutoMarkIdGet(Integer autoMarkId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'autoMarkId' is set
        if (autoMarkId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoMarkId' when calling autoMarkAutoMarkIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("auto_mark_id", autoMarkId);
        String path = UriComponentsBuilder.fromPath("/auto_mark/{auto_mark_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<AutoMark> returnType = new ParameterizedTypeReference<AutoMark>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Add new auto_mark
     * <p><b>200</b> - Successful adding
     * @param autoMark The autoMark parameter
     * @return AutoMark
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<AutoMark> autoMarkPost(AutoMark autoMark) throws RestClientException {
        Object postBody = autoMark;
        
        // verify the required parameter 'autoMark' is set
        if (autoMark == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoMark' when calling autoMarkPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/auto_mark").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<AutoMark> returnType = new ParameterizedTypeReference<AutoMark>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Add new auto
     * <p><b>200</b> - Successful adding
     * @param auto The auto parameter
     * @return Auto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Auto> autoPost(Auto auto) throws RestClientException {
        Object postBody = auto;
        
        // verify the required parameter 'auto' is set
        if (auto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'auto' when calling autoPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/auto").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Auto> returnType = new ParameterizedTypeReference<Auto>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
