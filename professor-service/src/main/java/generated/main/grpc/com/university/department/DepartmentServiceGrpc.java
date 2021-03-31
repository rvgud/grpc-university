package com.university.department;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.4.0)",
    comments = "Source: Department.proto")
public final class DepartmentServiceGrpc {

  private DepartmentServiceGrpc() {}

  public static final String SERVICE_NAME = "com.university.department.DepartmentService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.university.department.Profile,
      com.university.department.Department> METHOD_GET_DEPARTMENT =
      io.grpc.MethodDescriptor.<com.university.department.Profile, com.university.department.Department>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.university.department.DepartmentService", "GetDepartment"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.university.department.Profile.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.university.department.Department.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DepartmentServiceStub newStub(io.grpc.Channel channel) {
    return new DepartmentServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DepartmentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DepartmentServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DepartmentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DepartmentServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class DepartmentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getDepartment(com.university.department.Profile request,
        io.grpc.stub.StreamObserver<com.university.department.Department> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_DEPARTMENT, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_DEPARTMENT,
            asyncUnaryCall(
              new MethodHandlers<
                com.university.department.Profile,
                com.university.department.Department>(
                  this, METHODID_GET_DEPARTMENT)))
          .build();
    }
  }

  /**
   */
  public static final class DepartmentServiceStub extends io.grpc.stub.AbstractStub<DepartmentServiceStub> {
    private DepartmentServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartmentServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartmentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getDepartment(com.university.department.Profile request,
        io.grpc.stub.StreamObserver<com.university.department.Department> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_DEPARTMENT, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DepartmentServiceBlockingStub extends io.grpc.stub.AbstractStub<DepartmentServiceBlockingStub> {
    private DepartmentServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartmentServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartmentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.university.department.Department getDepartment(com.university.department.Profile request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_DEPARTMENT, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DepartmentServiceFutureStub extends io.grpc.stub.AbstractStub<DepartmentServiceFutureStub> {
    private DepartmentServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DepartmentServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DepartmentServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DepartmentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.university.department.Department> getDepartment(
        com.university.department.Profile request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_DEPARTMENT, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_DEPARTMENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DepartmentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DepartmentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_DEPARTMENT:
          serviceImpl.getDepartment((com.university.department.Profile) request,
              (io.grpc.stub.StreamObserver<com.university.department.Department>) responseObserver);
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

  private static final class DepartmentServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.university.department.DepartmentOuterClass.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DepartmentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DepartmentServiceDescriptorSupplier())
              .addMethod(METHOD_GET_DEPARTMENT)
              .build();
        }
      }
    }
    return result;
  }
}
