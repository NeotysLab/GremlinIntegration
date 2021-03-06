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
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for UsersAuthMfaApi
 */
@Ignore
public class UsersAuthMfaApiTest {

    private final UsersAuthMfaApi api = new UsersAuthMfaApi();

    
    /**
     * Authenticate a user with MFA.
     *
     * 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void authTest() throws ApiGremlinException {
        String email = null;
        String password = null;
        Integer token = null;
        String companyName = null;
        Boolean getCompanySession = null;
        api.auth(email, password, token, companyName, getCompanySession);

        // TODO: test validations
    }
    
    /**
     * Removes the MFA provider and secret, disabling MFA login.
     *
     * 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void disableTest() throws ApiGremlinException {
        String email = null;
        String password = null;
        Integer token = null;
        api.disable(email, password, token);

        // TODO: test validations
    }
    
    /**
     * Generate a secret key and enables it for the user.
     *
     * 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void enableTest() throws ApiGremlinException {
        String email = null;
        String password = null;
        String provider = null;
        api.enable(email, password, provider);

        // TODO: test validations
    }
    
    /**
     * Removes the MFA provider and secret, disabling MFA login.
     *
     * SUPER users only  # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_MFA&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void forceDisableTest() throws ApiGremlinException {
        String email = null;
        api.forceDisable(email);

        // TODO: test validations
    }
    
    /**
     * Returns the enabled/disabled status and provider if set, of MFA for the user.
     *
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;COMPANY_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void getInfoTest() throws ApiGremlinException {
        api.getInfo();

        // TODO: test validations
    }
    
    /**
     * Returns the enabled/disabled status of MFA for a user.
     *
     * SUPER users only  # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_MFA&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void isEnabledTest() throws ApiGremlinException {
        String email = null;
        api.isEnabled(email);

        // TODO: test validations
    }
    
    /**
     * Validate a MFA token for a user
     *
     * 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void validateTest() throws ApiGremlinException {
        String email = null;
        Integer token = null;
        api.validate(email, token);

        // TODO: test validations
    }
    
}
