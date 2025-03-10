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

package com.google.api.services.contactcenterinsights.v1.model;

/**
 * Represents response from generators.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Contact Center AI Insights API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudContactcenterinsightsV1GetGeneratorSuggestionResponse extends com.google.api.client.json.GenericJson {

  /**
   * The suggestion generated from the Generator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1GeneratorSuggestion generatorSuggestion;

  /**
   * The suggestion generated from the Generator.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1GeneratorSuggestion getGeneratorSuggestion() {
    return generatorSuggestion;
  }

  /**
   * The suggestion generated from the Generator.
   * @param generatorSuggestion generatorSuggestion or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1GetGeneratorSuggestionResponse setGeneratorSuggestion(GoogleCloudContactcenterinsightsV1GeneratorSuggestion generatorSuggestion) {
    this.generatorSuggestion = generatorSuggestion;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1GetGeneratorSuggestionResponse set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1GetGeneratorSuggestionResponse) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1GetGeneratorSuggestionResponse clone() {
    return (GoogleCloudContactcenterinsightsV1GetGeneratorSuggestionResponse) super.clone();
  }

}
