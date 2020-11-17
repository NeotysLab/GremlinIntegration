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

import com.gremlin.api.ApiGremlinException;
import com.gremlin.api.model.ApplicationExperiment;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for AlfiApi
 */
@Ignore
public class AlfiApiTest {

    private final AlfiApi api = new AlfiApi();

    
    /**
     * List all active experiments.
     *
     * This endpoint will return all active experiments for the team.  # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void activeTest() throws ApiGremlinException {
        Object teamId = null;
        List<ApplicationExperiment> response = api.active(teamId);

        // TODO: test validations
    }
    
    /**
     * List all completed experiments.
     *
     * This endpoint will return all completed experiments that the team has performed  # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void completedTest() throws ApiGremlinException {
        Object teamId = null;
        List<ApplicationExperiment> response = api.completed(teamId);

        // TODO: test validations
    }
    
    /**
     * Creates a new application level experiment.
     *
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void createNewExperimentTest() throws ApiGremlinException {
        String body = null;
        Object teamId = null;
        String response = api.createNewExperiment(body, teamId);

        // TODO: test validations
    }
    
    /**
     * Get details about an experiment.
     *
     * This endpoint will allow you to get info on a specific experiment based on its &#x60;guid&#x60;.  # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void getExperimentByGuidTest() throws ApiGremlinException {
        String guid = null;
        Object teamId = null;
        ApplicationExperiment response = api.getExperimentByGuid(guid, teamId);

        // TODO: test validations
    }
    
    /**
     * Idempotently halt all active experiments.
     *
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void requestHaltTest() throws ApiGremlinException {
        Object teamId = null;
        api.requestHalt(teamId);

        // TODO: test validations
    }
    
    /**
     * Idempotently halt the experiment with the associated &#x60;guid&#x60;.
     *
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;TEAM_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void requestHalt1Test() throws ApiGremlinException {
        String guid = null;
        Object teamId = null;
        api.requestHalt1(guid, teamId);

        // TODO: test validations
    }
    
}