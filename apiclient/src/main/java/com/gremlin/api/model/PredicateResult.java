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
 * PredicateResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class PredicateResult {
  @SerializedName("predicate")
  private PredicateObject predicate = null;

  @SerializedName("passed")
  private Boolean passed = null;

  @SerializedName("queryValue")
  private Object queryValue = null;

  @SerializedName("errors")
  private List<String> errors = null;

  public PredicateResult predicate(PredicateObject predicate) {
    this.predicate = predicate;
    return this;
  }

   /**
   * Get predicate
   * @return predicate
  **/
  @ApiModelProperty(value = "")
  public PredicateObject getPredicate() {
    return predicate;
  }

  public void setPredicate(PredicateObject predicate) {
    this.predicate = predicate;
  }

  public PredicateResult passed(Boolean passed) {
    this.passed = passed;
    return this;
  }

   /**
   * Get passed
   * @return passed
  **/
  @ApiModelProperty(value = "")
  public Boolean isPassed() {
    return passed;
  }

  public void setPassed(Boolean passed) {
    this.passed = passed;
  }

  public PredicateResult queryValue(Object queryValue) {
    this.queryValue = queryValue;
    return this;
  }

   /**
   * Get queryValue
   * @return queryValue
  **/
  @ApiModelProperty(value = "")
  public Object getQueryValue() {
    return queryValue;
  }

  public void setQueryValue(Object queryValue) {
    this.queryValue = queryValue;
  }

  public PredicateResult errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public PredicateResult addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<String>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")
  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredicateResult predicateResult = (PredicateResult) o;
    return Objects.equals(this.predicate, predicateResult.predicate) &&
        Objects.equals(this.passed, predicateResult.passed) &&
        Objects.equals(this.queryValue, predicateResult.queryValue) &&
        Objects.equals(this.errors, predicateResult.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(predicate, passed, queryValue, errors);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredicateResult {\n");
    
    sb.append("    predicate: ").append(toIndentedString(predicate)).append("\n");
    sb.append("    passed: ").append(toIndentedString(passed)).append("\n");
    sb.append("    queryValue: ").append(toIndentedString(queryValue)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

