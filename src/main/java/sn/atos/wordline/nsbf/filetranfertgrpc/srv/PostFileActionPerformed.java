// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proj.proto

package sn.atos.wordline.nsbf.filetranfertgrpc.srv;

/**
 * Protobuf type {@code FileTransfertManager.PostFileActionPerformed}
 */
public  final class PostFileActionPerformed extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FileTransfertManager.PostFileActionPerformed)
    PostFileActionPerformedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostFileActionPerformed.newBuilder() to construct.
  private PostFileActionPerformed(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostFileActionPerformed() {
    errorMessage_ = "";
    hasError_ = false;
    message_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostFileActionPerformed(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            errorMessage_ = s;
            break;
          }
          case 16: {

            hasError_ = input.readBool();
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_PostFileActionPerformed_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_PostFileActionPerformed_fieldAccessorTable
        .ensureFieldAccessorsInitialized(sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed.class, sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed.Builder.class);
  }

  public static final int ERRORMESSAGE_FIELD_NUMBER = 1;
  private volatile java.lang.Object errorMessage_;
  /**
   * <code>string errorMessage = 1;</code>
   */
  public java.lang.String getErrorMessage() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      errorMessage_ = s;
      return s;
    }
  }
  /**
   * <code>string errorMessage = 1;</code>
   */
  public com.google.protobuf.ByteString
      getErrorMessageBytes() {
    java.lang.Object ref = errorMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      errorMessage_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int HASERROR_FIELD_NUMBER = 2;
  private boolean hasError_;
  /**
   * <code>bool hasError = 2;</code>
   */
  public boolean getHasError() {
    return hasError_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 3;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 3;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getErrorMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, errorMessage_);
    }
    if (hasError_ != false) {
      output.writeBool(2, hasError_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getErrorMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, errorMessage_);
    }
    if (hasError_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, hasError_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed)) {
      return super.equals(obj);
    }
        sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed other = (sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed) obj;

    boolean result = true;
    result = result && getErrorMessage()
        .equals(other.getErrorMessage());
    result = result && (getHasError()
        == other.getHasError());
    result = result && getMessage()
        .equals(other.getMessage());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ERRORMESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getErrorMessage().hashCode();
    hash = (37 * hash) + HASERROR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getHasError());
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code FileTransfertManager.PostFileActionPerformed}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FileTransfertManager.PostFileActionPerformed)
      sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_PostFileActionPerformed_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_PostFileActionPerformed_fieldAccessorTable
          .ensureFieldAccessorsInitialized(sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed.class, sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed.Builder.class);
    }

    // Construct using sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      errorMessage_ = "";

      hasError_ = false;

      message_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return sn.atos.wordline.nsbf.filetranfertgrpc.srv.FileTransfert.internal_static_FileTransfertManager_PostFileActionPerformed_descriptor;
    }

    public sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed getDefaultInstanceForType() {
      return sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed.getDefaultInstance();
    }

    public sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed build() {
            sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed buildPartial() {
            sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed result = new sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed(this);
      result.errorMessage_ = errorMessage_;
      result.hasError_ = hasError_;
      result.message_ = message_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed) {
        return mergeFrom((sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed other) {
      if (other == sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed.getDefaultInstance()) return this;
      if (!other.getErrorMessage().isEmpty()) {
        errorMessage_ = other.errorMessage_;
        onChanged();
      }
      if (other.getHasError() != false) {
        setHasError(other.getHasError());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
            sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object errorMessage_ = "";
    /**
     * <code>string errorMessage = 1;</code>
     */
    public java.lang.String getErrorMessage() {
      java.lang.Object ref = errorMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        errorMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string errorMessage = 1;</code>
     */
    public com.google.protobuf.ByteString
        getErrorMessageBytes() {
      java.lang.Object ref = errorMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        errorMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string errorMessage = 1;</code>
     */
    public Builder setErrorMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      errorMessage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string errorMessage = 1;</code>
     */
    public Builder clearErrorMessage() {
      
      errorMessage_ = getDefaultInstance().getErrorMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string errorMessage = 1;</code>
     */
    public Builder setErrorMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      errorMessage_ = value;
      onChanged();
      return this;
    }

    private boolean hasError_ ;
    /**
     * <code>bool hasError = 2;</code>
     */
    public boolean getHasError() {
      return hasError_;
    }
    /**
     * <code>bool hasError = 2;</code>
     */
    public Builder setHasError(boolean value) {
      
      hasError_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool hasError = 2;</code>
     */
    public Builder clearHasError() {
      
      hasError_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 3;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 3;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 3;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 3;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 3;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:FileTransfertManager.PostFileActionPerformed)
  }

  // @@protoc_insertion_point(class_scope:FileTransfertManager.PostFileActionPerformed)
  private static final sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed();
  }

  public static sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostFileActionPerformed>
      PARSER = new com.google.protobuf.AbstractParser<PostFileActionPerformed>() {
    public PostFileActionPerformed parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostFileActionPerformed(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostFileActionPerformed> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostFileActionPerformed> getParserForType() {
    return PARSER;
  }

  public sn.atos.wordline.nsbf.filetranfertgrpc.srv.PostFileActionPerformed getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

