package service.environmentalpollution;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import service.environmentalpollution.EnvironmentalPollutionGrpc.EnvironmentalPollutionImplBase;




public class EnvironmentalPollutionServer {
	private final int port;
	  private final Server epserver;
	  
	  public EnvironmentalPollutionServer(int port) {
		    this.port = port;
		    this.epserver = ServerBuilder.forPort(port)
		        .addService(new EnvironmentalPollution())
		        .build();
		  }
	
	public void start() throws Exception {
	    epserver.start();
	    System.out.println("Server started on port " + port);
	    Runtime.getRuntime().addShutdownHook(new Thread(() -> {
	      System.out.println("Shutting down gRPC server since JVM is shutting down");
	      EnvironmentalPollutionServer.this.stop();
	    }));
	  }

	  private void stop() {
	    if (epserver != null) {
	      epserver.shutdown();
	    }
	  }

	  private void blockUntilShutdown() throws InterruptedException {
	    if (epserver != null) {
	      epserver.awaitTermination();
	    }
	  }
	  
	  public static void main(String[] args) throws Exception {
		  EnvironmentalPollutionServer epserver = new EnvironmentalPollutionServer(50051);
		    epserver.start();
		    epserver.blockUntilShutdown();
		  }
	  
	  private static class EnvironmentalPollution extends EnvironmentalPollutionImplBase {

		    @Override
		    public StreamObserver<EnvironmentalEvaluationRequest> EnvironmentalEvaluation(StreamObserver<EnvironmentalEvaluationReply> responseObserver) {
		      return new StreamObserver<EnvironmentalEvaluationRequest>() {
		        String result = "";

		        @Override
		        public void onNext(EnvironmentalEvaluationRequest request) {
		          System.out.println("Received message: " + request.getEnvironmentalPollutionLevel());
		          result += request.getEnvironmentalPollutionLevel();
		        }

		        @Override
		        public void onError(Throwable t) {
		          System.out.println("Error: " + ((EnvironmentalEvaluationRequestOrBuilder) t).getEnvironmentalPollutionLevel());
		        }

		        @Override
		        public void onCompleted() {
		          responseObserver.onNext(EnvironmentalEvaluationReply.newBuilder().setGrade("Result: " + result).build());
		          responseObserver.onCompleted();
		        }
		      };
		    }

		    @Override
		    public StreamObserver<DecideLocationRequest> DecideLocation(StreamObserver<DecideLocationReply> responseObserver) {
		      return new StreamObserver<DecideLocationRequest>() {
		        @Override
		        public void onNext(DecideLocationRequest request) {
		          System.out.println("Received message: " + request.getLocation());
		          responseObserver.onNext(DecideLocationReply.newBuilder().setGrade("Echo: " + request.getLocation()).build());
		        }

		        @Override
		        public void onError(Throwable t) {
		          System.out.println("Error: " + ((DecideLocationRequestOrBuilder) t).getLocation());
		        }

		        @Override
		        public void onCompleted() {
		          responseObserver.onCompleted();
		        }
		      };
		    }
		  }
	  

	
}
