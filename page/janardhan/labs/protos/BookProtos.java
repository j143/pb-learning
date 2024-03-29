// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: book.proto

package page.janardhan.labs.protos;

public final class BookProtos {
  private BookProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_labs_Book_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_labs_Book_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_labs_Book_GenreNumber_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_labs_Book_GenreNumber_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_labs_LibraryBook_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_labs_LibraryBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nbook.proto\022\004labs\"\335\001\n\004Book\022\014\n\004name\030\001 \001(" +
      "\t\022\n\n\002id\030\002 \001(\005\022\r\n\005price\030\003 \001(\005\022&\n\006genres\030\004" +
      " \003(\0132\026.labs.Book.GenreNumber\032J\n\013GenreNum" +
      "ber\022\016\n\006number\030\001 \001(\t\022+\n\004type\030\002 \001(\0162\024.labs" +
      ".Book.GenreType:\007FICTION\"8\n\tGenreType\022\013\n" +
      "\007FICTION\020\000\022\r\n\tREALSTORY\020\001\022\017\n\013EDUCATIONAL" +
      "\020\002\"(\n\013LibraryBook\022\031\n\005books\030\001 \003(\0132\n.labs." +
      "BookB*\n\032page.janardhan.labs.protosB\nBook" +
      "ProtosP\001"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_labs_Book_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_labs_Book_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_labs_Book_descriptor,
        new java.lang.String[] { "Name", "Id", "Price", "Genres", });
    internal_static_labs_Book_GenreNumber_descriptor =
      internal_static_labs_Book_descriptor.getNestedTypes().get(0);
    internal_static_labs_Book_GenreNumber_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_labs_Book_GenreNumber_descriptor,
        new java.lang.String[] { "Number", "Type", });
    internal_static_labs_LibraryBook_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_labs_LibraryBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_labs_LibraryBook_descriptor,
        new java.lang.String[] { "Books", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
