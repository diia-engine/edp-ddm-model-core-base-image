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

package com.epam.digital.data.platform.model.core.xmladapter;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import org.junit.jupiter.api.Test;

class LocalTimeXmlAdapterTest {

  private static final LocalTime PROCESSED_TIME = LocalTime.of(12, 5, 5);
  private static final String TIME_STRING = "12:05:05";

  private final LocalTimeXmlAdapter adapter = new LocalTimeXmlAdapter();

  @Test
  void shouldMarshalInFormatIfDateNotNull() {
    String actual = adapter.marshal(PROCESSED_TIME);
    assertEquals(TIME_STRING, actual);
  }

  @Test
  void shouldMarshalNullIfDateNull() {
    String actual = adapter.marshal(null);
    assertNull(actual);
  }

  @Test
  void shouldUnmarshalInFormatIfValidString() {
    LocalTime actual = adapter.unmarshal(TIME_STRING);
    assertEquals(PROCESSED_TIME, actual);
  }

  @Test
  void shouldUnmarshalNullIfDateNull() {
    LocalTime actual = adapter.unmarshal(null);
    assertNull(actual);
  }

  @Test
  void shouldThrowExceptionOnUnmarshalIfInvalidInput() {
    assertThrows(DateTimeParseException.class, () -> adapter.unmarshal("str"));
  }
}
