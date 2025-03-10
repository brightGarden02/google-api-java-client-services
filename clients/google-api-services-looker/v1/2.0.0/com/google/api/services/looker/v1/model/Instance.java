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

package com.google.api.services.looker.v1.model;

/**
 * A Looker instance. LINT.IfChange
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Looker (Google Cloud core) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Instance extends com.google.api.client.json.GenericJson {

  /**
   * Looker Instance Admin settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AdminSettings adminSettings;

  /**
   * Network name in the consumer project. Format: `projects/{project}/global/networks/{network}`.
   * Note that the consumer network may be in a different GCP project than the consumer project that
   * is hosting the Looker Instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String consumerNetwork;

  /**
   * Output only. The time when the Looker instance provisioning was first requested.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CustomDomain customDomain;

  /**
   * Maintenance denial period for this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DenyMaintenancePeriod denyMaintenancePeriod;

  /**
   * Output only. Public Egress IP (IPv4).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String egressPublicIp;

  /**
   * Encryption configuration (CMEK). Only set if CMEK has been enabled on the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EncryptionConfig encryptionConfig;

  /**
   * Output only. Private Ingress IP (IPv4).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ingressPrivateIp;

  /**
   * Output only. Public Ingress IP (IPv4).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String ingressPublicIp;

  /**
   * Output only. Last computed maintenance denial period for this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DenyMaintenancePeriod lastDenyMaintenancePeriod;

  /**
   * Optional. Linked Google Cloud Project Number for Looker Studio Pro.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long linkedLspProjectNumber;

  /**
   * Output only. Looker instance URI which can be used to access the Looker Instance UI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lookerUri;

  /**
   * Output only. The Looker version that the instance is using.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String lookerVersion;

  /**
   * Maintenance schedule for this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MaintenanceSchedule maintenanceSchedule;

  /**
   * Maintenance window for this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MaintenanceWindow maintenanceWindow;

  /**
   * Output only. Format: `projects/{project}/locations/{location}/instances/{instance}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Looker instance OAuth login settings.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private OAuthConfig oauthConfig;

  /**
   * Platform edition.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String platformEdition;

  /**
   * Whether private IP is enabled on the Looker instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean privateIpEnabled;

  /**
   * Whether public IP is enabled on the Looker instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean publicIpEnabled;

  /**
   * Name of a reserved IP address range within the Instance.consumer_network, to be used for
   * private services access connection. May or may not be specified in a create request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reservedRange;

  /**
   * Output only. The state of the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The time when the Looker instance was last updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * User metadata.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private UserMetadata userMetadata;

  /**
   * Looker Instance Admin settings.
   * @return value or {@code null} for none
   */
  public AdminSettings getAdminSettings() {
    return adminSettings;
  }

  /**
   * Looker Instance Admin settings.
   * @param adminSettings adminSettings or {@code null} for none
   */
  public Instance setAdminSettings(AdminSettings adminSettings) {
    this.adminSettings = adminSettings;
    return this;
  }

  /**
   * Network name in the consumer project. Format: `projects/{project}/global/networks/{network}`.
   * Note that the consumer network may be in a different GCP project than the consumer project that
   * is hosting the Looker Instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getConsumerNetwork() {
    return consumerNetwork;
  }

  /**
   * Network name in the consumer project. Format: `projects/{project}/global/networks/{network}`.
   * Note that the consumer network may be in a different GCP project than the consumer project that
   * is hosting the Looker Instance.
   * @param consumerNetwork consumerNetwork or {@code null} for none
   */
  public Instance setConsumerNetwork(java.lang.String consumerNetwork) {
    this.consumerNetwork = consumerNetwork;
    return this;
  }

  /**
   * Output only. The time when the Looker instance provisioning was first requested.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time when the Looker instance provisioning was first requested.
   * @param createTime createTime or {@code null} for none
   */
  public Instance setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public CustomDomain getCustomDomain() {
    return customDomain;
  }

  /**
   * @param customDomain customDomain or {@code null} for none
   */
  public Instance setCustomDomain(CustomDomain customDomain) {
    this.customDomain = customDomain;
    return this;
  }

  /**
   * Maintenance denial period for this instance.
   * @return value or {@code null} for none
   */
  public DenyMaintenancePeriod getDenyMaintenancePeriod() {
    return denyMaintenancePeriod;
  }

  /**
   * Maintenance denial period for this instance.
   * @param denyMaintenancePeriod denyMaintenancePeriod or {@code null} for none
   */
  public Instance setDenyMaintenancePeriod(DenyMaintenancePeriod denyMaintenancePeriod) {
    this.denyMaintenancePeriod = denyMaintenancePeriod;
    return this;
  }

  /**
   * Output only. Public Egress IP (IPv4).
   * @return value or {@code null} for none
   */
  public java.lang.String getEgressPublicIp() {
    return egressPublicIp;
  }

  /**
   * Output only. Public Egress IP (IPv4).
   * @param egressPublicIp egressPublicIp or {@code null} for none
   */
  public Instance setEgressPublicIp(java.lang.String egressPublicIp) {
    this.egressPublicIp = egressPublicIp;
    return this;
  }

  /**
   * Encryption configuration (CMEK). Only set if CMEK has been enabled on the instance.
   * @return value or {@code null} for none
   */
  public EncryptionConfig getEncryptionConfig() {
    return encryptionConfig;
  }

  /**
   * Encryption configuration (CMEK). Only set if CMEK has been enabled on the instance.
   * @param encryptionConfig encryptionConfig or {@code null} for none
   */
  public Instance setEncryptionConfig(EncryptionConfig encryptionConfig) {
    this.encryptionConfig = encryptionConfig;
    return this;
  }

  /**
   * Output only. Private Ingress IP (IPv4).
   * @return value or {@code null} for none
   */
  public java.lang.String getIngressPrivateIp() {
    return ingressPrivateIp;
  }

  /**
   * Output only. Private Ingress IP (IPv4).
   * @param ingressPrivateIp ingressPrivateIp or {@code null} for none
   */
  public Instance setIngressPrivateIp(java.lang.String ingressPrivateIp) {
    this.ingressPrivateIp = ingressPrivateIp;
    return this;
  }

  /**
   * Output only. Public Ingress IP (IPv4).
   * @return value or {@code null} for none
   */
  public java.lang.String getIngressPublicIp() {
    return ingressPublicIp;
  }

  /**
   * Output only. Public Ingress IP (IPv4).
   * @param ingressPublicIp ingressPublicIp or {@code null} for none
   */
  public Instance setIngressPublicIp(java.lang.String ingressPublicIp) {
    this.ingressPublicIp = ingressPublicIp;
    return this;
  }

  /**
   * Output only. Last computed maintenance denial period for this instance.
   * @return value or {@code null} for none
   */
  public DenyMaintenancePeriod getLastDenyMaintenancePeriod() {
    return lastDenyMaintenancePeriod;
  }

  /**
   * Output only. Last computed maintenance denial period for this instance.
   * @param lastDenyMaintenancePeriod lastDenyMaintenancePeriod or {@code null} for none
   */
  public Instance setLastDenyMaintenancePeriod(DenyMaintenancePeriod lastDenyMaintenancePeriod) {
    this.lastDenyMaintenancePeriod = lastDenyMaintenancePeriod;
    return this;
  }

  /**
   * Optional. Linked Google Cloud Project Number for Looker Studio Pro.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLinkedLspProjectNumber() {
    return linkedLspProjectNumber;
  }

  /**
   * Optional. Linked Google Cloud Project Number for Looker Studio Pro.
   * @param linkedLspProjectNumber linkedLspProjectNumber or {@code null} for none
   */
  public Instance setLinkedLspProjectNumber(java.lang.Long linkedLspProjectNumber) {
    this.linkedLspProjectNumber = linkedLspProjectNumber;
    return this;
  }

  /**
   * Output only. Looker instance URI which can be used to access the Looker Instance UI.
   * @return value or {@code null} for none
   */
  public java.lang.String getLookerUri() {
    return lookerUri;
  }

  /**
   * Output only. Looker instance URI which can be used to access the Looker Instance UI.
   * @param lookerUri lookerUri or {@code null} for none
   */
  public Instance setLookerUri(java.lang.String lookerUri) {
    this.lookerUri = lookerUri;
    return this;
  }

  /**
   * Output only. The Looker version that the instance is using.
   * @return value or {@code null} for none
   */
  public java.lang.String getLookerVersion() {
    return lookerVersion;
  }

  /**
   * Output only. The Looker version that the instance is using.
   * @param lookerVersion lookerVersion or {@code null} for none
   */
  public Instance setLookerVersion(java.lang.String lookerVersion) {
    this.lookerVersion = lookerVersion;
    return this;
  }

  /**
   * Maintenance schedule for this instance.
   * @return value or {@code null} for none
   */
  public MaintenanceSchedule getMaintenanceSchedule() {
    return maintenanceSchedule;
  }

  /**
   * Maintenance schedule for this instance.
   * @param maintenanceSchedule maintenanceSchedule or {@code null} for none
   */
  public Instance setMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule) {
    this.maintenanceSchedule = maintenanceSchedule;
    return this;
  }

  /**
   * Maintenance window for this instance.
   * @return value or {@code null} for none
   */
  public MaintenanceWindow getMaintenanceWindow() {
    return maintenanceWindow;
  }

  /**
   * Maintenance window for this instance.
   * @param maintenanceWindow maintenanceWindow or {@code null} for none
   */
  public Instance setMaintenanceWindow(MaintenanceWindow maintenanceWindow) {
    this.maintenanceWindow = maintenanceWindow;
    return this;
  }

  /**
   * Output only. Format: `projects/{project}/locations/{location}/instances/{instance}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Format: `projects/{project}/locations/{location}/instances/{instance}`.
   * @param name name or {@code null} for none
   */
  public Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Looker instance OAuth login settings.
   * @return value or {@code null} for none
   */
  public OAuthConfig getOauthConfig() {
    return oauthConfig;
  }

  /**
   * Looker instance OAuth login settings.
   * @param oauthConfig oauthConfig or {@code null} for none
   */
  public Instance setOauthConfig(OAuthConfig oauthConfig) {
    this.oauthConfig = oauthConfig;
    return this;
  }

  /**
   * Platform edition.
   * @return value or {@code null} for none
   */
  public java.lang.String getPlatformEdition() {
    return platformEdition;
  }

  /**
   * Platform edition.
   * @param platformEdition platformEdition or {@code null} for none
   */
  public Instance setPlatformEdition(java.lang.String platformEdition) {
    this.platformEdition = platformEdition;
    return this;
  }

  /**
   * Whether private IP is enabled on the Looker instance.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPrivateIpEnabled() {
    return privateIpEnabled;
  }

  /**
   * Whether private IP is enabled on the Looker instance.
   * @param privateIpEnabled privateIpEnabled or {@code null} for none
   */
  public Instance setPrivateIpEnabled(java.lang.Boolean privateIpEnabled) {
    this.privateIpEnabled = privateIpEnabled;
    return this;
  }

  /**
   * Whether public IP is enabled on the Looker instance.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getPublicIpEnabled() {
    return publicIpEnabled;
  }

  /**
   * Whether public IP is enabled on the Looker instance.
   * @param publicIpEnabled publicIpEnabled or {@code null} for none
   */
  public Instance setPublicIpEnabled(java.lang.Boolean publicIpEnabled) {
    this.publicIpEnabled = publicIpEnabled;
    return this;
  }

  /**
   * Name of a reserved IP address range within the Instance.consumer_network, to be used for
   * private services access connection. May or may not be specified in a create request.
   * @return value or {@code null} for none
   */
  public java.lang.String getReservedRange() {
    return reservedRange;
  }

  /**
   * Name of a reserved IP address range within the Instance.consumer_network, to be used for
   * private services access connection. May or may not be specified in a create request.
   * @param reservedRange reservedRange or {@code null} for none
   */
  public Instance setReservedRange(java.lang.String reservedRange) {
    this.reservedRange = reservedRange;
    return this;
  }

  /**
   * Output only. The state of the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the instance.
   * @param state state or {@code null} for none
   */
  public Instance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. The time when the Looker instance was last updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time when the Looker instance was last updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public Instance setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * User metadata.
   * @return value or {@code null} for none
   */
  public UserMetadata getUserMetadata() {
    return userMetadata;
  }

  /**
   * User metadata.
   * @param userMetadata userMetadata or {@code null} for none
   */
  public Instance setUserMetadata(UserMetadata userMetadata) {
    this.userMetadata = userMetadata;
    return this;
  }

  @Override
  public Instance set(String fieldName, Object value) {
    return (Instance) super.set(fieldName, value);
  }

  @Override
  public Instance clone() {
    return (Instance) super.clone();
  }

}
