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
 * ScenarioResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class ScenarioResponse {
  @SerializedName("org_id")
  private String orgId = null;

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("hypothesis")
  private String hypothesis = null;

  @SerializedName("steps")
  private List<Map<String, Object>> steps = null;

  @SerializedName("graph")
  private ScenarioGraph graph = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("createSource")
  private String createSource = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  @SerializedName("lastRunAt")
  private String lastRunAt = null;

  @SerializedName("tiers")
  private List<String> tiers = null;

  @SerializedName("recommendedScenarioId")
  private String recommendedScenarioId = null;

  @SerializedName("multiSelectTags")
  private Map<String, List<String>> multiSelectTags = null;

  /**
   * Gets or Sets createdFromType
   */
  @JsonAdapter(CreatedFromTypeEnum.Adapter.class)
  public enum CreatedFromTypeEnum {
    RECOMMENDED("Recommended"),
    
    SHARED("Shared");

    private String value;

    CreatedFromTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CreatedFromTypeEnum fromValue(String text) {
      for (CreatedFromTypeEnum b : CreatedFromTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CreatedFromTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreatedFromTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CreatedFromTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CreatedFromTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("createdFromType")
  private CreatedFromTypeEnum createdFromType = null;

  @SerializedName("createdFromId")
  private String createdFromId = null;

  @SerializedName("editCounter")
  private Integer editCounter = null;

  public ScenarioResponse orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @ApiModelProperty(value = "")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public ScenarioResponse guid(String guid) {
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

  public ScenarioResponse name(String name) {
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

  public ScenarioResponse description(String description) {
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

  public ScenarioResponse hypothesis(String hypothesis) {
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

  public ScenarioResponse steps(List<Map<String, Object>> steps) {
    this.steps = steps;
    return this;
  }

  public ScenarioResponse addStepsItem(Map<String, Object> stepsItem) {
    if (this.steps == null) {
      this.steps = new ArrayList<Map<String, Object>>();
    }
    this.steps.add(stepsItem);
    return this;
  }

   /**
   * Get steps
   * @return steps
  **/
  @ApiModelProperty(value = "")
  public List<Map<String, Object>> getSteps() {
    return steps;
  }

  public void setSteps(List<Map<String, Object>> steps) {
    this.steps = steps;
  }

  public ScenarioResponse graph(ScenarioGraph graph) {
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

  public ScenarioResponse state(String state) {
    this.state = state;
    return this;
  }

   /**
   * Get state
   * @return state
  **/
  @ApiModelProperty(value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ScenarioResponse createSource(String createSource) {
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

  public ScenarioResponse createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @ApiModelProperty(value = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public ScenarioResponse createdAt(String createdAt) {
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

  public ScenarioResponse updatedAt(String updatedAt) {
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

  public ScenarioResponse lastRunAt(String lastRunAt) {
    this.lastRunAt = lastRunAt;
    return this;
  }

   /**
   * Get lastRunAt
   * @return lastRunAt
  **/
  @ApiModelProperty(value = "")
  public String getLastRunAt() {
    return lastRunAt;
  }

  public void setLastRunAt(String lastRunAt) {
    this.lastRunAt = lastRunAt;
  }

  public ScenarioResponse tiers(List<String> tiers) {
    this.tiers = tiers;
    return this;
  }

  public ScenarioResponse addTiersItem(String tiersItem) {
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

  public ScenarioResponse recommendedScenarioId(String recommendedScenarioId) {
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

  public ScenarioResponse multiSelectTags(Map<String, List<String>> multiSelectTags) {
    this.multiSelectTags = multiSelectTags;
    return this;
  }

  public ScenarioResponse putMultiSelectTagsItem(String key, List<String> multiSelectTagsItem) {
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

  public ScenarioResponse createdFromType(CreatedFromTypeEnum createdFromType) {
    this.createdFromType = createdFromType;
    return this;
  }

   /**
   * Get createdFromType
   * @return createdFromType
  **/
  @ApiModelProperty(value = "")
  public CreatedFromTypeEnum getCreatedFromType() {
    return createdFromType;
  }

  public void setCreatedFromType(CreatedFromTypeEnum createdFromType) {
    this.createdFromType = createdFromType;
  }

  public ScenarioResponse createdFromId(String createdFromId) {
    this.createdFromId = createdFromId;
    return this;
  }

   /**
   * Get createdFromId
   * @return createdFromId
  **/
  @ApiModelProperty(value = "")
  public String getCreatedFromId() {
    return createdFromId;
  }

  public void setCreatedFromId(String createdFromId) {
    this.createdFromId = createdFromId;
  }

  public ScenarioResponse editCounter(Integer editCounter) {
    this.editCounter = editCounter;
    return this;
  }

   /**
   * Get editCounter
   * @return editCounter
  **/
  @ApiModelProperty(value = "")
  public Integer getEditCounter() {
    return editCounter;
  }

  public void setEditCounter(Integer editCounter) {
    this.editCounter = editCounter;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScenarioResponse scenarioResponse = (ScenarioResponse) o;
    return Objects.equals(this.orgId, scenarioResponse.orgId) &&
        Objects.equals(this.guid, scenarioResponse.guid) &&
        Objects.equals(this.name, scenarioResponse.name) &&
        Objects.equals(this.description, scenarioResponse.description) &&
        Objects.equals(this.hypothesis, scenarioResponse.hypothesis) &&
        Objects.equals(this.steps, scenarioResponse.steps) &&
        Objects.equals(this.graph, scenarioResponse.graph) &&
        Objects.equals(this.state, scenarioResponse.state) &&
        Objects.equals(this.createSource, scenarioResponse.createSource) &&
        Objects.equals(this.createdBy, scenarioResponse.createdBy) &&
        Objects.equals(this.createdAt, scenarioResponse.createdAt) &&
        Objects.equals(this.updatedAt, scenarioResponse.updatedAt) &&
        Objects.equals(this.lastRunAt, scenarioResponse.lastRunAt) &&
        Objects.equals(this.tiers, scenarioResponse.tiers) &&
        Objects.equals(this.recommendedScenarioId, scenarioResponse.recommendedScenarioId) &&
        Objects.equals(this.multiSelectTags, scenarioResponse.multiSelectTags) &&
        Objects.equals(this.createdFromType, scenarioResponse.createdFromType) &&
        Objects.equals(this.createdFromId, scenarioResponse.createdFromId) &&
        Objects.equals(this.editCounter, scenarioResponse.editCounter);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgId, guid, name, description, hypothesis, steps, graph, state, createSource, createdBy, createdAt, updatedAt, lastRunAt, tiers, recommendedScenarioId, multiSelectTags, createdFromType, createdFromId, editCounter);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScenarioResponse {\n");
    
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hypothesis: ").append(toIndentedString(hypothesis)).append("\n");
    sb.append("    steps: ").append(toIndentedString(steps)).append("\n");
    sb.append("    graph: ").append(toIndentedString(graph)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    createSource: ").append(toIndentedString(createSource)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    lastRunAt: ").append(toIndentedString(lastRunAt)).append("\n");
    sb.append("    tiers: ").append(toIndentedString(tiers)).append("\n");
    sb.append("    recommendedScenarioId: ").append(toIndentedString(recommendedScenarioId)).append("\n");
    sb.append("    multiSelectTags: ").append(toIndentedString(multiSelectTags)).append("\n");
    sb.append("    createdFromType: ").append(toIndentedString(createdFromType)).append("\n");
    sb.append("    createdFromId: ").append(toIndentedString(createdFromId)).append("\n");
    sb.append("    editCounter: ").append(toIndentedString(editCounter)).append("\n");
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

