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

/**
 * StringPredicate
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class StringPredicate extends Predicate {
  /**
   * Gets or Sets stringPredicateComparator
   */
  @JsonAdapter(ComparatorEnum.Adapter.class)
  public enum ComparatorEnum {
    EQU("EQU"),
    
    EQUALS("EQUALS"),
    
    NEQ("NEQ"),
    
    NOT_EQUALS("NOT_EQUALS"),
    
    LES("LES"),
    
    LESS_THAN("LESS_THAN"),
    
    LEQ("LEQ"),
    
    LESS_THAN_OR_EQUAL_TO("LESS_THAN_OR_EQUAL_TO"),
    
    GRT("GRT"),
    
    GREATER_THAN("GREATER_THAN"),
    
    GEQ("GEQ"),
    
    GREATER_THAN_OR_EQUAL_TO("GREATER_THAN_OR_EQUAL_TO"),
    
    CONTAINS("CONTAINS"),
    
    NOT_CONTAINS("NOT_CONTAINS"),
    
    STARTS_WITH("STARTS_WITH"),
    
    ENDS_WITH("ENDS_WITH");

    private String value;

    ComparatorEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ComparatorEnum fromValue(String text) {
      for (ComparatorEnum b : ComparatorEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ComparatorEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ComparatorEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ComparatorEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ComparatorEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("comparator")
  private ComparatorEnum stringPredicateComparator = null;

  @SerializedName("rValue")
  private String stringPredicateRValue = null;

  public StringPredicate stringPredicateComparator(ComparatorEnum stringPredicateComparator) {
    this.stringPredicateComparator = stringPredicateComparator;
    return this;
  }

   /**
   * Get stringPredicateComparator
   * @return stringPredicateComparator
  **/
  @ApiModelProperty(value = "")
  public ComparatorEnum getStringPredicateComparator() {
    return stringPredicateComparator;
  }

  public void getStringPredicateComparator(ComparatorEnum stringPredicateComparator) {
    this.stringPredicateComparator = stringPredicateComparator;
  }

  public StringPredicate stringPredicateRValue(String stringPredicateRValue) {
    this.stringPredicateRValue = stringPredicateRValue;
    return this;
  }

   /**
   * The right hand value of the predicate
   * @return stringPredicateRValue
  **/
  @ApiModelProperty(value = "The right hand value of the predicate")
  public String getStringPredicateRValue() {
    return stringPredicateRValue;
  }

  public void getStringPredicateRValue(String stringPredicateRValue) {
    this.stringPredicateRValue = stringPredicateRValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StringPredicate stringPredicate = (StringPredicate) o;
    return Objects.equals(this.stringPredicateComparator, stringPredicate.stringPredicateComparator) &&
        Objects.equals(this.stringPredicateRValue, stringPredicate.stringPredicateRValue) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(stringPredicateComparator, stringPredicateRValue, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StringPredicate {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    stringPredicateComparator: ").append(toIndentedString(stringPredicateComparator)).append("\n");
    sb.append("    stringPredicateRValue: ").append(toIndentedString(stringPredicateRValue)).append("\n");
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

