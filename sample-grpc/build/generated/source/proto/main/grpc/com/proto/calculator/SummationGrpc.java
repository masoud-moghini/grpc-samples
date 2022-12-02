package com.proto.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: Calculator/calculate.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SummationGrpc {

  private SummationGrpc() {}

  public static final String SERVICE_NAME = "calculator.Summation";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.CalculatorRequest,
      com.proto.calculator.CalculatorResponse> getSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Sum",
      requestType = com.proto.calculator.CalculatorRequest.class,
      responseType = com.proto.calculator.CalculatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.CalculatorRequest,
      com.proto.calculator.CalculatorResponse> getSumMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.CalculatorRequest, com.proto.calculator.CalculatorResponse> getSumMethod;
    if ((getSumMethod = SummationGrpc.getSumMethod) == null) {
      synchronized (SummationGrpc.class) {
        if ((getSumMethod = SummationGrpc.getSumMethod) == null) {
          SummationGrpc.getSumMethod = getSumMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.CalculatorRequest, com.proto.calculator.CalculatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Sum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.CalculatorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.CalculatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SummationMethodDescriptorSupplier("Sum"))
              .build();
        }
      }
    }
    return getSumMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.PrimeNumberRequest,
      com.proto.calculator.CalculatorResponse> getDecomposeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Decompose",
      requestType = com.proto.calculator.PrimeNumberRequest.class,
      responseType = com.proto.calculator.CalculatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.PrimeNumberRequest,
      com.proto.calculator.CalculatorResponse> getDecomposeMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.PrimeNumberRequest, com.proto.calculator.CalculatorResponse> getDecomposeMethod;
    if ((getDecomposeMethod = SummationGrpc.getDecomposeMethod) == null) {
      synchronized (SummationGrpc.class) {
        if ((getDecomposeMethod = SummationGrpc.getDecomposeMethod) == null) {
          SummationGrpc.getDecomposeMethod = getDecomposeMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.PrimeNumberRequest, com.proto.calculator.CalculatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Decompose"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.PrimeNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.CalculatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SummationMethodDescriptorSupplier("Decompose"))
              .build();
        }
      }
    }
    return getDecomposeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.AverageNumberRequest,
      com.proto.calculator.CalculatorResponse> getAverageMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Average",
      requestType = com.proto.calculator.AverageNumberRequest.class,
      responseType = com.proto.calculator.CalculatorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.AverageNumberRequest,
      com.proto.calculator.CalculatorResponse> getAverageMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.AverageNumberRequest, com.proto.calculator.CalculatorResponse> getAverageMethod;
    if ((getAverageMethod = SummationGrpc.getAverageMethod) == null) {
      synchronized (SummationGrpc.class) {
        if ((getAverageMethod = SummationGrpc.getAverageMethod) == null) {
          SummationGrpc.getAverageMethod = getAverageMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.AverageNumberRequest, com.proto.calculator.CalculatorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Average"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.AverageNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.CalculatorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SummationMethodDescriptorSupplier("Average"))
              .build();
        }
      }
    }
    return getAverageMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SummationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SummationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SummationStub>() {
        @java.lang.Override
        public SummationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SummationStub(channel, callOptions);
        }
      };
    return SummationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SummationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SummationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SummationBlockingStub>() {
        @java.lang.Override
        public SummationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SummationBlockingStub(channel, callOptions);
        }
      };
    return SummationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SummationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SummationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SummationFutureStub>() {
        @java.lang.Override
        public SummationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SummationFutureStub(channel, callOptions);
        }
      };
    return SummationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SummationImplBase implements io.grpc.BindableService {

    /**
     */
    public void sum(com.proto.calculator.CalculatorRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSumMethod(), responseObserver);
    }

    /**
     */
    public void decompose(com.proto.calculator.PrimeNumberRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDecomposeMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.AverageNumberRequest> average(
        io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getAverageMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSumMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.CalculatorRequest,
                com.proto.calculator.CalculatorResponse>(
                  this, METHODID_SUM)))
          .addMethod(
            getDecomposeMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.calculator.PrimeNumberRequest,
                com.proto.calculator.CalculatorResponse>(
                  this, METHODID_DECOMPOSE)))
          .addMethod(
            getAverageMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.proto.calculator.AverageNumberRequest,
                com.proto.calculator.CalculatorResponse>(
                  this, METHODID_AVERAGE)))
          .build();
    }
  }

  /**
   */
  public static final class SummationStub extends io.grpc.stub.AbstractAsyncStub<SummationStub> {
    private SummationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SummationStub(channel, callOptions);
    }

    /**
     */
    public void sum(com.proto.calculator.CalculatorRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void decompose(com.proto.calculator.PrimeNumberRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDecomposeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.calculator.AverageNumberRequest> average(
        io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getAverageMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class SummationBlockingStub extends io.grpc.stub.AbstractBlockingStub<SummationBlockingStub> {
    private SummationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SummationBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.calculator.CalculatorResponse sum(com.proto.calculator.CalculatorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSumMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.calculator.CalculatorResponse> decompose(
        com.proto.calculator.PrimeNumberRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDecomposeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SummationFutureStub extends io.grpc.stub.AbstractFutureStub<SummationFutureStub> {
    private SummationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SummationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SummationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.CalculatorResponse> sum(
        com.proto.calculator.CalculatorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUM = 0;
  private static final int METHODID_DECOMPOSE = 1;
  private static final int METHODID_AVERAGE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SummationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SummationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUM:
          serviceImpl.sum((com.proto.calculator.CalculatorRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse>) responseObserver);
          break;
        case METHODID_DECOMPOSE:
          serviceImpl.decompose((com.proto.calculator.PrimeNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AVERAGE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.average(
              (io.grpc.stub.StreamObserver<com.proto.calculator.CalculatorResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class SummationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SummationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.Calculate.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Summation");
    }
  }

  private static final class SummationFileDescriptorSupplier
      extends SummationBaseDescriptorSupplier {
    SummationFileDescriptorSupplier() {}
  }

  private static final class SummationMethodDescriptorSupplier
      extends SummationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SummationMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SummationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SummationFileDescriptorSupplier())
              .addMethod(getSumMethod())
              .addMethod(getDecomposeMethod())
              .addMethod(getAverageMethod())
              .build();
        }
      }
    }
    return result;
  }
}
