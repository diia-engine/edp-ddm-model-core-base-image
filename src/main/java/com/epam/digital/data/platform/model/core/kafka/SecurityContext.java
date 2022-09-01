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

import java.util.Objects;

public class SecurityContext {

  private String accessToken;
  private String digitalSignature;
  private String digitalSignatureDerived;

  private String digitalSignatureChecksum;
  private String digitalSignatureDerivedChecksum;

  public SecurityContext(){}

  public SecurityContext(
      String accessToken,
      String digitalSignature,
      String digitalSignatureDerived) {
    this.accessToken = accessToken;
    this.digitalSignature = digitalSignature;
    this.digitalSignatureDerived = digitalSignatureDerived;
  }

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public String getDigitalSignature() {
    return digitalSignature;
  }

  public void setDigitalSignature(String digitalSignature) {
    this.digitalSignature = digitalSignature;
  }

  public String getDigitalSignatureDerived() {
    return digitalSignatureDerived;
  }

  public void setDigitalSignatureDerived(String digitalSignatureDerived) {
    this.digitalSignatureDerived = digitalSignatureDerived;
  }

  public String getDigitalSignatureChecksum() {
    return digitalSignatureChecksum;
  }

  public void setDigitalSignatureChecksum(String digitalSignatureChecksum) {
    this.digitalSignatureChecksum = digitalSignatureChecksum;
  }

  public String getDigitalSignatureDerivedChecksum() {
    return digitalSignatureDerivedChecksum;
  }

  public void setDigitalSignatureDerivedChecksum(String digitalSignatureDerivedChecksum) {
    this.digitalSignatureDerivedChecksum = digitalSignatureDerivedChecksum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityContext that = (SecurityContext) o;
    return Objects.equals(accessToken, that.accessToken) && Objects
        .equals(digitalSignature, that.digitalSignature) && Objects
        .equals(digitalSignatureDerived, that.digitalSignatureDerived) && Objects
        .equals(digitalSignatureChecksum, that.digitalSignatureChecksum) && Objects
        .equals(digitalSignatureDerivedChecksum, that.digitalSignatureDerivedChecksum);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(accessToken, digitalSignature, digitalSignatureDerived, digitalSignatureChecksum,
            digitalSignatureDerivedChecksum);
  }
}
