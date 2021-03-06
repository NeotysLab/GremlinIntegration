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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SharedScenarioResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class SharedScenarioResponse {
  @SerializedName("sharedByTeam")
  private String sharedByTeam = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("hypothesis")
  private String hypothesis = null;

  @SerializedName("graph")
  private ScenarioGraph graph = null;

  @SerializedName("sharedBy")
  private String sharedBy = null;

  @SerializedName("sharedFromScenario")
  private String sharedFromScenario = null;

  @SerializedName("createSource")
  private String createSource = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  @SerializedName("tiers")
  private List<String> tiers = null;

  @SerializedName("recommendedScenarioId")
  private String recommendedScenarioId = null;

  @SerializedName("multiSelectTags")
  private Map<String, List<String>> multiSelectTags = null;

  public SharedScenarioResponse sharedByTeam(String sharedByTeam) {
    this.sharedByTeam = sharedByTeam;
    return this;
  }

   /**
   * Get sharedByTeam
   * @return sharedByTeam
  **/
  @ApiModelProperty(value = "")
  public String getSharedByTeam() {
    return sharedByTeam;
  }

  public void setSharedByTeam(String sharedByTeam) {
    this.sharedByTeam = sharedByTeam;
  }

  public SharedScenarioResponse guid(String guid) {
    this.guid = guid;
    return this;
  }

   /**
   * Get guid
   * @return guid
  **/
  @ApiModelProperty(value = "")
  public String getGuid() {
    return guid;
  }

  public void setGuid(String guid) {
    this.guid = guid;
  }

  public SharedScenarioResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SharedScenarioResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SharedScenarioResponse hypothesis(String hypothesis) {
    this.hypothesis = hypothesis;
    return this;
  }

   /**
   * Get hypothesis
   * @return hypothesis
  **/
  @ApiModelProperty(value = "")
  public String getHypothesis() {
    return hypothesis;
  }

  public void setHypothesis(String hypothesis) {
    this.hypothesis = hypothesis;
  }

  public SharedScenarioResponse graph(ScenarioGraph graph) {
    this.graph = graph;
    return this;
  }

   /**
   * Get graph
   * @return graph
  **/
  @ApiModelProperty(value = "")
  public ScenarioGraph getGraph() {
    return graph;
  }

  public void setGraph(ScenarioGraph graph) {
    this.graph = graph;
  }

  public SharedScenarioResponse sharedBy(String sharedBy) {
    this.sharedBy = sharedBy;
    return this;
  }

   /**
   * Get sharedBy
   * @return sharedBy
  **/
  @ApiModelProperty(value = "")
  public String getSharedBy() {
    return sharedBy;
  }

  public void setSharedBy(String sharedBy) {
    this.sharedBy = sharedBy;
  }

  public SharedScenarioResponse sharedFromScenario(String sharedFromScenario) {
    this.sharedFromScenario = sharedFromScenario;
    return this;
  }

   /**
   * Get sharedFromScenario
   * @return sharedFromScenario
  **/
  @ApiModelProperty(value = "")
  public String getSharedFromScenario() {
    return sharedFromScenario;
  }

  public void setSharedFromScenario(String sharedFromScenario) {
    this.sharedFromScenario = sharedFromScenario;
  }

  public SharedScenarioResponse createSource(String createSource) {
    this.createSource = createSource;
    return this;
  }

   /**
   * Get createSource
   * @return createSource
  **/
  @ApiModelProperty(value = "")
  public String getCreateSource() {
    return createSource;
  }

  public void setCreateSource(String createSource) {
    this.createSource = createSource;
  }

  public SharedScenarioResponse createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public SharedScenarioResponse updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public SharedScenarioResponse tiers(List<String> tiers) {
    this.tiers = tiers;
    return this;
  }

  public SharedScenarioResponse addTiersItem(String tiersItem) {
    if (this.tiers == null) {
      this.tiers = new ArrayList<String>();
    }
    this.tiers.add(tiersItem);
    return this;
  }

   /**
   * Get tiers
   * @return tiers
  **/
  @ApiModelProperty(value = "")
  public List<String> getTiers() {
    return tiers;
  }

  public void setTiers(List<String> tiers) {
    this.tiers = tiers;
  }

  public SharedScenarioResponse recommendedScenarioId(String recommendedScenarioId) {
    this.recommendedScenarioId = recommendedScenarioId;
    return this;
  }

   /**
   * Get recommendedScenarioId
   * @return recommendedScenarioId
  **/
  @ApiModelProperty(value = "")
  public String getRecommendedScenarioId() {
    return recommendedScenarioId;
  }

  public void setRecommendedScenarioId(String recommendedScenarioId) {
    this.recommendedScenarioId = recommendedScenarioId;
  }

  public SharedScenarioResponse multiSelectTags(Map<String, List<String>> multiSelectTags) {
    this.multiSelectTags = multiSelectTags;
    return this;
  }

  public SharedScenarioResponse putMultiSelectTagsItem(String key, List<String> multiSelectTagsItem) {
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
    SharedScenarioResponse sharedScenarioResponse = (SharedScenarioResponse) o;
    return Objects.equals(this.sharedByTeam, sharedScenarioResponse.sharedByTeam) &&
        Objects.equals(this.guid, sharedScenarioResponse.guid) &&
        Objects.equals(this.name, sharedScenarioResponse.name) &&
        Objects.equals(this.description, sharedScenarioResponse.description) &&
        Objects.equals(this.hypothesis, sharedScenarioResponse.hypothesis) &&
        Objects.equals(this.graph, sharedScenarioResponse.graph) &&
        Objects.equals(this.sharedBy, sharedScenarioResponse.sharedBy) &&
        Objects.equals(this.sharedFromScenario, sharedScenarioResponse.sharedFromScenario) &&
        Objects.equals(this.createSource, sharedScenarioResponse.createSource) &&
        Objects.equals(this.createdAt, sharedScenarioResponse.createdAt) &&
        Objects.equals(this.updatedAt, sharedScenarioResponse.updatedAt) &&
        Objects.equals(this.tiers, sharedScenarioResponse.tiers) &&
        Objects.equals(this.recommendedScenarioId, sharedScenarioResponse.recommendedScenarioId) &&
        Objects.equals(this.multiSelectTags, sharedScenarioResponse.multiSelectTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sharedByTeam, guid, name, description, hypothesis, graph, sharedBy, sharedFromScenario, createSource, createdAt, updatedAt, tiers, recommendedScenarioId, multiSelectTags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SharedScenarioResponse {\n");
    
    sb.append("    sharedByTeam: ").append(toIndentedString(sharedByTeam)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hypothesis: ").append(toIndentedString(hypothesis)).append("\n");
    sb.append("    graph: ").append(toIndentedString(graph)).append("\n");
    sb.append("    sharedBy: ").append(toIndentedString(sharedBy)).append("\n");
    sb.append("    sharedFromScenario: ").append(toIndentedString(sharedFromScenario)).append("\n");
    sb.append("    createSource: ").append(toIndentedString(createSource)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
    sb.append("    recommendedScenarioId: ").append(toIndentedString(recommendedScenarioId)).append("\n");
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

