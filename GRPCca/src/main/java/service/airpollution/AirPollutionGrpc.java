package service.airpollution;

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

/**
 * <pre>
 * Service Definition
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: AirPollution.proto")
public final class AirPollutionGrpc {

  private AirPollutionGrpc() {}

  public static final String SERVICE_NAME = "airpollution.AirPollution";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.airpollution.CityRequest,
      service.airpollution.LevelReply> getAirPollutionCityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AirPollutionCity",
      requestType = service.airpollution.CityRequest.class,
      responseType = service.airpollution.LevelReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.airpollution.CityRequest,
      service.airpollution.LevelReply> getAirPollutionCityMethod() {
    io.grpc.MethodDescriptor<service.airpollution.CityRequest, service.airpollution.LevelReply> getAirPollutionCityMethod;
    if ((getAirPollutionCityMethod = AirPollutionGrpc.getAirPollutionCityMethod) == null) {
      synchronized (AirPollutionGrpc.class) {
        if ((getAirPollutionCityMethod = AirPollutionGrpc.getAirPollutionCityMethod) == null) {
          AirPollutionGrpc.getAirPollutionCityMethod = getAirPollutionCityMethod = 
              io.grpc.MethodDescriptor.<service.airpollution.CityRequest, service.airpollution.LevelReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airpollution.AirPollution", "AirPollutionCity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.airpollution.CityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.airpollution.LevelReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AirPollutionMethodDescriptorSupplier("AirPollutionCity"))
                  .build();
          }
        }
     }
     return getAirPollutionCityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.airpollution.LevelRequest,
      service.airpollution.CityReply> getAirPollutionLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AirPollutionLevel",
      requestType = service.airpollution.LevelRequest.class,
      responseType = service.airpollution.CityReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.airpollution.LevelRequest,
      service.airpollution.CityReply> getAirPollutionLevelMethod() {
    io.grpc.MethodDescriptor<service.airpollution.LevelRequest, service.airpollution.CityReply> getAirPollutionLevelMethod;
    if ((getAirPollutionLevelMethod = AirPollutionGrpc.getAirPollutionLevelMethod) == null) {
      synchronized (AirPollutionGrpc.class) {
        if ((getAirPollutionLevelMethod = AirPollutionGrpc.getAirPollutionLevelMethod) == null) {
          AirPollutionGrpc.getAirPollutionLevelMethod = getAirPollutionLevelMethod = 
              io.grpc.MethodDescriptor.<service.airpollution.LevelRequest, service.airpollution.CityReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "airpollution.AirPollution", "AirPollutionLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.airpollution.LevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.airpollution.CityReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AirPollutionMethodDescriptorSupplier("AirPollutionLevel"))
                  .build();
          }
        }
     }
     return getAirPollutionLevelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.airpollution.MonthRequest,
      service.airpollution.CityLevelReply> getAirPollutionMonthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AirPollutionMonth",
      requestType = service.airpollution.MonthRequest.class,
      responseType = service.airpollution.CityLevelReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<service.airpollution.MonthRequest,
      service.airpollution.CityLevelReply> getAirPollutionMonthMethod() {
    io.grpc.MethodDescriptor<service.airpollution.MonthRequest, service.airpollution.CityLevelReply> getAirPollutionMonthMethod;
    if ((getAirPollutionMonthMethod = AirPollutionGrpc.getAirPollutionMonthMethod) == null) {
      synchronized (AirPollutionGrpc.class) {
        if ((getAirPollutionMonthMethod = AirPollutionGrpc.getAirPollutionMonthMethod) == null) {
          AirPollutionGrpc.getAirPollutionMonthMethod = getAirPollutionMonthMethod = 
              io.grpc.MethodDescriptor.<service.airpollution.MonthRequest, service.airpollution.CityLevelReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "airpollution.AirPollution", "AirPollutionMonth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.airpollution.MonthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.airpollution.CityLevelReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AirPollutionMethodDescriptorSupplier("AirPollutionMonth"))
                  .build();
          }
        }
     }
     return getAirPollutionMonthMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AirPollutionStub newStub(io.grpc.Channel channel) {
    return new AirPollutionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AirPollutionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AirPollutionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AirPollutionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AirPollutionFutureStub(channel);
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static abstract class AirPollutionImplBase implements io.grpc.BindableService {

    /**
     */
    public void airPollutionCity(service.airpollution.CityRequest request,
        io.grpc.stub.StreamObserver<service.airpollution.LevelReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAirPollutionCityMethod(), responseObserver);
    }

    /**
     */
    public void airPollutionLevel(service.airpollution.LevelRequest request,
        io.grpc.stub.StreamObserver<service.airpollution.CityReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAirPollutionLevelMethod(), responseObserver);
    }

    /**
     */
    public void airPollutionMonth(service.airpollution.MonthRequest request,
        io.grpc.stub.StreamObserver<service.airpollution.CityLevelReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAirPollutionMonthMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAirPollutionCityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.airpollution.CityRequest,
                service.airpollution.LevelReply>(
                  this, METHODID_AIR_POLLUTION_CITY)))
          .addMethod(
            getAirPollutionLevelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.airpollution.LevelRequest,
                service.airpollution.CityReply>(
                  this, METHODID_AIR_POLLUTION_LEVEL)))
          .addMethod(
            getAirPollutionMonthMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                service.airpollution.MonthRequest,
                service.airpollution.CityLevelReply>(
                  this, METHODID_AIR_POLLUTION_MONTH)))
          .build();
    }
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static final class AirPollutionStub extends io.grpc.stub.AbstractStub<AirPollutionStub> {
    private AirPollutionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirPollutionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirPollutionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirPollutionStub(channel, callOptions);
    }

    /**
     */
    public void airPollutionCity(service.airpollution.CityRequest request,
        io.grpc.stub.StreamObserver<service.airpollution.LevelReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAirPollutionCityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void airPollutionLevel(service.airpollution.LevelRequest request,
        io.grpc.stub.StreamObserver<service.airpollution.CityReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAirPollutionLevelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void airPollutionMonth(service.airpollution.MonthRequest request,
        io.grpc.stub.StreamObserver<service.airpollution.CityLevelReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAirPollutionMonthMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static final class AirPollutionBlockingStub extends io.grpc.stub.AbstractStub<AirPollutionBlockingStub> {
    private AirPollutionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirPollutionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirPollutionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirPollutionBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.airpollution.LevelReply airPollutionCity(service.airpollution.CityRequest request) {
      return blockingUnaryCall(
          getChannel(), getAirPollutionCityMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.airpollution.CityReply airPollutionLevel(service.airpollution.LevelRequest request) {
      return blockingUnaryCall(
          getChannel(), getAirPollutionLevelMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<service.airpollution.CityLevelReply> airPollutionMonth(
        service.airpollution.MonthRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getAirPollutionMonthMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static final class AirPollutionFutureStub extends io.grpc.stub.AbstractStub<AirPollutionFutureStub> {
    private AirPollutionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AirPollutionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AirPollutionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AirPollutionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.airpollution.LevelReply> airPollutionCity(
        service.airpollution.CityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAirPollutionCityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.airpollution.CityReply> airPollutionLevel(
        service.airpollution.LevelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAirPollutionLevelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AIR_POLLUTION_CITY = 0;
  private static final int METHODID_AIR_POLLUTION_LEVEL = 1;
  private static final int METHODID_AIR_POLLUTION_MONTH = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AirPollutionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AirPollutionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AIR_POLLUTION_CITY:
          serviceImpl.airPollutionCity((service.airpollution.CityRequest) request,
              (io.grpc.stub.StreamObserver<service.airpollution.LevelReply>) responseObserver);
          break;
        case METHODID_AIR_POLLUTION_LEVEL:
          serviceImpl.airPollutionLevel((service.airpollution.LevelRequest) request,
              (io.grpc.stub.StreamObserver<service.airpollution.CityReply>) responseObserver);
          break;
        case METHODID_AIR_POLLUTION_MONTH:
          serviceImpl.airPollutionMonth((service.airpollution.MonthRequest) request,
              (io.grpc.stub.StreamObserver<service.airpollution.CityLevelReply>) responseObserver);
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

  private static abstract class AirPollutionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AirPollutionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.airpollution.AirPollutionServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AirPollution");
    }
  }

  private static final class AirPollutionFileDescriptorSupplier
      extends AirPollutionBaseDescriptorSupplier {
    AirPollutionFileDescriptorSupplier() {}
  }

  private static final class AirPollutionMethodDescriptorSupplier
      extends AirPollutionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AirPollutionMethodDescriptorSupplier(String methodName) {
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
      synchronized (AirPollutionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AirPollutionFileDescriptorSupplier())
              .addMethod(getAirPollutionCityMethod())
              .addMethod(getAirPollutionLevelMethod())
              .addMethod(getAirPollutionMonthMethod())
              .build();
        }
      }
    }
    return result;
  }
}
