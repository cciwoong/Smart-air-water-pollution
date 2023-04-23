package service.environmentalpollution;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import service.environmentalpollution.EnvironmentalPollutionGrpc.EnvironmentalPollutionStub;
import service.environmentalpollution.EnvironmentalPollutionGrpc.EnvironmentalPollutionBlockingStub;

public class EnvironmentalPollutionClient {
	private final ManagedChannel channel;
	

	  public EnvironmentalPollutionClient(String host, int port) {
	    this.channel = ManagedChannelBuilder.forAddress(host, port)
	        .usePlaintext()
	        .build();
	  }
	  public void shutdown() throws InterruptedException {
		    channel.shutdown().awaitTermination(3, TimeUnit.SECONDS);
		  }
	  public void EnvironmentalEvaluation() {
		  EnvironmentalPollutionGrpc.EnvironmentalPollutionStub stub = EnvironmentalPollutionGrpc.newStub(channel);
		    CountDownLatch latch = new CountDownLatch(1);
		    StreamObserver<EnvironmentalEvaluationRequest> requestObserver = stub.environmentalEvaluation(new StreamObserver<EnvironmentalEvaluationReply>() {
		      @Override
		      public void onNext(EnvironmentalEvaluationReply response) {
		        System.out.println("The Grade: " + response.getGrade());
		      }

		      @Override
		      public void onError(Throwable t) {
		        System.out.println("Error: " + t.getMessage());
		        latch.countDown();
		      }

		      @Override
		      public void onCompleted() {
		        System.out.println("completed");
		        latch.countDown();
		      }
		    });
		    try {
		      requestObserver.onNext(EnvironmentalEvaluationRequest.newBuilder().setEnvironmentalPollutionLevel("Good").build());
		      requestObserver.onNext(EnvironmentalEvaluationRequest.newBuilder().setEnvironmentalPollutionLevel("Good").build());
		      requestObserver.onNext(EnvironmentalEvaluationRequest.newBuilder().setEnvironmentalPollutionLevel("Good").build());
		      requestObserver.onCompleted();
		      latch.await();
		    } catch (InterruptedException e) {
		      System.out.println("The Grade: " + e.getMessage());
		    }
		  }

		  public void DecideLocation() {
			  EnvironmentalPollutionGrpc.EnvironmentalPollutionStub stub = EnvironmentalPollutionGrpc.newStub(channel);
		    CountDownLatch latch = new CountDownLatch(1);
		    StreamObserver<DecideLocationRequest> requestObserver = stub.decideLocation(new StreamObserver<DecideLocationReply>() {
		      @Override
		      public void onNext(DecideLocationReply response) {
		        System.out.println("The Location: " + response.getGrade());
		      }

		      @Override
		      public void onError(Throwable t) {
		        System.out.println("Error: " + t.getMessage());
		        latch.countDown();
		      }

		      @Override
		      public void onCompleted() {
		        System.out.println("completed");
		        latch.countDown();
		      }
		    });
		    try {
		      requestObserver.onNext(DecideLocationRequest.newBuilder().setLocation("Ireland").build());
		      requestObserver.onNext(DecideLocationRequest.newBuilder().setLocation("Dublin").build());
		      requestObserver.onNext(DecideLocationRequest.newBuilder().setLocation("NCI").build());
		      requestObserver.onCompleted();
		      latch.await();
		    } catch (InterruptedException e) {
		      System.out.println("The Grade: " + e.getMessage());
		    }
		  }

		  public static void main(String[] args) throws Exception {
			  EnvironmentalPollutionClient client = new EnvironmentalPollutionClient("localhost", 50051);
		    try {
		      client.EnvironmentalEvaluation();
		      client.DecideLocation();
		    } finally {
		      client.shutdown();
		    }
		  }

}
