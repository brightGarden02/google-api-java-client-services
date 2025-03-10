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
 * `Type` represents the type of data that is written to, read from, or stored in Bigtable. It is
 * heavily based on the GoogleSQL standard to help maintain familiarity and consistency across
 * products and features. For compatibility with Bigtable's existing untyped APIs, each `Type`
 * includes an `Encoding` which describes how to convert to/from the underlying data. This might
 * involve composing a series of steps into an "encoding chain," for example to convert from INT64
 * -> STRING -> raw bytes. In most cases, a "link" in the encoding chain will be based an on
 * existing GoogleSQL conversion function like `CAST`. Each link in the encoding chain also defines
 * the following properties: * Natural sort: Does the encoded value sort consistently with the
 * original typed value? Note that Bigtable will always sort data based on the raw encoded value,
 * *not* the decoded type. - Example: STRING values sort in the same order as their UTF-8 encodings.
 * - Counterexample: Encoding INT64 to a fixed-width STRING does *not* preserve sort order when
 * dealing with negative numbers. INT64(1) > INT64(-1), but STRING("-00001") > STRING("00001). - The
 * overall encoding chain sorts naturally if *every* link does. * Self-delimiting: If we concatenate
 * two encoded values, can we always tell where the first one ends and the second one begins? -
 * Example: If we encode INT64s to fixed-width STRINGs, the first value will always contain exactly
 * N digits, possibly preceded by a sign. - Counterexample: If we concatenate two UTF-8 encoded
 * STRINGs, we have no way to tell where the first one ends. - The overall encoding chain is self-
 * delimiting if *any* link is. * Compatibility: Which other systems have matching encoding schemes?
 * For example, does this encoding have a GoogleSQL equivalent? HBase? Java?
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
public final class Type extends com.google.api.client.json.GenericJson {

  /**
   * Aggregate
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleBigtableAdminV2TypeAggregate aggregateType;

  /**
   * Bytes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleBigtableAdminV2TypeBytes bytesType;

  /**
   * Int64
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleBigtableAdminV2TypeInt64 int64Type;

  /**
   * Aggregate
   * @return value or {@code null} for none
   */
  public GoogleBigtableAdminV2TypeAggregate getAggregateType() {
    return aggregateType;
  }

  /**
   * Aggregate
   * @param aggregateType aggregateType or {@code null} for none
   */
  public Type setAggregateType(GoogleBigtableAdminV2TypeAggregate aggregateType) {
    this.aggregateType = aggregateType;
    return this;
  }

  /**
   * Bytes
   * @return value or {@code null} for none
   */
  public GoogleBigtableAdminV2TypeBytes getBytesType() {
    return bytesType;
  }

  /**
   * Bytes
   * @param bytesType bytesType or {@code null} for none
   */
  public Type setBytesType(GoogleBigtableAdminV2TypeBytes bytesType) {
    this.bytesType = bytesType;
    return this;
  }

  /**
   * Int64
   * @return value or {@code null} for none
   */
  public GoogleBigtableAdminV2TypeInt64 getInt64Type() {
    return int64Type;
  }

  /**
   * Int64
   * @param int64Type int64Type or {@code null} for none
   */
  public Type setInt64Type(GoogleBigtableAdminV2TypeInt64 int64Type) {
    this.int64Type = int64Type;
    return this;
  }

  @Override
  public Type set(String fieldName, Object value) {
    return (Type) super.set(fieldName, value);
  }

  @Override
  public Type clone() {
    return (Type) super.clone();
  }

}
