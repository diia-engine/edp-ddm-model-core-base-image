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

import com.fasterxml.jackson.annotation.JsonTypeInfo;

public class Request<T> {

  @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, property = "@class")
  private T payload;
  private RequestContext requestContext;
  private SecurityContext securityContext;

  public Request() {
  }

  public Request(T payload, SecurityContext securityContext) {
    this.payload = payload;
    this.securityContext = securityContext;
  }

  public Request(T payload,
      RequestContext requestContext,
      SecurityContext securityContext) {
    this.payload = payload;
    this.requestContext = requestContext;
    this.securityContext = securityContext;
  }

  public T getPayload() {
    return payload;
  }

  public void setPayload(T payload) {
    this.payload = payload;
  }

  public RequestContext getRequestContext() {
    return requestContext;
  }

  public void setRequestContext(RequestContext requestContext) {
    this.requestContext = requestContext;
  }

  public SecurityContext getSecurityContext() {
    return securityContext;
  }

  public void setSecurityContext(SecurityContext securityContext) {
    this.securityContext = securityContext;
  }
}
