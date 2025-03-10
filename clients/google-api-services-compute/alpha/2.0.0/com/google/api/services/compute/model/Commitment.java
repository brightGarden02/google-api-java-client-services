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

package com.google.api.services.compute.model;

/**
 * Represents a regional Commitment resource. Creating a commitment resource means that you are
 * purchasing a committed use contract with an explicit start and end time. You can create
 * commitments based on vCPUs and memory usage and receive discounted rates. For full details, read
 * Signing Up for Committed Use Discounts.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Commitment extends com.google.api.client.json.GenericJson {

  /**
   * Specifies whether to enable automatic renewal for the commitment. The default value is false if
   * not specified. The field can be updated until the day of the commitment expiration at 12:00am
   * PST. If the field is set to true, the commitment will be automatically renewed for either one
   * or three years according to the terms of the existing commitment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean autoRenew;

  /**
   * The category of the commitment. Category MACHINE specifies commitments composed of machine
   * resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments
   * composed of software licenses, listed in licenseResources. Note that only MACHINE commitments
   * should have a Type specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String category;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * [Output Only] Commitment end time in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endTimestamp;

  /**
   * Specifies the already existing reservations to attach to the Commitment. This field is
   * optional, and it can be a full or partial URL. For example, the following are valid URLs to an
   * reservation: - https://www.googleapis.com/compute/v1/projects/project/zones/zone
   * /reservations/reservation - projects/project/zones/zone/reservations/reservation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> existingReservations;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output Only] Type of the resource. Always compute#commitment for commitments.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The license specification required as part of a license commitment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LicenseResourceCommitment licenseResource;

  /**
   * List of source commitments to be merged into a new commitment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> mergeSourceCommitments;

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The plan for this commitment, which determines duration and discount rate. The currently
   * supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String plan;

  /**
   * [Output Only] URL of the region where this commitment may be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * List of create-on-create reservations for this commitment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Reservation> reservations;

  /**
   * [Output Only] Status information for Commitment resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CommitmentResourceStatus resourceStatus;

  /**
   * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource
   * commitments must occur together.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ResourceCommitment> resources;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLinkWithId;

  /**
   * Source commitment to be split into a new commitment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String splitSourceCommitment;

  /**
   * [Output Only] Commitment start time in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startTimestamp;

  /**
   * [Output Only] Status of the commitment with regards to eventual expiration (each commitment has
   * an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String status;

  /**
   * [Output Only] An optional, human-readable explanation of the status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * The type of commitment, which affects the discount rate and the eligible resources. Type
   * MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines. Type
   * ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to accelerator optimized
   * machines.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Specifies whether to enable automatic renewal for the commitment. The default value is false if
   * not specified. The field can be updated until the day of the commitment expiration at 12:00am
   * PST. If the field is set to true, the commitment will be automatically renewed for either one
   * or three years according to the terms of the existing commitment.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAutoRenew() {
    return autoRenew;
  }

  /**
   * Specifies whether to enable automatic renewal for the commitment. The default value is false if
   * not specified. The field can be updated until the day of the commitment expiration at 12:00am
   * PST. If the field is set to true, the commitment will be automatically renewed for either one
   * or three years according to the terms of the existing commitment.
   * @param autoRenew autoRenew or {@code null} for none
   */
  public Commitment setAutoRenew(java.lang.Boolean autoRenew) {
    this.autoRenew = autoRenew;
    return this;
  }

  /**
   * The category of the commitment. Category MACHINE specifies commitments composed of machine
   * resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments
   * composed of software licenses, listed in licenseResources. Note that only MACHINE commitments
   * should have a Type specified.
   * @return value or {@code null} for none
   */
  public java.lang.String getCategory() {
    return category;
  }

  /**
   * The category of the commitment. Category MACHINE specifies commitments composed of machine
   * resources such as VCPU or MEMORY, listed in resources. Category LICENSE specifies commitments
   * composed of software licenses, listed in licenseResources. Note that only MACHINE commitments
   * should have a Type specified.
   * @param category category or {@code null} for none
   */
  public Commitment setCategory(java.lang.String category) {
    this.category = category;
    return this;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public Commitment setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public Commitment setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * [Output Only] Commitment end time in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndTimestamp() {
    return endTimestamp;
  }

  /**
   * [Output Only] Commitment end time in RFC3339 text format.
   * @param endTimestamp endTimestamp or {@code null} for none
   */
  public Commitment setEndTimestamp(java.lang.String endTimestamp) {
    this.endTimestamp = endTimestamp;
    return this;
  }

  /**
   * Specifies the already existing reservations to attach to the Commitment. This field is
   * optional, and it can be a full or partial URL. For example, the following are valid URLs to an
   * reservation: - https://www.googleapis.com/compute/v1/projects/project/zones/zone
   * /reservations/reservation - projects/project/zones/zone/reservations/reservation
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getExistingReservations() {
    return existingReservations;
  }

  /**
   * Specifies the already existing reservations to attach to the Commitment. This field is
   * optional, and it can be a full or partial URL. For example, the following are valid URLs to an
   * reservation: - https://www.googleapis.com/compute/v1/projects/project/zones/zone
   * /reservations/reservation - projects/project/zones/zone/reservations/reservation
   * @param existingReservations existingReservations or {@code null} for none
   */
  public Commitment setExistingReservations(java.util.List<java.lang.String> existingReservations) {
    this.existingReservations = existingReservations;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public Commitment setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output Only] Type of the resource. Always compute#commitment for commitments.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of the resource. Always compute#commitment for commitments.
   * @param kind kind or {@code null} for none
   */
  public Commitment setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The license specification required as part of a license commitment.
   * @return value or {@code null} for none
   */
  public LicenseResourceCommitment getLicenseResource() {
    return licenseResource;
  }

  /**
   * The license specification required as part of a license commitment.
   * @param licenseResource licenseResource or {@code null} for none
   */
  public Commitment setLicenseResource(LicenseResourceCommitment licenseResource) {
    this.licenseResource = licenseResource;
    return this;
  }

  /**
   * List of source commitments to be merged into a new commitment.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getMergeSourceCommitments() {
    return mergeSourceCommitments;
  }

  /**
   * List of source commitments to be merged into a new commitment.
   * @param mergeSourceCommitments mergeSourceCommitments or {@code null} for none
   */
  public Commitment setMergeSourceCommitments(java.util.List<java.lang.String> mergeSourceCommitments) {
    this.mergeSourceCommitments = mergeSourceCommitments;
    return this;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. Provided by the client when the resource is created. The name must be
   * 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   * long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   * character must be a lowercase letter, and all following characters must be a dash, lowercase
   * letter, or digit, except the last character, which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public Commitment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The plan for this commitment, which determines duration and discount rate. The currently
   * supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
   * @return value or {@code null} for none
   */
  public java.lang.String getPlan() {
    return plan;
  }

  /**
   * The plan for this commitment, which determines duration and discount rate. The currently
   * supported plans are TWELVE_MONTH (1 year), and THIRTY_SIX_MONTH (3 years).
   * @param plan plan or {@code null} for none
   */
  public Commitment setPlan(java.lang.String plan) {
    this.plan = plan;
    return this;
  }

  /**
   * [Output Only] URL of the region where this commitment may be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where this commitment may be used.
   * @param region region or {@code null} for none
   */
  public Commitment setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * List of create-on-create reservations for this commitment.
   * @return value or {@code null} for none
   */
  public java.util.List<Reservation> getReservations() {
    return reservations;
  }

  /**
   * List of create-on-create reservations for this commitment.
   * @param reservations reservations or {@code null} for none
   */
  public Commitment setReservations(java.util.List<Reservation> reservations) {
    this.reservations = reservations;
    return this;
  }

  /**
   * [Output Only] Status information for Commitment resource.
   * @return value or {@code null} for none
   */
  public CommitmentResourceStatus getResourceStatus() {
    return resourceStatus;
  }

  /**
   * [Output Only] Status information for Commitment resource.
   * @param resourceStatus resourceStatus or {@code null} for none
   */
  public Commitment setResourceStatus(CommitmentResourceStatus resourceStatus) {
    this.resourceStatus = resourceStatus;
    return this;
  }

  /**
   * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource
   * commitments must occur together.
   * @return value or {@code null} for none
   */
  public java.util.List<ResourceCommitment> getResources() {
    return resources;
  }

  /**
   * A list of commitment amounts for particular resources. Note that VCPU and MEMORY resource
   * commitments must occur together.
   * @param resources resources or {@code null} for none
   */
  public Commitment setResources(java.util.List<ResourceCommitment> resources) {
    this.resources = resources;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public Commitment setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLinkWithId() {
    return selfLinkWithId;
  }

  /**
   * [Output Only] Server-defined URL for this resource with the resource id.
   * @param selfLinkWithId selfLinkWithId or {@code null} for none
   */
  public Commitment setSelfLinkWithId(java.lang.String selfLinkWithId) {
    this.selfLinkWithId = selfLinkWithId;
    return this;
  }

  /**
   * Source commitment to be split into a new commitment.
   * @return value or {@code null} for none
   */
  public java.lang.String getSplitSourceCommitment() {
    return splitSourceCommitment;
  }

  /**
   * Source commitment to be split into a new commitment.
   * @param splitSourceCommitment splitSourceCommitment or {@code null} for none
   */
  public Commitment setSplitSourceCommitment(java.lang.String splitSourceCommitment) {
    this.splitSourceCommitment = splitSourceCommitment;
    return this;
  }

  /**
   * [Output Only] Commitment start time in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartTimestamp() {
    return startTimestamp;
  }

  /**
   * [Output Only] Commitment start time in RFC3339 text format.
   * @param startTimestamp startTimestamp or {@code null} for none
   */
  public Commitment setStartTimestamp(java.lang.String startTimestamp) {
    this.startTimestamp = startTimestamp;
    return this;
  }

  /**
   * [Output Only] Status of the commitment with regards to eventual expiration (each commitment has
   * an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatus() {
    return status;
  }

  /**
   * [Output Only] Status of the commitment with regards to eventual expiration (each commitment has
   * an end date defined). One of the following values: NOT_YET_ACTIVE, ACTIVE, EXPIRED.
   * @param status status or {@code null} for none
   */
  public Commitment setStatus(java.lang.String status) {
    this.status = status;
    return this;
  }

  /**
   * [Output Only] An optional, human-readable explanation of the status.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * [Output Only] An optional, human-readable explanation of the status.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public Commitment setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * The type of commitment, which affects the discount rate and the eligible resources. Type
   * MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines. Type
   * ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to accelerator optimized
   * machines.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The type of commitment, which affects the discount rate and the eligible resources. Type
   * MEMORY_OPTIMIZED specifies a commitment that will only apply to memory optimized machines. Type
   * ACCELERATOR_OPTIMIZED specifies a commitment that will only apply to accelerator optimized
   * machines.
   * @param type type or {@code null} for none
   */
  public Commitment setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Commitment set(String fieldName, Object value) {
    return (Commitment) super.set(fieldName, value);
  }

  @Override
  public Commitment clone() {
    return (Commitment) super.clone();
  }

}
