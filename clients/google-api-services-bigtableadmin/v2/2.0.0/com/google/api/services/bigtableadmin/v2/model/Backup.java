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
 * A backup of a Cloud Bigtable table.
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
public final class Backup extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The encryption information for the backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EncryptionInfo encryptionInfo;

  /**
   * Output only. `end_time` is the time that the backup was finished. The row data in the backup
   * will be no newer than this timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Required. The expiration time of the backup, with microseconds granularity that must be at
   * least 6 hours and at most 90 days from the time the request is received. Once the `expire_time`
   * has passed, Cloud Bigtable will delete the backup and free the resources used by the backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String expireTime;

  /**
   * A globally unique identifier for the backup which cannot be changed. Values are of the form
   * `projects/{project}/instances/{instance}/clusters/{cluster}/ backups/_a-zA-Z0-9*` The final
   * segment of the name must be between 1 and 50 characters in length. The backup is stored in the
   * cluster identified by the prefix of the backup name of the form
   * `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Size of the backup in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long sizeBytes;

  /**
   * Output only. Name of the backup from which this backup was copied. If a backup is not created
   * by copying a backup, this field will be empty. Values are of the form:
   * projects//instances//clusters//backups/
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceBackup;

  /**
   * Required. Immutable. Name of the table from which this backup was created. This needs to be in
   * the same instance as the backup. Values are of the form
   * `projects/{project}/instances/{instance}/tables/{source_table}`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceTable;

  /**
   * Output only. `start_time` is the time that the backup was started (i.e. approximately the time
   * the CreateBackup request is received). The row data in this backup will be no older than this
   * timestamp.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Output only. The current state of the backup.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. The encryption information for the backup.
   * @return value or {@code null} for none
   */
  public EncryptionInfo getEncryptionInfo() {
    return encryptionInfo;
  }

  /**
   * Output only. The encryption information for the backup.
   * @param encryptionInfo encryptionInfo or {@code null} for none
   */
  public Backup setEncryptionInfo(EncryptionInfo encryptionInfo) {
    this.encryptionInfo = encryptionInfo;
    return this;
  }

  /**
   * Output only. `end_time` is the time that the backup was finished. The row data in the backup
   * will be no newer than this timestamp.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. `end_time` is the time that the backup was finished. The row data in the backup
   * will be no newer than this timestamp.
   * @param endTime endTime or {@code null} for none
   */
  public Backup setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Required. The expiration time of the backup, with microseconds granularity that must be at
   * least 6 hours and at most 90 days from the time the request is received. Once the `expire_time`
   * has passed, Cloud Bigtable will delete the backup and free the resources used by the backup.
   * @return value or {@code null} for none
   */
  public String getExpireTime() {
    return expireTime;
  }

  /**
   * Required. The expiration time of the backup, with microseconds granularity that must be at
   * least 6 hours and at most 90 days from the time the request is received. Once the `expire_time`
   * has passed, Cloud Bigtable will delete the backup and free the resources used by the backup.
   * @param expireTime expireTime or {@code null} for none
   */
  public Backup setExpireTime(String expireTime) {
    this.expireTime = expireTime;
    return this;
  }

  /**
   * A globally unique identifier for the backup which cannot be changed. Values are of the form
   * `projects/{project}/instances/{instance}/clusters/{cluster}/ backups/_a-zA-Z0-9*` The final
   * segment of the name must be between 1 and 50 characters in length. The backup is stored in the
   * cluster identified by the prefix of the backup name of the form
   * `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * A globally unique identifier for the backup which cannot be changed. Values are of the form
   * `projects/{project}/instances/{instance}/clusters/{cluster}/ backups/_a-zA-Z0-9*` The final
   * segment of the name must be between 1 and 50 characters in length. The backup is stored in the
   * cluster identified by the prefix of the backup name of the form
   * `projects/{project}/instances/{instance}/clusters/{cluster}`.
   * @param name name or {@code null} for none
   */
  public Backup setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Size of the backup in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Long getSizeBytes() {
    return sizeBytes;
  }

  /**
   * Output only. Size of the backup in bytes.
   * @param sizeBytes sizeBytes or {@code null} for none
   */
  public Backup setSizeBytes(java.lang.Long sizeBytes) {
    this.sizeBytes = sizeBytes;
    return this;
  }

  /**
   * Output only. Name of the backup from which this backup was copied. If a backup is not created
   * by copying a backup, this field will be empty. Values are of the form:
   * projects//instances//clusters//backups/
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceBackup() {
    return sourceBackup;
  }

  /**
   * Output only. Name of the backup from which this backup was copied. If a backup is not created
   * by copying a backup, this field will be empty. Values are of the form:
   * projects//instances//clusters//backups/
   * @param sourceBackup sourceBackup or {@code null} for none
   */
  public Backup setSourceBackup(java.lang.String sourceBackup) {
    this.sourceBackup = sourceBackup;
    return this;
  }

  /**
   * Required. Immutable. Name of the table from which this backup was created. This needs to be in
   * the same instance as the backup. Values are of the form
   * `projects/{project}/instances/{instance}/tables/{source_table}`.
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceTable() {
    return sourceTable;
  }

  /**
   * Required. Immutable. Name of the table from which this backup was created. This needs to be in
   * the same instance as the backup. Values are of the form
   * `projects/{project}/instances/{instance}/tables/{source_table}`.
   * @param sourceTable sourceTable or {@code null} for none
   */
  public Backup setSourceTable(java.lang.String sourceTable) {
    this.sourceTable = sourceTable;
    return this;
  }

  /**
   * Output only. `start_time` is the time that the backup was started (i.e. approximately the time
   * the CreateBackup request is received). The row data in this backup will be no older than this
   * timestamp.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Output only. `start_time` is the time that the backup was started (i.e. approximately the time
   * the CreateBackup request is received). The row data in this backup will be no older than this
   * timestamp.
   * @param startTime startTime or {@code null} for none
   */
  public Backup setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Output only. The current state of the backup.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of the backup.
   * @param state state or {@code null} for none
   */
  public Backup setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Backup set(String fieldName, Object value) {
    return (Backup) super.set(fieldName, value);
  }

  @Override
  public Backup clone() {
    return (Backup) super.clone();
  }

}
