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
import java.util.Map;

/**
 * UpdateScenarioScheduleRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class UpdateScenarioScheduleRequest {
  @SerializedName("trigger")
  private Map<String, Object> trigger = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  public UpdateScenarioScheduleRequest trigger(Map<String, Object> trigger) {
    this.trigger = trigger;
    return this;
  }

  public UpdateScenarioScheduleRequest putTriggerItem(String key, Object triggerItem) {
    if (this.trigger == null) {
      this.trigger = new HashMap<String, Object>();
    }
    this.trigger.put(key, triggerItem);
    return this;
  }

   /**
   * Get trigger
   * @return trigger
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getTrigger() {
    return trigger;
  }

  public void setTrigger(Map<String, Object> trigger) {
    this.trigger = trigger;
  }

  public UpdateScenarioScheduleRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateScenarioScheduleRequest updateScenarioScheduleRequest = (UpdateScenarioScheduleRequest) o;
    return Objects.equals(this.trigger, updateScenarioScheduleRequest.trigger) &&
        Objects.equals(this.enabled, updateScenarioScheduleRequest.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(trigger, enabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateScenarioScheduleRequest {\n");
    
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

