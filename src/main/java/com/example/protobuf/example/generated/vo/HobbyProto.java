// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: hobby.proto

package com.example.protobuf.example.generated.vo;

public final class HobbyProto {
  private HobbyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_thoreau_protobuf_vo_Hobby_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_thoreau_protobuf_vo_Hobby_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013hobby.proto\022\027com.thoreau.protobuf.vo\"$" +
      "\n\005Hobby\022\014\n\004name\030\001 \001(\t\022\r\n\005level\030\002 \001(\005B9\n)" +
      "com.example.protobuf.example.generated.v" +
      "oB\nHobbyProtoP\001b\006proto3"
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
    internal_static_com_thoreau_protobuf_vo_Hobby_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_thoreau_protobuf_vo_Hobby_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_thoreau_protobuf_vo_Hobby_descriptor,
        new java.lang.String[] { "Name", "Level", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
