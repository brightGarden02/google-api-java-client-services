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

package com.google.api.services.chat.v1.model;

/**
 * Either a toggle-style switch or a checkbox inside a `decoratedText` widget. [Google Workspace
 * Add-ons and Chat apps](https://developers.google.com/workspace/extend): Only supported in the
 * `decoratedText` widget.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Chat API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleAppsCardV1SwitchControl extends com.google.api.client.json.GenericJson {

  /**
   * How the switch appears in the user interface. [Google Workspace Add-ons and Chat
   * apps](https://developers.google.com/workspace/extend):
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String controlType;

  /**
   * The name by which the switch widget is identified in a form input event. For details about
   * working with form inputs, see [Receive form data](https://developers.google.com/workspace/chat
   * /read-form-data).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The action to perform when the switch state is changed, such as what function to run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleAppsCardV1Action onChangeAction;

  /**
   * When `true`, the switch is selected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean selected;

  /**
   * The value entered by a user, returned as part of a form input event. For details about working
   * with form inputs, see [Receive form data](https://developers.google.com/workspace/chat/read-
   * form-data).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * How the switch appears in the user interface. [Google Workspace Add-ons and Chat
   * apps](https://developers.google.com/workspace/extend):
   * @return value or {@code null} for none
   */
  public java.lang.String getControlType() {
    return controlType;
  }

  /**
   * How the switch appears in the user interface. [Google Workspace Add-ons and Chat
   * apps](https://developers.google.com/workspace/extend):
   * @param controlType controlType or {@code null} for none
   */
  public GoogleAppsCardV1SwitchControl setControlType(java.lang.String controlType) {
    this.controlType = controlType;
    return this;
  }

  /**
   * The name by which the switch widget is identified in a form input event. For details about
   * working with form inputs, see [Receive form data](https://developers.google.com/workspace/chat
   * /read-form-data).
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name by which the switch widget is identified in a form input event. For details about
   * working with form inputs, see [Receive form data](https://developers.google.com/workspace/chat
   * /read-form-data).
   * @param name name or {@code null} for none
   */
  public GoogleAppsCardV1SwitchControl setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The action to perform when the switch state is changed, such as what function to run.
   * @return value or {@code null} for none
   */
  public GoogleAppsCardV1Action getOnChangeAction() {
    return onChangeAction;
  }

  /**
   * The action to perform when the switch state is changed, such as what function to run.
   * @param onChangeAction onChangeAction or {@code null} for none
   */
  public GoogleAppsCardV1SwitchControl setOnChangeAction(GoogleAppsCardV1Action onChangeAction) {
    this.onChangeAction = onChangeAction;
    return this;
  }

  /**
   * When `true`, the switch is selected.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getSelected() {
    return selected;
  }

  /**
   * When `true`, the switch is selected.
   * @param selected selected or {@code null} for none
   */
  public GoogleAppsCardV1SwitchControl setSelected(java.lang.Boolean selected) {
    this.selected = selected;
    return this;
  }

  /**
   * The value entered by a user, returned as part of a form input event. For details about working
   * with form inputs, see [Receive form data](https://developers.google.com/workspace/chat/read-
   * form-data).
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The value entered by a user, returned as part of a form input event. For details about working
   * with form inputs, see [Receive form data](https://developers.google.com/workspace/chat/read-
   * form-data).
   * @param value value or {@code null} for none
   */
  public GoogleAppsCardV1SwitchControl setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public GoogleAppsCardV1SwitchControl set(String fieldName, Object value) {
    return (GoogleAppsCardV1SwitchControl) super.set(fieldName, value);
  }

  @Override
  public GoogleAppsCardV1SwitchControl clone() {
    return (GoogleAppsCardV1SwitchControl) super.clone();
  }

}
