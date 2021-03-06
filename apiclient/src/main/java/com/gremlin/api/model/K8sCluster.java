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

import java.util.ArrayList;
import java.util.List;

/**
 * K8sCluster
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class K8sCluster {
  @SerializedName("assetId")
  private String assetId = null;

  @SerializedName("clusterName")
  private String clusterName = null;

  @SerializedName("owningTeamId")
  private String owningTeamId = null;

  @SerializedName("availableNamespaces")
  private List<String> availableNamespaces = null;

  @SerializedName("currentlySharedNamespaces")
  private List<String> currentlySharedNamespaces = null;

  public K8sCluster assetId(String assetId) {
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

  public K8sCluster clusterName(String clusterName) {
    this.clusterName = clusterName;
    return this;
  }

   /**
   * Get clusterName
   * @return clusterName
  **/
  @ApiModelProperty(value = "")
  public String getClusterName() {
    return clusterName;
  }

  public void setClusterName(String clusterName) {
    this.clusterName = clusterName;
  }

  public K8sCluster owningTeamId(String owningTeamId) {
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

  public K8sCluster availableNamespaces(List<String> availableNamespaces) {
    this.availableNamespaces = availableNamespaces;
    return this;
  }

  public K8sCluster addAvailableNamespacesItem(String availableNamespacesItem) {
    if (this.availableNamespaces == null) {
      this.availableNamespaces = new ArrayList<String>();
    }
    this.availableNamespaces.add(availableNamespacesItem);
    return this;
  }

   /**
   * Get availableNamespaces
   * @return availableNamespaces
  **/
  @ApiModelProperty(value = "")
  public List<String> getAvailableNamespaces() {
    return availableNamespaces;
  }

  public void setAvailableNamespaces(List<String> availableNamespaces) {
    this.availableNamespaces = availableNamespaces;
  }

  public K8sCluster currentlySharedNamespaces(List<String> currentlySharedNamespaces) {
    this.currentlySharedNamespaces = currentlySharedNamespaces;
    return this;
  }

  public K8sCluster addCurrentlySharedNamespacesItem(String currentlySharedNamespacesItem) {
    if (this.currentlySharedNamespaces == null) {
      this.currentlySharedNamespaces = new ArrayList<String>();
    }
    this.currentlySharedNamespaces.add(currentlySharedNamespacesItem);
    return this;
  }

   /**
   * Get currentlySharedNamespaces
   * @return currentlySharedNamespaces
  **/
  @ApiModelProperty(value = "")
  public List<String> getCurrentlySharedNamespaces() {
    return currentlySharedNamespaces;
  }

  public void setCurrentlySharedNamespaces(List<String> currentlySharedNamespaces) {
    this.currentlySharedNamespaces = currentlySharedNamespaces;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    K8sCluster k8sCluster = (K8sCluster) o;
    return Objects.equals(this.assetId, k8sCluster.assetId) &&
        Objects.equals(this.clusterName, k8sCluster.clusterName) &&
        Objects.equals(this.owningTeamId, k8sCluster.owningTeamId) &&
        Objects.equals(this.availableNamespaces, k8sCluster.availableNamespaces) &&
        Objects.equals(this.currentlySharedNamespaces, k8sCluster.currentlySharedNamespaces);
  }

  @Override
  public int hashCode() {
    return Objects.hash(assetId, clusterName, owningTeamId, availableNamespaces, currentlySharedNamespaces);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class K8sCluster {\n");
    
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
    sb.append("    owningTeamId: ").append(toIndentedString(owningTeamId)).append("\n");
    sb.append("    availableNamespaces: ").append(toIndentedString(availableNamespaces)).append("\n");
    sb.append("    currentlySharedNamespaces: ").append(toIndentedString(currentlySharedNamespaces)).append("\n");
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

