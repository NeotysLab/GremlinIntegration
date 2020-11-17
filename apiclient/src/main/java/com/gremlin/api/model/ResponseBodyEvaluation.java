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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * ResponseBodyEvaluation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class ResponseBodyEvaluation {
  /**
   * The operation to logically combine predicates into a success or failure
   */
  @JsonAdapter(OpEnum.Adapter.class)
  public enum OpEnum {
    AND("AND"),
    
    OR("OR");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OpEnum fromValue(String text) {
      for (OpEnum b : OpEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OpEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OpEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OpEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OpEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("op")
  private OpEnum op = null;

  @SerializedName("predicates")
  private List<Predicate> predicates = null;

  public ResponseBodyEvaluation op(OpEnum op) {
    this.op = op;
    return this;
  }

   /**
   * The operation to logically combine predicates into a success or failure
   * @return op
  **/
  @ApiModelProperty(value = "The operation to logically combine predicates into a success or failure")
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public ResponseBodyEvaluation predicates(List<Predicate> predicates) {
    this.predicates = predicates;
    return this;
  }

  public ResponseBodyEvaluation addPredicatesItem(Predicate predicatesItem) {
    if (this.predicates == null) {
      this.predicates = new ArrayList<Predicate>();
    }
    this.predicates.add(predicatesItem);
    return this;
  }

   /**
   * The list of predicates to evaluate against the status check response body
   * @return predicates
  **/
  @ApiModelProperty(value = "The list of predicates to evaluate against the status check response body")
  public List<Predicate> getPredicates() {
    return predicates;
  }

  public void setPredicates(List<Predicate> predicates) {
    this.predicates = predicates;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseBodyEvaluation responseBodyEvaluation = (ResponseBodyEvaluation) o;
    return Objects.equals(this.op, responseBodyEvaluation.op) &&
        Objects.equals(this.predicates, responseBodyEvaluation.predicates);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, predicates);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseBodyEvaluation {\n");
    
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
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

