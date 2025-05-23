/*
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package dev.ottbot.centralrelay.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * OttbotReleaseView
 */
@JsonPropertyOrder({
  OttbotReleaseView.JSON_PROPERTY_ID,
  OttbotReleaseView.JSON_PROPERTY_NAME,
  OttbotReleaseView.JSON_PROPERTY_DESCRIPTION,
  OttbotReleaseView.JSON_PROPERTY_VERSION,
  OttbotReleaseView.JSON_PROPERTY_SERVICE,
  OttbotReleaseView.JSON_PROPERTY_DOWNLOAD_URL,
  OttbotReleaseView.JSON_PROPERTY_RELEASE_CHANNEL
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-22T15:30:33.297029192Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class OttbotReleaseView {
  public static final String JSON_PROPERTY_ID = "id";
  @javax.annotation.Nullable
  private String id;

  public static final String JSON_PROPERTY_NAME = "name";
  @javax.annotation.Nullable
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  @javax.annotation.Nullable
  private String description;

  public static final String JSON_PROPERTY_VERSION = "version";
  @javax.annotation.Nullable
  private String version;

  /**
   * Gets or Sets service
   */
  public enum ServiceEnum {
    ENGINE_SERVER(String.valueOf("ENGINE_SERVER")),
    
    ENGINE_SERVER_CONFIG(String.valueOf("ENGINE_SERVER_CONFIG")),
    
    CONFIG_SERVER(String.valueOf("CONFIG_SERVER")),
    
    CONFIG_SERVER_CONFIG(String.valueOf("CONFIG_SERVER_CONFIG")),
    
    HEADSET_APP(String.valueOf("HEADSET_APP")),
    
    ANDROID_APP(String.valueOf("ANDROID_APP")),
    
    PI_SERVER_IMAGE(String.valueOf("PI_SERVER_IMAGE")),
    
    PI_ZERO_IMAGE(String.valueOf("PI_ZERO_IMAGE"));

    private String value;

    ServiceEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ServiceEnum fromValue(String value) {
      for (ServiceEnum b : ServiceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SERVICE = "service";
  @javax.annotation.Nullable
  private ServiceEnum service;

  public static final String JSON_PROPERTY_DOWNLOAD_URL = "downloadUrl";
  @javax.annotation.Nullable
  private String downloadUrl;

  public static final String JSON_PROPERTY_RELEASE_CHANNEL = "releaseChannel";
  @javax.annotation.Nullable
  private String releaseChannel;

  public OttbotReleaseView() {
  }

  public OttbotReleaseView id(@javax.annotation.Nullable String id) {
    
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setId(@javax.annotation.Nullable String id) {
    this.id = id;
  }


  public OttbotReleaseView name(@javax.annotation.Nullable String name) {
    
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(@javax.annotation.Nullable String name) {
    this.name = name;
  }


  public OttbotReleaseView description(@javax.annotation.Nullable String description) {
    
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(@javax.annotation.Nullable String description) {
    this.description = description;
  }


  public OttbotReleaseView version(@javax.annotation.Nullable String version) {
    
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(@javax.annotation.Nullable String version) {
    this.version = version;
  }


  public OttbotReleaseView service(@javax.annotation.Nullable ServiceEnum service) {
    
    this.service = service;
    return this;
  }

  /**
   * Get service
   * @return service
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ServiceEnum getService() {
    return service;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setService(@javax.annotation.Nullable ServiceEnum service) {
    this.service = service;
  }


  public OttbotReleaseView downloadUrl(@javax.annotation.Nullable String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

  /**
   * Get downloadUrl
   * @return downloadUrl
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDownloadUrl() {
    return downloadUrl;
  }


  @JsonProperty(JSON_PROPERTY_DOWNLOAD_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDownloadUrl(@javax.annotation.Nullable String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public OttbotReleaseView releaseChannel(@javax.annotation.Nullable String releaseChannel) {
    
    this.releaseChannel = releaseChannel;
    return this;
  }

  /**
   * Get releaseChannel
   * @return releaseChannel
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getReleaseChannel() {
    return releaseChannel;
  }


  @JsonProperty(JSON_PROPERTY_RELEASE_CHANNEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReleaseChannel(@javax.annotation.Nullable String releaseChannel) {
    this.releaseChannel = releaseChannel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OttbotReleaseView ottbotReleaseView = (OttbotReleaseView) o;
    return Objects.equals(this.id, ottbotReleaseView.id) &&
        Objects.equals(this.name, ottbotReleaseView.name) &&
        Objects.equals(this.description, ottbotReleaseView.description) &&
        Objects.equals(this.version, ottbotReleaseView.version) &&
        Objects.equals(this.service, ottbotReleaseView.service) &&
        Objects.equals(this.downloadUrl, ottbotReleaseView.downloadUrl) &&
        Objects.equals(this.releaseChannel, ottbotReleaseView.releaseChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, version, service, downloadUrl, releaseChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OttbotReleaseView {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    releaseChannel: ").append(toIndentedString(releaseChannel)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

