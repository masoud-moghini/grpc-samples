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
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_GreetingManyTimesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_GreetingManyTimesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_GreetingManyTimesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_GreetingManyTimesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_LongGreetingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_LongGreetingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_LongGreetingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_LongGreetingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_GreetingToEveryoneRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_GreetingToEveryoneRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_greeting_GreetingToEveryoneResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_greeting_GreetingToEveryoneResponse_fieldAccessorTable;

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
      "nse\022\016\n\006result\030\001 \001(\t\"?\n\030GreetingManyTimes" +
      "Request\022\021\n\tfirstName\030\001 \001(\t\022\020\n\010lastName\030\002" +
      " \001(\t\"+\n\031GreetingManyTimesResponse\022\016\n\006res" +
      "ult\030\001 \001(\t\"C\n\023LongGreetingRequest\022,\n\020gree" +
      "ting_request\030\001 \001(\0132\022.greeting.Greeting\"1" +
      "\n\024LongGreetingResponse\022\031\n\021greeting_respo" +
      "nse\030\001 \001(\t\"-\n\031GreetingToEveryoneRequest\022\020" +
      "\n\010greeting\030\001 \001(\t\",\n\032GreetingToEveryoneRe" +
      "sponse\022\016\n\006result\030\001 \001(\t2\351\002\n\017GreetingServi" +
      "ce\022>\n\005greet\022\031.greeting.GreetingRequest\032\032" +
      ".greeting.GreetingResponse\022[\n\016greetManyT" +
      "imes\022\".greeting.GreetingManyTimesRequest" +
      "\032#.greeting.GreetingManyTimesResponse0\001\022" +
      "T\n\014longGreeting\022\".greeting.GreetingManyT" +
      "imesRequest\032\036.greeting.LongGreetingRespo" +
      "nse(\001\022c\n\022greetingToEveryone\022#.greeting.G" +
      "reetingToEveryoneRequest\032$.greeting.Gree" +
      "tingToEveryoneResponse(\0010\001B\026\n\022com.proto." +
      "greetingP\001b\006proto3"
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
    internal_static_greeting_GreetingManyTimesRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_greeting_GreetingManyTimesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_GreetingManyTimesRequest_descriptor,
        new java.lang.String[] { "FirstName", "LastName", });
    internal_static_greeting_GreetingManyTimesResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_greeting_GreetingManyTimesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_GreetingManyTimesResponse_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_greeting_LongGreetingRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_greeting_LongGreetingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_LongGreetingRequest_descriptor,
        new java.lang.String[] { "GreetingRequest", });
    internal_static_greeting_LongGreetingResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_greeting_LongGreetingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_LongGreetingResponse_descriptor,
        new java.lang.String[] { "GreetingResponse", });
    internal_static_greeting_GreetingToEveryoneRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_greeting_GreetingToEveryoneRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_GreetingToEveryoneRequest_descriptor,
        new java.lang.String[] { "Greeting", });
    internal_static_greeting_GreetingToEveryoneResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_greeting_GreetingToEveryoneResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_greeting_GreetingToEveryoneResponse_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
