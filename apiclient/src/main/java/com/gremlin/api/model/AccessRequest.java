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


package com.gremlin.api.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

/**
 * AccessRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class AccessRequest {
  @SerializedName("owningTeamId")
  private String owningTeamId = null;

  @SerializedName("assetId")
  private String assetId = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("teamToShareWith")
  private String teamToShareWith = null;

  public AccessRequest owningTeamId(String owningTeamId) {
    this.owningTeamId = owningTeamId;
    return this;
  }

   /**
   * Get owningTeamId
   * @return owningTeamId
  **/
  @ApiModelProperty(value = "")
  public String getOwningTeamId() {
    return owningTeamId;
  }

  public void setOwningTeamId(String owningTeamId) {
    this.owningTeamId = owningTeamId;
  }

  public AccessRequest assetId(String assetId) {
    this.assetId = assetId;
    return this;
  }

   /**
   * Get assetId
   * @return assetId
  **/
  @ApiModelProperty(value = "")
  public String getAssetId() {
    return assetId;
  }

  public void setAssetId(String assetId) {
    this.assetId = assetId;
  }

  public AccessRequest namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @ApiModelProperty(value = "")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public AccessRequest teamToShareWith(String teamToShareWith) {
    this.teamToShareWith = teamToShareWith;
    return this;
  }

   /**
   * Get teamToShareWith
   * @return teamToShareWith
  **/
  @ApiModelProperty(value = "")
  public String getTeamToShareWith() {
    return teamToShareWith;
  }

  public void setTeamToShareWith(String teamToShareWith) {
    this.teamToShareWith = teamToShareWith;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccessRequest accessRequest = (AccessRequest) o;
    return Objects.equals(this.owningTeamId, accessRequest.owningTeamId) &&
        Objects.equals(this.assetId, accessRequest.assetId) &&
        Objects.equals(this.namespace, accessRequest.namespace) &&
        Objects.equals(this.teamToShareWith, accessRequest.teamToShareWith);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owningTeamId, assetId, namespace, teamToShareWith);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccessRequest {\n");
    
    sb.append("    owningTeamId: ").append(toIndentedString(owningTeamId)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    teamToShareWith: ").append(toIndentedString(teamToShareWith)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
