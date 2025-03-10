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

package com.google.api.services.batch.v1.model;

/**
 * Spec of a task
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Batch API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TaskSpec extends com.google.api.client.json.GenericJson {

  /**
   * ComputeResource requirements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ComputeResource computeResource;

  /**
   * Environment variables to set before running the Task.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Environment environment;

  /**
   * Deprecated: please use environment(non-plural) instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> environments;

  /**
   * Lifecycle management schema when any task in a task group is failed. Currently we only support
   * one lifecycle policy. When the lifecycle policy condition is met, the action in the policy will
   * execute. If task execution result does not meet with the defined lifecycle policy, we consider
   * it as the default policy. Default policy means if the exit code is 0, exit task. If task ends
   * with non-zero exit code, retry the task with max_retry_count.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<LifecyclePolicy> lifecyclePolicies;

  static {
    // hack to force ProGuard to consider LifecyclePolicy used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(LifecyclePolicy.class);
  }

  /**
   * Maximum number of retries on failures. The default, 0, which means never retry. The valid value
   * range is [0, 10].
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxRetryCount;

  /**
   * Maximum duration the task should run. The task will be killed and marked as FAILED if over this
   * limit. The valid value range for max_run_duration in seconds is [0, 315576000000.999999999],
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String maxRunDuration;

  /**
   * The sequence of scripts or containers to run for this Task. Each Task using this TaskSpec
   * executes its list of runnables in order. The Task succeeds if all of its runnables either exit
   * with a zero status or any that exit with a non-zero status have the ignore_exit_status flag.
   * Background runnables are killed automatically (if they have not already exited) a short time
   * after all foreground runnables have completed. Even though this is likely to result in a non-
   * zero exit status for the background runnable, these automatic kills are not treated as Task
   * failures.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Runnable> runnables;

  static {
    // hack to force ProGuard to consider Runnable used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Runnable.class);
  }

  /**
   * Volumes to mount before running Tasks using this TaskSpec.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Volume> volumes;

  /**
   * ComputeResource requirements.
   * @return value or {@code null} for none
   */
  public ComputeResource getComputeResource() {
    return computeResource;
  }

  /**
   * ComputeResource requirements.
   * @param computeResource computeResource or {@code null} for none
   */
  public TaskSpec setComputeResource(ComputeResource computeResource) {
    this.computeResource = computeResource;
    return this;
  }

  /**
   * Environment variables to set before running the Task.
   * @return value or {@code null} for none
   */
  public Environment getEnvironment() {
    return environment;
  }

  /**
   * Environment variables to set before running the Task.
   * @param environment environment or {@code null} for none
   */
  public TaskSpec setEnvironment(Environment environment) {
    this.environment = environment;
    return this;
  }

  /**
   * Deprecated: please use environment(non-plural) instead.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getEnvironments() {
    return environments;
  }

  /**
   * Deprecated: please use environment(non-plural) instead.
   * @param environments environments or {@code null} for none
   */
  public TaskSpec setEnvironments(java.util.Map<String, java.lang.String> environments) {
    this.environments = environments;
    return this;
  }

  /**
   * Lifecycle management schema when any task in a task group is failed. Currently we only support
   * one lifecycle policy. When the lifecycle policy condition is met, the action in the policy will
   * execute. If task execution result does not meet with the defined lifecycle policy, we consider
   * it as the default policy. Default policy means if the exit code is 0, exit task. If task ends
   * with non-zero exit code, retry the task with max_retry_count.
   * @return value or {@code null} for none
   */
  public java.util.List<LifecyclePolicy> getLifecyclePolicies() {
    return lifecyclePolicies;
  }

  /**
   * Lifecycle management schema when any task in a task group is failed. Currently we only support
   * one lifecycle policy. When the lifecycle policy condition is met, the action in the policy will
   * execute. If task execution result does not meet with the defined lifecycle policy, we consider
   * it as the default policy. Default policy means if the exit code is 0, exit task. If task ends
   * with non-zero exit code, retry the task with max_retry_count.
   * @param lifecyclePolicies lifecyclePolicies or {@code null} for none
   */
  public TaskSpec setLifecyclePolicies(java.util.List<LifecyclePolicy> lifecyclePolicies) {
    this.lifecyclePolicies = lifecyclePolicies;
    return this;
  }

  /**
   * Maximum number of retries on failures. The default, 0, which means never retry. The valid value
   * range is [0, 10].
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxRetryCount() {
    return maxRetryCount;
  }

  /**
   * Maximum number of retries on failures. The default, 0, which means never retry. The valid value
   * range is [0, 10].
   * @param maxRetryCount maxRetryCount or {@code null} for none
   */
  public TaskSpec setMaxRetryCount(java.lang.Integer maxRetryCount) {
    this.maxRetryCount = maxRetryCount;
    return this;
  }

  /**
   * Maximum duration the task should run. The task will be killed and marked as FAILED if over this
   * limit. The valid value range for max_run_duration in seconds is [0, 315576000000.999999999],
   * @return value or {@code null} for none
   */
  public String getMaxRunDuration() {
    return maxRunDuration;
  }

  /**
   * Maximum duration the task should run. The task will be killed and marked as FAILED if over this
   * limit. The valid value range for max_run_duration in seconds is [0, 315576000000.999999999],
   * @param maxRunDuration maxRunDuration or {@code null} for none
   */
  public TaskSpec setMaxRunDuration(String maxRunDuration) {
    this.maxRunDuration = maxRunDuration;
    return this;
  }

  /**
   * The sequence of scripts or containers to run for this Task. Each Task using this TaskSpec
   * executes its list of runnables in order. The Task succeeds if all of its runnables either exit
   * with a zero status or any that exit with a non-zero status have the ignore_exit_status flag.
   * Background runnables are killed automatically (if they have not already exited) a short time
   * after all foreground runnables have completed. Even though this is likely to result in a non-
   * zero exit status for the background runnable, these automatic kills are not treated as Task
   * failures.
   * @return value or {@code null} for none
   */
  public java.util.List<Runnable> getRunnables() {
    return runnables;
  }

  /**
   * The sequence of scripts or containers to run for this Task. Each Task using this TaskSpec
   * executes its list of runnables in order. The Task succeeds if all of its runnables either exit
   * with a zero status or any that exit with a non-zero status have the ignore_exit_status flag.
   * Background runnables are killed automatically (if they have not already exited) a short time
   * after all foreground runnables have completed. Even though this is likely to result in a non-
   * zero exit status for the background runnable, these automatic kills are not treated as Task
   * failures.
   * @param runnables runnables or {@code null} for none
   */
  public TaskSpec setRunnables(java.util.List<Runnable> runnables) {
    this.runnables = runnables;
    return this;
  }

  /**
   * Volumes to mount before running Tasks using this TaskSpec.
   * @return value or {@code null} for none
   */
  public java.util.List<Volume> getVolumes() {
    return volumes;
  }

  /**
   * Volumes to mount before running Tasks using this TaskSpec.
   * @param volumes volumes or {@code null} for none
   */
  public TaskSpec setVolumes(java.util.List<Volume> volumes) {
    this.volumes = volumes;
    return this;
  }

  @Override
  public TaskSpec set(String fieldName, Object value) {
    return (TaskSpec) super.set(fieldName, value);
  }

  @Override
  public TaskSpec clone() {
    return (TaskSpec) super.clone();
  }

}
