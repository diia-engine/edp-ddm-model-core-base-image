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

public enum Status {
  SUCCESS,
  OPERATION_FAILED,
  NOT_FOUND,
  CREATED,
  NO_CONTENT,
  INVALID_SIGNATURE,
  THIRD_PARTY_SERVICE_UNAVAILABLE,
  PROCEDURE_ERROR,
  INTERNAL_CONTRACT_VIOLATION,
  CONSTRAINT_VIOLATION,
  JWT_EXPIRED,
  JWT_INVALID,
  FORBIDDEN_OPERATION,
  SQL_ERROR
}
