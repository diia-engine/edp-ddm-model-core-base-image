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

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LocalDateXmlAdapterTest {

  private static final LocalDate PROCESSED_DATE =
      LocalDate.of(2021, 5, 6);
  private static final String DATE_STRING = "2021-05-06";

  private final LocalDateXmlAdapter adapter = new LocalDateXmlAdapter();

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
    LocalDate actual = adapter.unmarshal(DATE_STRING);
    assertEquals(PROCESSED_DATE, actual);
  }

  @Test
  void shouldUnmarshalNullIfDateNull() {
    LocalDate actual = adapter.unmarshal(null);
    assertNull(actual);
  }

  @Test
  void shouldThrowExceptionOnUnmarshalIfInvalidInput() {
    assertThrows(DateTimeParseException.class, () -> adapter.unmarshal("str"));
  }
}
