/*
 * Copyright 2021 EPAM Systems.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.epam.digital.data.platform.model.core.kafka;

public class RequestContext {

  private String system;
  private String application;
  private String businessProcess;
  private String businessProcessDefinitionId;
  private String businessProcessInstanceId;
  private String businessActivity;
  private String businessActivityInstanceId;

  public String getSystem() {
    return system;
  }

  public void setSystem(String system) {
    this.system = system;
  }

  public String getApplication() {
    return application;
  }

  public void setApplication(String application) {
    this.application = application;
  }

  public String getBusinessProcess() {
    return businessProcess;
  }

  public void setBusinessProcess(String businessProcess) {
    this.businessProcess = businessProcess;
  }

  public String getBusinessProcessDefinitionId() {
    return businessProcessDefinitionId;
  }

  public void setBusinessProcessDefinitionId(String businessProcessDefinitionId) {
    this.businessProcessDefinitionId = businessProcessDefinitionId;
  }

  public String getBusinessProcessInstanceId() {
    return businessProcessInstanceId;
  }

  public void setBusinessProcessInstanceId(String businessProcessInstanceId) {
    this.businessProcessInstanceId = businessProcessInstanceId;
  }

  public String getBusinessActivity() {
    return businessActivity;
  }

  public void setBusinessActivity(String businessActivity) {
    this.businessActivity = businessActivity;
  }

  public String getBusinessActivityInstanceId() {
    return businessActivityInstanceId;
  }

  public void setBusinessActivityInstanceId(String businessActivityInstanceId) {
    this.businessActivityInstanceId = businessActivityInstanceId;
  }
}
