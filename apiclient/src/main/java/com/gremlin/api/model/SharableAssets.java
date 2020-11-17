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
 * SharableAssets
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class SharableAssets {
  @SerializedName("availableClusters")
  private List<K8sCluster> availableClusters = null;

  @SerializedName("myClusters")
  private List<K8sCluster> myClusters = null;

  public SharableAssets availableClusters(List<K8sCluster> availableClusters) {
    this.availableClusters = availableClusters;
    return this;
  }

  public SharableAssets addAvailableClustersItem(K8sCluster availableClustersItem) {
    if (this.availableClusters == null) {
      this.availableClusters = new ArrayList<K8sCluster>();
    }
    this.availableClusters.add(availableClustersItem);
    return this;
  }

   /**
   * Get availableClusters
   * @return availableClusters
  **/
  @ApiModelProperty(value = "")
  public List<K8sCluster> getAvailableClusters() {
    return availableClusters;
  }

  public void setAvailableClusters(List<K8sCluster> availableClusters) {
    this.availableClusters = availableClusters;
  }

  public SharableAssets myClusters(List<K8sCluster> myClusters) {
    this.myClusters = myClusters;
    return this;
  }

  public SharableAssets addMyClustersItem(K8sCluster myClustersItem) {
    if (this.myClusters == null) {
      this.myClusters = new ArrayList<K8sCluster>();
    }
    this.myClusters.add(myClustersItem);
    return this;
  }

   /**
   * Get myClusters
   * @return myClusters
  **/
  @ApiModelProperty(value = "")
  public List<K8sCluster> getMyClusters() {
    return myClusters;
  }

  public void setMyClusters(List<K8sCluster> myClusters) {
    this.myClusters = myClusters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharableAssets sharableAssets = (SharableAssets) o;
    return Objects.equals(this.availableClusters, sharableAssets.availableClusters) &&
        Objects.equals(this.myClusters, sharableAssets.myClusters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(availableClusters, myClusters);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharableAssets {\n");
    
    sb.append("    availableClusters: ").append(toIndentedString(availableClusters)).append("\n");
    sb.append("    myClusters: ").append(toIndentedString(myClusters)).append("\n");
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
