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
import com.gremlin.api.model.CompanyPatchInput;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for CompaniesApi
 */
@Ignore
public class CompaniesApiTest {

    private final CompaniesApi api = new CompaniesApi();

    
    /**
     * Returns all clients for the supplied company
     *
     * SUPER users only  # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;READ_ALL_CLIENTS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void getClientsForCompanyTest() throws ApiGremlinException {
        String identifier = null;
        api.getClientsForCompany(identifier);

        // TODO: test validations
    }
    
    /**
     * Gets a Company by its supplied guid
     *
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;COMPANY_DEFAULT&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void getCompanyTest() throws ApiGremlinException {
        String identifier = null;
        api.getCompany(identifier);

        // TODO: test validations
    }
    
    /**
     * Returns all users for the supplied company
     *
     * SUPER users only  # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;READ_ALL_USERS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void getUsersForCompanyTest() throws ApiGremlinException {
        String identifier = null;
        api.getUsersForCompany(identifier);

        // TODO: test validations
    }
    
    /**
     * Invite one or more users to join your Gremlin company
     *
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;ADD_USER_TO_COMPANY&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void inviteUsersToCompanyTest() throws ApiGremlinException {
        String identifier = null;
        String body = null;
        api.inviteUsersToCompany(identifier, body);

        // TODO: test validations
    }
    
    /**
     * Deactivates a user.
     *
     * Once deactivated, user will not be able to do anything on company  # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;DEACTIVATE_USER&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void rbacRevokeTest() throws ApiGremlinException {
        String identifier = null;
        String email = null;
        api.rbacRevoke(identifier, email);

        // TODO: test validations
    }
    
    /**
     * Revoke a pending user invite.
     *
     * # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;DEACTIVATE_USER&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void rbacRevokeInviteTest() throws ApiGremlinException {
        String identifier = null;
        String email = null;
        api.rbacRevokeInvite(identifier, email);

        // TODO: test validations
    }
    
    /**
     * Activates a user.
     *
     * User must exist. This is primarily used to reactivate a deactivated user.  # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;ACTIVATE_USER&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void rbacUnrevokeTest() throws ApiGremlinException {
        String identifier = null;
        String email = null;
        api.rbacUnrevoke(identifier, email);

        // TODO: test validations
    }
    
    /**
     * Update roles of existing user.
     *
     * User must exist.  # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_COMPANY_USER_PERMISSIONS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void rbacUpdateTest() throws ApiGremlinException {
        String identifier = null;
        String email = null;
        String body = null;
        api.rbacUpdate(identifier, email, body);

        // TODO: test validations
    }
    
    /**
     * Update the prefs for company
     *
     * This endpoint will allow you to update the prefs for a company based on its identifier.  # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_COMPANY_PREFS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void updateCompanyPrefsTest() throws ApiGremlinException {
        String identifier = null;
        CompanyPatchInput body = null;
        api.updateCompanyPrefs(identifier, body);

        // TODO: test validations
    }
    
    /**
     * Updates the MFA preferences associated with this Company.
     *
     * SUPER users only  # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_MFA&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void updateMfaPrefsTest() throws ApiGremlinException {
        String identifier = null;
        Boolean forceMfa = null;
        List<String> mfaProviders = null;
        String defaultMfaProvider = null;
        api.updateMfaPrefs(identifier, forceMfa, mfaProviders, defaultMfaProvider);

        // TODO: test validations
    }
    
    /**
     * Updates the preferences associated with this Company.
     *
     * SUPER users only  # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_COMPANY_PREFS&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void updatePrefsTest() throws ApiGremlinException {
        String identifier = null;
        String domain = null;
        api.updatePrefs(identifier, domain);

        // TODO: test validations
    }
    
    /**
     * Updates the preferences associated with this Company.
     *
     * SUPER users only  # Authorization Schema ## [__Bearer Tokens__](https://www.gremlin.com/docs/api-reference/examples/#authentication-and-access-tokens) ### Role Based Access Control [&#x60;MANAGE_SAML&#x60;](https://www.gremlin.com/docs/user-management/access-control/#privileges) 
     *
     * @throws ApiGremlinException
     *          if the Api call fails
     */
    @Test
    public void updateSamlPropertiesTest() throws ApiGremlinException {
        String identifier = null;
        String enabled = null;
        String entityId = null;
        String idpUrl = null;
        String certificate = null;
        String forced = null;
        api.updateSamlProperties(identifier, enabled, entityId, idpUrl, certificate, forced);

        // TODO: test validations
    }
    
}
