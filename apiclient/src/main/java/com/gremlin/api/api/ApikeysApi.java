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
import com.gremlin.api.model.ApiKeyJson;
import com.gremlin.api.model.CreateApiKeysRequest;
import com.gremlin.api.ApiGremlinException;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApikeysApi {
    private ApiGremlinClient apiGremlinClient;

    public ApikeysApi() {
        this(Configuration.getDefaultApiGremlinClient());
    }

    public ApikeysApi(ApiGremlinClient apiGremlinClient) {
        this.apiGremlinClient = apiGremlinClient;
    }

    public ApiGremlinClient getApiGremlinClient() {
        return apiGremlinClient;
    }

    public void setApiGremlinClient(ApiGremlinClient apiGremlinClient) {
        this.apiGremlinClient = apiGremlinClient;
    }

    /**
     * Build call for activate1
     * @param identifier  (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call activate1Call(String identifier, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apikeys/{identifier}/activate"
            .replaceAll("\\{" + "identifier" + "\\}", apiGremlinClient.escapeString(identifier.toString()));

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

        String[] localVarAuthNames = new String[] {  "GremlinapiKey"};
        return apiGremlinClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call activate1ValidateBeforeCall(String identifier, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiGremlinException("Missing the required parameter 'identifier' when calling activate1(Async)");
        }
        

        com.squareup.okhttp.Call call = activate1Call(identifier, teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Un-Revoke an existing API Key
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;ACTIVATE_API_KEY&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param identifier  (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void activate1(String identifier, Object teamId) throws ApiGremlinException {
        activate1WithHttpInfo(identifier, teamId);
    }

    /**
     * Un-Revoke an existing API Key
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;ACTIVATE_API_KEY&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param identifier  (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> activate1WithHttpInfo(String identifier, Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = activate1ValidateBeforeCall(identifier, teamId, null, null);
        return apiGremlinClient.execute(call);
    }

    /**
     * Un-Revoke an existing API Key (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;ACTIVATE_API_KEY&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param identifier  (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call activate1Async(String identifier, Object teamId, final ApiCallback<Void> callback) throws ApiGremlinException {

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

        com.squareup.okhttp.Call call = activate1ValidateBeforeCall(identifier, teamId, progressListener, progressRequestListener);
        apiGremlinClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for createNew
     * @param body  (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createNewCall(CreateApiKeysRequest body, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/apikeys";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (teamId != null)
        localVarQueryParams.addAll(apiGremlinClient.parameterToPair("teamId", teamId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/plain"
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
        return apiGremlinClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createNewValidateBeforeCall(CreateApiKeysRequest body, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        

        com.squareup.okhttp.Call call = createNewCall(body, teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create a new API Key
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param body  (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void createNew(CreateApiKeysRequest body, Object teamId) throws ApiGremlinException {
        createNewWithHttpInfo(body, teamId);
    }

    /**
     * Create a new API Key
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param body  (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> createNewWithHttpInfo(CreateApiKeysRequest body, Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = createNewValidateBeforeCall(body, teamId, null, null);
        return apiGremlinClient.execute(call);
    }

    /**
     * Create a new API Key (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param body  (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createNewAsync(CreateApiKeysRequest body, Object teamId, final ApiCallback<Void> callback) throws ApiGremlinException {

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

        com.squareup.okhttp.Call call = createNewValidateBeforeCall(body, teamId, progressListener, progressRequestListener);
        apiGremlinClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for listActive
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listActiveCall(Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apikeys/active";

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

        String[] localVarAuthNames = new String[] { "GremlinapiKey" };
        return apiGremlinClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listActiveValidateBeforeCall(Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        

        com.squareup.okhttp.Call call = listActiveCall(teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List active API Keys
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return List&lt;ApiKeyJson&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ApiKeyJson> listActive(Object teamId) throws ApiGremlinException {
        ApiResponse<List<ApiKeyJson>> resp = listActiveWithHttpInfo(teamId);
        return resp.getData();
    }

    /**
     * List active API Keys
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;List&lt;ApiKeyJson&gt;&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ApiKeyJson>> listActiveWithHttpInfo(Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = listActiveValidateBeforeCall(teamId, null, null);
        Type localVarReturnType = new TypeToken<List<ApiKeyJson>>(){}.getType();
        return apiGremlinClient.execute(call, localVarReturnType);
    }

    /**
     * List active API Keys (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listActiveAsync(Object teamId, final ApiCallback<List<ApiKeyJson>> callback) throws ApiGremlinException {

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

        com.squareup.okhttp.Call call = listActiveValidateBeforeCall(teamId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ApiKeyJson>>(){}.getType();
        apiGremlinClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listAll
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listAllCall(Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apikeys";

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

        String[] localVarAuthNames = new String[] { "GremlinapiKey" };
        return apiGremlinClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listAllValidateBeforeCall(Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        

        com.squareup.okhttp.Call call = listAllCall(teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List all API Keys
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return List&lt;ApiKeyJson&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ApiKeyJson> listAll(Object teamId) throws ApiGremlinException {
        ApiResponse<List<ApiKeyJson>> resp = listAllWithHttpInfo(teamId);
        return resp.getData();
    }

    /**
     * List all API Keys
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;List&lt;ApiKeyJson&gt;&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ApiKeyJson>> listAllWithHttpInfo(Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = listAllValidateBeforeCall(teamId, null, null);
        Type localVarReturnType = new TypeToken<List<ApiKeyJson>>(){}.getType();
        return apiGremlinClient.execute(call, localVarReturnType);
    }

    /**
     * List all API Keys (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAllAsync(Object teamId, final ApiCallback<List<ApiKeyJson>> callback) throws ApiGremlinException {

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

        com.squareup.okhttp.Call call = listAllValidateBeforeCall(teamId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ApiKeyJson>>(){}.getType();
        apiGremlinClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for revoke1
     * @param identifier  (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call revoke1Call(String identifier, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/apikeys/{identifier}"
            .replaceAll("\\{" + "identifier" + "\\}", apiGremlinClient.escapeString(identifier.toString()));

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

        String[] localVarAuthNames = new String[] { "GremlinapiKey" };
        return apiGremlinClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call revoke1ValidateBeforeCall(String identifier, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        
        // verify the required parameter 'identifier' is set
        if (identifier == null) {
            throw new ApiGremlinException("Missing the required parameter 'identifier' when calling revoke1(Async)");
        }
        

        com.squareup.okhttp.Call call = revoke1Call(identifier, teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Revoke an existing API Key
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param identifier  (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void revoke1(String identifier, Object teamId) throws ApiGremlinException {
        revoke1WithHttpInfo(identifier, teamId);
    }

    /**
     * Revoke an existing API Key
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param identifier  (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> revoke1WithHttpInfo(String identifier, Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = revoke1ValidateBeforeCall(identifier, teamId, null, null);
        return apiGremlinClient.execute(call);
    }

    /**
     * Revoke an existing API Key (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param identifier  (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call revoke1Async(String identifier, Object teamId, final ApiCallback<Void> callback) throws ApiGremlinException {

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

        com.squareup.okhttp.Call call = revoke1ValidateBeforeCall(identifier, teamId, progressListener, progressRequestListener);
        apiGremlinClient.executeAsync(call, callback);
        return call;
    }
}
