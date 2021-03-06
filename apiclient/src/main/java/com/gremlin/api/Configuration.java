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


package com.gremlin.api;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")
public class Configuration {
    private static ApiGremlinClient defaultApiGremlinClient = new ApiGremlinClient();

    /**
     * Get the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @return Default API client
     */
    public static ApiGremlinClient getDefaultApiGremlinClient() {
        return defaultApiGremlinClient;
    }

    /**
     * Set the default API client, which would be used when creating API
     * instances without providing an API client.
     *
     * @param apiGremlinClient API client
     */
    public static void setDefaultApiGremlinClient(ApiGremlinClient apiGremlinClient) {
        defaultApiGremlinClient = apiGremlinClient;
    }
}
