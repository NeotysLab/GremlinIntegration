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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TrafficImpactMapping
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class TrafficImpactMapping {
  @SerializedName("multiSelectTags")
  private Map<String, List<String>> multiSelectTags = null;

  public TrafficImpactMapping multiSelectTags(Map<String, List<String>> multiSelectTags) {
    this.multiSelectTags = multiSelectTags;
    return this;
  }

  public TrafficImpactMapping putMultiSelectTagsItem(String key, List<String> multiSelectTagsItem) {
    if (this.multiSelectTags == null) {
      this.multiSelectTags = new HashMap<String, List<String>>();
    }
    this.multiSelectTags.put(key, multiSelectTagsItem);
    return this;
  }

   /**
   * Get multiSelectTags
   * @return multiSelectTags
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<String>> getMultiSelectTags() {
    return multiSelectTags;
  }

  public void setMultiSelectTags(Map<String, List<String>> multiSelectTags) {
    this.multiSelectTags = multiSelectTags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrafficImpactMapping trafficImpactMapping = (TrafficImpactMapping) o;
    return Objects.equals(this.multiSelectTags, trafficImpactMapping.multiSelectTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(multiSelectTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrafficImpactMapping {\n");
    
    sb.append("    multiSelectTags: ").append(toIndentedString(multiSelectTags)).append("\n");
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

