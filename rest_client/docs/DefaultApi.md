# DefaultApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**autoAutoIdGet**](DefaultApi.md#autoAutoIdGet) | **GET** /auto/{auto_id} | 
[**autoMarkAutoMarkIdGet**](DefaultApi.md#autoMarkAutoMarkIdGet) | **GET** /auto_mark/{auto_mark_id} | 
[**autoMarkPost**](DefaultApi.md#autoMarkPost) | **POST** /auto_mark | 
[**autoPost**](DefaultApi.md#autoPost) | **POST** /auto | 


<a name="autoAutoIdGet"></a>
# **autoAutoIdGet**
> Auto autoAutoIdGet(autoId)



Get information about auto by auto id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer autoId = 56; // Integer | 
try {
    Auto result = apiInstance.autoAutoIdGet(autoId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autoAutoIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoId** | **Integer**|  |

### Return type

[**Auto**](Auto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="autoMarkAutoMarkIdGet"></a>
# **autoMarkAutoMarkIdGet**
> AutoMark autoMarkAutoMarkIdGet(autoMarkId)



Get information about auto by auto_mark id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer autoMarkId = 56; // Integer | 
try {
    AutoMark result = apiInstance.autoMarkAutoMarkIdGet(autoMarkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autoMarkAutoMarkIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoMarkId** | **Integer**|  |

### Return type

[**AutoMark**](AutoMark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="autoMarkPost"></a>
# **autoMarkPost**
> AutoMark autoMarkPost(autoMark)



Add new auto_mark

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AutoMark autoMark = new AutoMark(); // AutoMark | 
try {
    AutoMark result = apiInstance.autoMarkPost(autoMark);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autoMarkPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoMark** | [**AutoMark**](AutoMark.md)|  |

### Return type

[**AutoMark**](AutoMark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autoPost"></a>
# **autoPost**
> Auto autoPost(auto)



Add new auto

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Auto auto = new Auto(); // Auto | 
try {
    Auto result = apiInstance.autoPost(auto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autoPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **auto** | [**Auto**](Auto.md)|  |

### Return type

[**Auto**](Auto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

