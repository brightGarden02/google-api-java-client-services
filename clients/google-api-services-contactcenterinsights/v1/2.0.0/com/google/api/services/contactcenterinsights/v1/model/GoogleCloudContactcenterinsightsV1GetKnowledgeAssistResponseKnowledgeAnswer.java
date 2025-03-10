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
 * Represents an answer from Knowledge. Cuurently supports FAQ and Generative answers.
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
public final class GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswer extends com.google.api.client.json.GenericJson {

  /**
   * The piece of text from the `source` that answers this suggested query.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String answerText;

  /**
   * Populated if the prediction came from FAQ.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerFaqSource faqSource;

  /**
   * Populated if the prediction was Generative.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerGenerativeSource generativeSource;

  /**
   * Populated if the prediction was from intent matching.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerIntentMatchingSource intentMatchingSource;

  /**
   * The system's confidence score that this answer is a good match for this conversational query.
   * The range is from 0.0 (completely uncertain) to 1.0 (completely certain).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Float matchConfidence;

  /**
   * The piece of text from the `source` that answers this suggested query.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnswerText() {
    return answerText;
  }

  /**
   * The piece of text from the `source` that answers this suggested query.
   * @param answerText answerText or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswer setAnswerText(java.lang.String answerText) {
    this.answerText = answerText;
    return this;
  }

  /**
   * Populated if the prediction came from FAQ.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerFaqSource getFaqSource() {
    return faqSource;
  }

  /**
   * Populated if the prediction came from FAQ.
   * @param faqSource faqSource or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswer setFaqSource(GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerFaqSource faqSource) {
    this.faqSource = faqSource;
    return this;
  }

  /**
   * Populated if the prediction was Generative.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerGenerativeSource getGenerativeSource() {
    return generativeSource;
  }

  /**
   * Populated if the prediction was Generative.
   * @param generativeSource generativeSource or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswer setGenerativeSource(GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerGenerativeSource generativeSource) {
    this.generativeSource = generativeSource;
    return this;
  }

  /**
   * Populated if the prediction was from intent matching.
   * @return value or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerIntentMatchingSource getIntentMatchingSource() {
    return intentMatchingSource;
  }

  /**
   * Populated if the prediction was from intent matching.
   * @param intentMatchingSource intentMatchingSource or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswer setIntentMatchingSource(GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswerIntentMatchingSource intentMatchingSource) {
    this.intentMatchingSource = intentMatchingSource;
    return this;
  }

  /**
   * The system's confidence score that this answer is a good match for this conversational query.
   * The range is from 0.0 (completely uncertain) to 1.0 (completely certain).
   * @return value or {@code null} for none
   */
  public java.lang.Float getMatchConfidence() {
    return matchConfidence;
  }

  /**
   * The system's confidence score that this answer is a good match for this conversational query.
   * The range is from 0.0 (completely uncertain) to 1.0 (completely certain).
   * @param matchConfidence matchConfidence or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswer setMatchConfidence(java.lang.Float matchConfidence) {
    this.matchConfidence = matchConfidence;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswer set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswer) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswer clone() {
    return (GoogleCloudContactcenterinsightsV1GetKnowledgeAssistResponseKnowledgeAnswer) super.clone();
  }

}
