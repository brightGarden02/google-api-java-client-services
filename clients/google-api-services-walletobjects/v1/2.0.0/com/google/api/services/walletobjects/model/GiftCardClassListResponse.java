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

package com.google.api.services.walletobjects.model;

/**
 * Model definition for GiftCardClassListResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Wallet API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GiftCardClassListResponse extends com.google.api.client.json.GenericJson {

  /**
   * Pagination of the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Pagination pagination;

  /**
   * Resources corresponding to the list request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GiftCardClass> resources;

  static {
    // hack to force ProGuard to consider GiftCardClass used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(GiftCardClass.class);
  }

  /**
   * Pagination of the response.
   * @return value or {@code null} for none
   */
  public Pagination getPagination() {
    return pagination;
  }

  /**
   * Pagination of the response.
   * @param pagination pagination or {@code null} for none
   */
  public GiftCardClassListResponse setPagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Resources corresponding to the list request.
   * @return value or {@code null} for none
   */
  public java.util.List<GiftCardClass> getResources() {
    return resources;
  }

  /**
   * Resources corresponding to the list request.
   * @param resources resources or {@code null} for none
   */
  public GiftCardClassListResponse setResources(java.util.List<GiftCardClass> resources) {
    this.resources = resources;
    return this;
  }

  @Override
  public GiftCardClassListResponse set(String fieldName, Object value) {
    return (GiftCardClassListResponse) super.set(fieldName, value);
  }

  @Override
  public GiftCardClassListResponse clone() {
    return (GiftCardClassListResponse) super.clone();
  }

}
