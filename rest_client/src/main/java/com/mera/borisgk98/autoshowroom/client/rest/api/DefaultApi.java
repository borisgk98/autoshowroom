package com.mera.borisgk98.autoshowroom.client.rest.api;

import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiClient;

import com.mera.borisgk98.autoshowroom.client.models.Auto;
import com.mera.borisgk98.autoshowroom.client.models.AutoMark;
import com.mera.borisgk98.autoshowroom.client.models.AutoModel;
import com.mera.borisgk98.autoshowroom.client.models.AutoOption;
import com.mera.borisgk98.autoshowroom.client.models.Customer;
import com.mera.borisgk98.autoshowroom.client.models.Order;
import com.mera.borisgk98.autoshowroom.client.models.Seller;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-05-27T16:29:32.481+03:00[Europe/Moscow]")
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
     * Delate information about auto by auto id
     * <p><b>200</b> - Successful deletting
     * <p><b>404</b> - Not found auto by this auto_id
     * @param autoId The autoId parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> autoAutoIdDelete(Integer autoId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'autoId' is set
        if (autoId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoId' when calling autoAutoIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("auto_id", autoId);
        String path = UriComponentsBuilder.fromPath("/auto/{auto_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
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
     * Change information about auto
     * <p><b>200</b> - Successful changing
     * @param auto The auto parameter
     * @return Auto
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Auto> autoAutoIdPut(Auto auto) throws RestClientException {
        Object postBody = auto;
        
        // verify the required parameter 'auto' is set
        if (auto == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'auto' when calling autoAutoIdPut");
        }
        
        String path = UriComponentsBuilder.fromPath("/auto/{auto_id}").build().toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - List of autos
     * @param limit Limit for number of returnig values
     * @param offset Offset for number of returnig values
     * @return List&lt;Auto&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Auto> autoGet(Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/auto").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Auto> returnType = new ParameterizedTypeReference<Auto>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create information about auto
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
    /**
     * 
     * Delate information about automark by automark id
     * <p><b>200</b> - Successful deletting
     * <p><b>404</b> - Not found automark by this automark_id
     * @param automarkId The automarkId parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> automarkAutomarkIdDelete(Integer automarkId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'automarkId' is set
        if (automarkId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'automarkId' when calling automarkAutomarkIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("automark_id", automarkId);
        String path = UriComponentsBuilder.fromPath("/automark/{automark_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get information about automark by automark id
     * <p><b>200</b> - Successful getting
     * <p><b>404</b> - Not found automark by this automark_id
     * @param automarkId The automarkId parameter
     * @return AutoMark
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<AutoMark> automarkAutomarkIdGet(Integer automarkId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'automarkId' is set
        if (automarkId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'automarkId' when calling automarkAutomarkIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("automark_id", automarkId);
        String path = UriComponentsBuilder.fromPath("/automark/{automark_id}").buildAndExpand(uriVariables).toUriString();
        
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
     * Change information about automark
     * <p><b>200</b> - Successful changing
     * @param autoMark The autoMark parameter
     * @return AutoMark
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<AutoMark> automarkAutomarkIdPut(AutoMark autoMark) throws RestClientException {
        Object postBody = autoMark;
        
        // verify the required parameter 'autoMark' is set
        if (autoMark == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoMark' when calling automarkAutomarkIdPut");
        }
        
        String path = UriComponentsBuilder.fromPath("/automark/{automark_id}").build().toUriString();
        
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
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - List of automarks
     * @param limit Limit for number of returnig values
     * @param offset Offset for number of returnig values
     * @return List&lt;AutoMark&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<AutoMark> automarkGet(Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/automark").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<AutoMark> returnType = new ParameterizedTypeReference<AutoMark>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create information about automark
     * <p><b>200</b> - Successful adding
     * @param autoMark The autoMark parameter
     * @return AutoMark
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<AutoMark> automarkPost(AutoMark autoMark) throws RestClientException {
        Object postBody = autoMark;
        
        // verify the required parameter 'autoMark' is set
        if (autoMark == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoMark' when calling automarkPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/automark").build().toUriString();
        
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
     * Delate information about automodel by automodel id
     * <p><b>200</b> - Successful deletting
     * <p><b>404</b> - Not found automodel by this automodel_id
     * @param automodelId The automodelId parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> automodelAutomodelIdDelete(Integer automodelId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'automodelId' is set
        if (automodelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'automodelId' when calling automodelAutomodelIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("automodel_id", automodelId);
        String path = UriComponentsBuilder.fromPath("/automodel/{automodel_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get information about automodel by automodel id
     * <p><b>200</b> - Successful getting
     * <p><b>404</b> - Not found automodel by this automodel_id
     * @param automodelId The automodelId parameter
     * @return AutoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<AutoModel> automodelAutomodelIdGet(Integer automodelId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'automodelId' is set
        if (automodelId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'automodelId' when calling automodelAutomodelIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("automodel_id", automodelId);
        String path = UriComponentsBuilder.fromPath("/automodel/{automodel_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<AutoModel> returnType = new ParameterizedTypeReference<AutoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Change information about automodel
     * <p><b>200</b> - Successful changing
     * @param autoModel The autoModel parameter
     * @return AutoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<AutoModel> automodelAutomodelIdPut(AutoModel autoModel) throws RestClientException {
        Object postBody = autoModel;
        
        // verify the required parameter 'autoModel' is set
        if (autoModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoModel' when calling automodelAutomodelIdPut");
        }
        
        String path = UriComponentsBuilder.fromPath("/automodel/{automodel_id}").build().toUriString();
        
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

        ParameterizedTypeReference<AutoModel> returnType = new ParameterizedTypeReference<AutoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - List of automodels
     * @param limit Limit for number of returnig values
     * @param offset Offset for number of returnig values
     * @return List&lt;AutoModel&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<AutoModel> automodelGet(Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/automodel").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<AutoModel> returnType = new ParameterizedTypeReference<AutoModel>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create information about automodel
     * <p><b>200</b> - Successful adding
     * @param autoModel The autoModel parameter
     * @return AutoModel
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<AutoModel> automodelPost(AutoModel autoModel) throws RestClientException {
        Object postBody = autoModel;
        
        // verify the required parameter 'autoModel' is set
        if (autoModel == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoModel' when calling automodelPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/automodel").build().toUriString();
        
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

        ParameterizedTypeReference<AutoModel> returnType = new ParameterizedTypeReference<AutoModel>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Delate information about autooption by autooption id
     * <p><b>200</b> - Successful deletting
     * <p><b>404</b> - Not found autooption by this autooption_id
     * @param autooptionId The autooptionId parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> autooptionAutooptionIdDelete(Integer autooptionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'autooptionId' is set
        if (autooptionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autooptionId' when calling autooptionAutooptionIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("autooption_id", autooptionId);
        String path = UriComponentsBuilder.fromPath("/autooption/{autooption_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get information about autooption by autooption id
     * <p><b>200</b> - Successful getting
     * <p><b>404</b> - Not found autooption by this autooption_id
     * @param autooptionId The autooptionId parameter
     * @return AutoOption
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<AutoOption> autooptionAutooptionIdGet(Integer autooptionId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'autooptionId' is set
        if (autooptionId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autooptionId' when calling autooptionAutooptionIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("autooption_id", autooptionId);
        String path = UriComponentsBuilder.fromPath("/autooption/{autooption_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<AutoOption> returnType = new ParameterizedTypeReference<AutoOption>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Change information about autooption
     * <p><b>200</b> - Successful changing
     * @param autoOption The autoOption parameter
     * @return AutoOption
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<AutoOption> autooptionAutooptionIdPut(AutoOption autoOption) throws RestClientException {
        Object postBody = autoOption;
        
        // verify the required parameter 'autoOption' is set
        if (autoOption == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoOption' when calling autooptionAutooptionIdPut");
        }
        
        String path = UriComponentsBuilder.fromPath("/autooption/{autooption_id}").build().toUriString();
        
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

        ParameterizedTypeReference<AutoOption> returnType = new ParameterizedTypeReference<AutoOption>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - List of autooptions
     * @param limit Limit for number of returnig values
     * @param offset Offset for number of returnig values
     * @return List&lt;AutoOption&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<AutoOption> autooptionGet(Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/autooption").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<AutoOption> returnType = new ParameterizedTypeReference<AutoOption>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create information about autooption
     * <p><b>200</b> - Successful adding
     * @param autoOption The autoOption parameter
     * @return AutoOption
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<AutoOption> autooptionPost(AutoOption autoOption) throws RestClientException {
        Object postBody = autoOption;
        
        // verify the required parameter 'autoOption' is set
        if (autoOption == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'autoOption' when calling autooptionPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/autooption").build().toUriString();
        
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

        ParameterizedTypeReference<AutoOption> returnType = new ParameterizedTypeReference<AutoOption>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Delate information about customer by customer id
     * <p><b>200</b> - Successful deletting
     * <p><b>404</b> - Not found customer by this customer_id
     * @param customerId The customerId parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> customerCustomerIdDelete(Integer customerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling customerCustomerIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customer_id", customerId);
        String path = UriComponentsBuilder.fromPath("/customer/{customer_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get information about customer by customer id
     * <p><b>200</b> - Successful getting
     * <p><b>404</b> - Not found customer by this customer_id
     * @param customerId The customerId parameter
     * @return Customer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Customer> customerCustomerIdGet(Integer customerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'customerId' is set
        if (customerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customerId' when calling customerCustomerIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("customer_id", customerId);
        String path = UriComponentsBuilder.fromPath("/customer/{customer_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Customer> returnType = new ParameterizedTypeReference<Customer>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Change information about customer
     * <p><b>200</b> - Successful changing
     * @param customer The customer parameter
     * @return Customer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Customer> customerCustomerIdPut(Customer customer) throws RestClientException {
        Object postBody = customer;
        
        // verify the required parameter 'customer' is set
        if (customer == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customer' when calling customerCustomerIdPut");
        }
        
        String path = UriComponentsBuilder.fromPath("/customer/{customer_id}").build().toUriString();
        
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

        ParameterizedTypeReference<Customer> returnType = new ParameterizedTypeReference<Customer>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - List of customers
     * @param limit Limit for number of returnig values
     * @param offset Offset for number of returnig values
     * @return List&lt;Customer&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Customer> customerGet(Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/customer").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Customer> returnType = new ParameterizedTypeReference<Customer>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create information about customer
     * <p><b>200</b> - Successful adding
     * @param customer The customer parameter
     * @return Customer
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Customer> customerPost(Customer customer) throws RestClientException {
        Object postBody = customer;
        
        // verify the required parameter 'customer' is set
        if (customer == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'customer' when calling customerPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/customer").build().toUriString();
        
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

        ParameterizedTypeReference<Customer> returnType = new ParameterizedTypeReference<Customer>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - List of orders
     * @param limit Limit for number of returnig values
     * @param offset Offset for number of returnig values
     * @return List&lt;Order&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Order> orderGet(Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/order").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Order> returnType = new ParameterizedTypeReference<Order>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Delate information about order by order id
     * <p><b>200</b> - Successful deletting
     * <p><b>404</b> - Not found order by this order_id
     * @param orderId The orderId parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> orderOrderIdDelete(Integer orderId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling orderOrderIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("order_id", orderId);
        String path = UriComponentsBuilder.fromPath("/order/{order_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get information about order by order id
     * <p><b>200</b> - Successful getting
     * <p><b>404</b> - Not found order by this order_id
     * @param orderId The orderId parameter
     * @return Order
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Order> orderOrderIdGet(Integer orderId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'orderId' is set
        if (orderId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'orderId' when calling orderOrderIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("order_id", orderId);
        String path = UriComponentsBuilder.fromPath("/order/{order_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Order> returnType = new ParameterizedTypeReference<Order>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Change information about order
     * <p><b>200</b> - Successful changing
     * @param order The order parameter
     * @return Order
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Order> orderOrderIdPut(Order order) throws RestClientException {
        Object postBody = order;
        
        // verify the required parameter 'order' is set
        if (order == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'order' when calling orderOrderIdPut");
        }
        
        String path = UriComponentsBuilder.fromPath("/order/{order_id}").build().toUriString();
        
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

        ParameterizedTypeReference<Order> returnType = new ParameterizedTypeReference<Order>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create information about order
     * <p><b>200</b> - Successful adding
     * @param order The order parameter
     * @return Order
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Order> orderPost(Order order) throws RestClientException {
        Object postBody = order;
        
        // verify the required parameter 'order' is set
        if (order == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'order' when calling orderPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/order").build().toUriString();
        
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

        ParameterizedTypeReference<Order> returnType = new ParameterizedTypeReference<Order>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * 
     * <p><b>200</b> - List of sellers
     * @param limit Limit for number of returnig values
     * @param offset Offset for number of returnig values
     * @return List&lt;Seller&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Flux<Seller> sellerGet(Integer limit, Integer offset) throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/seller").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "limit", limit));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "offset", offset));

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Seller> returnType = new ParameterizedTypeReference<Seller>() {};
        return apiClient.invokeFluxAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Create information about seller
     * <p><b>200</b> - Successful adding
     * @param seller The seller parameter
     * @return Seller
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Seller> sellerPost(Seller seller) throws RestClientException {
        Object postBody = seller;
        
        // verify the required parameter 'seller' is set
        if (seller == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seller' when calling sellerPost");
        }
        
        String path = UriComponentsBuilder.fromPath("/seller").build().toUriString();
        
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

        ParameterizedTypeReference<Seller> returnType = new ParameterizedTypeReference<Seller>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Delate information about seller by seller id
     * <p><b>200</b> - Successful deletting
     * <p><b>404</b> - Not found seller by this seller_id
     * @param sellerId The sellerId parameter
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Void> sellerSellerIdDelete(Integer sellerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'sellerId' is set
        if (sellerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sellerId' when calling sellerSellerIdDelete");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("seller_id", sellerId);
        String path = UriComponentsBuilder.fromPath("/seller/{seller_id}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        return apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Get information about seller by seller id
     * <p><b>200</b> - Successful getting
     * <p><b>404</b> - Not found seller by this seller_id
     * @param sellerId The sellerId parameter
     * @return Seller
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Seller> sellerSellerIdGet(Integer sellerId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'sellerId' is set
        if (sellerId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'sellerId' when calling sellerSellerIdGet");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("seller_id", sellerId);
        String path = UriComponentsBuilder.fromPath("/seller/{seller_id}").buildAndExpand(uriVariables).toUriString();
        
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

        ParameterizedTypeReference<Seller> returnType = new ParameterizedTypeReference<Seller>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * 
     * Change information about seller
     * <p><b>200</b> - Successful changing
     * @param seller The seller parameter
     * @return Seller
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Mono<Seller> sellerSellerIdPut(Seller seller) throws RestClientException {
        Object postBody = seller;
        
        // verify the required parameter 'seller' is set
        if (seller == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'seller' when calling sellerSellerIdPut");
        }
        
        String path = UriComponentsBuilder.fromPath("/seller/{seller_id}").build().toUriString();
        
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

        ParameterizedTypeReference<Seller> returnType = new ParameterizedTypeReference<Seller>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
