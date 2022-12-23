package com.proto.calculator;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.50.2)",
    comments = "Source: Blog/blog.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BlogServiceGrpc {

  private BlogServiceGrpc() {}

  public static final String SERVICE_NAME = "calculator.BlogService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.CreateBlogRequest,
      com.proto.calculator.CreateBlogResponse> getCreateBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBlog",
      requestType = com.proto.calculator.CreateBlogRequest.class,
      responseType = com.proto.calculator.CreateBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.CreateBlogRequest,
      com.proto.calculator.CreateBlogResponse> getCreateBlogMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.CreateBlogRequest, com.proto.calculator.CreateBlogResponse> getCreateBlogMethod;
    if ((getCreateBlogMethod = BlogServiceGrpc.getCreateBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getCreateBlogMethod = BlogServiceGrpc.getCreateBlogMethod) == null) {
          BlogServiceGrpc.getCreateBlogMethod = getCreateBlogMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.CreateBlogRequest, com.proto.calculator.CreateBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.CreateBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.CreateBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("CreateBlog"))
              .build();
        }
      }
    }
    return getCreateBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.ReadBlogRequest,
      com.proto.calculator.ReadBlogResponse> getReadBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadBlog",
      requestType = com.proto.calculator.ReadBlogRequest.class,
      responseType = com.proto.calculator.ReadBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.ReadBlogRequest,
      com.proto.calculator.ReadBlogResponse> getReadBlogMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.ReadBlogRequest, com.proto.calculator.ReadBlogResponse> getReadBlogMethod;
    if ((getReadBlogMethod = BlogServiceGrpc.getReadBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getReadBlogMethod = BlogServiceGrpc.getReadBlogMethod) == null) {
          BlogServiceGrpc.getReadBlogMethod = getReadBlogMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.ReadBlogRequest, com.proto.calculator.ReadBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.ReadBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.ReadBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("ReadBlog"))
              .build();
        }
      }
    }
    return getReadBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.UpdateBlogRequest,
      com.proto.calculator.UpdateBlogResponse> getUpdateBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateBlog",
      requestType = com.proto.calculator.UpdateBlogRequest.class,
      responseType = com.proto.calculator.UpdateBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.UpdateBlogRequest,
      com.proto.calculator.UpdateBlogResponse> getUpdateBlogMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.UpdateBlogRequest, com.proto.calculator.UpdateBlogResponse> getUpdateBlogMethod;
    if ((getUpdateBlogMethod = BlogServiceGrpc.getUpdateBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getUpdateBlogMethod = BlogServiceGrpc.getUpdateBlogMethod) == null) {
          BlogServiceGrpc.getUpdateBlogMethod = getUpdateBlogMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.UpdateBlogRequest, com.proto.calculator.UpdateBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.UpdateBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.UpdateBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("UpdateBlog"))
              .build();
        }
      }
    }
    return getUpdateBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.DeleteBlogRequest,
      com.proto.calculator.DeleteBlogResponse> getDeleteBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteBlog",
      requestType = com.proto.calculator.DeleteBlogRequest.class,
      responseType = com.proto.calculator.DeleteBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.calculator.DeleteBlogRequest,
      com.proto.calculator.DeleteBlogResponse> getDeleteBlogMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.DeleteBlogRequest, com.proto.calculator.DeleteBlogResponse> getDeleteBlogMethod;
    if ((getDeleteBlogMethod = BlogServiceGrpc.getDeleteBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getDeleteBlogMethod = BlogServiceGrpc.getDeleteBlogMethod) == null) {
          BlogServiceGrpc.getDeleteBlogMethod = getDeleteBlogMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.DeleteBlogRequest, com.proto.calculator.DeleteBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.DeleteBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.DeleteBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("DeleteBlog"))
              .build();
        }
      }
    }
    return getDeleteBlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.calculator.ListBlogRequest,
      com.proto.calculator.ListBlogResponse> getListBlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListBlog",
      requestType = com.proto.calculator.ListBlogRequest.class,
      responseType = com.proto.calculator.ListBlogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.calculator.ListBlogRequest,
      com.proto.calculator.ListBlogResponse> getListBlogMethod() {
    io.grpc.MethodDescriptor<com.proto.calculator.ListBlogRequest, com.proto.calculator.ListBlogResponse> getListBlogMethod;
    if ((getListBlogMethod = BlogServiceGrpc.getListBlogMethod) == null) {
      synchronized (BlogServiceGrpc.class) {
        if ((getListBlogMethod = BlogServiceGrpc.getListBlogMethod) == null) {
          BlogServiceGrpc.getListBlogMethod = getListBlogMethod =
              io.grpc.MethodDescriptor.<com.proto.calculator.ListBlogRequest, com.proto.calculator.ListBlogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListBlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.ListBlogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.calculator.ListBlogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BlogServiceMethodDescriptorSupplier("ListBlog"))
              .build();
        }
      }
    }
    return getListBlogMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BlogServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogServiceStub>() {
        @java.lang.Override
        public BlogServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogServiceStub(channel, callOptions);
        }
      };
    return BlogServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BlogServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogServiceBlockingStub>() {
        @java.lang.Override
        public BlogServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogServiceBlockingStub(channel, callOptions);
        }
      };
    return BlogServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BlogServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BlogServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BlogServiceFutureStub>() {
        @java.lang.Override
        public BlogServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BlogServiceFutureStub(channel, callOptions);
        }
      };
    return BlogServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BlogServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void createBlog(com.proto.calculator.CreateBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.CreateBlogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBlogMethod(), responseObserver);
    }

    /**
     */
    public void readBlog(com.proto.calculator.ReadBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.ReadBlogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadBlogMethod(), responseObserver);
    }

    /**
     */
    public void updateBlog(com.proto.calculator.UpdateBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.UpdateBlogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateBlogMethod(), responseObserver);
    }

    /**
     */
    public void deleteBlog(com.proto.calculator.DeleteBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.DeleteBlogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteBlogMethod(), responseObserver);
    }

    /**
     */
    public void listBlog(com.proto.calculator.ListBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.ListBlogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListBlogMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateBlogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.CreateBlogRequest,
                com.proto.calculator.CreateBlogResponse>(
                  this, METHODID_CREATE_BLOG)))
          .addMethod(
            getReadBlogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.ReadBlogRequest,
                com.proto.calculator.ReadBlogResponse>(
                  this, METHODID_READ_BLOG)))
          .addMethod(
            getUpdateBlogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.UpdateBlogRequest,
                com.proto.calculator.UpdateBlogResponse>(
                  this, METHODID_UPDATE_BLOG)))
          .addMethod(
            getDeleteBlogMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.calculator.DeleteBlogRequest,
                com.proto.calculator.DeleteBlogResponse>(
                  this, METHODID_DELETE_BLOG)))
          .addMethod(
            getListBlogMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.calculator.ListBlogRequest,
                com.proto.calculator.ListBlogResponse>(
                  this, METHODID_LIST_BLOG)))
          .build();
    }
  }

  /**
   */
  public static final class BlogServiceStub extends io.grpc.stub.AbstractAsyncStub<BlogServiceStub> {
    private BlogServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogServiceStub(channel, callOptions);
    }

    /**
     */
    public void createBlog(com.proto.calculator.CreateBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.CreateBlogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void readBlog(com.proto.calculator.ReadBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.ReadBlogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReadBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateBlog(com.proto.calculator.UpdateBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.UpdateBlogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteBlog(com.proto.calculator.DeleteBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.DeleteBlogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteBlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listBlog(com.proto.calculator.ListBlogRequest request,
        io.grpc.stub.StreamObserver<com.proto.calculator.ListBlogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getListBlogMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BlogServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BlogServiceBlockingStub> {
    private BlogServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.calculator.CreateBlogResponse createBlog(com.proto.calculator.CreateBlogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.calculator.ReadBlogResponse readBlog(com.proto.calculator.ReadBlogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReadBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.calculator.UpdateBlogResponse updateBlog(com.proto.calculator.UpdateBlogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.calculator.DeleteBlogResponse deleteBlog(com.proto.calculator.DeleteBlogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteBlogMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.proto.calculator.ListBlogResponse> listBlog(
        com.proto.calculator.ListBlogRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getListBlogMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BlogServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BlogServiceFutureStub> {
    private BlogServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlogServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BlogServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.CreateBlogResponse> createBlog(
        com.proto.calculator.CreateBlogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBlogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.ReadBlogResponse> readBlog(
        com.proto.calculator.ReadBlogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReadBlogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.UpdateBlogResponse> updateBlog(
        com.proto.calculator.UpdateBlogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateBlogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.calculator.DeleteBlogResponse> deleteBlog(
        com.proto.calculator.DeleteBlogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteBlogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_BLOG = 0;
  private static final int METHODID_READ_BLOG = 1;
  private static final int METHODID_UPDATE_BLOG = 2;
  private static final int METHODID_DELETE_BLOG = 3;
  private static final int METHODID_LIST_BLOG = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BlogServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BlogServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_BLOG:
          serviceImpl.createBlog((com.proto.calculator.CreateBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.CreateBlogResponse>) responseObserver);
          break;
        case METHODID_READ_BLOG:
          serviceImpl.readBlog((com.proto.calculator.ReadBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.ReadBlogResponse>) responseObserver);
          break;
        case METHODID_UPDATE_BLOG:
          serviceImpl.updateBlog((com.proto.calculator.UpdateBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.UpdateBlogResponse>) responseObserver);
          break;
        case METHODID_DELETE_BLOG:
          serviceImpl.deleteBlog((com.proto.calculator.DeleteBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.DeleteBlogResponse>) responseObserver);
          break;
        case METHODID_LIST_BLOG:
          serviceImpl.listBlog((com.proto.calculator.ListBlogRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.calculator.ListBlogResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BlogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BlogServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.calculator.BlogOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BlogService");
    }
  }

  private static final class BlogServiceFileDescriptorSupplier
      extends BlogServiceBaseDescriptorSupplier {
    BlogServiceFileDescriptorSupplier() {}
  }

  private static final class BlogServiceMethodDescriptorSupplier
      extends BlogServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BlogServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BlogServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BlogServiceFileDescriptorSupplier())
              .addMethod(getCreateBlogMethod())
              .addMethod(getReadBlogMethod())
              .addMethod(getUpdateBlogMethod())
              .addMethod(getDeleteBlogMethod())
              .addMethod(getListBlogMethod())
              .build();
        }
      }
    }
    return result;
  }
}
