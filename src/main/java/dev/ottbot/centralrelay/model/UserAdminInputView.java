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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UserAdminInputView
 */
@JsonPropertyOrder({
  UserAdminInputView.JSON_PROPERTY_USERNAME,
  UserAdminInputView.JSON_PROPERTY_PASSWORD,
  UserAdminInputView.JSON_PROPERTY_DISPLAY_NAME,
  UserAdminInputView.JSON_PROPERTY_ROLES,
  UserAdminInputView.JSON_PROPERTY_ENABLED
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2025-05-22T15:30:33.297029192Z[Etc/UTC]", comments = "Generator version: 7.10.0")
public class UserAdminInputView {
  public static final String JSON_PROPERTY_USERNAME = "username";
  @javax.annotation.Nullable
  private String username;

  public static final String JSON_PROPERTY_PASSWORD = "password";
  @javax.annotation.Nullable
  private String password;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  @javax.annotation.Nullable
  private String displayName;

  /**
   * Gets or Sets roles
   */
  public enum RolesEnum {
    ADMIN(String.valueOf("ADMIN")),
    
    USER(String.valueOf("USER"));

    private String value;

    RolesEnum(String value) {
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
    public static RolesEnum fromValue(String value) {
      for (RolesEnum b : RolesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ROLES = "roles";
  @javax.annotation.Nullable
  private List<RolesEnum> roles = new ArrayList<>();

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  @javax.annotation.Nullable
  private Boolean enabled;

  public UserAdminInputView() {
  }

  public UserAdminInputView username(@javax.annotation.Nullable String username) {
    
    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUsername() {
    return username;
  }


  @JsonProperty(JSON_PROPERTY_USERNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUsername(@javax.annotation.Nullable String username) {
    this.username = username;
  }


  public UserAdminInputView password(@javax.annotation.Nullable String password) {
    
    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPassword() {
    return password;
  }


  @JsonProperty(JSON_PROPERTY_PASSWORD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPassword(@javax.annotation.Nullable String password) {
    this.password = password;
  }


  public UserAdminInputView displayName(@javax.annotation.Nullable String displayName) {
    
    this.displayName = displayName;
    return this;
  }

  /**
   * Get displayName
   * @return displayName
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDisplayName(@javax.annotation.Nullable String displayName) {
    this.displayName = displayName;
  }


  public UserAdminInputView roles(@javax.annotation.Nullable List<RolesEnum> roles) {
    
    this.roles = roles;
    return this;
  }

  public UserAdminInputView addRolesItem(RolesEnum rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<>();
    }
    this.roles.add(rolesItem);
    return this;
  }

  /**
   * Get roles
   * @return roles
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<RolesEnum> getRoles() {
    return roles;
  }


  @JsonProperty(JSON_PROPERTY_ROLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRoles(@javax.annotation.Nullable List<RolesEnum> roles) {
    this.roles = roles;
  }


  public UserAdminInputView enabled(@javax.annotation.Nullable Boolean enabled) {
    
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getEnabled() {
    return enabled;
  }


  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEnabled(@javax.annotation.Nullable Boolean enabled) {
    this.enabled = enabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAdminInputView userAdminInputView = (UserAdminInputView) o;
    return Objects.equals(this.username, userAdminInputView.username) &&
        Objects.equals(this.password, userAdminInputView.password) &&
        Objects.equals(this.displayName, userAdminInputView.displayName) &&
        Objects.equals(this.roles, userAdminInputView.roles) &&
        Objects.equals(this.enabled, userAdminInputView.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, displayName, roles, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAdminInputView {\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

