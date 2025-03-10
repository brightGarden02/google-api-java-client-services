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
 * Reasoning for the suggestion.
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
public final class GoogleCloudContactcenterinsightsV1AgentCoachingSuggestionAgentCoachingSuggestionReasoning extends com.google.api.client.json.GenericJson {

  /**
   * Optional. The actions that the agent has taken already.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String agentActionTaken;

  /**
   * Optional. Summary of the issue.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String issueSummary;

  /**
   * Optional. The actions that the agent has taken already.
   * @return value or {@code null} for none
   */
  public java.lang.String getAgentActionTaken() {
    return agentActionTaken;
  }

  /**
   * Optional. The actions that the agent has taken already.
   * @param agentActionTaken agentActionTaken or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AgentCoachingSuggestionAgentCoachingSuggestionReasoning setAgentActionTaken(java.lang.String agentActionTaken) {
    this.agentActionTaken = agentActionTaken;
    return this;
  }

  /**
   * Optional. Summary of the issue.
   * @return value or {@code null} for none
   */
  public java.lang.String getIssueSummary() {
    return issueSummary;
  }

  /**
   * Optional. Summary of the issue.
   * @param issueSummary issueSummary or {@code null} for none
   */
  public GoogleCloudContactcenterinsightsV1AgentCoachingSuggestionAgentCoachingSuggestionReasoning setIssueSummary(java.lang.String issueSummary) {
    this.issueSummary = issueSummary;
    return this;
  }

  @Override
  public GoogleCloudContactcenterinsightsV1AgentCoachingSuggestionAgentCoachingSuggestionReasoning set(String fieldName, Object value) {
    return (GoogleCloudContactcenterinsightsV1AgentCoachingSuggestionAgentCoachingSuggestionReasoning) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudContactcenterinsightsV1AgentCoachingSuggestionAgentCoachingSuggestionReasoning clone() {
    return (GoogleCloudContactcenterinsightsV1AgentCoachingSuggestionAgentCoachingSuggestionReasoning) super.clone();
  }

}
