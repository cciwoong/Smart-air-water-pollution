// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AirPollution.proto

package service.airpollution;

public final class AirPollutionServiceImpl {
  private AirPollutionServiceImpl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airpollution_CityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airpollution_CityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airpollution_LevelReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airpollution_LevelReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airpollution_LevelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airpollution_LevelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airpollution_CityReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airpollution_CityReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airpollution_MonthRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airpollution_MonthRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_airpollution_CityLevelReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_airpollution_CityLevelReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022AirPollution.proto\022\014airpollution\"\037\n\013Ci" +
      "tyRequest\022\020\n\010location\030\001 \001(\t\"\'\n\nLevelRepl" +
      "y\022\031\n\021AirPollutionLevel\030\001 \001(\t\")\n\014LevelReq" +
      "uest\022\031\n\021AirPollutionLevel\030\001 \001(\t\"\035\n\tCityR" +
      "eply\022\020\n\010location\030\001 \001(\t\")\n\014MonthRequest\022\031" +
      "\n\021AirPollutionMonth\030\001 \001(\t\"=\n\016CityLevelRe" +
      "ply\022\020\n\010location\030\001 \001(\t\022\031\n\021AirPollutionLev" +
      "el\030\002 \001(\t2\370\001\n\014AirPollution\022I\n\020AirPollutio" +
      "nCity\022\031.airpollution.CityRequest\032\030.airpo" +
      "llution.LevelReply\"\000\022J\n\021AirPollutionLeve" +
      "l\022\032.airpollution.LevelRequest\032\027.airpollu" +
      "tion.CityReply\"\000\022Q\n\021AirPollutionMonth\022\032." +
      "airpollution.MonthRequest\032\034.airpollution" +
      ".CityLevelReply\"\0000\001B1\n\024service.airpollut" +
      "ionB\027AirPollutionServiceImplP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_airpollution_CityRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_airpollution_CityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airpollution_CityRequest_descriptor,
        new java.lang.String[] { "Location", });
    internal_static_airpollution_LevelReply_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_airpollution_LevelReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airpollution_LevelReply_descriptor,
        new java.lang.String[] { "AirPollutionLevel", });
    internal_static_airpollution_LevelRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_airpollution_LevelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airpollution_LevelRequest_descriptor,
        new java.lang.String[] { "AirPollutionLevel", });
    internal_static_airpollution_CityReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_airpollution_CityReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airpollution_CityReply_descriptor,
        new java.lang.String[] { "Location", });
    internal_static_airpollution_MonthRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_airpollution_MonthRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airpollution_MonthRequest_descriptor,
        new java.lang.String[] { "AirPollutionMonth", });
    internal_static_airpollution_CityLevelReply_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_airpollution_CityLevelReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_airpollution_CityLevelReply_descriptor,
        new java.lang.String[] { "Location", "AirPollutionLevel", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}