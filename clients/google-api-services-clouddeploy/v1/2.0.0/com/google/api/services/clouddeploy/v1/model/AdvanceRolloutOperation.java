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

package com.google.api.services.clouddeploy.v1.model;

/**
 * Contains the information of an automated advance-rollout operation.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Deploy API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AdvanceRolloutOperation extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The phase the rollout will be advanced to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String destinationPhase;

  /**
   * Output only. The name of the rollout that initiates the `AutomationRun`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String rollout;

  /**
   * Output only. The phase of a deployment that initiated the operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourcePhase;

  /**
   * Output only. How long the operation will be paused.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String wait;

  /**
   * Output only. The phase the rollout will be advanced to.
   * @return value or {@code null} for none
   */
  public java.lang.String getDestinationPhase() {
    return destinationPhase;
  }

  /**
   * Output only. The phase the rollout will be advanced to.
   * @param destinationPhase destinationPhase or {@code null} for none
   */
  public AdvanceRolloutOperation setDestinationPhase(java.lang.String destinationPhase) {
    this.destinationPhase = destinationPhase;
    return this;
  }

  /**
   * Output only. The name of the rollout that initiates the `AutomationRun`.
   * @return value or {@code null} for none
   */
  public java.lang.String getRollout() {
    return rollout;
  }

  /**
   * Output only. The name of the rollout that initiates the `AutomationRun`.
   * @param rollout rollout or {@code null} for none
   */
  public AdvanceRolloutOperation setRollout(java.lang.String rollout) {
    this.rollout = rollout;
    return this;
  }

  /**
   * Output only. The phase of a deployment that initiated the operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourcePhase() {
    return sourcePhase;
  }

  /**
   * Output only. The phase of a deployment that initiated the operation.
   * @param sourcePhase sourcePhase or {@code null} for none
   */
  public AdvanceRolloutOperation setSourcePhase(java.lang.String sourcePhase) {
    this.sourcePhase = sourcePhase;
    return this;
  }

  /**
   * Output only. How long the operation will be paused.
   * @return value or {@code null} for none
   */
  public String getWait() {
    return wait;
  }

  /**
   * Output only. How long the operation will be paused.
   * @param wait wait or {@code null} for none
   */
  public AdvanceRolloutOperation setWait(String wait) {
    this.wait = wait;
    return this;
  }

  @Override
  public AdvanceRolloutOperation set(String fieldName, Object value) {
    return (AdvanceRolloutOperation) super.set(fieldName, value);
  }

  @Override
  public AdvanceRolloutOperation clone() {
    return (AdvanceRolloutOperation) super.clone();
  }

}
