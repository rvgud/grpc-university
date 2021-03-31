package com.university.professor;

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
    comments = "Source: Professor.proto")
public final class ProfessorServiceGrpc {

  private ProfessorServiceGrpc() {}

  public static final String SERVICE_NAME = "com.university.professor.ProfessorService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      com.university.professor.Profile> METHOD_GET_PROFILE =
      io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.university.professor.Profile>newBuilder()
          .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
          .setFullMethodName(generateFullMethodName(
              "com.university.professor.ProfessorService", "GetProfile"))
          .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.google.protobuf.Empty.getDefaultInstance()))
          .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
              com.university.professor.Profile.getDefaultInstance()))
          .build();

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProfessorServiceStub newStub(io.grpc.Channel channel) {
    return new ProfessorServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProfessorServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ProfessorServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProfessorServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ProfessorServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ProfessorServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getProfile(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.university.professor.Profile> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_GET_PROFILE, responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_GET_PROFILE,
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                com.university.professor.Profile>(
                  this, METHODID_GET_PROFILE)))
          .build();
    }
  }

  /**
   */
  public static final class ProfessorServiceStub extends io.grpc.stub.AbstractStub<ProfessorServiceStub> {
    private ProfessorServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfessorServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfessorServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfessorServiceStub(channel, callOptions);
    }

    /**
     */
    public void getProfile(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.university.professor.Profile> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_GET_PROFILE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProfessorServiceBlockingStub extends io.grpc.stub.AbstractStub<ProfessorServiceBlockingStub> {
    private ProfessorServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfessorServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfessorServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfessorServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.university.professor.Profile getProfile(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), METHOD_GET_PROFILE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProfessorServiceFutureStub extends io.grpc.stub.AbstractStub<ProfessorServiceFutureStub> {
    private ProfessorServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ProfessorServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProfessorServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ProfessorServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.university.professor.Profile> getProfile(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_GET_PROFILE, getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PROFILE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProfessorServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProfessorServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PROFILE:
          serviceImpl.getProfile((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<com.university.professor.Profile>) responseObserver);
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

  private static final class ProfessorServiceDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier {
    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.university.professor.Professor.getDescriptor();
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ProfessorServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProfessorServiceDescriptorSupplier())
              .addMethod(METHOD_GET_PROFILE)
              .build();
        }
      }
    }
    return result;
  }
}
