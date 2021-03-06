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
import org.threeten.bp.OffsetDateTime;

/**
 * Webhook
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class Webhook {
  @SerializedName("teamId")
  private String teamId = null;

  @SerializedName("identifier")
  private String identifier = null;

  /**
   * The type of this webhook
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    TASK("TASK"),
    
    STATUS_CHECK("STATUS_CHECK");

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

  @SerializedName("webhookEndpoint")
  private WebhookEndpoint webhookEndpoint = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("createdAt")
  private OffsetDateTime createdAt = null;

  @SerializedName("updatedBy")
  private String updatedBy = null;

  @SerializedName("updatedAt")
  private OffsetDateTime updatedAt = null;

  /**
   * Gets or Sets triggerEvents
   */
  @JsonAdapter(TriggerEventsEnum.Adapter.class)
  public enum TriggerEventsEnum {
    INITIALIZING("INITIALIZING"),
    
    RUNNING("RUNNING"),
    
    FINISHED("FINISHED");

    private String value;

    TriggerEventsEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TriggerEventsEnum fromValue(String text) {
      for (TriggerEventsEnum b : TriggerEventsEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TriggerEventsEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TriggerEventsEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TriggerEventsEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TriggerEventsEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("triggerEvents")
  private List<TriggerEventsEnum> triggerEvents = null;

  /**
   * The state of this webhook (ACTIVE / DEACTIVATED
   */
  @JsonAdapter(StateEnum.Adapter.class)
  public enum StateEnum {
    ACTIVE("ACTIVE"),
    
    DEACTIVATED("DEACTIVATED");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StateEnum fromValue(String text) {
      for (StateEnum b : StateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("state")
  private StateEnum state = null;

  @SerializedName("payload")
  private String payload = null;

  public Webhook teamId(String teamId) {
    this.teamId = teamId;
    return this;
  }

   /**
   * The identifier of the team to which this webhook belongs
   * @return teamId
  **/
  @ApiModelProperty(value = "The identifier of the team to which this webhook belongs")
  public String getTeamId() {
    return teamId;
  }

  public void setTeamId(String teamId) {
    this.teamId = teamId;
  }

  public Webhook identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * The identifier of this webhook
   * @return identifier
  **/
  @ApiModelProperty(value = "The identifier of this webhook")
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  public Webhook type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The type of this webhook
   * @return type
  **/
  @ApiModelProperty(value = "The type of this webhook")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Webhook webhookEndpoint(WebhookEndpoint webhookEndpoint) {
    this.webhookEndpoint = webhookEndpoint;
    return this;
  }

   /**
   * The webhook endpoint configuration for this webhook
   * @return webhookEndpoint
  **/
  @ApiModelProperty(value = "The webhook endpoint configuration for this webhook")
  public WebhookEndpoint getWebhookEndpoint() {
    return webhookEndpoint;
  }

  public void setWebhookEndpoint(WebhookEndpoint webhookEndpoint) {
    this.webhookEndpoint = webhookEndpoint;
  }

  public Webhook name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of this webhook
   * @return name
  **/
  @ApiModelProperty(value = "The name of this webhook")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Webhook description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The description of this webhook
   * @return description
  **/
  @ApiModelProperty(value = "The description of this webhook")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Webhook createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * The identifier of the user that created this webhook
   * @return createdBy
  **/
  @ApiModelProperty(value = "The identifier of the user that created this webhook")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Webhook createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * The time of creation of this webhook
   * @return createdAt
  **/
  @ApiModelProperty(value = "The time of creation of this webhook")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public Webhook updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

   /**
   * The time of the most recent update for this webhook (if applicable)
   * @return updatedBy
  **/
  @ApiModelProperty(value = "The time of the most recent update for this webhook (if applicable)")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  public Webhook updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * The identifier of the user that most recently updated this webhook (if applicable)
   * @return updatedAt
  **/
  @ApiModelProperty(value = "The identifier of the user that most recently updated this webhook (if applicable)")
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public Webhook triggerEvents(List<TriggerEventsEnum> triggerEvents) {
    this.triggerEvents = triggerEvents;
    return this;
  }

  public Webhook addTriggerEventsItem(TriggerEventsEnum triggerEventsItem) {
    if (this.triggerEvents == null) {
      this.triggerEvents = new ArrayList<TriggerEventsEnum>();
    }
    this.triggerEvents.add(triggerEventsItem);
    return this;
  }

   /**
   * The identifier of the user that most recently updated this webhook (if applicable)
   * @return triggerEvents
  **/
  @ApiModelProperty(value = "The identifier of the user that most recently updated this webhook (if applicable)")
  public List<TriggerEventsEnum> getTriggerEvents() {
    return triggerEvents;
  }

  public void setTriggerEvents(List<TriggerEventsEnum> triggerEvents) {
    this.triggerEvents = triggerEvents;
  }

  public Webhook state(StateEnum state) {
    this.state = state;
    return this;
  }

   /**
   * The state of this webhook (ACTIVE / DEACTIVATED
   * @return state
  **/
  @ApiModelProperty(value = "The state of this webhook (ACTIVE / DEACTIVATED")
  public StateEnum getState() {
    return state;
  }

  public void setState(StateEnum state) {
    this.state = state;
  }

  public Webhook payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload to be sent when the webhook is invoked
   * @return payload
  **/
  @ApiModelProperty(value = "The payload to be sent when the webhook is invoked")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.teamId, webhook.teamId) &&
        Objects.equals(this.identifier, webhook.identifier) &&
        Objects.equals(this.type, webhook.type) &&
        Objects.equals(this.webhookEndpoint, webhook.webhookEndpoint) &&
        Objects.equals(this.name, webhook.name) &&
        Objects.equals(this.description, webhook.description) &&
        Objects.equals(this.createdBy, webhook.createdBy) &&
        Objects.equals(this.createdAt, webhook.createdAt) &&
        Objects.equals(this.updatedBy, webhook.updatedBy) &&
        Objects.equals(this.updatedAt, webhook.updatedAt) &&
        Objects.equals(this.triggerEvents, webhook.triggerEvents) &&
        Objects.equals(this.state, webhook.state) &&
        Objects.equals(this.payload, webhook.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(teamId, identifier, type, webhookEndpoint, name, description, createdBy, createdAt, updatedBy, updatedAt, triggerEvents, state, payload);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    
    sb.append("    teamId: ").append(toIndentedString(teamId)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    webhookEndpoint: ").append(toIndentedString(webhookEndpoint)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    triggerEvents: ").append(toIndentedString(triggerEvents)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

