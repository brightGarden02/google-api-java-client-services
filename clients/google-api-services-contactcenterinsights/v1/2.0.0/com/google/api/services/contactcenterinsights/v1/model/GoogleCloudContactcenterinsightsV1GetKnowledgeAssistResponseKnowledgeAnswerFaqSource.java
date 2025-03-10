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
 * Details about source of FAQ answer.
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
public final class GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerFaqSource extends com.google.api.client.json.GenericJson {

  /**
   * Indicates which Knowledge Document this answer was extracted from. Format:
   * `projects//knowledgeBases//documents/`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String document;

  /**
   * The corresponding FAQ question.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String question;

  /**
   * Indicates which Knowledge Document this answer was extracted from. Format:
   * `projects//knowledgeBases//documents/`.
   * @return value or {@code null} for none
   */
  public java.lang.String getDocument() {
    return document;
  }

  /**
   * Indicates which Knowledge Document this answer was extracted from. Format:
   * `projects//knowledgeBases//documents/`.
   * @param document document or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerFaqSource setDocument(java.lang.String document) {
    this.document = document;
    return this;
  }

  /**
   * The corresponding FAQ question.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuestion() {
    return question;
  }

  /**
   * The corresponding FAQ question.
   * @param question question or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerFaqSource setQuestion(java.lang.String question) {
    this.question = question;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerFaqSource set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerFaqSource) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerFaqSource clone() {
    return (GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerFaqSource) super.clone();
  }

}
