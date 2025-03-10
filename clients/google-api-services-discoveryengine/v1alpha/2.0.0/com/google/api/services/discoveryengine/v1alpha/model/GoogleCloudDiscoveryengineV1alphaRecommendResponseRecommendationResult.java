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
 * RecommendationResult represents a generic recommendation result with associated metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Discovery Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDiscoveryengineV1alphaRecommendResponseRecommendationResult extends com.google.api.client.json.GenericJson {

  /**
   * Set if `returnDocument` is set to true in RecommendRequest.params.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudDiscoveryengineV1alphaDocument document;

  /**
   * Resource ID of the recommended Document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Additional Document metadata or annotations. Possible values: * `score`: Recommendation score
   * in double value. Is set if `returnScore` is set to true in RecommendRequest.params.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> metadata;

  /**
   * Set if `returnDocument` is set to true in RecommendRequest.params.
   * @return value or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaDocument getDocument() {
    return document;
  }

  /**
   * Set if `returnDocument` is set to true in RecommendRequest.params.
   * @param document document or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecommendResponseRecommendationResult setDocument(GoogleCloudDiscoveryengineV1alphaDocument document) {
    this.document = document;
    return this;
  }

  /**
   * Resource ID of the recommended Document.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Resource ID of the recommended Document.
   * @param id id or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecommendResponseRecommendationResult setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Additional Document metadata or annotations. Possible values: * `score`: Recommendation score
   * in double value. Is set if `returnScore` is set to true in RecommendRequest.params.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getMetadata() {
    return metadata;
  }

  /**
   * Additional Document metadata or annotations. Possible values: * `score`: Recommendation score
   * in double value. Is set if `returnScore` is set to true in RecommendRequest.params.
   * @param metadata metadata or {@code null} for none
   */
  public GoogleCloudDiscoveryengineV1alphaRecommendResponseRecommendationResult setMetadata(java.util.Map<String, java.lang.Object> metadata) {
    this.metadata = metadata;
    return this;
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaRecommendResponseRecommendationResult set(String fieldName, Object value) {
    return (GoogleCloudDiscoveryengineV1alphaRecommendResponseRecommendationResult) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDiscoveryengineV1alphaRecommendResponseRecommendationResult clone() {
    return (GoogleCloudDiscoveryengineV1alphaRecommendResponseRecommendationResult) super.clone();
  }

}
