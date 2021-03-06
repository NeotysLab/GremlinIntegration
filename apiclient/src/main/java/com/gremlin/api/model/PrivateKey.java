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
 * PrivateKey
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class PrivateKey {
  @SerializedName("format")
  private String format = null;

  @SerializedName("algorithm")
  private String algorithm = null;

  @SerializedName("encoded")
  private List<byte[]> encoded = null;

  @SerializedName("destroyed")
  private Boolean destroyed = null;

  public PrivateKey format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public PrivateKey algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

   /**
   * Get algorithm
   * @return algorithm
  **/
  @ApiModelProperty(value = "")
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  public PrivateKey encoded(List<byte[]> encoded) {
    this.encoded = encoded;
    return this;
  }

  public PrivateKey addEncodedItem(byte[] encodedItem) {
    if (this.encoded == null) {
      this.encoded = new ArrayList<byte[]>();
    }
    this.encoded.add(encodedItem);
    return this;
  }

   /**
   * Get encoded
   * @return encoded
  **/
  @ApiModelProperty(value = "")
  public List<byte[]> getEncoded() {
    return encoded;
  }

  public void setEncoded(List<byte[]> encoded) {
    this.encoded = encoded;
  }

  public PrivateKey destroyed(Boolean destroyed) {
    this.destroyed = destroyed;
    return this;
  }

   /**
   * Get destroyed
   * @return destroyed
  **/
  @ApiModelProperty(value = "")
  public Boolean isDestroyed() {
    return destroyed;
  }

  public void setDestroyed(Boolean destroyed) {
    this.destroyed = destroyed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrivateKey privateKey = (PrivateKey) o;
    return Objects.equals(this.format, privateKey.format) &&
        Objects.equals(this.algorithm, privateKey.algorithm) &&
        Objects.equals(this.encoded, privateKey.encoded) &&
        Objects.equals(this.destroyed, privateKey.destroyed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(format, algorithm, encoded, destroyed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrivateKey {\n");
    
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    encoded: ").append(toIndentedString(encoded)).append("\n");
    sb.append("    destroyed: ").append(toIndentedString(destroyed)).append("\n");
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

