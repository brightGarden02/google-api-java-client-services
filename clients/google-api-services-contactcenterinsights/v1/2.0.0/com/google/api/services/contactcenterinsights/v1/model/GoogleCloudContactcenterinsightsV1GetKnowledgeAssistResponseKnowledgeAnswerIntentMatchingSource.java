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
 * Details about source of Intent Matching answer.
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
public final class GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerIntentMatchingSource extends com.google.api.client.json.GenericJson {

  /**
   * Title of the document.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String title;

  /**
   * URI the data is sourced from.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uri;

  /**
   * Title of the document.
   * @return value or {@code null} for none
   */
  public java.lang.String getTitle() {
    return title;
  }

  /**
   * Title of the document.
   * @param title title or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerIntentMatchingSource setTitle(java.lang.String title) {
    this.title = title;
    return this;
  }

  /**
   * URI the data is sourced from.
   * @return value or {@code null} for none
   */
  public java.lang.String getUri() {
    return uri;
  }

  /**
   * URI the data is sourced from.
   * @param uri uri or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerIntentMatchingSource setUri(java.lang.String uri) {
    this.uri = uri;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerIntentMatchingSource set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerIntentMatchingSource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerIntentMatchingSource clone() {
    return (GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerIntentMatchingSource) super.clone();
  }

}
