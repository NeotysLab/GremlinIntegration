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
import com.gremlin.api.ApiGremlinClient;

import java.io.IOException;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MetadataApi {
    private ApiGremlinClient apiGremlinClient;

    public MetadataApi() {
        this(Configuration.getDefaultApiGremlinClient());
    }

    public MetadataApi(ApiGremlinClient apiGremlinClient) {
        this.apiGremlinClient = apiGremlinClient;
    }

    public ApiGremlinClient getApiGremlinClient() {
        return apiGremlinClient;
    }

    public void setApiGremlinClient(ApiGremlinClient apiGremlinClient) {
        this.apiGremlinClient = apiGremlinClient;
    }

    /**
     * Build call for metadata
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiGremlinException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call metadataCall(Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/metadata";

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
    private com.squareup.okhttp.Call metadataValidateBeforeCall(Object teamId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiGremlinException {
        

        com.squareup.okhttp.Call call = metadataCall(teamId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Get metadata about the Gremlin commands.
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void metadata(Object teamId) throws ApiGremlinException {
        metadataWithHttpInfo(teamId);
    }

    /**
     * Get metadata about the Gremlin commands.
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiGremlinException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> metadataWithHttpInfo(Object teamId) throws ApiGremlinException {
        com.squareup.okhttp.Call call = metadataValidateBeforeCall(teamId, null, null);
        return apiGremlinClient.execute(call);
    }

    /**
     * Get metadata about the Gremlin commands. (asynchronously)
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     * @param teamId Required when using company session token (RBAC only). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiGremlinException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call metadataAsync(Object teamId, final ApiCallback<Void> callback) throws ApiGremlinException {

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

        com.squareup.okhttp.Call call = metadataValidateBeforeCall(teamId, progressListener, progressRequestListener);
        apiGremlinClient.executeAsync(call, callback);
        return call;
    }
}
