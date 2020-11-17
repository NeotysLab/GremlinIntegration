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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Strategy
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class Strategy {
  @SerializedName("all_hosts")
  private Boolean allHosts = null;

  @SerializedName("all_containers")
  private Boolean allContainers = null;

  @SerializedName("hostIds")
  private List<String> hostIds = null;

  @SerializedName("containerIds")
  private List<String> containerIds = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    EXACT("Exact"),
    
    RANDOMCOUNT("RandomCount"),
    
    RANDOMPERCENT("RandomPercent");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("multiSelectTags")
  private Map<String, List<String>> multiSelectTags = null;

  @SerializedName("multiSelectLabels")
  private Map<String, List<String>> multiSelectLabels = null;

  @SerializedName("tags")
  private Map<String, String> tags = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  public Strategy allHosts(Boolean allHosts) {
    this.allHosts = allHosts;
    return this;
  }

   /**
   * Get allHosts
   * @return allHosts
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllHosts() {
    return allHosts;
  }

  public void setAllHosts(Boolean allHosts) {
    this.allHosts = allHosts;
  }

  public Strategy allContainers(Boolean allContainers) {
    this.allContainers = allContainers;
    return this;
  }

   /**
   * Get allContainers
   * @return allContainers
  **/
  @ApiModelProperty(value = "")
  public Boolean isAllContainers() {
    return allContainers;
  }

  public void setAllContainers(Boolean allContainers) {
    this.allContainers = allContainers;
  }

  public Strategy hostIds(List<String> hostIds) {
    this.hostIds = hostIds;
    return this;
  }

  public Strategy addHostIdsItem(String hostIdsItem) {
    if (this.hostIds == null) {
      this.hostIds = new ArrayList<String>();
    }
    this.hostIds.add(hostIdsItem);
    return this;
  }

   /**
   * Get hostIds
   * @return hostIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getHostIds() {
    return hostIds;
  }

  public void setHostIds(List<String> hostIds) {
    this.hostIds = hostIds;
  }

  public Strategy containerIds(List<String> containerIds) {
    this.containerIds = containerIds;
    return this;
  }

  public Strategy addContainerIdsItem(String containerIdsItem) {
    if (this.containerIds == null) {
      this.containerIds = new ArrayList<String>();
    }
    this.containerIds.add(containerIdsItem);
    return this;
  }

   /**
   * Get containerIds
   * @return containerIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getContainerIds() {
    return containerIds;
  }

  public void setContainerIds(List<String> containerIds) {
    this.containerIds = containerIds;
  }

  public Strategy type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Strategy multiSelectTags(Map<String, List<String>> multiSelectTags) {
    this.multiSelectTags = multiSelectTags;
    return this;
  }

  public Strategy putMultiSelectTagsItem(String key, List<String> multiSelectTagsItem) {
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

  public Strategy multiSelectLabels(Map<String, List<String>> multiSelectLabels) {
    this.multiSelectLabels = multiSelectLabels;
    return this;
  }

  public Strategy putMultiSelectLabelsItem(String key, List<String> multiSelectLabelsItem) {
    if (this.multiSelectLabels == null) {
      this.multiSelectLabels = new HashMap<String, List<String>>();
    }
    this.multiSelectLabels.put(key, multiSelectLabelsItem);
    return this;
  }

   /**
   * Get multiSelectLabels
   * @return multiSelectLabels
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<String>> getMultiSelectLabels() {
    return multiSelectLabels;
  }

  public void setMultiSelectLabels(Map<String, List<String>> multiSelectLabels) {
    this.multiSelectLabels = multiSelectLabels;
  }

  public Strategy tags(Map<String, String> tags) {
    this.tags = tags;
    return this;
  }

  public Strategy putTagsItem(String key, String tagsItem) {
    if (this.tags == null) {
      this.tags = new HashMap<String, String>();
    }
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getTags() {
    return tags;
  }

  public void setTags(Map<String, String> tags) {
    this.tags = tags;
  }

  public Strategy labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Strategy putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<String, String>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Strategy strategy = (Strategy) o;
    return Objects.equals(this.allHosts, strategy.allHosts) &&
        Objects.equals(this.allContainers, strategy.allContainers) &&
        Objects.equals(this.hostIds, strategy.hostIds) &&
        Objects.equals(this.containerIds, strategy.containerIds) &&
        Objects.equals(this.type, strategy.type) &&
        Objects.equals(this.multiSelectTags, strategy.multiSelectTags) &&
        Objects.equals(this.multiSelectLabels, strategy.multiSelectLabels) &&
        Objects.equals(this.tags, strategy.tags) &&
        Objects.equals(this.labels, strategy.labels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allHosts, allContainers, hostIds, containerIds, type, multiSelectTags, multiSelectLabels, tags, labels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Strategy {\n");
    
    sb.append("    allHosts: ").append(toIndentedString(allHosts)).append("\n");
    sb.append("    allContainers: ").append(toIndentedString(allContainers)).append("\n");
    sb.append("    hostIds: ").append(toIndentedString(hostIds)).append("\n");
    sb.append("    containerIds: ").append(toIndentedString(containerIds)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    multiSelectTags: ").append(toIndentedString(multiSelectTags)).append("\n");
    sb.append("    multiSelectLabels: ").append(toIndentedString(multiSelectLabels)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
