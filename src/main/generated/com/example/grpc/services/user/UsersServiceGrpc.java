package com.example.grpc.services.user;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.57.2)",
    comments = "Source: user.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UsersServiceGrpc {

  private UsersServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "grpc.UsersService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.example.grpc.services.user.UserProto.User> getFindByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findById",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.example.grpc.services.user.UserProto.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.example.grpc.services.user.UserProto.User> getFindByIdMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.example.grpc.services.user.UserProto.User> getFindByIdMethod;
    if ((getFindByIdMethod = UsersServiceGrpc.getFindByIdMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getFindByIdMethod = UsersServiceGrpc.getFindByIdMethod) == null) {
          UsersServiceGrpc.getFindByIdMethod = getFindByIdMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.example.grpc.services.user.UserProto.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.services.user.UserProto.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("findById"))
              .build();
        }
      }
    }
    return getFindByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.example.grpc.services.user.UserProto.User> getFindByUserNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findByUserName",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.example.grpc.services.user.UserProto.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.example.grpc.services.user.UserProto.User> getFindByUserNameMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.example.grpc.services.user.UserProto.User> getFindByUserNameMethod;
    if ((getFindByUserNameMethod = UsersServiceGrpc.getFindByUserNameMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getFindByUserNameMethod = UsersServiceGrpc.getFindByUserNameMethod) == null) {
          UsersServiceGrpc.getFindByUserNameMethod = getFindByUserNameMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.example.grpc.services.user.UserProto.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findByUserName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.services.user.UserProto.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("findByUserName"))
              .build();
        }
      }
    }
    return getFindByUserNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.example.grpc.services.user.UserProto.Users> getFindAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findAll",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.example.grpc.services.user.UserProto.Users.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.example.grpc.services.user.UserProto.Users> getFindAllMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.example.grpc.services.user.UserProto.Users> getFindAllMethod;
    if ((getFindAllMethod = UsersServiceGrpc.getFindAllMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getFindAllMethod = UsersServiceGrpc.getFindAllMethod) == null) {
          UsersServiceGrpc.getFindAllMethod = getFindAllMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.example.grpc.services.user.UserProto.Users>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.services.user.UserProto.Users.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("findAll"))
              .build();
        }
      }
    }
    return getFindAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.services.user.UserProto.User,
      com.example.grpc.services.user.UserProto.User> getAddUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addUser",
      requestType = com.example.grpc.services.user.UserProto.User.class,
      responseType = com.example.grpc.services.user.UserProto.User.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.services.user.UserProto.User,
      com.example.grpc.services.user.UserProto.User> getAddUserMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.services.user.UserProto.User, com.example.grpc.services.user.UserProto.User> getAddUserMethod;
    if ((getAddUserMethod = UsersServiceGrpc.getAddUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getAddUserMethod = UsersServiceGrpc.getAddUserMethod) == null) {
          UsersServiceGrpc.getAddUserMethod = getAddUserMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.services.user.UserProto.User, com.example.grpc.services.user.UserProto.User>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.services.user.UserProto.User.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.services.user.UserProto.User.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("addUser"))
              .build();
        }
      }
    }
    return getAddUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.example.grpc.services.user.UserProto.UpdateUserNameDTO,
      com.google.protobuf.Empty> getUpdateUserNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateUserName",
      requestType = com.example.grpc.services.user.UserProto.UpdateUserNameDTO.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.example.grpc.services.user.UserProto.UpdateUserNameDTO,
      com.google.protobuf.Empty> getUpdateUserNameMethod() {
    io.grpc.MethodDescriptor<com.example.grpc.services.user.UserProto.UpdateUserNameDTO, com.google.protobuf.Empty> getUpdateUserNameMethod;
    if ((getUpdateUserNameMethod = UsersServiceGrpc.getUpdateUserNameMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getUpdateUserNameMethod = UsersServiceGrpc.getUpdateUserNameMethod) == null) {
          UsersServiceGrpc.getUpdateUserNameMethod = getUpdateUserNameMethod =
              io.grpc.MethodDescriptor.<com.example.grpc.services.user.UserProto.UpdateUserNameDTO, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateUserName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.example.grpc.services.user.UserProto.UpdateUserNameDTO.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("updateUserName"))
              .build();
        }
      }
    }
    return getUpdateUserNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.google.protobuf.Empty> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteUser",
      requestType = com.google.protobuf.StringValue.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.StringValue,
      com.google.protobuf.Empty> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.StringValue, com.google.protobuf.Empty> getDeleteUserMethod;
    if ((getDeleteUserMethod = UsersServiceGrpc.getDeleteUserMethod) == null) {
      synchronized (UsersServiceGrpc.class) {
        if ((getDeleteUserMethod = UsersServiceGrpc.getDeleteUserMethod) == null) {
          UsersServiceGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.StringValue, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.StringValue.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new UsersServiceMethodDescriptorSupplier("deleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UsersServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceStub>() {
        @java.lang.Override
        public UsersServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceStub(channel, callOptions);
        }
      };
    return UsersServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UsersServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceBlockingStub>() {
        @java.lang.Override
        public UsersServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceBlockingStub(channel, callOptions);
        }
      };
    return UsersServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UsersServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UsersServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UsersServiceFutureStub>() {
        @java.lang.Override
        public UsersServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UsersServiceFutureStub(channel, callOptions);
        }
      };
    return UsersServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void findById(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.example.grpc.services.user.UserProto.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByIdMethod(), responseObserver);
    }

    /**
     */
    default void findByUserName(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.example.grpc.services.user.UserProto.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindByUserNameMethod(), responseObserver);
    }

    /**
     */
    default void findAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.services.user.UserProto.Users> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAllMethod(), responseObserver);
    }

    /**
     */
    default void addUser(com.example.grpc.services.user.UserProto.User request,
        io.grpc.stub.StreamObserver<com.example.grpc.services.user.UserProto.User> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddUserMethod(), responseObserver);
    }

    /**
     */
    default void updateUserName(com.example.grpc.services.user.UserProto.UpdateUserNameDTO request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserNameMethod(), responseObserver);
    }

    /**
     */
    default void deleteUser(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service UsersService.
   */
  public static abstract class UsersServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return UsersServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service UsersService.
   */
  public static final class UsersServiceStub
      extends io.grpc.stub.AbstractAsyncStub<UsersServiceStub> {
    private UsersServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceStub(channel, callOptions);
    }

    /**
     */
    public void findById(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.example.grpc.services.user.UserProto.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findByUserName(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.example.grpc.services.user.UserProto.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindByUserNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAll(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.example.grpc.services.user.UserProto.Users> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addUser(com.example.grpc.services.user.UserProto.User request,
        io.grpc.stub.StreamObserver<com.example.grpc.services.user.UserProto.User> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUserName(com.example.grpc.services.user.UserProto.UpdateUserNameDTO request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.google.protobuf.StringValue request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service UsersService.
   */
  public static final class UsersServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<UsersServiceBlockingStub> {
    private UsersServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.example.grpc.services.user.UserProto.User findById(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.services.user.UserProto.User findByUserName(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindByUserNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.services.user.UserProto.Users findAll(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFindAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.example.grpc.services.user.UserProto.User addUser(com.example.grpc.services.user.UserProto.User request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty updateUserName(com.example.grpc.services.user.UserProto.UpdateUserNameDTO request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty deleteUser(com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service UsersService.
   */
  public static final class UsersServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<UsersServiceFutureStub> {
    private UsersServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UsersServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UsersServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.services.user.UserProto.User> findById(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.services.user.UserProto.User> findByUserName(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindByUserNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.services.user.UserProto.Users> findAll(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFindAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.example.grpc.services.user.UserProto.User> addUser(
        com.example.grpc.services.user.UserProto.User request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> updateUserName(
        com.example.grpc.services.user.UserProto.UpdateUserNameDTO request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> deleteUser(
        com.google.protobuf.StringValue request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FIND_BY_ID = 0;
  private static final int METHODID_FIND_BY_USER_NAME = 1;
  private static final int METHODID_FIND_ALL = 2;
  private static final int METHODID_ADD_USER = 3;
  private static final int METHODID_UPDATE_USER_NAME = 4;
  private static final int METHODID_DELETE_USER = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_BY_ID:
          serviceImpl.findById((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.services.user.UserProto.User>) responseObserver);
          break;
        case METHODID_FIND_BY_USER_NAME:
          serviceImpl.findByUserName((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.services.user.UserProto.User>) responseObserver);
          break;
        case METHODID_FIND_ALL:
          serviceImpl.findAll((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.services.user.UserProto.Users>) responseObserver);
          break;
        case METHODID_ADD_USER:
          serviceImpl.addUser((com.example.grpc.services.user.UserProto.User) request,
              (io.grpc.stub.StreamObserver<com.example.grpc.services.user.UserProto.User>) responseObserver);
          break;
        case METHODID_UPDATE_USER_NAME:
          serviceImpl.updateUserName((com.example.grpc.services.user.UserProto.UpdateUserNameDTO) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.google.protobuf.StringValue) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getFindByIdMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.StringValue,
              com.example.grpc.services.user.UserProto.User>(
                service, METHODID_FIND_BY_ID)))
        .addMethod(
          getFindByUserNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.StringValue,
              com.example.grpc.services.user.UserProto.User>(
                service, METHODID_FIND_BY_USER_NAME)))
        .addMethod(
          getFindAllMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              com.example.grpc.services.user.UserProto.Users>(
                service, METHODID_FIND_ALL)))
        .addMethod(
          getAddUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.services.user.UserProto.User,
              com.example.grpc.services.user.UserProto.User>(
                service, METHODID_ADD_USER)))
        .addMethod(
          getUpdateUserNameMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.example.grpc.services.user.UserProto.UpdateUserNameDTO,
              com.google.protobuf.Empty>(
                service, METHODID_UPDATE_USER_NAME)))
        .addMethod(
          getDeleteUserMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.google.protobuf.StringValue,
              com.google.protobuf.Empty>(
                service, METHODID_DELETE_USER)))
        .build();
  }

  private static abstract class UsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UsersServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.example.grpc.services.user.UserProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UsersService");
    }
  }

  private static final class UsersServiceFileDescriptorSupplier
      extends UsersServiceBaseDescriptorSupplier {
    UsersServiceFileDescriptorSupplier() {}
  }

  private static final class UsersServiceMethodDescriptorSupplier
      extends UsersServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    UsersServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (UsersServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UsersServiceFileDescriptorSupplier())
              .addMethod(getFindByIdMethod())
              .addMethod(getFindByUserNameMethod())
              .addMethod(getFindAllMethod())
              .addMethod(getAddUserMethod())
              .addMethod(getUpdateUserNameMethod())
              .addMethod(getDeleteUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
