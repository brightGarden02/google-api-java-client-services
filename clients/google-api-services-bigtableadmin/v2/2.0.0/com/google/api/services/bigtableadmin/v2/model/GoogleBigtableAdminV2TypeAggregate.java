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

package com.google.api.services.bigtableadmin.v2.model;

/**
 * A value that combines incremental updates into a summarized value. Data is never directly written
 * or read using type `Aggregate`. Writes will provide either the `input_type` or `state_type`, and
 * reads will always return the `state_type` .
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Bigtable Admin API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleBigtableAdminV2TypeAggregate extends com.google.api.client.json.GenericJson {

  /**
   * Type of the inputs that are accumulated by this `Aggregate`, which must specify a full
   * encoding. Use `AddInput` mutations to accumulate new inputs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Type inputType;

  /**
   * Output only. Type that holds the internal accumulator state for the `Aggregate`. This is a
   * function of the `input_type` and `aggregator` chosen, and will always specify a full encoding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Type stateType;

  /**
   * Sum aggregator.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleBigtableAdminV2TypeAggregateSum sum;

  /**
   * Type of the inputs that are accumulated by this `Aggregate`, which must specify a full
   * encoding. Use `AddInput` mutations to accumulate new inputs.
   * @return value or {@code null} for none
   */
  public Type getInputType() {
    return inputType;
  }

  /**
   * Type of the inputs that are accumulated by this `Aggregate`, which must specify a full
   * encoding. Use `AddInput` mutations to accumulate new inputs.
   * @param inputType inputType or {@code null} for none
   */
  public GoogleBigtableAdminV2TypeAggregate setInputType(Type inputType) {
    this.inputType = inputType;
    return this;
  }

  /**
   * Output only. Type that holds the internal accumulator state for the `Aggregate`. This is a
   * function of the `input_type` and `aggregator` chosen, and will always specify a full encoding.
   * @return value or {@code null} for none
   */
  public Type getStateType() {
    return stateType;
  }

  /**
   * Output only. Type that holds the internal accumulator state for the `Aggregate`. This is a
   * function of the `input_type` and `aggregator` chosen, and will always specify a full encoding.
   * @param stateType stateType or {@code null} for none
   */
  public GoogleBigtableAdminV2TypeAggregate setStateType(Type stateType) {
    this.stateType = stateType;
    return this;
  }

  /**
   * Sum aggregator.
   * @return value or {@code null} for none
   */
  public GoogleBigtableAdminV2TypeAggregateSum getSum() {
    return sum;
  }

  /**
   * Sum aggregator.
   * @param sum sum or {@code null} for none
   */
  public GoogleBigtableAdminV2TypeAggregate setSum(GoogleBigtableAdminV2TypeAggregateSum sum) {
    this.sum = sum;
    return this;
  }

  @Override
  public GoogleBigtableAdminV2TypeAggregate set(String fieldName, Object value) {
    return (GoogleBigtableAdminV2TypeAggregate) super.set(fieldName, value);
  }

  @Override
  public GoogleBigtableAdminV2TypeAggregate clone() {
    return (GoogleBigtableAdminV2TypeAggregate) super.clone();
  }

}
