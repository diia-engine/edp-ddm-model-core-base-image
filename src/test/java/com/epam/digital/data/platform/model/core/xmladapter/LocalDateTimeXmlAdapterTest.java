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

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.*;

class LocalDateTimeXmlAdapterTest {

  private static final LocalDateTime PROCESSED_DATE = LocalDateTime.of(2021, 5, 6, 12, 12, 12, 777777777);
  private static final String DATE_STRING = "2021-05-06T12:12:12.777Z";

  private final LocalDateTimeXmlAdapter adapter = new LocalDateTimeXmlAdapter();

  @Test
  void shouldMarshalInFormatIfDateNotNull() {
    String actual = adapter.marshal(PROCESSED_DATE);
    assertEquals(DATE_STRING, actual);
  }

  @Test
  void shouldMarshalNullIfDateNull() {
    String actual = adapter.marshal(null);
    assertNull(actual);
  }

  @Test
  void shouldUnmarshalInFormatIfValidString() {
    LocalDateTime expected = LocalDateTime.of(2021, 5, 6, 12, 12, 12, 777000000);
    LocalDateTime actual = adapter.unmarshal(DATE_STRING);
    assertEquals(expected, actual);
  }

  @Test
  void shouldUnmarshalNullIfDateNull() {
    LocalDateTime actual = adapter.unmarshal(null);
    assertNull(actual);
  }

  @Test
  void shouldThrowExceptionOnUnmarshalIfInvalidInput() {
    assertThrows(DateTimeParseException.class, () -> adapter.unmarshal("str"));
  }
}
