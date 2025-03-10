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

package com.google.api.services.documentai.v1.model;

/**
 * A processor version is an implementation of a processor. Each processor can have multiple
 * versions, pretrained by Google internally or uptrained by the customer. A processor can only have
 * one default version at a time. Its document-processing behavior is defined by that version.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDocumentaiV1ProcessorVersion extends com.google.api.client.json.GenericJson {

  /**
   * The time the processor version was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * If set, information about the eventual deprecation of this version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1ProcessorVersionDeprecationInfo deprecationInfo;

  /**
   * The display name of the processor version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * The schema of the processor version. Describes the output.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1DocumentSchema documentSchema;

  /**
   * Output only. Denotes that this `ProcessorVersion` is managed by Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean googleManaged;

  /**
   * The KMS key name used for encryption.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyName;

  /**
   * The KMS key version with which data is encrypted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKeyVersionName;

  /**
   * The most recently invoked evaluation for the processor version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDocumentaiV1EvaluationReference latestEvaluation;

  /**
   * Output only. The model type of this processor version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String modelType;

  /**
   * Identifier. The resource name of the processor version. Format: `projects/{project}/locations/{
   * location}/processors/{processor}/processorVersions/{processor_version}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The state of the processor version.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The time the processor version was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * The time the processor version was created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ProcessorVersion setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * If set, information about the eventual deprecation of this version.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ProcessorVersionDeprecationInfo getDeprecationInfo() {
    return deprecationInfo;
  }

  /**
   * If set, information about the eventual deprecation of this version.
   * @param deprecationInfo deprecationInfo or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ProcessorVersion setDeprecationInfo(GoogleCloudDocumentaiV1ProcessorVersionDeprecationInfo deprecationInfo) {
    this.deprecationInfo = deprecationInfo;
    return this;
  }

  /**
   * The display name of the processor version.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The display name of the processor version.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ProcessorVersion setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * The schema of the processor version. Describes the output.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1DocumentSchema getDocumentSchema() {
    return documentSchema;
  }

  /**
   * The schema of the processor version. Describes the output.
   * @param documentSchema documentSchema or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ProcessorVersion setDocumentSchema(GoogleCloudDocumentaiV1DocumentSchema documentSchema) {
    this.documentSchema = documentSchema;
    return this;
  }

  /**
   * Output only. Denotes that this `ProcessorVersion` is managed by Google.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getGoogleManaged() {
    return googleManaged;
  }

  /**
   * Output only. Denotes that this `ProcessorVersion` is managed by Google.
   * @param googleManaged googleManaged or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ProcessorVersion setGoogleManaged(java.lang.Boolean googleManaged) {
    this.googleManaged = googleManaged;
    return this;
  }

  /**
   * The KMS key name used for encryption.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyName() {
    return kmsKeyName;
  }

  /**
   * The KMS key name used for encryption.
   * @param kmsKeyName kmsKeyName or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ProcessorVersion setKmsKeyName(java.lang.String kmsKeyName) {
    this.kmsKeyName = kmsKeyName;
    return this;
  }

  /**
   * The KMS key version with which data is encrypted.
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKeyVersionName() {
    return kmsKeyVersionName;
  }

  /**
   * The KMS key version with which data is encrypted.
   * @param kmsKeyVersionName kmsKeyVersionName or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ProcessorVersion setKmsKeyVersionName(java.lang.String kmsKeyVersionName) {
    this.kmsKeyVersionName = kmsKeyVersionName;
    return this;
  }

  /**
   * The most recently invoked evaluation for the processor version.
   * @return value or {@code null} for none
   */
  public GoogleCloudDocumentaiV1EvaluationReference getLatestEvaluation() {
    return latestEvaluation;
  }

  /**
   * The most recently invoked evaluation for the processor version.
   * @param latestEvaluation latestEvaluation or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ProcessorVersion setLatestEvaluation(GoogleCloudDocumentaiV1EvaluationReference latestEvaluation) {
    this.latestEvaluation = latestEvaluation;
    return this;
  }

  /**
   * Output only. The model type of this processor version.
   * @return value or {@code null} for none
   */
  public java.lang.String getModelType() {
    return modelType;
  }

  /**
   * Output only. The model type of this processor version.
   * @param modelType modelType or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ProcessorVersion setModelType(java.lang.String modelType) {
    this.modelType = modelType;
    return this;
  }

  /**
   * Identifier. The resource name of the processor version. Format: `projects/{project}/locations/{
   * location}/processors/{processor}/processorVersions/{processor_version}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Identifier. The resource name of the processor version. Format: `projects/{project}/locations/{
   * location}/processors/{processor}/processorVersions/{processor_version}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ProcessorVersion setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The state of the processor version.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of the processor version.
   * @param state state or {@code null} for none
   */
  public GoogleCloudDocumentaiV1ProcessorVersion setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public GoogleCloudDocumentaiV1ProcessorVersion set(String fieldName, Object value) {
    return (GoogleCloudDocumentaiV1ProcessorVersion) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDocumentaiV1ProcessorVersion clone() {
    return (GoogleCloudDocumentaiV1ProcessorVersion) super.clone();
  }

}
