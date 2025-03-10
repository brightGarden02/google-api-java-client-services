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

package com.google.api.services.aiplatform.v1.model;

/**
 * The dedicated serving endpoint for this FeatureOnlineStore. Only need to set when you choose
 * Optimized storage type. Public endpoint is provisioned by default.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1FeatureOnlineStoreDedicatedServingEndpoint extends com.google.api.client.json.GenericJson {

  /**
   * Output only. This field will be populated with the domain name to use for this
   * FeatureOnlineStore
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String publicEndpointDomainName;

  /**
   * Output only. This field will be populated with the domain name to use for this
   * FeatureOnlineStore
   * @return value or {@code null} for none
   */
  public java.lang.String getPublicEndpointDomainName() {
    return publicEndpointDomainName;
  }

  /**
   * Output only. This field will be populated with the domain name to use for this
   * FeatureOnlineStore
   * @param publicEndpointDomainName publicEndpointDomainName or {@code null} for none
   */
  public GoogleCloudAiplatformV1FeatureOnlineStoreDedicatedServingEndpoint setPublicEndpointDomainName(java.lang.String publicEndpointDomainName) {
    this.publicEndpointDomainName = publicEndpointDomainName;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1FeatureOnlineStoreDedicatedServingEndpoint set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1FeatureOnlineStoreDedicatedServingEndpoint) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1FeatureOnlineStoreDedicatedServingEndpoint clone() {
    return (GoogleCloudAiplatformV1FeatureOnlineStoreDedicatedServingEndpoint) super.clone();
  }

}
