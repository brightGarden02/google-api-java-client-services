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

package com.google.api.services.redis.v1beta1.model;

/**
 * A cluster instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Memorystore for Redis API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Cluster extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The authorization mode of the Redis cluster. If not provided, auth feature is
   * disabled for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authorizationMode;

  /**
   * Output only. The timestamp associated with the cluster creation request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Optional. The delete operation will fail when the value is set to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deletionProtectionEnabled;

  /**
   * Output only. Endpoints created on each given network, for Redis clients to connect to the
   * cluster. Currently only one discovery endpoint is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DiscoveryEndpoint> discoveryEndpoints;

  /**
   * Required. Unique name of the resource in this scope including project and location using the
   * form: `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. The type of a redis node in the cluster. NodeType determines the underlying machine-
   * type of a redis node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodeType;

  /**
   * Optional. Persistence config (RDB, AOF) for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ClusterPersistenceConfig persistenceConfig;

  /**
   * Output only. Precise value of redis memory size in GB for the entire cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double preciseSizeGb;

  /**
   * Required. Each PscConfig configures the consumer network where IPs will be designated to the
   * cluster for client access through Private Service Connect Automation. Currently, only one
   * PscConfig is supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PscConfig> pscConfigs;

  /**
   * Output only. PSC connections for discovery of the cluster topology and accessing the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PscConnection> pscConnections;

  /**
   * Optional. Key/Value pairs of customer overrides for mutable Redis Configs
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> redisConfigs;

  /**
   * Optional. The number of replica nodes per shard.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer replicaCount;

  /**
   * Required. Number of shards for the Redis cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer shardCount;

  /**
   * Output only. Redis memory size in GB for the entire cluster rounded up to the next integer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer sizeGb;

  /**
   * Output only. The current state of this cluster. Can be CREATING, READY, UPDATING, DELETING and
   * SUSPENDED
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Additional information about the current state of the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private StateInfo stateInfo;

  /**
   * Optional. The in-transit encryption for the Redis cluster. If not provided, encryption is
   * disabled for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transitEncryptionMode;

  /**
   * Output only. System assigned, unique identifier for the cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Optional. The authorization mode of the Redis cluster. If not provided, auth feature is
   * disabled for the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthorizationMode() {
    return authorizationMode;
  }

  /**
   * Optional. The authorization mode of the Redis cluster. If not provided, auth feature is
   * disabled for the cluster.
   * @param authorizationMode authorizationMode or {@code null} for none
   */
  public Cluster setAuthorizationMode(java.lang.String authorizationMode) {
    this.authorizationMode = authorizationMode;
    return this;
  }

  /**
   * Output only. The timestamp associated with the cluster creation request.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The timestamp associated with the cluster creation request.
   * @param createTime createTime or {@code null} for none
   */
  public Cluster setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Optional. The delete operation will fail when the value is set to true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeletionProtectionEnabled() {
    return deletionProtectionEnabled;
  }

  /**
   * Optional. The delete operation will fail when the value is set to true.
   * @param deletionProtectionEnabled deletionProtectionEnabled or {@code null} for none
   */
  public Cluster setDeletionProtectionEnabled(java.lang.Boolean deletionProtectionEnabled) {
    this.deletionProtectionEnabled = deletionProtectionEnabled;
    return this;
  }

  /**
   * Output only. Endpoints created on each given network, for Redis clients to connect to the
   * cluster. Currently only one discovery endpoint is supported.
   * @return value or {@code null} for none
   */
  public java.util.List<DiscoveryEndpoint> getDiscoveryEndpoints() {
    return discoveryEndpoints;
  }

  /**
   * Output only. Endpoints created on each given network, for Redis clients to connect to the
   * cluster. Currently only one discovery endpoint is supported.
   * @param discoveryEndpoints discoveryEndpoints or {@code null} for none
   */
  public Cluster setDiscoveryEndpoints(java.util.List<DiscoveryEndpoint> discoveryEndpoints) {
    this.discoveryEndpoints = discoveryEndpoints;
    return this;
  }

  /**
   * Required. Unique name of the resource in this scope including project and location using the
   * form: `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Unique name of the resource in this scope including project and location using the
   * form: `projects/{project_id}/locations/{location_id}/clusters/{cluster_id}`
   * @param name name or {@code null} for none
   */
  public Cluster setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Optional. The type of a redis node in the cluster. NodeType determines the underlying machine-
   * type of a redis node.
   * @return value or {@code null} for none
   */
  public java.lang.String getNodeType() {
    return nodeType;
  }

  /**
   * Optional. The type of a redis node in the cluster. NodeType determines the underlying machine-
   * type of a redis node.
   * @param nodeType nodeType or {@code null} for none
   */
  public Cluster setNodeType(java.lang.String nodeType) {
    this.nodeType = nodeType;
    return this;
  }

  /**
   * Optional. Persistence config (RDB, AOF) for the cluster.
   * @return value or {@code null} for none
   */
  public ClusterPersistenceConfig getPersistenceConfig() {
    return persistenceConfig;
  }

  /**
   * Optional. Persistence config (RDB, AOF) for the cluster.
   * @param persistenceConfig persistenceConfig or {@code null} for none
   */
  public Cluster setPersistenceConfig(ClusterPersistenceConfig persistenceConfig) {
    this.persistenceConfig = persistenceConfig;
    return this;
  }

  /**
   * Output only. Precise value of redis memory size in GB for the entire cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Double getPreciseSizeGb() {
    return preciseSizeGb;
  }

  /**
   * Output only. Precise value of redis memory size in GB for the entire cluster.
   * @param preciseSizeGb preciseSizeGb or {@code null} for none
   */
  public Cluster setPreciseSizeGb(java.lang.Double preciseSizeGb) {
    this.preciseSizeGb = preciseSizeGb;
    return this;
  }

  /**
   * Required. Each PscConfig configures the consumer network where IPs will be designated to the
   * cluster for client access through Private Service Connect Automation. Currently, only one
   * PscConfig is supported.
   * @return value or {@code null} for none
   */
  public java.util.List<PscConfig> getPscConfigs() {
    return pscConfigs;
  }

  /**
   * Required. Each PscConfig configures the consumer network where IPs will be designated to the
   * cluster for client access through Private Service Connect Automation. Currently, only one
   * PscConfig is supported.
   * @param pscConfigs pscConfigs or {@code null} for none
   */
  public Cluster setPscConfigs(java.util.List<PscConfig> pscConfigs) {
    this.pscConfigs = pscConfigs;
    return this;
  }

  /**
   * Output only. PSC connections for discovery of the cluster topology and accessing the cluster.
   * @return value or {@code null} for none
   */
  public java.util.List<PscConnection> getPscConnections() {
    return pscConnections;
  }

  /**
   * Output only. PSC connections for discovery of the cluster topology and accessing the cluster.
   * @param pscConnections pscConnections or {@code null} for none
   */
  public Cluster setPscConnections(java.util.List<PscConnection> pscConnections) {
    this.pscConnections = pscConnections;
    return this;
  }

  /**
   * Optional. Key/Value pairs of customer overrides for mutable Redis Configs
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getRedisConfigs() {
    return redisConfigs;
  }

  /**
   * Optional. Key/Value pairs of customer overrides for mutable Redis Configs
   * @param redisConfigs redisConfigs or {@code null} for none
   */
  public Cluster setRedisConfigs(java.util.Map<String, java.lang.String> redisConfigs) {
    this.redisConfigs = redisConfigs;
    return this;
  }

  /**
   * Optional. The number of replica nodes per shard.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getReplicaCount() {
    return replicaCount;
  }

  /**
   * Optional. The number of replica nodes per shard.
   * @param replicaCount replicaCount or {@code null} for none
   */
  public Cluster setReplicaCount(java.lang.Integer replicaCount) {
    this.replicaCount = replicaCount;
    return this;
  }

  /**
   * Required. Number of shards for the Redis cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getShardCount() {
    return shardCount;
  }

  /**
   * Required. Number of shards for the Redis cluster.
   * @param shardCount shardCount or {@code null} for none
   */
  public Cluster setShardCount(java.lang.Integer shardCount) {
    this.shardCount = shardCount;
    return this;
  }

  /**
   * Output only. Redis memory size in GB for the entire cluster rounded up to the next integer.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSizeGb() {
    return sizeGb;
  }

  /**
   * Output only. Redis memory size in GB for the entire cluster rounded up to the next integer.
   * @param sizeGb sizeGb or {@code null} for none
   */
  public Cluster setSizeGb(java.lang.Integer sizeGb) {
    this.sizeGb = sizeGb;
    return this;
  }

  /**
   * Output only. The current state of this cluster. Can be CREATING, READY, UPDATING, DELETING and
   * SUSPENDED
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of this cluster. Can be CREATING, READY, UPDATING, DELETING and
   * SUSPENDED
   * @param state state or {@code null} for none
   */
  public Cluster setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Additional information about the current state of the cluster.
   * @return value or {@code null} for none
   */
  public StateInfo getStateInfo() {
    return stateInfo;
  }

  /**
   * Output only. Additional information about the current state of the cluster.
   * @param stateInfo stateInfo or {@code null} for none
   */
  public Cluster setStateInfo(StateInfo stateInfo) {
    this.stateInfo = stateInfo;
    return this;
  }

  /**
   * Optional. The in-transit encryption for the Redis cluster. If not provided, encryption is
   * disabled for the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getTransitEncryptionMode() {
    return transitEncryptionMode;
  }

  /**
   * Optional. The in-transit encryption for the Redis cluster. If not provided, encryption is
   * disabled for the cluster.
   * @param transitEncryptionMode transitEncryptionMode or {@code null} for none
   */
  public Cluster setTransitEncryptionMode(java.lang.String transitEncryptionMode) {
    this.transitEncryptionMode = transitEncryptionMode;
    return this;
  }

  /**
   * Output only. System assigned, unique identifier for the cluster.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Output only. System assigned, unique identifier for the cluster.
   * @param uid uid or {@code null} for none
   */
  public Cluster setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  @Override
  public Cluster set(String fieldName, Object value) {
    return (Cluster) super.set(fieldName, value);
  }

  @Override
  public Cluster clone() {
    return (Cluster) super.clone();
  }

}
