// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Greeting/greeting.proto

package com.proto.greeting;

public final class GreetingOuterClass {
  private GreetingOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_Greeting_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_Greeting_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_GreetingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_GreetingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_GreetingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_GreetingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027Greeting/greeting.proto\022\010greeting\"1\n\010G" +
      "reeting\022\022\n\nfirst_name\030\001 \001(\t\022\021\n\tlast_name" +
      "\030\002 \001(\t\"7\n\017GreetingRequest\022$\n\010greeting\030\001 " +
      "\001(\0132\022.greeting.Greeting\"\"\n\020GreetingRespo" +
      "nse\022\016\n\006result\030\001 \001(\t2Q\n\017GreetingService\022>" +
      "\n\005greet\022\031.greeting.GreetingRequest\032\032.gre" +
      "eting.GreetingResponseB\026\n\022com.proto.gree" +
      "tingP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_greeting_Greeting_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_greeting_Greeting_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_Greeting_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_greeting_GreetingRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_greeting_GreetingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_GreetingRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_greeting_GreetingResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_greeting_GreetingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_GreetingResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
