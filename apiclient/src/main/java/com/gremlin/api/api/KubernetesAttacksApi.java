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
import com.gremlin.api.model.AttackResponse;
import com.gremlin.api.model.HaltRequest;
import com.gremlin.api.ApiGremlinClient;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.gremlin.api.model.Attack;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KubernetesAttacksApi {
    private ApiGremlinClient apiGremlinClient;

    public KubernetesAttacksApi() {
        this(Configuration.getDefaultApiGremlinClient());
    }

    public KubernetesAttacksApi(ApiGremlinClient apiGremlinClient) {
        this.apiGremlinClient = apiGremlinClient;
    }

    public ApiGremlinClient getApiGremlinClient() {
        return apiGremlinClient;
    }

    public void setApiGremlinClient(ApiGremlinClient apiGremlinClient) {
        this.apiGremlinClient = apiGremlinClient;
    }

    /**
     * Build call for createAttack
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createAttackCall(Object teamId, Attack body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/kubernetes/attacks/new";

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

        String[] localVarAuthNames = new String[] { "GremlinapiKey" };
        return apiGremlinClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createAttackValidateBeforeCall(Object teamId, Attack body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        

        com.squareup.okhttp.Call call = createAttackCall(teamId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create an attack
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param body  (optional)
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void createAttack(Object teamId, Attack body) throws ApiGremlinException {
        createAttackWithHttpInfo(teamId, body);
    }

    /**
     * Create an attack
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param body  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> createAttackWithHttpInfo(Object teamId, Attack body) throws ApiGremlinException {
        com.squareup.okhttp.Call call = createAttackValidateBeforeCall(teamId, body, null, null);
        return apiGremlinClient.execute(call);
    }

    /**
     * Create an attack (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAttackAsync(Object teamId, Attack body, final ApiCallback<Void> callback) throws ApiGremlinException {

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

        com.squareup.okhttp.Call call = createAttackValidateBeforeCall(teamId, body, progressListener, progressRequestListener);
        apiGremlinClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getAttack
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAttackCall(String guid, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/kubernetes/attacks/{guid}"
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

        String[] localVarAuthNames = new String[] { "GremlinapiKey" };
        return apiGremlinClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getAttackValidateBeforeCall(String guid, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        
        // verify the required parameter 'guid' is set
        if (guid == null) {
            throw new ApiGremlinException("Missing the required parameter 'guid' when calling getAttack(Async)");
        }
        

        com.squareup.okhttp.Call call = getAttackCall(guid, teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get an attack by it&#39;s guid
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return AttackResponse
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public AttackResponse getAttack(String guid, Object teamId) throws ApiGremlinException {
        ApiResponse<AttackResponse> resp = getAttackWithHttpInfo(guid, teamId);
        return resp.getData();
    }

    /**
     * Get an attack by it&#39;s guid
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;AttackResponse&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<AttackResponse> getAttackWithHttpInfo(String guid, Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = getAttackValidateBeforeCall(guid, teamId, null, null);
        Type localVarReturnType = new TypeToken<AttackResponse>(){}.getType();
        return apiGremlinClient.execute(call, localVarReturnType);
    }

    /**
     * Get an attack by it&#39;s guid (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param guid This value represents the globally unique identifier of the record to fetch. (required)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAttackAsync(String guid, Object teamId, final ApiCallback<AttackResponse> callback) throws ApiGremlinException {

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

        com.squareup.okhttp.Call call = getAttackValidateBeforeCall(guid, teamId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<AttackResponse>(){}.getType();
        apiGremlinClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getAttacks
     * @param source Filter Kubernetes attacks to either Adhoc or Scenario. (optional, default to Adhoc)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getAttacksCall(String source, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/kubernetes/attacks";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (source != null)
        localVarQueryParams.addAll(apiGremlinClient.parameterToPair("source", source));
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
    private com.squareup.okhttp.Call getAttacksValidateBeforeCall(String source, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        

        com.squareup.okhttp.Call call = getAttacksCall(source, teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List all attacks.
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param source Filter Kubernetes attacks to either Adhoc or Scenario. (optional, default to Adhoc)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return List&lt;AttackResponse&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<AttackResponse> getAttacks(String source, Object teamId) throws ApiGremlinException {
        ApiResponse<List<AttackResponse>> resp = getAttacksWithHttpInfo(source, teamId);
        return resp.getData();
    }

    /**
     * List all attacks.
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param source Filter Kubernetes attacks to either Adhoc or Scenario. (optional, default to Adhoc)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;List&lt;AttackResponse&gt;&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<AttackResponse>> getAttacksWithHttpInfo(String source, Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = getAttacksValidateBeforeCall(source, teamId, null, null);
        Type localVarReturnType = new TypeToken<List<AttackResponse>>(){}.getType();
        return apiGremlinClient.execute(call, localVarReturnType);
    }

    /**
     * List all attacks. (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param source Filter Kubernetes attacks to either Adhoc or Scenario. (optional, default to Adhoc)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAttacksAsync(String source, Object teamId, final ApiCallback<List<AttackResponse>> callback) throws ApiGremlinException {

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

        com.squareup.okhttp.Call call = getAttacksValidateBeforeCall(source, teamId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<AttackResponse>>(){}.getType();
        apiGremlinClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for haltAllAttacks
     * @param body  (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call haltAllAttacksCall(HaltRequest body, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/kubernetes/attacks/halt";

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

        String[] localVarAuthNames = new String[] { "GremlinapiKey" };
        return apiGremlinClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call haltAllAttacksValidateBeforeCall(HaltRequest body, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        

        com.squareup.okhttp.Call call = haltAllAttacksCall(body, teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Halt all active attacks
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param body  (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void haltAllAttacks(HaltRequest body, Object teamId) throws ApiGremlinException {
        haltAllAttacksWithHttpInfo(body, teamId);
    }

    /**
     * Halt all active attacks
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param body  (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> haltAllAttacksWithHttpInfo(HaltRequest body, Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = haltAllAttacksValidateBeforeCall(body, teamId, null, null);
        return apiGremlinClient.execute(call);
    }

    /**
     * Halt all active attacks (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param body  (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call haltAllAttacksAsync(HaltRequest body, Object teamId, final ApiCallback<Void> callback) throws ApiGremlinException {

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

        com.squareup.okhttp.Call call = haltAllAttacksValidateBeforeCall(body, teamId, progressListener, progressRequestListener);
        apiGremlinClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for haltAttack
     * @param uid  (required)
     * @param body  (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call haltAttackCall(String uid, HaltRequest body, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/kubernetes/attacks/{uid}/halt"
            .replaceAll("\\{" + "uid" + "\\}", apiGremlinClient.escapeString(uid.toString()));

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

        String[] localVarAuthNames = new String[] { "GremlinapiKey" };
        return apiGremlinClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call haltAttackValidateBeforeCall(String uid, HaltRequest body, Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        
        // verify the required parameter 'uid' is set
        if (uid == null) {
            throw new ApiGremlinException("Missing the required parameter 'uid' when calling haltAttack(Async)");
        }
        

        com.squareup.okhttp.Call call = haltAttackCall(uid, body, teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Halt an active attack
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param uid  (required)
     * @param body  (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void haltAttack(String uid, HaltRequest body, Object teamId) throws ApiGremlinException {
        haltAttackWithHttpInfo(uid, body, teamId);
    }

    /**
     * Halt an active attack
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param uid  (required)
     * @param body  (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> haltAttackWithHttpInfo(String uid, HaltRequest body, Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = haltAttackValidateBeforeCall(uid, body, teamId, null, null);
        return apiGremlinClient.execute(call);
    }

    /**
     * Halt an active attack (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param uid  (required)
     * @param body  (optional)
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call haltAttackAsync(String uid, HaltRequest body, Object teamId, final ApiCallback<Void> callback) throws ApiGremlinException {

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

        com.squareup.okhttp.Call call = haltAttackValidateBeforeCall(uid, body, teamId, progressListener, progressRequestListener);
        apiGremlinClient.executeAsync(call, callback);
        return call;
    }
}