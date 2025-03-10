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

package com.google.api.services.discoveryengine.v1alpha.model;

/**
 * Request message for DocumentService.PurgeDocuments method.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaPurgeDocumentsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The desired location of errors incurred during the purge.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaPurgeErrorConfig errorConfig;

  /**
   * Required. Filter matching documents to purge. Only currently supported value is `*` (all
   * items).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Actually performs the purge. If `force` is set to false, return the expected purge count
   * without deleting any documents.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean force;

  /**
   * Cloud Storage location for the input content. Supported `data_schema`: * `document_id`: One
   * valid Document.id per line.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaGcsSource gcsSource;

  /**
   * The desired location of errors incurred during the purge.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaPurgeErrorConfig getErrorConfig() {
    return errorConfig;
  }

  /**
   * The desired location of errors incurred during the purge.
   * @param errorConfig errorConfig or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaPurgeDocumentsRequest setErrorConfig(GoogleCloudDiscoveryengineV1alphaPurgeErrorConfig errorConfig) {
    this.errorConfig = errorConfig;
    return this;
  }

  /**
   * Required. Filter matching documents to purge. Only currently supported value is `*` (all
   * items).
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Required. Filter matching documents to purge. Only currently supported value is `*` (all
   * items).
   * @param filter filter or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaPurgeDocumentsRequest setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Actually performs the purge. If `force` is set to false, return the expected purge count
   * without deleting any documents.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getForce() {
    return force;
  }

  /**
   * Actually performs the purge. If `force` is set to false, return the expected purge count
   * without deleting any documents.
   * @param force force or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaPurgeDocumentsRequest setForce(java.lang.Boolean force) {
    this.force = force;
    return this;
  }

  /**
   * Cloud Storage location for the input content. Supported `data_schema`: * `document_id`: One
   * valid Document.id per line.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaGcsSource getGcsSource() {
    return gcsSource;
  }

  /**
   * Cloud Storage location for the input content. Supported `data_schema`: * `document_id`: One
   * valid Document.id per line.
   * @param gcsSource gcsSource or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaPurgeDocumentsRequest setGcsSource(GoogleCloudDiscoveryengineV1alphaGcsSource gcsSource) {
    this.gcsSource = gcsSource;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaPurgeDocumentsRequest set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaPurgeDocumentsRequest) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaPurgeDocumentsRequest clone() {
    return (GoogleCloudDiscoveryengineV1alphaPurgeDocumentsRequest) super.clone();
  }

}
