package service.waterpollution;

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
    comments = "Source: WaterPollution.proto")
public final class WaterPollutionGrpc {

  private WaterPollutionGrpc() {}

  public static final String SERVICE_NAME = "waterpollution.WaterPollution";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.waterpollution.CityRequest,
      service.waterpollution.LevelReply> getWaterPollutionCityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WaterPollutionCity",
      requestType = service.waterpollution.CityRequest.class,
      responseType = service.waterpollution.LevelReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.waterpollution.CityRequest,
      service.waterpollution.LevelReply> getWaterPollutionCityMethod() {
    io.grpc.MethodDescriptor<service.waterpollution.CityRequest, service.waterpollution.LevelReply> getWaterPollutionCityMethod;
    if ((getWaterPollutionCityMethod = WaterPollutionGrpc.getWaterPollutionCityMethod) == null) {
      synchronized (WaterPollutionGrpc.class) {
        if ((getWaterPollutionCityMethod = WaterPollutionGrpc.getWaterPollutionCityMethod) == null) {
          WaterPollutionGrpc.getWaterPollutionCityMethod = getWaterPollutionCityMethod = 
              io.grpc.MethodDescriptor.<service.waterpollution.CityRequest, service.waterpollution.LevelReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "waterpollution.WaterPollution", "WaterPollutionCity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.waterpollution.CityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.waterpollution.LevelReply.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterPollutionMethodDescriptorSupplier("WaterPollutionCity"))
                  .build();
          }
        }
     }
     return getWaterPollutionCityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.waterpollution.LevelRequest,
      service.waterpollution.CityReply> getWaterPollutionLevelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WaterPollutionLevel",
      requestType = service.waterpollution.LevelRequest.class,
      responseType = service.waterpollution.CityReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.waterpollution.LevelRequest,
      service.waterpollution.CityReply> getWaterPollutionLevelMethod() {
    io.grpc.MethodDescriptor<service.waterpollution.LevelRequest, service.waterpollution.CityReply> getWaterPollutionLevelMethod;
    if ((getWaterPollutionLevelMethod = WaterPollutionGrpc.getWaterPollutionLevelMethod) == null) {
      synchronized (WaterPollutionGrpc.class) {
        if ((getWaterPollutionLevelMethod = WaterPollutionGrpc.getWaterPollutionLevelMethod) == null) {
          WaterPollutionGrpc.getWaterPollutionLevelMethod = getWaterPollutionLevelMethod = 
              io.grpc.MethodDescriptor.<service.waterpollution.LevelRequest, service.waterpollution.CityReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "waterpollution.WaterPollution", "WaterPollutionLevel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.waterpollution.LevelRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.waterpollution.CityReply.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterPollutionMethodDescriptorSupplier("WaterPollutionLevel"))
                  .build();
          }
        }
     }
     return getWaterPollutionLevelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.waterpollution.MonthRequest,
      service.waterpollution.CityLevelReply> getWaterPollutionMonthMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WaterPollutionMonth",
      requestType = service.waterpollution.MonthRequest.class,
      responseType = service.waterpollution.CityLevelReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<service.waterpollution.MonthRequest,
      service.waterpollution.CityLevelReply> getWaterPollutionMonthMethod() {
    io.grpc.MethodDescriptor<service.waterpollution.MonthRequest, service.waterpollution.CityLevelReply> getWaterPollutionMonthMethod;
    if ((getWaterPollutionMonthMethod = WaterPollutionGrpc.getWaterPollutionMonthMethod) == null) {
      synchronized (WaterPollutionGrpc.class) {
        if ((getWaterPollutionMonthMethod = WaterPollutionGrpc.getWaterPollutionMonthMethod) == null) {
          WaterPollutionGrpc.getWaterPollutionMonthMethod = getWaterPollutionMonthMethod = 
              io.grpc.MethodDescriptor.<service.waterpollution.MonthRequest, service.waterpollution.CityLevelReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "waterpollution.WaterPollution", "WaterPollutionMonth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.waterpollution.MonthRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.waterpollution.CityLevelReply.getDefaultInstance()))
                  .setSchemaDescriptor(new WaterPollutionMethodDescriptorSupplier("WaterPollutionMonth"))
                  .build();
          }
        }
     }
     return getWaterPollutionMonthMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WaterPollutionStub newStub(io.grpc.Channel channel) {
    return new WaterPollutionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WaterPollutionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WaterPollutionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WaterPollutionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WaterPollutionFutureStub(channel);
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static abstract class WaterPollutionImplBase implements io.grpc.BindableService {

    /**
     */
    public void waterPollutionCity(service.waterpollution.CityRequest request,
        io.grpc.stub.StreamObserver<service.waterpollution.LevelReply> responseObserver) {
      asyncUnimplementedUnaryCall(getWaterPollutionCityMethod(), responseObserver);
    }

    /**
     */
    public void waterPollutionLevel(service.waterpollution.LevelRequest request,
        io.grpc.stub.StreamObserver<service.waterpollution.CityReply> responseObserver) {
      asyncUnimplementedUnaryCall(getWaterPollutionLevelMethod(), responseObserver);
    }

    /**
     */
    public void waterPollutionMonth(service.waterpollution.MonthRequest request,
        io.grpc.stub.StreamObserver<service.waterpollution.CityLevelReply> responseObserver) {
      asyncUnimplementedUnaryCall(getWaterPollutionMonthMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWaterPollutionCityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.waterpollution.CityRequest,
                service.waterpollution.LevelReply>(
                  this, METHODID_WATER_POLLUTION_CITY)))
          .addMethod(
            getWaterPollutionLevelMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.waterpollution.LevelRequest,
                service.waterpollution.CityReply>(
                  this, METHODID_WATER_POLLUTION_LEVEL)))
          .addMethod(
            getWaterPollutionMonthMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                service.waterpollution.MonthRequest,
                service.waterpollution.CityLevelReply>(
                  this, METHODID_WATER_POLLUTION_MONTH)))
          .build();
    }
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static final class WaterPollutionStub extends io.grpc.stub.AbstractStub<WaterPollutionStub> {
    private WaterPollutionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterPollutionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterPollutionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterPollutionStub(channel, callOptions);
    }

    /**
     */
    public void waterPollutionCity(service.waterpollution.CityRequest request,
        io.grpc.stub.StreamObserver<service.waterpollution.LevelReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWaterPollutionCityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void waterPollutionLevel(service.waterpollution.LevelRequest request,
        io.grpc.stub.StreamObserver<service.waterpollution.CityReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWaterPollutionLevelMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void waterPollutionMonth(service.waterpollution.MonthRequest request,
        io.grpc.stub.StreamObserver<service.waterpollution.CityLevelReply> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWaterPollutionMonthMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static final class WaterPollutionBlockingStub extends io.grpc.stub.AbstractStub<WaterPollutionBlockingStub> {
    private WaterPollutionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterPollutionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterPollutionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterPollutionBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.waterpollution.LevelReply waterPollutionCity(service.waterpollution.CityRequest request) {
      return blockingUnaryCall(
          getChannel(), getWaterPollutionCityMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.waterpollution.CityReply waterPollutionLevel(service.waterpollution.LevelRequest request) {
      return blockingUnaryCall(
          getChannel(), getWaterPollutionLevelMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<service.waterpollution.CityLevelReply> waterPollutionMonth(
        service.waterpollution.MonthRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWaterPollutionMonthMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Service Definition
   * </pre>
   */
  public static final class WaterPollutionFutureStub extends io.grpc.stub.AbstractStub<WaterPollutionFutureStub> {
    private WaterPollutionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WaterPollutionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WaterPollutionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WaterPollutionFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.waterpollution.LevelReply> waterPollutionCity(
        service.waterpollution.CityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWaterPollutionCityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.waterpollution.CityReply> waterPollutionLevel(
        service.waterpollution.LevelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWaterPollutionLevelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WATER_POLLUTION_CITY = 0;
  private static final int METHODID_WATER_POLLUTION_LEVEL = 1;
  private static final int METHODID_WATER_POLLUTION_MONTH = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WaterPollutionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WaterPollutionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WATER_POLLUTION_CITY:
          serviceImpl.waterPollutionCity((service.waterpollution.CityRequest) request,
              (io.grpc.stub.StreamObserver<service.waterpollution.LevelReply>) responseObserver);
          break;
        case METHODID_WATER_POLLUTION_LEVEL:
          serviceImpl.waterPollutionLevel((service.waterpollution.LevelRequest) request,
              (io.grpc.stub.StreamObserver<service.waterpollution.CityReply>) responseObserver);
          break;
        case METHODID_WATER_POLLUTION_MONTH:
          serviceImpl.waterPollutionMonth((service.waterpollution.MonthRequest) request,
              (io.grpc.stub.StreamObserver<service.waterpollution.CityLevelReply>) responseObserver);
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

  private static abstract class WaterPollutionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WaterPollutionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.waterpollution.WaterPollutionServiceImpl.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WaterPollution");
    }
  }

  private static final class WaterPollutionFileDescriptorSupplier
      extends WaterPollutionBaseDescriptorSupplier {
    WaterPollutionFileDescriptorSupplier() {}
  }

  private static final class WaterPollutionMethodDescriptorSupplier
      extends WaterPollutionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WaterPollutionMethodDescriptorSupplier(String methodName) {
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
      synchronized (WaterPollutionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WaterPollutionFileDescriptorSupplier())
              .addMethod(getWaterPollutionCityMethod())
              .addMethod(getWaterPollutionLevelMethod())
              .addMethod(getWaterPollutionMonthMethod())
              .build();
        }
      }
    }
    return result;
  }
}
