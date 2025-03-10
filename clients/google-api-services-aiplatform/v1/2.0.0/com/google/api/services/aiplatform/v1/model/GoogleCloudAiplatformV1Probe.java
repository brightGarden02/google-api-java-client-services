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
 * Probe describes a health check to be performed against a container to determine whether it is
 * alive or ready to receive traffic.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Vertex AI API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudAiplatformV1Probe extends com.google.api.client.json.GenericJson {

  /**
   * Exec specifies the action to take.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudAiplatformV1ProbeExecAction exec;

  /**
   * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Must be
   * less than timeout_seconds. Maps to Kubernetes probe argument 'periodSeconds'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer periodSeconds;

  /**
   * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1.
   * Must be greater or equal to period_seconds. Maps to Kubernetes probe argument 'timeoutSeconds'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timeoutSeconds;

  /**
   * Exec specifies the action to take.
   * @return value or {@code null} for none
   */
  public GoogleCloudAiplatformV1ProbeExecAction getExec() {
    return exec;
  }

  /**
   * Exec specifies the action to take.
   * @param exec exec or {@code null} for none
   */
  public GoogleCloudAiplatformV1Probe setExec(GoogleCloudAiplatformV1ProbeExecAction exec) {
    this.exec = exec;
    return this;
  }

  /**
   * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Must be
   * less than timeout_seconds. Maps to Kubernetes probe argument 'periodSeconds'.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPeriodSeconds() {
    return periodSeconds;
  }

  /**
   * How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is 1. Must be
   * less than timeout_seconds. Maps to Kubernetes probe argument 'periodSeconds'.
   * @param periodSeconds periodSeconds or {@code null} for none
   */
  public GoogleCloudAiplatformV1Probe setPeriodSeconds(java.lang.Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return this;
  }

  /**
   * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1.
   * Must be greater or equal to period_seconds. Maps to Kubernetes probe argument 'timeoutSeconds'.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  /**
   * Number of seconds after which the probe times out. Defaults to 1 second. Minimum value is 1.
   * Must be greater or equal to period_seconds. Maps to Kubernetes probe argument 'timeoutSeconds'.
   * @param timeoutSeconds timeoutSeconds or {@code null} for none
   */
  public GoogleCloudAiplatformV1Probe setTimeoutSeconds(java.lang.Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  @Override
  public GoogleCloudAiplatformV1Probe set(String fieldName, Object value) {
    return (GoogleCloudAiplatformV1Probe) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudAiplatformV1Probe clone() {
    return (GoogleCloudAiplatformV1Probe) super.clone();
  }

}
