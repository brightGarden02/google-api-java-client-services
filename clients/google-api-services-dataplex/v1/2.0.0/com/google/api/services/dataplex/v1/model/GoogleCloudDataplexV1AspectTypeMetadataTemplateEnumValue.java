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

package com.google.api.services.dataplex.v1.model;

/**
 * Definition of Enumvalue (to be used by enum fields)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1AspectTypeMetadataTemplateEnumValue extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Optional deprecation message to be set if an enum value needs to be deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String deprecated;

  /**
   * Required. Index for the enum. Cannot be modified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer index;

  /**
   * Required. Name of the enumvalue. This is the actual value that the aspect will contain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Optional. Optional deprecation message to be set if an enum value needs to be deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeprecated() {
    return deprecated;
  }

  /**
   * Optional. Optional deprecation message to be set if an enum value needs to be deprecated.
   * @param deprecated deprecated or {@code null} for none
   */
  public GoogleCloudDataplexV1AspectTypeMetadataTemplateEnumValue setDeprecated(java.lang.String deprecated) {
    this.deprecated = deprecated;
    return this;
  }

  /**
   * Required. Index for the enum. Cannot be modified.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getIndex() {
    return index;
  }

  /**
   * Required. Index for the enum. Cannot be modified.
   * @param index index or {@code null} for none
   */
  public GoogleCloudDataplexV1AspectTypeMetadataTemplateEnumValue setIndex(java.lang.Integer index) {
    this.index = index;
    return this;
  }

  /**
   * Required. Name of the enumvalue. This is the actual value that the aspect will contain.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Name of the enumvalue. This is the actual value that the aspect will contain.
   * @param name name or {@code null} for none
   */
  public GoogleCloudDataplexV1AspectTypeMetadataTemplateEnumValue setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1AspectTypeMetadataTemplateEnumValue set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1AspectTypeMetadataTemplateEnumValue) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1AspectTypeMetadataTemplateEnumValue clone() {
    return (GoogleCloudDataplexV1AspectTypeMetadataTemplateEnumValue) super.clone();
  }

}
