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
 * InfraCommand
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-22T16:18:53.536Z")



public class InfraCommand {
  @SerializedName("templateId")
  private String templateId = null;

  /**
   * Gets or Sets infraCommandType
   */
  @JsonAdapter(InfraCommandTypeEnum.Adapter.class)
  public enum InfraCommandTypeEnum {
    CPU("cpu"),
    CPU2("CPU"),
    IO("io"),
    IO2("IO"),

    MEMORY("Memory"),
    MEMORY3("memory"),
    MEMORY2("MEMORY"),

    DISK("Disk"),
    DISK3("disk"),
    DISK2("DISK"),
    BLACKHOLE("Blackhole"),
    BLACKHOLE3("blackhole"),
    BLACKHOLE2("BLACKHOLE"),


    DNS("dns"),
    DNS2("DNS"),


    LATENCY("Latency"),
    LATENCY3("latency"),
    LATENCY2("LATENCY"),


    PACKET_LOSS("Packet Loss"),
    PACKET_LOSS2("PACKET_LOSS"),
    PACKET_LOSS3("packet loss"),


    SHUTDOWN("Shutdown"),
    SHUTDOWN2("SHUTDOWN"),
    SHUTDOWN3("shutdown"),

    TIME_TRAVEL("Time Travel"),
    TIME_TRAVEL3("time travel"),
    TIME_TRAVEL2("TIME_TRAVEL"),


    PROCESS_KILLER("Process Killer"),
    PROCESS_KILLER3("process killer"),
    PROCESS_KILLER2("PROCESS_kILLER"),

    UNKNOWN2("UNKNOWN"),
    UNKNOWN("unknown");

    private String value;

    InfraCommandTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InfraCommandTypeEnum fromValue(String text) {
      for (InfraCommandTypeEnum b : InfraCommandTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InfraCommandTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InfraCommandTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InfraCommandTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InfraCommandTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("infra_command_type")
  private InfraCommandTypeEnum infraCommandType = null;

  @SerializedName("infra_command_args")
  private InfraCommandArgs infraCommandArgs = null;

  @SerializedName("maxExpectedLength")
  private Integer maxExpectedLength = null;

  @SerializedName("length")
  private Integer length = null;

  @SerializedName("commandArgs")
  private InfraCommandArgs commandArgs = null;

  @SerializedName("commandType")
  private InfraCommandTypeEnum commandType = null;


  public InfraCommandArgs getCommandArgs() {
    return commandArgs;
  }

  public void setCommandArgs(InfraCommandArgs commandArgs) {
    this.commandArgs = commandArgs;
  }

  public InfraCommandTypeEnum getCommandType() {
    return commandType;
  }

  public void setCommandType(InfraCommandTypeEnum commandType) {
    this.commandType = commandType;
  }

  public InfraCommand templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Get templateId
   * @return templateId
  **/
  @ApiModelProperty(value = "")
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  public InfraCommand infraCommandType(InfraCommandTypeEnum infraCommandType) {
    this.infraCommandType = infraCommandType;
    return this;
  }

   /**
   * Get infraCommandType
   * @return infraCommandType
  **/
  @ApiModelProperty(value = "")
  public InfraCommandTypeEnum getInfraCommandType() {
    return infraCommandType;
  }

  public void setInfraCommandType(InfraCommandTypeEnum infraCommandType) {
    this.infraCommandType = infraCommandType;
  }

  public InfraCommand infraCommandArgs(InfraCommandArgs infraCommandArgs) {
    this.infraCommandArgs = infraCommandArgs;
    return this;
  }

   /**
   * Get infraCommandArgs
   * @return infraCommandArgs
  **/
  @ApiModelProperty(value = "")
  public InfraCommandArgs getInfraCommandArgs() {
    return infraCommandArgs;
  }

  public void setInfraCommandArgs(InfraCommandArgs infraCommandArgs) {
    this.infraCommandArgs = infraCommandArgs;
  }

  public InfraCommand maxExpectedLength(Integer maxExpectedLength) {
    this.maxExpectedLength = maxExpectedLength;
    return this;
  }

   /**
   * Get maxExpectedLength
   * @return maxExpectedLength
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxExpectedLength() {
    return maxExpectedLength;
  }

  public void setMaxExpectedLength(Integer maxExpectedLength) {
    this.maxExpectedLength = maxExpectedLength;
  }

  public InfraCommand length(Integer length) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfraCommand infraCommand = (InfraCommand) o;
    return Objects.equals(this.templateId, infraCommand.templateId) &&
        Objects.equals(this.infraCommandType, infraCommand.infraCommandType) &&
        Objects.equals(this.infraCommandArgs, infraCommand.infraCommandArgs) &&
        Objects.equals(this.maxExpectedLength, infraCommand.maxExpectedLength) &&
        Objects.equals(this.length, infraCommand.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(templateId, infraCommandType, infraCommandArgs, maxExpectedLength, length);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfraCommand {\n");
    
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
    sb.append("    infraCommandType: ").append(toIndentedString(infraCommandType)).append("\n");
    sb.append("    infraCommandArgs: ").append(toIndentedString(infraCommandArgs)).append("\n");
    sb.append("    maxExpectedLength: ").append(toIndentedString(maxExpectedLength)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

