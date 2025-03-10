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

package com.google.api.services.dns.model;

/**
 * Configures a RRSetRoutingPolicy such that all queries are responded with the primary_targets if
 * they are healthy. And if all of them are unhealthy, then we fallback to a geo localized policy.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class RRSetRoutingPolicyPrimaryBackupPolicy extends com.google.api.client.json.GenericJson {

  /**
   * Backup targets provide a regional failover policy for the otherwise global primary targets. If
   * serving state is set to BACKUP, this policy essentially becomes a geo routing policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RRSetRoutingPolicyGeoPolicy backupGeoTargets;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Endpoints that are health checked before making the routing decision. Unhealthy endpoints are
   * omitted from the results. If all endpoints are unhealthy, we serve a response based on the
   * backup_geo_targets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RRSetRoutingPolicyHealthCheckTargets primaryTargets;

  /**
   * When serving state is PRIMARY, this field provides the option of sending a small percentage of
   * the traffic to the backup targets.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double trickleTraffic;

  /**
   * Backup targets provide a regional failover policy for the otherwise global primary targets. If
   * serving state is set to BACKUP, this policy essentially becomes a geo routing policy.
   * @return value or {@code null} for none
   */
  public RRSetRoutingPolicyGeoPolicy getBackupGeoTargets() {
    return backupGeoTargets;
  }

  /**
   * Backup targets provide a regional failover policy for the otherwise global primary targets. If
   * serving state is set to BACKUP, this policy essentially becomes a geo routing policy.
   * @param backupGeoTargets backupGeoTargets or {@code null} for none
   */
  public RRSetRoutingPolicyPrimaryBackupPolicy setBackupGeoTargets(RRSetRoutingPolicyGeoPolicy backupGeoTargets) {
    this.backupGeoTargets = backupGeoTargets;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public RRSetRoutingPolicyPrimaryBackupPolicy setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Endpoints that are health checked before making the routing decision. Unhealthy endpoints are
   * omitted from the results. If all endpoints are unhealthy, we serve a response based on the
   * backup_geo_targets.
   * @return value or {@code null} for none
   */
  public RRSetRoutingPolicyHealthCheckTargets getPrimaryTargets() {
    return primaryTargets;
  }

  /**
   * Endpoints that are health checked before making the routing decision. Unhealthy endpoints are
   * omitted from the results. If all endpoints are unhealthy, we serve a response based on the
   * backup_geo_targets.
   * @param primaryTargets primaryTargets or {@code null} for none
   */
  public RRSetRoutingPolicyPrimaryBackupPolicy setPrimaryTargets(RRSetRoutingPolicyHealthCheckTargets primaryTargets) {
    this.primaryTargets = primaryTargets;
    return this;
  }

  /**
   * When serving state is PRIMARY, this field provides the option of sending a small percentage of
   * the traffic to the backup targets.
   * @return value or {@code null} for none
   */
  public java.lang.Double getTrickleTraffic() {
    return trickleTraffic;
  }

  /**
   * When serving state is PRIMARY, this field provides the option of sending a small percentage of
   * the traffic to the backup targets.
   * @param trickleTraffic trickleTraffic or {@code null} for none
   */
  public RRSetRoutingPolicyPrimaryBackupPolicy setTrickleTraffic(java.lang.Double trickleTraffic) {
    this.trickleTraffic = trickleTraffic;
    return this;
  }

  @Override
  public RRSetRoutingPolicyPrimaryBackupPolicy set(String fieldName, Object value) {
    return (RRSetRoutingPolicyPrimaryBackupPolicy) super.set(fieldName, value);
  }

  @Override
  public RRSetRoutingPolicyPrimaryBackupPolicy clone() {
    return (RRSetRoutingPolicyPrimaryBackupPolicy) super.clone();
  }

}
