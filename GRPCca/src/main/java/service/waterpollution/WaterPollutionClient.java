package service.waterpollution;

import java.util.Iterator;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import service.waterpollution.WaterPollutionGrpc.WaterPollutionBlockingStub;

public class WaterPollutionClient {
	private static WaterPollutionBlockingStub blockingStub;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host = "localhost";
		int port = 50051;

		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

		blockingStub = WaterPollutionGrpc.newBlockingStub(channel);
	}
	
	// unary rpc : WaterPollutionCity
		public static void WaterPollutionCity() {
			CityRequest request = CityRequest.newBuilder().setLocation("Dublin waterpollution level is").build();

			LevelReply reply = blockingStub.waterPollutionCity(request);

			System.out.println("Reply from the server" + reply.getWaterPollutionLevel());
		} 
	
	// unary rpc : WaterPollutionLevel
		public static void WaterPollutionLevel() {
			LevelRequest request = LevelRequest.newBuilder().setWaterPollutionLevel("The city waterpolluttion level 'good' is ").build();

			CityReply reply = blockingStub.waterPollutionLevel(request);

			System.out.println("Reply from the server" + reply.getLocation());
		}
	// server streaming rpc : WaterPollutionMonth
				public static void WaterPollutionMonth() {
					MonthRequest request = MonthRequest.newBuilder().setWaterPollutionMonth("October").build();

					Iterator<CityLevelReply> reply = blockingStub.waterPollutionMonth(request);

					System.out.println("Reply from the server" + ((CityRequestOrBuilder) reply).getLocation() + ((LevelReplyOrBuilder) reply).getWaterPollutionLevel());
				}		
		
	}
