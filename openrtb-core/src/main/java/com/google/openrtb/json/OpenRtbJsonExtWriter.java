/*
 * Copyright 2014 Google Inc. All Rights Reserved.
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

package com.google.openrtb.json;

import com.google.protobuf.Message;

import com.fasterxml.jackson.core.JsonGenerator;

import java.io.IOException;

/**
 * A serialization extension, can add children of "ext" fields.
 */
public interface OpenRtbJsonExtWriter<M extends Message> {

  /**
   * Serialize all properties set in an extension node.
   *
   * @param msg The extension node
   * @param gen JSON generator
   */
  void write(M msg, JsonGenerator gen) throws IOException;
}
