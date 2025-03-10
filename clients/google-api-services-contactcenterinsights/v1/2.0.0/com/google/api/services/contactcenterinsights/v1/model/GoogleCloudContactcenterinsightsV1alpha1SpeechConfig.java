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
 * Speech-to-Text configuration. Speech-to-Text settings are applied to conversations ingested from
 * the UploadConversation and IngestConversations endpoints, including conversation coming from CCAI
 * Platform. They are not applied to conversations ingested from the CreateConversation endpoint.
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
public final class GoogleCloudContactcenterinsightsV1alpha1SpeechConfig extends com.google.api.client.json.GenericJson {

  /**
   * The fully-qualified Speech Recognizer resource name. Format:
   * `projects/{project_id}/locations/{location}/recognizer/{recognizer}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String speechRecognizer;

  /**
   * The fully-qualified Speech Recognizer resource name. Format:
   * `projects/{project_id}/locations/{location}/recognizer/{recognizer}`
   * @return value or {@code null} for none
   */
  public java.lang.String getSpeechRecognizer() {
    return speechRecognizer;
  }

  /**
   * The fully-qualified Speech Recognizer resource name. Format:
   * `projects/{project_id}/locations/{location}/recognizer/{recognizer}`
   * @param speechRecognizer speechRecognizer or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1alpha1SpeechConfig setSpeechRecognizer(java.lang.String speechRecognizer) {
    this.speechRecognizer = speechRecognizer;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1alpha1SpeechConfig set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1alpha1SpeechConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1alpha1SpeechConfig clone() {
    return (GoogleCloudContactcenterinsightsV1alpha1SpeechConfig) super.clone();
  }

}
