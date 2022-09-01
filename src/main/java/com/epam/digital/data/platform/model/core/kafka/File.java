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

import javax.validation.constraints.NotNull;
import java.util.Objects;

public class File {

  @NotNull
  private String id;
  @NotNull
  private String checksum;

  public File() {
  }

  public File(String id, String checksum) {
    this.id = id;
    this.checksum = checksum;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getChecksum() {
    return checksum;
  }

  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    File file = (File) o;
    return Objects.equals(id, file.id) && Objects.equals(checksum, file.checksum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, checksum);
  }

  @Override
  public String toString() {
    return "File{" + "id='" + id + '\'' + ", checksum='" + checksum + '\'' + '}';
  }
}
