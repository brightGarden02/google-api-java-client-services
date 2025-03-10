/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.spanner.v1.model;

/**
 * A possible configuration for a Cloud Spanner instance. Configurations define the geographic
 * placement of nodes and their replication.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InstanceConfig extends com.google.api.client.json.GenericJson {

  /**
   * Base configuration name, e.g. projects//instanceConfigs/nam3, based on which this configuration
   * is created. Only set for user managed configurations. `base_config` must refer to a
   * configuration of type GOOGLE_MANAGED in the same project as this configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String baseConfig;

  /**
   * Output only. Whether this instance config is a Google or User Managed Configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String configType;

  /**
   * The name of this instance configuration as it appears in UIs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * etag is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a instance config from overwriting each other. It is strongly suggested that systems make
   * use of the etag in the read-modify-write cycle to perform instance config updates in order to
   * avoid race conditions: An etag is returned in the response which contains instance configs, and
   * systems are expected to put that etag in the request to update instance config to ensure that
   * their change will be applied to the same version of the instance config. If no etag is provided
   * in the call to update instance config, then the existing instance config is overwritten
   * blindly.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Output only. Describes whether free instances are available to be created in this instance
   * config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String freeInstanceAvailability;

  /**
   * Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into
   * groups that reflect a customer's organizational needs and deployment strategies. Cloud Labels
   * can be used to filter collections of resources. They can be used to control how resource
   * metrics are aggregated. And they can be used as arguments to policy management rules (e.g.
   * route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long
   * and must conform to the following regular expression: `a-z{0,62}`. * Label values must be
   * between 0 and 63 characters long and must conform to the regular expression `[a-z0-9_-]{0,63}`.
   * * No more than 64 labels can be associated with a given resource. See https://goo.gl/xmQnxf for
   * more information on and examples of labels. If you plan to use labels in your own code, please
   * note that additional characters may be allowed in the future. Therefore, you are advised to use
   * an internal label representation, such as JSON, which doesn't rely upon specific characters
   * being disallowed. For example, representing labels as the string: name + "_" + value would
   * prove problematic if we were to allow "_" in a future release.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Allowed values of the "default_leader" schema option for databases in instances that use this
   * instance configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> leaderOptions;

  /**
   * A unique identifier for the instance configuration. Values are of the form
   * `projects//instanceConfigs/a-z*`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The available optional replicas to choose from for user managed configurations.
   * Populated for Google managed configurations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ReplicaInfo> optionalReplicas;

  /**
   * Output only. The `QuorumType` of the instance configuration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String quorumType;

  /**
   * Output only. If true, the instance config is being created or updated. If false, there are no
   * ongoing operations for the instance config.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean reconciling;

  /**
   * The geographic placement of nodes in this instance configuration and their replication
   * properties.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ReplicaInfo> replicas;

  /**
   * Output only. The current instance config state. Applicable only for USER_MANAGED configs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The storage limit in bytes per processing unit.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long storageLimitPerProcessingUnit;

  /**
   * Base configuration name, e.g. projects//instanceConfigs/nam3, based on which this configuration
   * is created. Only set for user managed configurations. `base_config` must refer to a
   * configuration of type GOOGLE_MANAGED in the same project as this configuration.
   * @return value or {@code null} for none
   */
  public java.lang.String getBaseConfig() {
    return baseConfig;
  }

  /**
   * Base configuration name, e.g. projects//instanceConfigs/nam3, based on which this configuration
   * is created. Only set for user managed configurations. `base_config` must refer to a
   * configuration of type GOOGLE_MANAGED in the same project as this configuration.
   * @param baseConfig baseConfig or {@code null} for none
   */
  public InstanceConfig setBaseConfig(java.lang.String baseConfig) {
    this.baseConfig = baseConfig;
    return this;
  }

  /**
   * Output only. Whether this instance config is a Google or User Managed Configuration.
   * @return value or {@code null} for none
   */
  public java.lang.String getConfigType() {
    return configType;
  }

  /**
   * Output only. Whether this instance config is a Google or User Managed Configuration.
   * @param configType configType or {@code null} for none
   */
  public InstanceConfig setConfigType(java.lang.String configType) {
    this.configType = configType;
    return this;
  }

  /**
   * The name of this instance configuration as it appears in UIs.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The name of this instance configuration as it appears in UIs.
   * @param displayName displayName or {@code null} for none
   */
  public InstanceConfig setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * etag is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a instance config from overwriting each other. It is strongly suggested that systems make
   * use of the etag in the read-modify-write cycle to perform instance config updates in order to
   * avoid race conditions: An etag is returned in the response which contains instance configs, and
   * systems are expected to put that etag in the request to update instance config to ensure that
   * their change will be applied to the same version of the instance config. If no etag is provided
   * in the call to update instance config, then the existing instance config is overwritten
   * blindly.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * etag is used for optimistic concurrency control as a way to help prevent simultaneous updates
   * of a instance config from overwriting each other. It is strongly suggested that systems make
   * use of the etag in the read-modify-write cycle to perform instance config updates in order to
   * avoid race conditions: An etag is returned in the response which contains instance configs, and
   * systems are expected to put that etag in the request to update instance config to ensure that
   * their change will be applied to the same version of the instance config. If no etag is provided
   * in the call to update instance config, then the existing instance config is overwritten
   * blindly.
   * @param etag etag or {@code null} for none
   */
  public InstanceConfig setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Output only. Describes whether free instances are available to be created in this instance
   * config.
   * @return value or {@code null} for none
   */
  public java.lang.String getFreeInstanceAvailability() {
    return freeInstanceAvailability;
  }

  /**
   * Output only. Describes whether free instances are available to be created in this instance
   * config.
   * @param freeInstanceAvailability freeInstanceAvailability or {@code null} for none
   */
  public InstanceConfig setFreeInstanceAvailability(java.lang.String freeInstanceAvailability) {
    this.freeInstanceAvailability = freeInstanceAvailability;
    return this;
  }

  /**
   * Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into
   * groups that reflect a customer's organizational needs and deployment strategies. Cloud Labels
   * can be used to filter collections of resources. They can be used to control how resource
   * metrics are aggregated. And they can be used as arguments to policy management rules (e.g.
   * route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long
   * and must conform to the following regular expression: `a-z{0,62}`. * Label values must be
   * between 0 and 63 characters long and must conform to the regular expression `[a-z0-9_-]{0,63}`.
   * * No more than 64 labels can be associated with a given resource. See https://goo.gl/xmQnxf for
   * more information on and examples of labels. If you plan to use labels in your own code, please
   * note that additional characters may be allowed in the future. Therefore, you are advised to use
   * an internal label representation, such as JSON, which doesn't rely upon specific characters
   * being disallowed. For example, representing labels as the string: name + "_" + value would
   * prove problematic if we were to allow "_" in a future release.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into
   * groups that reflect a customer's organizational needs and deployment strategies. Cloud Labels
   * can be used to filter collections of resources. They can be used to control how resource
   * metrics are aggregated. And they can be used as arguments to policy management rules (e.g.
   * route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long
   * and must conform to the following regular expression: `a-z{0,62}`. * Label values must be
   * between 0 and 63 characters long and must conform to the regular expression `[a-z0-9_-]{0,63}`.
   * * No more than 64 labels can be associated with a given resource. See https://goo.gl/xmQnxf for
   * more information on and examples of labels. If you plan to use labels in your own code, please
   * note that additional characters may be allowed in the future. Therefore, you are advised to use
   * an internal label representation, such as JSON, which doesn't rely upon specific characters
   * being disallowed. For example, representing labels as the string: name + "_" + value would
   * prove problematic if we were to allow "_" in a future release.
   * @param labels labels or {@code null} for none
   */
  public InstanceConfig setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Allowed values of the "default_leader" schema option for databases in instances that use this
   * instance configuration.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getLeaderOptions() {
    return leaderOptions;
  }

  /**
   * Allowed values of the "default_leader" schema option for databases in instances that use this
   * instance configuration.
   * @param leaderOptions leaderOptions or {@code null} for none
   */
  public InstanceConfig setLeaderOptions(java.util.List<java.lang.String> leaderOptions) {
    this.leaderOptions = leaderOptions;
    return this;
  }

  /**
   * A unique identifier for the instance configuration. Values are of the form
   * `projects//instanceConfigs/a-z*`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * A unique identifier for the instance configuration. Values are of the form
   * `projects//instanceConfigs/a-z*`.
   * @param name name or {@code null} for none
   */
  public InstanceConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The available optional replicas to choose from for user managed configurations.
   * Populated for Google managed configurations.
   * @return value or {@code null} for none
   */
  public java.util.List<ReplicaInfo> getOptionalReplicas() {
    return optionalReplicas;
  }

  /**
   * Output only. The available optional replicas to choose from for user managed configurations.
   * Populated for Google managed configurations.
   * @param optionalReplicas optionalReplicas or {@code null} for none
   */
  public InstanceConfig setOptionalReplicas(java.util.List<ReplicaInfo> optionalReplicas) {
    this.optionalReplicas = optionalReplicas;
    return this;
  }

  /**
   * Output only. The `QuorumType` of the instance configuration.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuorumType() {
    return quorumType;
  }

  /**
   * Output only. The `QuorumType` of the instance configuration.
   * @param quorumType quorumType or {@code null} for none
   */
  public InstanceConfig setQuorumType(java.lang.String quorumType) {
    this.quorumType = quorumType;
    return this;
  }

  /**
   * Output only. If true, the instance config is being created or updated. If false, there are no
   * ongoing operations for the instance config.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReconciling() {
    return reconciling;
  }

  /**
   * Output only. If true, the instance config is being created or updated. If false, there are no
   * ongoing operations for the instance config.
   * @param reconciling reconciling or {@code null} for none
   */
  public InstanceConfig setReconciling(java.lang.Boolean reconciling) {
    this.reconciling = reconciling;
    return this;
  }

  /**
   * The geographic placement of nodes in this instance configuration and their replication
   * properties.
   * @return value or {@code null} for none
   */
  public java.util.List<ReplicaInfo> getReplicas() {
    return replicas;
  }

  /**
   * The geographic placement of nodes in this instance configuration and their replication
   * properties.
   * @param replicas replicas or {@code null} for none
   */
  public InstanceConfig setReplicas(java.util.List<ReplicaInfo> replicas) {
    this.replicas = replicas;
    return this;
  }

  /**
   * Output only. The current instance config state. Applicable only for USER_MANAGED configs.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current instance config state. Applicable only for USER_MANAGED configs.
   * @param state state or {@code null} for none
   */
  public InstanceConfig setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The storage limit in bytes per processing unit.
   * @return value or {@code null} for none
   */
  public java.lang.Long getStorageLimitPerProcessingUnit() {
    return storageLimitPerProcessingUnit;
  }

  /**
   * Output only. The storage limit in bytes per processing unit.
   * @param storageLimitPerProcessingUnit storageLimitPerProcessingUnit or {@code null} for none
   */
  public InstanceConfig setStorageLimitPerProcessingUnit(java.lang.Long storageLimitPerProcessingUnit) {
    this.storageLimitPerProcessingUnit = storageLimitPerProcessingUnit;
    return this;
  }

  @Override
  public InstanceConfig set(String fieldName, Object value) {
    return (InstanceConfig) super.set(fieldName, value);
  }

  @Override
  public InstanceConfig clone() {
    return (InstanceConfig) super.clone();
  }

}
