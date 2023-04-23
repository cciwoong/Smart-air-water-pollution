package service.waterpollution;

import java.io.IOException;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import service.waterpollution.WaterPollutionGrpc.WaterPollutionImplBase;



public class WaterPollutionServer extends WaterPollutionImplBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WaterPollutionServer waterserver = new WaterPollutionServer();
		int port = 50051;

		Server server;
		try {
			server = ServerBuilder.forPort(port).addService(waterserver).build().start();
			System.out.println("Running the Server...");
			
			server.awaitTermination();
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void waterPollutionCity(CityRequest request, StreamObserver<LevelReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("--- Give me two seconds, Receiving Request from client ---");

		/*
		 * Logic Code
		 * 
		 */

		LevelReply reply = LevelReply.newBuilder()
				.setWaterPollutionLevel("The WaterPollution Level of " + request.getLocation()).build();
		responseObserver.onNext(reply);	

		responseObserver.onCompleted();
	}

	@Override
	public void waterPollutionLevel(LevelRequest request, StreamObserver<CityReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("--- Give me two seconds, Receiving Request from client ---");

		/*
		 * Logic Code
		 * 
		 */

		CityReply reply = CityReply.newBuilder()
				.setLocation("The city which has WaterPollution Level" + request.getWaterPollutionLevel()).build();
		
		responseObserver.onNext(reply);

		try {
			//wait for a second
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		responseObserver.onCompleted();

	}

	@Override
	public void waterPollutionMonth(MonthRequest request, StreamObserver<CityLevelReply> responseObserver) {
		// TODO Auto-generated method stub
		System.out.println("--- Give me two seconds, Receiving Request from client ---");

		/*
		 * Logic Code
		 * 
		 */
		
		CityLevelReply reply = CityLevelReply.newBuilder().setLocation("Dublin").setWaterPollutionLevel("Good").build();
		
		responseObserver.onNext(reply);

		 responseObserver.onCompleted();

	}
	

}

