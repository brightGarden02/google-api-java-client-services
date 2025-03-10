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

package com.google.api.services.firebaseappcheck.v1beta.model;

/**
 * App Check enforcement policy for a specific resource of a Firebase service supported by App
 * Check. Note that this policy will override the service-level configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Firebase App Check API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleFirebaseAppcheckV1betaResourcePolicy extends com.google.api.client.json.GenericJson {

  /**
   * Required. The App Check enforcement mode for this resource. This will override the
   * EnforcementMode setting on the parent service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String enforcementMode;

  /**
   * This checksum is computed by the server based on the value of other fields, and may be sent on
   * update and delete requests to ensure the client has an up-to-date value before proceeding. This
   * etag is strongly validated as defined by RFC 7232.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * Required. The relative name of the resource policy object, in the format: ```
   * projects/{project_number}/services/{service_id}/resourcePolicies/{resource_policy_id} ``` Note
   * that the `service_id` element must be a supported service ID. Currently, the following service
   * IDs are supported: * `oauth2.googleapis.com` (Google Identity for iOS) `resource_policy_id` is
   * a system-generated UID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Required. Service specific name of the resource object to which this policy applies, in the
   * format: * `//oauth2.googleapis.com/projects/{project_number}/oauthClients/{oauth_client_id}`
   * (Google Identity for iOS) Note that the resource must belong to the service specified in the
   * `name` and be from the same project as this policy, but the resource is allowed to be missing
   * at the time of creation of this policy; in that case, we make a best-effort attempt at
   * respecting this policy, but it may not have any effect until the resource is fully created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String targetResource;

  /**
   * Output only. Timestamp when this resource policy configuration object was most recently
   * updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * Required. The App Check enforcement mode for this resource. This will override the
   * EnforcementMode setting on the parent service.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnforcementMode() {
    return enforcementMode;
  }

  /**
   * Required. The App Check enforcement mode for this resource. This will override the
   * EnforcementMode setting on the parent service.
   * @param enforcementMode enforcementMode or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaResourcePolicy setEnforcementMode(java.lang.String enforcementMode) {
    this.enforcementMode = enforcementMode;
    return this;
  }

  /**
   * This checksum is computed by the server based on the value of other fields, and may be sent on
   * update and delete requests to ensure the client has an up-to-date value before proceeding. This
   * etag is strongly validated as defined by RFC 7232.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * This checksum is computed by the server based on the value of other fields, and may be sent on
   * update and delete requests to ensure the client has an up-to-date value before proceeding. This
   * etag is strongly validated as defined by RFC 7232.
   * @param etag etag or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaResourcePolicy setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * Required. The relative name of the resource policy object, in the format: ```
   * projects/{project_number}/services/{service_id}/resourcePolicies/{resource_policy_id} ``` Note
   * that the `service_id` element must be a supported service ID. Currently, the following service
   * IDs are supported: * `oauth2.googleapis.com` (Google Identity for iOS) `resource_policy_id` is
   * a system-generated UID.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. The relative name of the resource policy object, in the format: ```
   * projects/{project_number}/services/{service_id}/resourcePolicies/{resource_policy_id} ``` Note
   * that the `service_id` element must be a supported service ID. Currently, the following service
   * IDs are supported: * `oauth2.googleapis.com` (Google Identity for iOS) `resource_policy_id` is
   * a system-generated UID.
   * @param name name or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaResourcePolicy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Required. Service specific name of the resource object to which this policy applies, in the
   * format: * `//oauth2.googleapis.com/projects/{project_number}/oauthClients/{oauth_client_id}`
   * (Google Identity for iOS) Note that the resource must belong to the service specified in the
   * `name` and be from the same project as this policy, but the resource is allowed to be missing
   * at the time of creation of this policy; in that case, we make a best-effort attempt at
   * respecting this policy, but it may not have any effect until the resource is fully created.
   * @return value or {@code null} for none
   */
  public java.lang.String getTargetResource() {
    return targetResource;
  }

  /**
   * Required. Service specific name of the resource object to which this policy applies, in the
   * format: * `//oauth2.googleapis.com/projects/{project_number}/oauthClients/{oauth_client_id}`
   * (Google Identity for iOS) Note that the resource must belong to the service specified in the
   * `name` and be from the same project as this policy, but the resource is allowed to be missing
   * at the time of creation of this policy; in that case, we make a best-effort attempt at
   * respecting this policy, but it may not have any effect until the resource is fully created.
   * @param targetResource targetResource or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaResourcePolicy setTargetResource(java.lang.String targetResource) {
    this.targetResource = targetResource;
    return this;
  }

  /**
   * Output only. Timestamp when this resource policy configuration object was most recently
   * updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Timestamp when this resource policy configuration object was most recently
   * updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleFirebaseAppcheckV1betaResourcePolicy setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleFirebaseAppcheckV1betaResourcePolicy set(String fieldName, Object value) {
    return (GoogleFirebaseAppcheckV1betaResourcePolicy) super.set(fieldName, value);
  }

  @Override
  public GoogleFirebaseAppcheckV1betaResourcePolicy clone() {
    return (GoogleFirebaseAppcheckV1betaResourcePolicy) super.clone();
  }

}
