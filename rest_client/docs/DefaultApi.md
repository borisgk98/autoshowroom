# DefaultApi

All URIs are relative to *http://localhost:9000*

Method | HTTP request | Description
------------- | ------------- | -------------
[**autoAutoIdDelete**](DefaultApi.md#autoAutoIdDelete) | **DELETE** /auto/{auto_id} | 
[**autoAutoIdGet**](DefaultApi.md#autoAutoIdGet) | **GET** /auto/{auto_id} | 
[**autoAutoIdPut**](DefaultApi.md#autoAutoIdPut) | **PUT** /auto/{auto_id} | 
[**autoGet**](DefaultApi.md#autoGet) | **GET** /auto | 
[**autoPost**](DefaultApi.md#autoPost) | **POST** /auto | 
[**automarkAutomarkIdDelete**](DefaultApi.md#automarkAutomarkIdDelete) | **DELETE** /automark/{automark_id} | 
[**automarkAutomarkIdGet**](DefaultApi.md#automarkAutomarkIdGet) | **GET** /automark/{automark_id} | 
[**automarkAutomarkIdPut**](DefaultApi.md#automarkAutomarkIdPut) | **PUT** /automark/{automark_id} | 
[**automarkGet**](DefaultApi.md#automarkGet) | **GET** /automark | 
[**automarkPost**](DefaultApi.md#automarkPost) | **POST** /automark | 
[**automodelAutomodelIdDelete**](DefaultApi.md#automodelAutomodelIdDelete) | **DELETE** /automodel/{automodel_id} | 
[**automodelAutomodelIdGet**](DefaultApi.md#automodelAutomodelIdGet) | **GET** /automodel/{automodel_id} | 
[**automodelAutomodelIdPut**](DefaultApi.md#automodelAutomodelIdPut) | **PUT** /automodel/{automodel_id} | 
[**automodelGet**](DefaultApi.md#automodelGet) | **GET** /automodel | 
[**automodelPost**](DefaultApi.md#automodelPost) | **POST** /automodel | 
[**autooptionAutooptionIdDelete**](DefaultApi.md#autooptionAutooptionIdDelete) | **DELETE** /autooption/{autooption_id} | 
[**autooptionAutooptionIdGet**](DefaultApi.md#autooptionAutooptionIdGet) | **GET** /autooption/{autooption_id} | 
[**autooptionAutooptionIdPut**](DefaultApi.md#autooptionAutooptionIdPut) | **PUT** /autooption/{autooption_id} | 
[**autooptionGet**](DefaultApi.md#autooptionGet) | **GET** /autooption | 
[**autooptionPost**](DefaultApi.md#autooptionPost) | **POST** /autooption | 
[**customerCustomerIdDelete**](DefaultApi.md#customerCustomerIdDelete) | **DELETE** /customer/{customer_id} | 
[**customerCustomerIdGet**](DefaultApi.md#customerCustomerIdGet) | **GET** /customer/{customer_id} | 
[**customerCustomerIdPut**](DefaultApi.md#customerCustomerIdPut) | **PUT** /customer/{customer_id} | 
[**customerGet**](DefaultApi.md#customerGet) | **GET** /customer | 
[**customerPost**](DefaultApi.md#customerPost) | **POST** /customer | 
[**orderGet**](DefaultApi.md#orderGet) | **GET** /order | 
[**orderOrderIdDelete**](DefaultApi.md#orderOrderIdDelete) | **DELETE** /order/{order_id} | 
[**orderOrderIdGet**](DefaultApi.md#orderOrderIdGet) | **GET** /order/{order_id} | 
[**orderOrderIdPut**](DefaultApi.md#orderOrderIdPut) | **PUT** /order/{order_id} | 
[**orderPost**](DefaultApi.md#orderPost) | **POST** /order | 
[**sellerGet**](DefaultApi.md#sellerGet) | **GET** /seller | 
[**sellerPost**](DefaultApi.md#sellerPost) | **POST** /seller | 
[**sellerSellerIdDelete**](DefaultApi.md#sellerSellerIdDelete) | **DELETE** /seller/{seller_id} | 
[**sellerSellerIdGet**](DefaultApi.md#sellerSellerIdGet) | **GET** /seller/{seller_id} | 
[**sellerSellerIdPut**](DefaultApi.md#sellerSellerIdPut) | **PUT** /seller/{seller_id} | 


<a name="autoAutoIdDelete"></a>
# **autoAutoIdDelete**
> autoAutoIdDelete(autoId)



Delate information about auto by auto id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer autoId = 56; // Integer | 
try {
    apiInstance.autoAutoIdDelete(autoId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autoAutoIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

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

<a name="autoAutoIdPut"></a>
# **autoAutoIdPut**
> Auto autoAutoIdPut(auto)



Change information about auto

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Auto auto = new Auto(); // Auto | 
try {
    Auto result = apiInstance.autoAutoIdPut(auto);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autoAutoIdPut");
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

<a name="autoGet"></a>
# **autoGet**
> List&lt;Auto&gt; autoGet(limit, offset)



### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer limit = 56; // Integer | Limit for number of returnig values
Integer offset = 56; // Integer | Offset for number of returnig values
try {
    List<Auto> result = apiInstance.autoGet(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autoGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit for number of returnig values | [optional]
 **offset** | **Integer**| Offset for number of returnig values | [optional]

### Return type

[**List&lt;Auto&gt;**](Auto.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="autoPost"></a>
# **autoPost**
> Auto autoPost(auto)



Create information about auto

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

<a name="automarkAutomarkIdDelete"></a>
# **automarkAutomarkIdDelete**
> automarkAutomarkIdDelete(automarkId)



Delate information about automark by automark id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer automarkId = 56; // Integer | 
try {
    apiInstance.automarkAutomarkIdDelete(automarkId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#automarkAutomarkIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **automarkId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="automarkAutomarkIdGet"></a>
# **automarkAutomarkIdGet**
> AutoMark automarkAutomarkIdGet(automarkId)



Get information about automark by automark id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer automarkId = 56; // Integer | 
try {
    AutoMark result = apiInstance.automarkAutomarkIdGet(automarkId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#automarkAutomarkIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **automarkId** | **Integer**|  |

### Return type

[**AutoMark**](AutoMark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="automarkAutomarkIdPut"></a>
# **automarkAutomarkIdPut**
> AutoMark automarkAutomarkIdPut(autoMark)



Change information about automark

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AutoMark autoMark = new AutoMark(); // AutoMark | 
try {
    AutoMark result = apiInstance.automarkAutomarkIdPut(autoMark);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#automarkAutomarkIdPut");
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

<a name="automarkGet"></a>
# **automarkGet**
> List&lt;AutoMark&gt; automarkGet(limit, offset)



### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer limit = 56; // Integer | Limit for number of returnig values
Integer offset = 56; // Integer | Offset for number of returnig values
try {
    List<AutoMark> result = apiInstance.automarkGet(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#automarkGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit for number of returnig values | [optional]
 **offset** | **Integer**| Offset for number of returnig values | [optional]

### Return type

[**List&lt;AutoMark&gt;**](AutoMark.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="automarkPost"></a>
# **automarkPost**
> AutoMark automarkPost(autoMark)



Create information about automark

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AutoMark autoMark = new AutoMark(); // AutoMark | 
try {
    AutoMark result = apiInstance.automarkPost(autoMark);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#automarkPost");
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

<a name="automodelAutomodelIdDelete"></a>
# **automodelAutomodelIdDelete**
> automodelAutomodelIdDelete(automodelId)



Delate information about automodel by automodel id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer automodelId = 56; // Integer | 
try {
    apiInstance.automodelAutomodelIdDelete(automodelId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#automodelAutomodelIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **automodelId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="automodelAutomodelIdGet"></a>
# **automodelAutomodelIdGet**
> AutoModel automodelAutomodelIdGet(automodelId)



Get information about automodel by automodel id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer automodelId = 56; // Integer | 
try {
    AutoModel result = apiInstance.automodelAutomodelIdGet(automodelId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#automodelAutomodelIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **automodelId** | **Integer**|  |

### Return type

[**AutoModel**](AutoModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="automodelAutomodelIdPut"></a>
# **automodelAutomodelIdPut**
> AutoModel automodelAutomodelIdPut(autoModel)



Change information about automodel

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AutoModel autoModel = new AutoModel(); // AutoModel | 
try {
    AutoModel result = apiInstance.automodelAutomodelIdPut(autoModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#automodelAutomodelIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoModel** | [**AutoModel**](AutoModel.md)|  |

### Return type

[**AutoModel**](AutoModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="automodelGet"></a>
# **automodelGet**
> List&lt;AutoModel&gt; automodelGet(limit, offset)



### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer limit = 56; // Integer | Limit for number of returnig values
Integer offset = 56; // Integer | Offset for number of returnig values
try {
    List<AutoModel> result = apiInstance.automodelGet(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#automodelGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit for number of returnig values | [optional]
 **offset** | **Integer**| Offset for number of returnig values | [optional]

### Return type

[**List&lt;AutoModel&gt;**](AutoModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="automodelPost"></a>
# **automodelPost**
> AutoModel automodelPost(autoModel)



Create information about automodel

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AutoModel autoModel = new AutoModel(); // AutoModel | 
try {
    AutoModel result = apiInstance.automodelPost(autoModel);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#automodelPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoModel** | [**AutoModel**](AutoModel.md)|  |

### Return type

[**AutoModel**](AutoModel.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autooptionAutooptionIdDelete"></a>
# **autooptionAutooptionIdDelete**
> autooptionAutooptionIdDelete(autooptionId)



Delate information about autooption by autooption id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer autooptionId = 56; // Integer | 
try {
    apiInstance.autooptionAutooptionIdDelete(autooptionId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autooptionAutooptionIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autooptionId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="autooptionAutooptionIdGet"></a>
# **autooptionAutooptionIdGet**
> AutoOption autooptionAutooptionIdGet(autooptionId)



Get information about autooption by autooption id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer autooptionId = 56; // Integer | 
try {
    AutoOption result = apiInstance.autooptionAutooptionIdGet(autooptionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autooptionAutooptionIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autooptionId** | **Integer**|  |

### Return type

[**AutoOption**](AutoOption.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="autooptionAutooptionIdPut"></a>
# **autooptionAutooptionIdPut**
> AutoOption autooptionAutooptionIdPut(autoOption)



Change information about autooption

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AutoOption autoOption = new AutoOption(); // AutoOption | 
try {
    AutoOption result = apiInstance.autooptionAutooptionIdPut(autoOption);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autooptionAutooptionIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoOption** | [**AutoOption**](AutoOption.md)|  |

### Return type

[**AutoOption**](AutoOption.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="autooptionGet"></a>
# **autooptionGet**
> List&lt;AutoOption&gt; autooptionGet(limit, offset)



### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer limit = 56; // Integer | Limit for number of returnig values
Integer offset = 56; // Integer | Offset for number of returnig values
try {
    List<AutoOption> result = apiInstance.autooptionGet(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autooptionGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit for number of returnig values | [optional]
 **offset** | **Integer**| Offset for number of returnig values | [optional]

### Return type

[**List&lt;AutoOption&gt;**](AutoOption.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="autooptionPost"></a>
# **autooptionPost**
> AutoOption autooptionPost(autoOption)



Create information about autooption

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
AutoOption autoOption = new AutoOption(); // AutoOption | 
try {
    AutoOption result = apiInstance.autooptionPost(autoOption);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#autooptionPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **autoOption** | [**AutoOption**](AutoOption.md)|  |

### Return type

[**AutoOption**](AutoOption.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerCustomerIdDelete"></a>
# **customerCustomerIdDelete**
> customerCustomerIdDelete(customerId)



Delate information about customer by customer id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer customerId = 56; // Integer | 
try {
    apiInstance.customerCustomerIdDelete(customerId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#customerCustomerIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="customerCustomerIdGet"></a>
# **customerCustomerIdGet**
> Customer customerCustomerIdGet(customerId)



Get information about customer by customer id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer customerId = 56; // Integer | 
try {
    Customer result = apiInstance.customerCustomerIdGet(customerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#customerCustomerIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customerId** | **Integer**|  |

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customerCustomerIdPut"></a>
# **customerCustomerIdPut**
> Customer customerCustomerIdPut(customer)



Change information about customer

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Customer customer = new Customer(); // Customer | 
try {
    Customer result = apiInstance.customerCustomerIdPut(customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#customerCustomerIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)|  |

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="customerGet"></a>
# **customerGet**
> List&lt;Customer&gt; customerGet(limit, offset)



### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer limit = 56; // Integer | Limit for number of returnig values
Integer offset = 56; // Integer | Offset for number of returnig values
try {
    List<Customer> result = apiInstance.customerGet(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#customerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit for number of returnig values | [optional]
 **offset** | **Integer**| Offset for number of returnig values | [optional]

### Return type

[**List&lt;Customer&gt;**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="customerPost"></a>
# **customerPost**
> Customer customerPost(customer)



Create information about customer

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Customer customer = new Customer(); // Customer | 
try {
    Customer result = apiInstance.customerPost(customer);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#customerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **customer** | [**Customer**](Customer.md)|  |

### Return type

[**Customer**](Customer.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orderGet"></a>
# **orderGet**
> List&lt;Order&gt; orderGet(limit, offset)



### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer limit = 56; // Integer | Limit for number of returnig values
Integer offset = 56; // Integer | Offset for number of returnig values
try {
    List<Order> result = apiInstance.orderGet(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#orderGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit for number of returnig values | [optional]
 **offset** | **Integer**| Offset for number of returnig values | [optional]

### Return type

[**List&lt;Order&gt;**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderOrderIdDelete"></a>
# **orderOrderIdDelete**
> orderOrderIdDelete(orderId)



Delate information about order by order id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer orderId = 56; // Integer | 
try {
    apiInstance.orderOrderIdDelete(orderId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#orderOrderIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="orderOrderIdGet"></a>
# **orderOrderIdGet**
> Order orderOrderIdGet(orderId)



Get information about order by order id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer orderId = 56; // Integer | 
try {
    Order result = apiInstance.orderOrderIdGet(orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#orderOrderIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orderId** | **Integer**|  |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="orderOrderIdPut"></a>
# **orderOrderIdPut**
> Order orderOrderIdPut(order)



Change information about order

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Order order = new Order(); // Order | 
try {
    Order result = apiInstance.orderOrderIdPut(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#orderOrderIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)|  |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="orderPost"></a>
# **orderPost**
> Order orderPost(order)



Create information about order

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Order order = new Order(); // Order | 
try {
    Order result = apiInstance.orderPost(order);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#orderPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **order** | [**Order**](Order.md)|  |

### Return type

[**Order**](Order.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sellerGet"></a>
# **sellerGet**
> List&lt;Seller&gt; sellerGet(limit, offset)



### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer limit = 56; // Integer | Limit for number of returnig values
Integer offset = 56; // Integer | Offset for number of returnig values
try {
    List<Seller> result = apiInstance.sellerGet(limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#sellerGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Limit for number of returnig values | [optional]
 **offset** | **Integer**| Offset for number of returnig values | [optional]

### Return type

[**List&lt;Seller&gt;**](Seller.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sellerPost"></a>
# **sellerPost**
> Seller sellerPost(seller)



Create information about seller

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Seller seller = new Seller(); // Seller | 
try {
    Seller result = apiInstance.sellerPost(seller);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#sellerPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seller** | [**Seller**](Seller.md)|  |

### Return type

[**Seller**](Seller.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sellerSellerIdDelete"></a>
# **sellerSellerIdDelete**
> sellerSellerIdDelete(sellerId)



Delate information about seller by seller id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer sellerId = 56; // Integer | 
try {
    apiInstance.sellerSellerIdDelete(sellerId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#sellerSellerIdDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **Integer**|  |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="sellerSellerIdGet"></a>
# **sellerSellerIdGet**
> Seller sellerSellerIdGet(sellerId)



Get information about seller by seller id

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Integer sellerId = 56; // Integer | 
try {
    Seller result = apiInstance.sellerSellerIdGet(sellerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#sellerSellerIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sellerId** | **Integer**|  |

### Return type

[**Seller**](Seller.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="sellerSellerIdPut"></a>
# **sellerSellerIdPut**
> Seller sellerSellerIdPut(seller)



Change information about seller

### Example
```java
// Import classes:
//import com.mera.borisgk98.autoshowroom.client.rest.invoker.ApiException;
//import com.mera.borisgk98.autoshowroom.client.rest.api.DefaultApi;


DefaultApi apiInstance = new DefaultApi();
Seller seller = new Seller(); // Seller | 
try {
    Seller result = apiInstance.sellerSellerIdPut(seller);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#sellerSellerIdPut");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **seller** | [**Seller**](Seller.md)|  |

### Return type

[**Seller**](Seller.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

