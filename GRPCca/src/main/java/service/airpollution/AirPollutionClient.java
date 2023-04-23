package service.airpollution;

import java.util.Iterator;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import service.airpollution.AirPollutionGrpc.AirPollutionBlockingStub;

public class AirPollutionClient {
	private static AirPollutionBlockingStub blockingStub;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String host = "localhost";
		int port = 50051;

		ManagedChannel channel = ManagedChannelBuilder.forAddress(host, port).usePlaintext().build();

		blockingStub = AirPollutionGrpc.newBlockingStub(channel);
	}
	
	// unary rpc : AirPollutionCity
		public static void AirPollutionCity() {
			CityRequest request = CityRequest.newBuilder().setLocation("Dublin airpollution level is").build();

			LevelReply reply = blockingStub.airPollutionCity(request);

			System.out.println("Reply from the server" + reply.getAirPollutionLevel());
		} 
	
	// unary rpc : AirPollutionLevel
		public static void AirPollutionLevel() {
			LevelRequest request = LevelRequest.newBuilder().setAirPollutionLevel("The city airpolluttion level 'good' is ").build();

			CityReply reply = blockingStub.airPollutionLevel(request);

			System.out.println("Reply from the server" + reply.getLocation());
		}
	// server streaming rpc : AirPollutionMonth
				public static void AirPollutionMonth() {
					MonthRequest request = MonthRequest.newBuilder().setAirPollutionMonth("October").build();

					Iterator<CityLevelReply> reply = blockingStub.airPollutionMonth(request);

					System.out.println("Reply from the server" + ((CityRequestOrBuilder) reply).getLocation() + ((LevelReplyOrBuilder) reply).getAirPollutionLevel());
				}		
		
	}
