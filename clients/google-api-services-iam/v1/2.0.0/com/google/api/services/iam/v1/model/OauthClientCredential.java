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

package com.google.api.services.iam.v1.model;

/**
 * Represents an oauth client credential. Used to authenticate an oauth client while accessing
 * Google Cloud resources on behalf of a user by using OAuth2 Protocol.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Identity and Access Management (IAM) API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OauthClientCredential extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The system-generated oauth client secret.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientSecret;

  /**
   * Optional. Whether the oauth client credential is disabled. You cannot use a disabled oauth
   * client credential for OAuth.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disabled;

  /**
   * Optional. A user-specified display name of the oauth client credential Cannot exceed 32
   * characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Immutable. The resource name of the oauth client credential. Format:
   * `projects/{project}/locations/{location}/oauthClients/{oauth_client}/credentials/{credential}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The system-generated oauth client secret.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientSecret() {
    return clientSecret;
  }

  /**
   * Output only. The system-generated oauth client secret.
   * @param clientSecret clientSecret or {@code null} for none
   */
  public OauthClientCredential setClientSecret(java.lang.String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Optional. Whether the oauth client credential is disabled. You cannot use a disabled oauth
   * client credential for OAuth.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisabled() {
    return disabled;
  }

  /**
   * Optional. Whether the oauth client credential is disabled. You cannot use a disabled oauth
   * client credential for OAuth.
   * @param disabled disabled or {@code null} for none
   */
  public OauthClientCredential setDisabled(java.lang.Boolean disabled) {
    this.disabled = disabled;
    return this;
  }

  /**
   * Optional. A user-specified display name of the oauth client credential Cannot exceed 32
   * characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Optional. A user-specified display name of the oauth client credential Cannot exceed 32
   * characters.
   * @param displayName displayName or {@code null} for none
   */
  public OauthClientCredential setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Immutable. The resource name of the oauth client credential. Format:
   * `projects/{project}/locations/{location}/oauthClients/{oauth_client}/credentials/{credential}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Immutable. The resource name of the oauth client credential. Format:
   * `projects/{project}/locations/{location}/oauthClients/{oauth_client}/credentials/{credential}`
   * @param name name or {@code null} for none
   */
  public OauthClientCredential setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public OauthClientCredential set(String fieldName, Object value) {
    return (OauthClientCredential) super.set(fieldName, value);
  }

  @Override
  public OauthClientCredential clone() {
    return (OauthClientCredential) super.clone();
  }

}
