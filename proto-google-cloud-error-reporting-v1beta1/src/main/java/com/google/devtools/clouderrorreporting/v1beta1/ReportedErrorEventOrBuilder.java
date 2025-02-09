/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouderrorreporting/v1beta1/report_errors_service.proto

package com.google.devtools.clouderrorreporting.v1beta1;

public interface ReportedErrorEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouderrorreporting.v1beta1.ReportedErrorEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Optional] Time when the event occurred.
   * If not provided, the time when the event was received by the
   * Error Reporting system will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1;</code>
   */
  boolean hasEventTime();
  /**
   *
   *
   * <pre>
   * [Optional] Time when the event occurred.
   * If not provided, the time when the event was received by the
   * Error Reporting system will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1;</code>
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   *
   *
   * <pre>
   * [Optional] Time when the event occurred.
   * If not provided, the time when the event was received by the
   * Error Reporting system will be used.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * [Required] The service context in which this error has occurred.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ServiceContext service_context = 2;</code>
   */
  boolean hasServiceContext();
  /**
   *
   *
   * <pre>
   * [Required] The service context in which this error has occurred.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ServiceContext service_context = 2;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ServiceContext getServiceContext();
  /**
   *
   *
   * <pre>
   * [Required] The service context in which this error has occurred.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ServiceContext service_context = 2;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ServiceContextOrBuilder
      getServiceContextOrBuilder();

  /**
   *
   *
   * <pre>
   * [Required] A message describing the error. The message can contain an
   * exception stack in one of the supported programming languages and formats.
   * In that case, the message is parsed and detailed exception information
   * is returned when retrieving the error event again.
   * </pre>
   *
   * <code>string message = 3;</code>
   */
  java.lang.String getMessage();
  /**
   *
   *
   * <pre>
   * [Required] A message describing the error. The message can contain an
   * exception stack in one of the supported programming languages and formats.
   * In that case, the message is parsed and detailed exception information
   * is returned when retrieving the error event again.
   * </pre>
   *
   * <code>string message = 3;</code>
   */
  com.google.protobuf.ByteString getMessageBytes();

  /**
   *
   *
   * <pre>
   * [Optional] A description of the context in which the error occurred.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorContext context = 4;</code>
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * [Optional] A description of the context in which the error occurred.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorContext context = 4;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ErrorContext getContext();
  /**
   *
   *
   * <pre>
   * [Optional] A description of the context in which the error occurred.
   * </pre>
   *
   * <code>.google.devtools.clouderrorreporting.v1beta1.ErrorContext context = 4;</code>
   */
  com.google.devtools.clouderrorreporting.v1beta1.ErrorContextOrBuilder getContextOrBuilder();
}
