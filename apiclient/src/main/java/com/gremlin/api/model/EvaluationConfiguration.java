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
 * EvaluationConfiguration
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class EvaluationConfiguration {
  @SerializedName("okLatencyMaxMs")
  private Integer okLatencyMaxMs = null;

  @SerializedName("okStatusCodes")
  private List<String> okStatusCodes = null;

  @SerializedName("responseBodyEvaluation")
  private ResponseBodyEvaluation responseBodyEvaluation = null;

  public EvaluationConfiguration okLatencyMaxMs(Integer okLatencyMaxMs) {
    this.okLatencyMaxMs = okLatencyMaxMs;
    return this;
  }

   /**
   * The maximum latency in milliseconds for a successful status check
   * @return okLatencyMaxMs
  **/
  @ApiModelProperty(value = "The maximum latency in milliseconds for a successful status check")
  public Integer getOkLatencyMaxMs() {
    return okLatencyMaxMs;
  }

  public void setOkLatencyMaxMs(Integer okLatencyMaxMs) {
    this.okLatencyMaxMs = okLatencyMaxMs;
  }

  public EvaluationConfiguration okStatusCodes(List<String> okStatusCodes) {
    this.okStatusCodes = okStatusCodes;
    return this;
  }

  public EvaluationConfiguration addOkStatusCodesItem(String okStatusCodesItem) {
    if (this.okStatusCodes == null) {
      this.okStatusCodes = new ArrayList<String>();
    }
    this.okStatusCodes.add(okStatusCodesItem);
    return this;
  }

   /**
   * The list of successful response status codes for a successful status check
   * @return okStatusCodes
  **/
  @ApiModelProperty(value = "The list of successful response status codes for a successful status check")
  public List<String> getOkStatusCodes() {
    return okStatusCodes;
  }

  public void setOkStatusCodes(List<String> okStatusCodes) {
    this.okStatusCodes = okStatusCodes;
  }

  public EvaluationConfiguration responseBodyEvaluation(ResponseBodyEvaluation responseBodyEvaluation) {
    this.responseBodyEvaluation = responseBodyEvaluation;
    return this;
  }

   /**
   * The configuration for evaluating the success of a response body
   * @return responseBodyEvaluation
  **/
  @ApiModelProperty(value = "The configuration for evaluating the success of a response body")
  public ResponseBodyEvaluation getResponseBodyEvaluation() {
    return responseBodyEvaluation;
  }

  public void setResponseBodyEvaluation(ResponseBodyEvaluation responseBodyEvaluation) {
    this.responseBodyEvaluation = responseBodyEvaluation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationConfiguration evaluationConfiguration = (EvaluationConfiguration) o;
    return Objects.equals(this.okLatencyMaxMs, evaluationConfiguration.okLatencyMaxMs) &&
        Objects.equals(this.okStatusCodes, evaluationConfiguration.okStatusCodes) &&
        Objects.equals(this.responseBodyEvaluation, evaluationConfiguration.responseBodyEvaluation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(okLatencyMaxMs, okStatusCodes, responseBodyEvaluation);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationConfiguration {\n");
    
    sb.append("    okLatencyMaxMs: ").append(toIndentedString(okLatencyMaxMs)).append("\n");
    sb.append("    okStatusCodes: ").append(toIndentedString(okStatusCodes)).append("\n");
    sb.append("    responseBodyEvaluation: ").append(toIndentedString(responseBodyEvaluation)).append("\n");
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

