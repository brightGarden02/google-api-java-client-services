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
 * Generate recommended DataQualityRules response.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataplex API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDataplexV1GenerateDataQualityRulesResponse extends com.google.api.client.json.GenericJson {

  /**
   * Generated recommended {@link DataQualityRule}s.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDataplexV1DataQualityRule> rule;

  static {
    // hack to force ProGuard to consider GoogleCloudDataplexV1DataQualityRule used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GoogleCloudDataplexV1DataQualityRule.class);
  }

  /**
   * Generated recommended {@link DataQualityRule}s.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDataplexV1DataQualityRule> getRule() {
    return rule;
  }

  /**
   * Generated recommended {@link DataQualityRule}s.
   * @param rule rule or {@code null} for none
   */
  public GoogleCloudDataplexV1GenerateDataQualityRulesResponse setRule(java.util.List<GoogleCloudDataplexV1DataQualityRule> rule) {
    this.rule = rule;
    return this;
  }

  @Override
  public GoogleCloudDataplexV1GenerateDataQualityRulesResponse set(String fieldName, Object value) {
    return (GoogleCloudDataplexV1GenerateDataQualityRulesResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDataplexV1GenerateDataQualityRulesResponse clone() {
    return (GoogleCloudDataplexV1GenerateDataQualityRulesResponse) super.clone();
  }

}
