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
import org.threeten.bp.OffsetDateTime;

/**
 * Task
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class Task {
  @SerializedName("end")
  private OffsetDateTime end = null;

  @SerializedName("targets")
  private List<String> targets = null;

  @SerializedName("annotations")
  private Map<String, String> annotations = null;

  @SerializedName("providers")
  private List<String> providers = null;

  @SerializedName("version")
  private Integer version = null;

  @SerializedName("start_time")
  private OffsetDateTime startTime = null;

  @SerializedName("end_time")
  private OffsetDateTime endTime = null;

  @SerializedName("k8sAttackId")
  private String k8sAttackId = null;

  @SerializedName("total_clients")
  private Integer totalClients = null;

  @SerializedName("clientsMetricsEnabledCount")
  private Integer clientsMetricsEnabledCount = null;

  @SerializedName("targetContainers")
  private Map<String, List<String>> targetContainers = null;

  @SerializedName("executionStageSummary")
  private Map<String, Integer> executionStageSummary = null;

  @SerializedName("dynamicallyResolvedIPs")
  private List<String> dynamicallyResolvedIPs = null;

  @SerializedName("externalPartitionKey")
  private String externalPartitionKey = null;

  @SerializedName("externalSortKey")
  private String externalSortKey = null;

  @SerializedName("attackQuery")
  private AttackQuery attackQuery = null;

  @SerializedName("start")
  private OffsetDateTime start = null;

  @SerializedName("callbacks")
  private List<CallBack> callbacks = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("trafficImpactMapping")
  private TrafficImpactMapping trafficImpactMapping = null;

  /**
   * Gets or Sets stage
   */
  @JsonAdapter(StageEnum.Adapter.class)
  public enum StageEnum {
    INVALIDARGUMENT("InvalidArgument"),
    
    TARGETNOTFOUND("TargetNotFound"),
    
    SUCCESSFUL("Successful"),
    
    USERHALTED("UserHalted"),
    
    CLIENTABORTED("ClientAborted"),
    
    LOSTCOMMUNICATION("LostCommunication"),
    
    INITIALIZATIONFAILED("InitializationFailed"),
    
    TEARDOWNFAILED("TeardownFailed"),
    
    HALTFAILED("HaltFailed"),
    
    FAILED("Failed"),
    
    PENDING("Pending"),
    
    DISTRIBUTED("Distributed"),
    
    INITIALIZING("Initializing"),
    
    HALTDISTRIBUTED("HaltDistributed"),
    
    INTERRUPTTRIGGERED("InterruptTriggered"),
    
    ROLLBACKTRIGGERED("RollbackTriggered"),
    
    ROLLBACKSTARTED("RollbackStarted"),
    
    HALT("Halt"),
    
    RUNNING("Running"),
    
    TEARINGDOWN("TearingDown");

    private String value;

    StageEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StageEnum fromValue(String text) {
      for (StageEnum b : StageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StageEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StageEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StageEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StageEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("stage")
  private StageEnum stage = null;

  @SerializedName("infra_target")
  private TaskTarget target = null;

  @SerializedName("attributes")
  private Map<String, Object> attributes = null;

  @SerializedName("scenarioRunNumber")
  private Integer scenarioRunNumber = null;

  @SerializedName("scenarioId")
  private String scenarioId = null;

  @SerializedName("scenarioNodeGuid")
  private String scenarioNodeGuid = null;

  @SerializedName("container")
  private Boolean container = null;

  @SerializedName("stage_lifecycle")
  private String stageLifecycle = null;

  @SerializedName("halting")
  private Boolean halting = null;

  @SerializedName("commandTemplateId")
  private String commandTemplateId = null;

  @SerializedName("targetTemplateId")
  private String targetTemplateId = null;

  @SerializedName("args")
  private List<String> args = null;

  @SerializedName("gremlinName")
  private String gremlinName = null;

  /**
   * Gets or Sets targetType
   */
  @JsonAdapter(TargetTypeEnum.Adapter.class)
  public enum TargetTypeEnum {
    HOST("Host"),
    
    CONTAINER("Container"),
    
    DOCKER("Docker"),
    
    KUBERNETES("Kubernetes");

    private String value;

    TargetTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TargetTypeEnum fromValue(String text) {
      for (TargetTypeEnum b : TargetTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TargetTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TargetTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TargetTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TargetTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("target_type")
  private TargetTypeEnum targetType = null;

  @SerializedName("multiSelectLabels")
  private Map<String, List<String>> multiSelectLabels = null;

  /**
   * Gets or Sets createSource
   */
  @JsonAdapter(CreateSourceEnum.Adapter.class)
  public enum CreateSourceEnum {
    WEBAPP("WebApp"),
    
    API("Api"),
    
    SCHEDULED("Scheduled"),
    
    MANUAL("Manual"),
    
    SPINNAKER("Spinnaker"),
    
    CONCORD("Concord"),
    
    GREMLINFEEDER("GremlinFeeder"),
    
    GREMLINSDKPYTHON("GremlinSdkPython"),
    
    SCENARIO("Scenario"),
    
    CHAO("Chao"),
    
    WEBSITE("Website");

    private String value;

    CreateSourceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CreateSourceEnum fromValue(String text) {
      for (CreateSourceEnum b : CreateSourceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CreateSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreateSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CreateSourceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CreateSourceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("createSource")
  private CreateSourceEnum createSource = null;

  @SerializedName("gremlin")
  private String gremlin = null;

  @SerializedName("multiSelectTags")
  private Map<String, List<String>> multiSelectTags = null;

  @SerializedName("length")
  private Integer length = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NETWORK("NETWORK"),
    
    RESOURCE("RESOURCE"),
    
    STATE("STATE"),
    
    UNKNOWN("UNKNOWN");

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

  @SerializedName("guid")
  private String guid = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("sourceInfo")
  private SourceInfo sourceInfo = null;

  /**
   * Gets or Sets createSourceDetail
   */
  @JsonAdapter(CreateSourceDetailEnum.Adapter.class)
  public enum CreateSourceDetailEnum {
    ONBOARDING("Onboarding");

    private String value;

    CreateSourceDetailEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CreateSourceDetailEnum fromValue(String text) {
      for (CreateSourceDetailEnum b : CreateSourceDetailEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<CreateSourceDetailEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CreateSourceDetailEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CreateSourceDetailEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return CreateSourceDetailEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("createSourceDetail")
  private CreateSourceDetailEnum createSourceDetail = null;

  @SerializedName("infra_command")
  private InfraCommand command = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  public Task end(OffsetDateTime end) {
    this.end = end;
    return this;
  }

   /**
   * Get end
   * @return end
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEnd() {
    return end;
  }

  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }

  public Task targets(List<String> targets) {
    this.targets = targets;
    return this;
  }

  public Task addTargetsItem(String targetsItem) {
    if (this.targets == null) {
      this.targets = new ArrayList<String>();
    }
    this.targets.add(targetsItem);
    return this;
  }

   /**
   * Get targets
   * @return targets
  **/
  @ApiModelProperty(value = "")
  public List<String> getTargets() {
    return targets;
  }

  public void setTargets(List<String> targets) {
    this.targets = targets;
  }

  public Task annotations(Map<String, String> annotations) {
    this.annotations = annotations;
    return this;
  }

  public Task putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<String, String>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @ApiModelProperty(value = "")
  public Map<String, String> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }

  public Task providers(List<String> providers) {
    this.providers = providers;
    return this;
  }

  public Task addProvidersItem(String providersItem) {
    if (this.providers == null) {
      this.providers = new ArrayList<String>();
    }
    this.providers.add(providersItem);
    return this;
  }

   /**
   * Get providers
   * @return providers
  **/
  @ApiModelProperty(value = "")
  public List<String> getProviders() {
    return providers;
  }

  public void setProviders(List<String> providers) {
    this.providers = providers;
  }

  public Task version(Integer version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(value = "")
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
    this.version = version;
  }

  public Task startTime(OffsetDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

   /**
   * Get startTime
   * @return startTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(OffsetDateTime startTime) {
    this.startTime = startTime;
  }

  public Task endTime(OffsetDateTime endTime) {
    this.endTime = endTime;
    return this;
  }

   /**
   * Get endTime
   * @return endTime
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getEndTime() {
    return endTime;
  }

  public void setEndTime(OffsetDateTime endTime) {
    this.endTime = endTime;
  }

  public Task k8sAttackId(String k8sAttackId) {
    this.k8sAttackId = k8sAttackId;
    return this;
  }

   /**
   * Get k8sAttackId
   * @return k8sAttackId
  **/
  @ApiModelProperty(value = "")
  public String getK8sAttackId() {
    return k8sAttackId;
  }

  public void setK8sAttackId(String k8sAttackId) {
    this.k8sAttackId = k8sAttackId;
  }

  public Task totalClients(Integer totalClients) {
    this.totalClients = totalClients;
    return this;
  }

   /**
   * Get totalClients
   * @return totalClients
  **/
  @ApiModelProperty(value = "")
  public Integer getTotalClients() {
    return totalClients;
  }

  public void setTotalClients(Integer totalClients) {
    this.totalClients = totalClients;
  }

  public Task clientsMetricsEnabledCount(Integer clientsMetricsEnabledCount) {
    this.clientsMetricsEnabledCount = clientsMetricsEnabledCount;
    return this;
  }

   /**
   * Get clientsMetricsEnabledCount
   * @return clientsMetricsEnabledCount
  **/
  @ApiModelProperty(value = "")
  public Integer getClientsMetricsEnabledCount() {
    return clientsMetricsEnabledCount;
  }

  public void setClientsMetricsEnabledCount(Integer clientsMetricsEnabledCount) {
    this.clientsMetricsEnabledCount = clientsMetricsEnabledCount;
  }

  public Task targetContainers(Map<String, List<String>> targetContainers) {
    this.targetContainers = targetContainers;
    return this;
  }

  public Task putTargetContainersItem(String key, List<String> targetContainersItem) {
    if (this.targetContainers == null) {
      this.targetContainers = new HashMap<String, List<String>>();
    }
    this.targetContainers.put(key, targetContainersItem);
    return this;
  }

   /**
   * Get targetContainers
   * @return targetContainers
  **/
  @ApiModelProperty(value = "")
  public Map<String, List<String>> getTargetContainers() {
    return targetContainers;
  }

  public void setTargetContainers(Map<String, List<String>> targetContainers) {
    this.targetContainers = targetContainers;
  }

  public Task executionStageSummary(Map<String, Integer> executionStageSummary) {
    this.executionStageSummary = executionStageSummary;
    return this;
  }

  public Task putExecutionStageSummaryItem(String key, Integer executionStageSummaryItem) {
    if (this.executionStageSummary == null) {
      this.executionStageSummary = new HashMap<String, Integer>();
    }
    this.executionStageSummary.put(key, executionStageSummaryItem);
    return this;
  }

   /**
   * Get executionStageSummary
   * @return executionStageSummary
  **/
  @ApiModelProperty(value = "")
  public Map<String, Integer> getExecutionStageSummary() {
    return executionStageSummary;
  }

  public void setExecutionStageSummary(Map<String, Integer> executionStageSummary) {
    this.executionStageSummary = executionStageSummary;
  }

  public Task dynamicallyResolvedIPs(List<String> dynamicallyResolvedIPs) {
    this.dynamicallyResolvedIPs = dynamicallyResolvedIPs;
    return this;
  }

  public Task addDynamicallyResolvedIPsItem(String dynamicallyResolvedIPsItem) {
    if (this.dynamicallyResolvedIPs == null) {
      this.dynamicallyResolvedIPs = new ArrayList<String>();
    }
    this.dynamicallyResolvedIPs.add(dynamicallyResolvedIPsItem);
    return this;
  }

   /**
   * Get dynamicallyResolvedIPs
   * @return dynamicallyResolvedIPs
  **/
  @ApiModelProperty(value = "")
  public List<String> getDynamicallyResolvedIPs() {
    return dynamicallyResolvedIPs;
  }

  public void setDynamicallyResolvedIPs(List<String> dynamicallyResolvedIPs) {
    this.dynamicallyResolvedIPs = dynamicallyResolvedIPs;
  }

  public Task externalPartitionKey(String externalPartitionKey) {
    this.externalPartitionKey = externalPartitionKey;
    return this;
  }

   /**
   * Get externalPartitionKey
   * @return externalPartitionKey
  **/
  @ApiModelProperty(value = "")
  public String getExternalPartitionKey() {
    return externalPartitionKey;
  }

  public void setExternalPartitionKey(String externalPartitionKey) {
    this.externalPartitionKey = externalPartitionKey;
  }

  public Task externalSortKey(String externalSortKey) {
    this.externalSortKey = externalSortKey;
    return this;
  }

   /**
   * Get externalSortKey
   * @return externalSortKey
  **/
  @ApiModelProperty(value = "")
  public String getExternalSortKey() {
    return externalSortKey;
  }

  public void setExternalSortKey(String externalSortKey) {
    this.externalSortKey = externalSortKey;
  }

  public Task attackQuery(AttackQuery attackQuery) {
    this.attackQuery = attackQuery;
    return this;
  }

   /**
   * Get attackQuery
   * @return attackQuery
  **/
  @ApiModelProperty(value = "")
  public AttackQuery getAttackQuery() {
    return attackQuery;
  }

  public void setAttackQuery(AttackQuery attackQuery) {
    this.attackQuery = attackQuery;
  }

  public Task start(OffsetDateTime start) {
    this.start = start;
    return this;
  }

   /**
   * Get start
   * @return start
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getStart() {
    return start;
  }

  public void setStart(OffsetDateTime start) {
    this.start = start;
  }

  public Task callbacks(List<CallBack> callbacks) {
    this.callbacks = callbacks;
    return this;
  }

  public Task addCallbacksItem(CallBack callbacksItem) {
    if (this.callbacks == null) {
      this.callbacks = new ArrayList<CallBack>();
    }
    this.callbacks.add(callbacksItem);
    return this;
  }

   /**
   * Get callbacks
   * @return callbacks
  **/
  @ApiModelProperty(value = "")
  public List<CallBack> getCallbacks() {
    return callbacks;
  }

  public void setCallbacks(List<CallBack> callbacks) {
    this.callbacks = callbacks;
  }

  public Task user(String user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @ApiModelProperty(value = "")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public Task trafficImpactMapping(TrafficImpactMapping trafficImpactMapping) {
    this.trafficImpactMapping = trafficImpactMapping;
    return this;
  }

   /**
   * Get trafficImpactMapping
   * @return trafficImpactMapping
  **/
  @ApiModelProperty(value = "")
  public TrafficImpactMapping getTrafficImpactMapping() {
    return trafficImpactMapping;
  }

  public void setTrafficImpactMapping(TrafficImpactMapping trafficImpactMapping) {
    this.trafficImpactMapping = trafficImpactMapping;
  }

  public Task stage(StageEnum stage) {
    this.stage = stage;
    return this;
  }

   /**
   * Get stage
   * @return stage
  **/
  @ApiModelProperty(value = "")
  public StageEnum getStage() {
    return stage;
  }

  public void setStage(StageEnum stage) {
    this.stage = stage;
  }

  public Task target(TaskTarget target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(value = "")
  public TaskTarget getTarget() {
    return target;
  }

  public void setTarget(TaskTarget target) {
    this.target = target;
  }

  public Task attributes(Map<String, Object> attributes) {
    this.attributes = attributes;
    return this;
  }

  public Task putAttributesItem(String key, Object attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<String, Object>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(value = "")
  public Map<String, Object> getAttributes() {
    return attributes;
  }

  public void setAttributes(Map<String, Object> attributes) {
    this.attributes = attributes;
  }

  public Task scenarioRunNumber(Integer scenarioRunNumber) {
    this.scenarioRunNumber = scenarioRunNumber;
    return this;
  }

   /**
   * Get scenarioRunNumber
   * @return scenarioRunNumber
  **/
  @ApiModelProperty(value = "")
  public Integer getScenarioRunNumber() {
    return scenarioRunNumber;
  }

  public void setScenarioRunNumber(Integer scenarioRunNumber) {
    this.scenarioRunNumber = scenarioRunNumber;
  }

  public Task scenarioId(String scenarioId) {
    this.scenarioId = scenarioId;
    return this;
  }

   /**
   * Get scenarioId
   * @return scenarioId
  **/
  @ApiModelProperty(value = "")
  public String getScenarioId() {
    return scenarioId;
  }

  public void setScenarioId(String scenarioId) {
    this.scenarioId = scenarioId;
  }

  public Task scenarioNodeGuid(String scenarioNodeGuid) {
    this.scenarioNodeGuid = scenarioNodeGuid;
    return this;
  }

   /**
   * Get scenarioNodeGuid
   * @return scenarioNodeGuid
  **/
  @ApiModelProperty(value = "")
  public String getScenarioNodeGuid() {
    return scenarioNodeGuid;
  }

  public void setScenarioNodeGuid(String scenarioNodeGuid) {
    this.scenarioNodeGuid = scenarioNodeGuid;
  }

  public Task container(Boolean container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  @ApiModelProperty(value = "")
  public Boolean isContainer() {
    return container;
  }

  public void setContainer(Boolean container) {
    this.container = container;
  }

  public Task stageLifecycle(String stageLifecycle) {
    this.stageLifecycle = stageLifecycle;
    return this;
  }

   /**
   * Get stageLifecycle
   * @return stageLifecycle
  **/
  @ApiModelProperty(value = "")
  public String getStageLifecycle() {
    return stageLifecycle;
  }

  public void setStageLifecycle(String stageLifecycle) {
    this.stageLifecycle = stageLifecycle;
  }

  public Task halting(Boolean halting) {
    this.halting = halting;
    return this;
  }

   /**
   * Get halting
   * @return halting
  **/
  @ApiModelProperty(value = "")
  public Boolean isHalting() {
    return halting;
  }

  public void setHalting(Boolean halting) {
    this.halting = halting;
  }

  public Task commandTemplateId(String commandTemplateId) {
    this.commandTemplateId = commandTemplateId;
    return this;
  }

   /**
   * Get commandTemplateId
   * @return commandTemplateId
  **/
  @ApiModelProperty(value = "")
  public String getCommandTemplateId() {
    return commandTemplateId;
  }

  public void setCommandTemplateId(String commandTemplateId) {
    this.commandTemplateId = commandTemplateId;
  }

  public Task targetTemplateId(String targetTemplateId) {
    this.targetTemplateId = targetTemplateId;
    return this;
  }

   /**
   * Get targetTemplateId
   * @return targetTemplateId
  **/
  @ApiModelProperty(value = "")
  public String getTargetTemplateId() {
    return targetTemplateId;
  }

  public void setTargetTemplateId(String targetTemplateId) {
    this.targetTemplateId = targetTemplateId;
  }

  public Task args(List<String> args) {
    this.args = args;
    return this;
  }

  public Task addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<String>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Get args
   * @return args
  **/
  @ApiModelProperty(value = "")
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }

  public Task gremlinName(String gremlinName) {
    this.gremlinName = gremlinName;
    return this;
  }

   /**
   * Get gremlinName
   * @return gremlinName
  **/
  @ApiModelProperty(value = "")
  public String getGremlinName() {
    return gremlinName;
  }

  public void setGremlinName(String gremlinName) {
    this.gremlinName = gremlinName;
  }

  public Task targetType(TargetTypeEnum targetType) {
    this.targetType = targetType;
    return this;
  }

   /**
   * Get targetType
   * @return targetType
  **/
  @ApiModelProperty(value = "")
  public TargetTypeEnum getTargetType() {
    return targetType;
  }

  public void setTargetType(TargetTypeEnum targetType) {
    this.targetType = targetType;
  }

  public Task multiSelectLabels(Map<String, List<String>> multiSelectLabels) {
    this.multiSelectLabels = multiSelectLabels;
    return this;
  }

  public Task putMultiSelectLabelsItem(String key, List<String> multiSelectLabelsItem) {
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

  public Task createSource(CreateSourceEnum createSource) {
    this.createSource = createSource;
    return this;
  }

   /**
   * Get createSource
   * @return createSource
  **/
  @ApiModelProperty(value = "")
  public CreateSourceEnum getCreateSource() {
    return createSource;
  }

  public void setCreateSource(CreateSourceEnum createSource) {
    this.createSource = createSource;
  }

  public Task gremlin(String gremlin) {
    this.gremlin = gremlin;
    return this;
  }

   /**
   * Get gremlin
   * @return gremlin
  **/
  @ApiModelProperty(value = "")
  public String getGremlin() {
    return gremlin;
  }

  public void setGremlin(String gremlin) {
    this.gremlin = gremlin;
  }

  public Task multiSelectTags(Map<String, List<String>> multiSelectTags) {
    this.multiSelectTags = multiSelectTags;
    return this;
  }

  public Task putMultiSelectTagsItem(String key, List<String> multiSelectTagsItem) {
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

  public Task length(Integer length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public Integer getLength() {
    return length;
  }

  public void setLength(Integer length) {
    this.length = length;
  }

  public Task type(TypeEnum type) {
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

  public Task guid(String guid) {
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

  public Task orgId(String orgId) {
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

  public Task sourceInfo(SourceInfo sourceInfo) {
    this.sourceInfo = sourceInfo;
    return this;
  }

   /**
   * Get sourceInfo
   * @return sourceInfo
  **/
  @ApiModelProperty(value = "")
  public SourceInfo getSourceInfo() {
    return sourceInfo;
  }

  public void setSourceInfo(SourceInfo sourceInfo) {
    this.sourceInfo = sourceInfo;
  }

  public Task createSourceDetail(CreateSourceDetailEnum createSourceDetail) {
    this.createSourceDetail = createSourceDetail;
    return this;
  }

   /**
   * Get createSourceDetail
   * @return createSourceDetail
  **/
  @ApiModelProperty(value = "")
  public CreateSourceDetailEnum getCreateSourceDetail() {
    return createSourceDetail;
  }

  public void setCreateSourceDetail(CreateSourceDetailEnum createSourceDetail) {
    this.createSourceDetail = createSourceDetail;
  }

  public Task command(InfraCommand command) {
    this.command = command;
    return this;
  }

   /**
   * Get command
   * @return command
  **/
  @ApiModelProperty(value = "")
  public InfraCommand getCommand() {
    return command;
  }

  public void setCommand(InfraCommand command) {
    this.command = command;
  }

  public Task createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Task updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.end, task.end) &&
        Objects.equals(this.targets, task.targets) &&
        Objects.equals(this.annotations, task.annotations) &&
        Objects.equals(this.providers, task.providers) &&
        Objects.equals(this.version, task.version) &&
        Objects.equals(this.startTime, task.startTime) &&
        Objects.equals(this.endTime, task.endTime) &&
        Objects.equals(this.k8sAttackId, task.k8sAttackId) &&
        Objects.equals(this.totalClients, task.totalClients) &&
        Objects.equals(this.clientsMetricsEnabledCount, task.clientsMetricsEnabledCount) &&
        Objects.equals(this.targetContainers, task.targetContainers) &&
        Objects.equals(this.executionStageSummary, task.executionStageSummary) &&
        Objects.equals(this.dynamicallyResolvedIPs, task.dynamicallyResolvedIPs) &&
        Objects.equals(this.externalPartitionKey, task.externalPartitionKey) &&
        Objects.equals(this.externalSortKey, task.externalSortKey) &&
        Objects.equals(this.attackQuery, task.attackQuery) &&
        Objects.equals(this.start, task.start) &&
        Objects.equals(this.callbacks, task.callbacks) &&
        Objects.equals(this.user, task.user) &&
        Objects.equals(this.trafficImpactMapping, task.trafficImpactMapping) &&
        Objects.equals(this.stage, task.stage) &&
        Objects.equals(this.target, task.target) &&
        Objects.equals(this.attributes, task.attributes) &&
        Objects.equals(this.scenarioRunNumber, task.scenarioRunNumber) &&
        Objects.equals(this.scenarioId, task.scenarioId) &&
        Objects.equals(this.scenarioNodeGuid, task.scenarioNodeGuid) &&
        Objects.equals(this.container, task.container) &&
        Objects.equals(this.stageLifecycle, task.stageLifecycle) &&
        Objects.equals(this.halting, task.halting) &&
        Objects.equals(this.commandTemplateId, task.commandTemplateId) &&
        Objects.equals(this.targetTemplateId, task.targetTemplateId) &&
        Objects.equals(this.args, task.args) &&
        Objects.equals(this.gremlinName, task.gremlinName) &&
        Objects.equals(this.targetType, task.targetType) &&
        Objects.equals(this.multiSelectLabels, task.multiSelectLabels) &&
        Objects.equals(this.createSource, task.createSource) &&
        Objects.equals(this.gremlin, task.gremlin) &&
        Objects.equals(this.multiSelectTags, task.multiSelectTags) &&
        Objects.equals(this.length, task.length) &&
        Objects.equals(this.type, task.type) &&
        Objects.equals(this.guid, task.guid) &&
        Objects.equals(this.orgId, task.orgId) &&
        Objects.equals(this.sourceInfo, task.sourceInfo) &&
        Objects.equals(this.createSourceDetail, task.createSourceDetail) &&
        Objects.equals(this.command, task.command) &&
        Objects.equals(this.createdAt, task.createdAt) &&
        Objects.equals(this.updatedAt, task.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, targets, annotations, providers, version, startTime, endTime, k8sAttackId, totalClients, clientsMetricsEnabledCount, targetContainers, executionStageSummary, dynamicallyResolvedIPs, externalPartitionKey, externalSortKey, attackQuery, start, callbacks, user, trafficImpactMapping, stage, target, attributes, scenarioRunNumber, scenarioId, scenarioNodeGuid, container, stageLifecycle, halting, commandTemplateId, targetTemplateId, args, gremlinName, targetType, multiSelectLabels, createSource, gremlin, multiSelectTags, length, type, guid, orgId, sourceInfo, createSourceDetail, command, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    k8sAttackId: ").append(toIndentedString(k8sAttackId)).append("\n");
    sb.append("    totalClients: ").append(toIndentedString(totalClients)).append("\n");
    sb.append("    clientsMetricsEnabledCount: ").append(toIndentedString(clientsMetricsEnabledCount)).append("\n");
    sb.append("    targetContainers: ").append(toIndentedString(targetContainers)).append("\n");
    sb.append("    executionStageSummary: ").append(toIndentedString(executionStageSummary)).append("\n");
    sb.append("    dynamicallyResolvedIPs: ").append(toIndentedString(dynamicallyResolvedIPs)).append("\n");
    sb.append("    externalPartitionKey: ").append(toIndentedString(externalPartitionKey)).append("\n");
    sb.append("    externalSortKey: ").append(toIndentedString(externalSortKey)).append("\n");
    sb.append("    attackQuery: ").append(toIndentedString(attackQuery)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    callbacks: ").append(toIndentedString(callbacks)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    trafficImpactMapping: ").append(toIndentedString(trafficImpactMapping)).append("\n");
    sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    scenarioRunNumber: ").append(toIndentedString(scenarioRunNumber)).append("\n");
    sb.append("    scenarioId: ").append(toIndentedString(scenarioId)).append("\n");
    sb.append("    scenarioNodeGuid: ").append(toIndentedString(scenarioNodeGuid)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    stageLifecycle: ").append(toIndentedString(stageLifecycle)).append("\n");
    sb.append("    halting: ").append(toIndentedString(halting)).append("\n");
    sb.append("    commandTemplateId: ").append(toIndentedString(commandTemplateId)).append("\n");
    sb.append("    targetTemplateId: ").append(toIndentedString(targetTemplateId)).append("\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    gremlinName: ").append(toIndentedString(gremlinName)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    multiSelectLabels: ").append(toIndentedString(multiSelectLabels)).append("\n");
    sb.append("    createSource: ").append(toIndentedString(createSource)).append("\n");
    sb.append("    gremlin: ").append(toIndentedString(gremlin)).append("\n");
    sb.append("    multiSelectTags: ").append(toIndentedString(multiSelectTags)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    sourceInfo: ").append(toIndentedString(sourceInfo)).append("\n");
    sb.append("    createSourceDetail: ").append(toIndentedString(createSourceDetail)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

