/*
 * Copyright 2022 EPAM Systems.
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

package com.epam.digital.data.platform.model.core.geometry;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

public class Polygon extends Geometry {

  @NotNull
  @Size(min = 4)
  @Valid
  private List<Dot> dots;

  public Polygon() {}

  public Polygon(List<Dot> dots) {
    this.dots = dots;
  }

  public List<Dot> getDots() {
    return dots;
  }

  public void setDots(List<Dot> dots) {
    this.dots = dots;
  }
}
