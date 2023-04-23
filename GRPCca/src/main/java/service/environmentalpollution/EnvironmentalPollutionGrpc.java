package service.environmentalpollution;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

import io.grpc.stub.StreamObserver;

/**
 * <pre>
 * Service Definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: EnvironmentalPollution.proto")
public final class EnvironmentalPollutionGrpc {

  private EnvironmentalPollutionGrpc() {}

  public static final String SERVICE_NAME = "environmentalpollution.EnvironmentalPollution";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.environmentalpollution.EnvironmentalEvaluationRequest,
      service.environmentalpollution.EnvironmentalEvaluationReply> getEnvironmentalEvaluationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnvironmentalEvaluation",
      requestType = service.environmentalpollution.EnvironmentalEvaluationRequest.class,
      responseType = service.environmentalpollution.EnvironmentalEvaluationReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<service.environmentalpollution.EnvironmentalEvaluationRequest,
      service.environmentalpollution.EnvironmentalEvaluationReply> getEnvironmentalEvaluationMethod() {
    io.grpc.MethodDescriptor<service.environmentalpollution.EnvironmentalEvaluationRequest, service.environmentalpollution.EnvironmentalEvaluationReply> getEnvironmentalEvaluationMethod;
    if ((getEnvironmentalEvaluationMethod = EnvironmentalPollutionGrpc.getEnvironmentalEvaluationMethod) == null) {
      synchronized (EnvironmentalPollutionGrpc.class) {
        if ((getEnvironmentalEvaluationMethod = EnvironmentalPollutionGrpc.getEnvironmentalEvaluationMethod) == null) {
          EnvironmentalPollutionGrpc.getEnvironmentalEvaluationMethod = getEnvironmentalEvaluationMethod = 
              io.grpc.MethodDescriptor.<service.environmentalpollution.EnvironmentalEvaluationRequest, service.environmentalpollution.EnvironmentalEvaluationReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "environmentalpollution.EnvironmentalPollution", "EnvironmentalEvaluation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.environmentalpollution.EnvironmentalEvaluationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.environmentalpollution.EnvironmentalEvaluationReply.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentalPollutionMethodDescriptorSupplier("EnvironmentalEvaluation"))
                  .build();
          }
        }
     }
     return getEnvironmentalEvaluationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.environmentalpollution.DecideLocationRequest,
      service.environmentalpollution.DecideLocationReply> getDecideLocationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DecideLocation",
      requestType = service.environmentalpollution.DecideLocationRequest.class,
      responseType = service.environmentalpollution.DecideLocationReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<service.environmentalpollution.DecideLocationRequest,
      service.environmentalpollution.DecideLocationReply> getDecideLocationMethod() {
    io.grpc.MethodDescriptor<service.environmentalpollution.DecideLocationRequest, service.environmentalpollution.DecideLocationReply> getDecideLocationMethod;
    if ((getDecideLocationMethod = EnvironmentalPollutionGrpc.getDecideLocationMethod) == null) {
      synchronized (EnvironmentalPollutionGrpc.class) {
        if ((getDecideLocationMethod = EnvironmentalPollutionGrpc.getDecideLocationMethod) == null) {
          EnvironmentalPollutionGrpc.getDecideLocationMethod = getDecideLocationMethod = 
              io.grpc.MethodDescriptor.<service.environmentalpollution.DecideLocationRequest, service.environmentalpollution.DecideLocationReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "environmentalpollution.EnvironmentalPollution", "DecideLocation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.environmentalpollution.DecideLocationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.environmentalpollution.DecideLocationReply.getDefaultInstance()))
                  .setSchemaDescriptor(new EnvironmentalPollutionMethodDescriptorSupplier("DecideLocation"))
                  .build();
          }
        }
     }
     return getDecideLocationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EnvironmentalPollutionStub newStub(io.grpc.Channel channel) {
    return new EnvironmentalPollutionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EnvironmentalPollutionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EnvironmentalPollutionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EnvironmentalPollutionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EnvironmentalPollutionFutureStub(channel);
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static abstract class EnvironmentalPollutionImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Client Streaming RPC method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<service.environmentalpollution.EnvironmentalEvaluationRequest> environmentalEvaluation(
        io.grpc.stub.StreamObserver<service.environmentalpollution.EnvironmentalEvaluationReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getEnvironmentalEvaluationMethod(), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<service.environmentalpollution.DecideLocationRequest> decideLocation(
        io.grpc.stub.StreamObserver<service.environmentalpollution.DecideLocationReply> responseObserver) {
      return asyncUnimplementedStreamingCall(getDecideLocationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEnvironmentalEvaluationMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                service.environmentalpollution.EnvironmentalEvaluationRequest,
                service.environmentalpollution.EnvironmentalEvaluationReply>(
                  this, METHODID_ENVIRONMENTAL_EVALUATION)))
          .addMethod(
            getDecideLocationMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                service.environmentalpollution.DecideLocationRequest,
                service.environmentalpollution.DecideLocationReply>(
                  this, METHODID_DECIDE_LOCATION)))
          .build();
    }

	public StreamObserver<EnvironmentalEvaluationRequest> EnvironmentalEvaluation(
			StreamObserver<EnvironmentalEvaluationReply> responseObserver) {
		// TODO Auto-generated method stub
		return null;
	}

	public StreamObserver<DecideLocationRequest> DecideLocation(StreamObserver<DecideLocationReply> responseObserver) {
		// TODO Auto-generated method stub
		return null;
	}
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static final class EnvironmentalPollutionStub extends io.grpc.stub.AbstractStub<EnvironmentalPollutionStub> {
    private EnvironmentalPollutionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvironmentalPollutionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentalPollutionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvironmentalPollutionStub(channel, callOptions);
    }

    /**
     * <pre>
     * Client Streaming RPC method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<service.environmentalpollution.EnvironmentalEvaluationRequest> environmentalEvaluation(
        io.grpc.stub.StreamObserver<service.environmentalpollution.EnvironmentalEvaluationReply> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getEnvironmentalEvaluationMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Bidirectional Streaming RPC method
     * </pre>
     */
    public io.grpc.stub.StreamObserver<service.environmentalpollution.DecideLocationRequest> decideLocation(
        io.grpc.stub.StreamObserver<service.environmentalpollution.DecideLocationReply> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getDecideLocationMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static final class EnvironmentalPollutionBlockingStub extends io.grpc.stub.AbstractStub<EnvironmentalPollutionBlockingStub> {
    private EnvironmentalPollutionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvironmentalPollutionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentalPollutionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvironmentalPollutionBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static final class EnvironmentalPollutionFutureStub extends io.grpc.stub.AbstractStub<EnvironmentalPollutionFutureStub> {
    private EnvironmentalPollutionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EnvironmentalPollutionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EnvironmentalPollutionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EnvironmentalPollutionFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_ENVIRONMENTAL_EVALUATION = 0;
  private static final int METHODID_DECIDE_LOCATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EnvironmentalPollutionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EnvironmentalPollutionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ENVIRONMENTAL_EVALUATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.environmentalEvaluation(
              (io.grpc.stub.StreamObserver<service.environmentalpollution.EnvironmentalEvaluationReply>) responseObserver);
        case METHODID_DECIDE_LOCATION:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.decideLocation(
              (io.grpc.stub.StreamObserver<service.environmentalpollution.DecideLocationReply>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EnvironmentalPollutionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EnvironmentalPollutionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.environmentalpollution.EnvironmentalPollutionServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EnvironmentalPollution");
    }
  }

  private static final class EnvironmentalPollutionFileDescriptorSupplier
      extends EnvironmentalPollutionBaseDescriptorSupplier {
    EnvironmentalPollutionFileDescriptorSupplier() {}
  }

  private static final class EnvironmentalPollutionMethodDescriptorSupplier
      extends EnvironmentalPollutionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EnvironmentalPollutionMethodDescriptorSupplier(String methodName) {
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
      synchronized (EnvironmentalPollutionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EnvironmentalPollutionFileDescriptorSupplier())
              .addMethod(getEnvironmentalEvaluationMethod())
              .addMethod(getDecideLocationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
