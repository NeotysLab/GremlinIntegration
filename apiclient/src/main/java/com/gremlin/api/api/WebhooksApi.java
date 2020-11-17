/*
 * The Gremlin API
 * The API for interacting with Gremlin's 'Failure as a Service'
 *
 * OpenAPI spec version: v1
 * Contact: support@gremlin.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.gremlin.api.api;

import com.gremlin.api.*;
import com.gremlin.api.model.Webhook;
import com.gremlin.api.model.WebhookRequest;
import com.gremlin.api.ApiGremlinClient;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WebhooksApi {
    private ApiGremlinClient apiGremlinClient;

    public WebhooksApi() {
        this(Configuration.getDefaultApiGremlinClient());
    }

    public WebhooksApi(ApiGremlinClient apiGremlinClient) {
        this.apiGremlinClient = apiGremlinClient;
    }

    public ApiGremlinClient getApiGremlinClient() {
        return apiGremlinClient;
    }

    public void setApiGremlinClient(ApiGremlinClient apiGremlinClient) {
        this.apiGremlinClient = apiGremlinClient;
    }

    /**
     * Build call for createWebhook1
     * @param body webhook to create (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createWebhook1Call(WebhookRequest body, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/webhooks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (teamId != null)
        localVarQueryParams.addAll(apiGremlinClient.parameterToPair("teamId", teamId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiGremlinClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiGremlinClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiGremlinClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  "GremlinapiKey"};
        return apiGremlinClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createWebhook1ValidateBeforeCall(WebhookRequest body, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        

        com.squareup.okhttp.Call call = createWebhook1Call(body, teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param body webhook to create (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void createWebhook1(WebhookRequest body, Object teamId) throws ApiGremlinException {
        createWebhook1WithHttpInfo(body, teamId);
    }

    /**
     * 
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param body webhook to create (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> createWebhook1WithHttpInfo(WebhookRequest body, Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = createWebhook1ValidateBeforeCall(body, teamId, null, null);
        return apiGremlinClient.execute(call);
    }

    /**
     *  (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param body webhook to create (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createWebhook1Async(WebhookRequest body, Object teamId, final ApiCallback<Void> callback) throws ApiGremlinException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createWebhook1ValidateBeforeCall(body, teamId, progressListener, progressRequestListener);
        apiGremlinClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for deleteWebhook
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteWebhookCall(String guid, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhooks/{guid}"
            .replaceAll("\\{" + "guid" + "\\}", apiGremlinClient.escapeString(guid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (teamId != null)
        localVarQueryParams.addAll(apiGremlinClient.parameterToPair("teamId", teamId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiGremlinClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiGremlinClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiGremlinClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"GremlinapiKey"  };
        return apiGremlinClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteWebhookValidateBeforeCall(String guid, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        
        // verify the required parameter 'guid' is set
        if (guid == null) {
            throw new ApiGremlinException("Missing the required parameter 'guid' when calling deleteWebhook(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteWebhookCall(guid, teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteWebhook(String guid, Object teamId) throws ApiGremlinException {
        deleteWebhookWithHttpInfo(guid, teamId);
    }

    /**
     * 
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteWebhookWithHttpInfo(String guid, Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = deleteWebhookValidateBeforeCall(guid, teamId, null, null);
        return apiGremlinClient.execute(call);
    }

    /**
     *  (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteWebhookAsync(String guid, Object teamId, final ApiCallback<Void> callback) throws ApiGremlinException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteWebhookValidateBeforeCall(guid, teamId, progressListener, progressRequestListener);
        apiGremlinClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getWebhookById
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getWebhookByIdCall(String guid, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhooks/{guid}"
            .replaceAll("\\{" + "guid" + "\\}", apiGremlinClient.escapeString(guid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (teamId != null)
        localVarQueryParams.addAll(apiGremlinClient.parameterToPair("teamId", teamId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiGremlinClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiGremlinClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiGremlinClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  "GremlinapiKey"};
        return apiGremlinClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getWebhookByIdValidateBeforeCall(String guid, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        
        // verify the required parameter 'guid' is set
        if (guid == null) {
            throw new ApiGremlinException("Missing the required parameter 'guid' when calling getWebhookById(Async)");
        }
        

        com.squareup.okhttp.Call call = getWebhookByIdCall(guid, teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return Webhook
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Webhook getWebhookById(String guid, Object teamId) throws ApiGremlinException {
        ApiResponse<Webhook> resp = getWebhookByIdWithHttpInfo(guid, teamId);
        return resp.getData();
    }

    /**
     * 
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;Webhook&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Webhook> getWebhookByIdWithHttpInfo(String guid, Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = getWebhookByIdValidateBeforeCall(guid, teamId, null, null);
        Type localVarReturnType = new TypeToken<Webhook>(){}.getType();
        return apiGremlinClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getWebhookByIdAsync(String guid, Object teamId, final ApiCallback<Webhook> callback) throws ApiGremlinException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getWebhookByIdValidateBeforeCall(guid, teamId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Webhook>(){}.getType();
        apiGremlinClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getWebhooks
     * @param state Filter webhooks by state (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getWebhooksCall(String state, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/webhooks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (state != null)
        localVarQueryParams.addAll(apiGremlinClient.parameterToPair("state", state));
        if (teamId != null)
        localVarQueryParams.addAll(apiGremlinClient.parameterToPair("teamId", teamId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiGremlinClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiGremlinClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiGremlinClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"GremlinapiKey"  };
        return apiGremlinClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getWebhooksValidateBeforeCall(String state, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        

        com.squareup.okhttp.Call call = getWebhooksCall(state, teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param state Filter webhooks by state (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return List&lt;Webhook&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Webhook> getWebhooks(String state, Object teamId) throws ApiGremlinException {
        ApiResponse<List<Webhook>> resp = getWebhooksWithHttpInfo(state, teamId);
        return resp.getData();
    }

    /**
     * 
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param state Filter webhooks by state (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;List&lt;Webhook&gt;&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Webhook>> getWebhooksWithHttpInfo(String state, Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = getWebhooksValidateBeforeCall(state, teamId, null, null);
        Type localVarReturnType = new TypeToken<List<Webhook>>(){}.getType();
        return apiGremlinClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param state Filter webhooks by state (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getWebhooksAsync(String state, Object teamId, final ApiCallback<List<Webhook>> callback) throws ApiGremlinException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getWebhooksValidateBeforeCall(state, teamId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Webhook>>(){}.getType();
        apiGremlinClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for updateWebhook
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param body webhook update (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateWebhookCall(String guid, WebhookRequest body, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/webhooks/{guid}"
            .replaceAll("\\{" + "guid" + "\\}", apiGremlinClient.escapeString(guid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (teamId != null)
        localVarQueryParams.addAll(apiGremlinClient.parameterToPair("teamId", teamId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
        };
        final String localVarAccept = apiGremlinClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiGremlinClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiGremlinClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {"GremlinapiKey"  };
        return apiGremlinClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateWebhookValidateBeforeCall(String guid, WebhookRequest body, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        
        // verify the required parameter 'guid' is set
        if (guid == null) {
            throw new ApiGremlinException("Missing the required parameter 'guid' when calling updateWebhook(Async)");
        }
        

        com.squareup.okhttp.Call call = updateWebhookCall(guid, body, teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param body webhook update (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void updateWebhook(String guid, WebhookRequest body, Object teamId) throws ApiGremlinException {
        updateWebhookWithHttpInfo(guid, body, teamId);
    }

    /**
     * 
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param body webhook update (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> updateWebhookWithHttpInfo(String guid, WebhookRequest body, Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = updateWebhookValidateBeforeCall(guid, body, teamId, null, null);
        return apiGremlinClient.execute(call);
    }

    /**
     *  (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_WEBHOOKS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param body webhook update (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateWebhookAsync(String guid, WebhookRequest body, Object teamId, final ApiCallback<Void> callback) throws ApiGremlinException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateWebhookValidateBeforeCall(guid, body, teamId, progressListener, progressRequestListener);
        apiGremlinClient.executeAsync(call, callback);
        return call;
    }
}