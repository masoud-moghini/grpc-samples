// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Blog/blog.proto

package com.proto.calculator;

/**
 * Protobuf type {@code calculator.UpdateBlogResponse}
 */
public final class UpdateBlogResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:calculator.UpdateBlogResponse)
    UpdateBlogResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateBlogResponse.newBuilder() to construct.
  private UpdateBlogResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateBlogResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateBlogResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.proto.calculator.BlogOuterClass.internal_static_calculator_UpdateBlogResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.proto.calculator.BlogOuterClass.internal_static_calculator_UpdateBlogResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.proto.calculator.UpdateBlogResponse.class, com.proto.calculator.UpdateBlogResponse.Builder.class);
  }

  public static final int BLOG_FIELD_NUMBER = 1;
  private com.proto.calculator.Blog blog_;
  /**
   * <code>.calculator.Blog blog = 1;</code>
   * @return Whether the blog field is set.
   */
  @java.lang.Override
  public boolean hasBlog() {
    return blog_ != null;
  }
  /**
   * <code>.calculator.Blog blog = 1;</code>
   * @return The blog.
   */
  @java.lang.Override
  public com.proto.calculator.Blog getBlog() {
    return blog_ == null ? com.proto.calculator.Blog.getDefaultInstance() : blog_;
  }
  /**
   * <code>.calculator.Blog blog = 1;</code>
   */
  @java.lang.Override
  public com.proto.calculator.BlogOrBuilder getBlogOrBuilder() {
    return getBlog();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (blog_ != null) {
      output.writeMessage(1, getBlog());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (blog_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBlog());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.proto.calculator.UpdateBlogResponse)) {
      return super.equals(obj);
    }
    com.proto.calculator.UpdateBlogResponse other = (com.proto.calculator.UpdateBlogResponse) obj;

    if (hasBlog() != other.hasBlog()) return false;
    if (hasBlog()) {
      if (!getBlog()
          .equals(other.getBlog())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasBlog()) {
      hash = (37 * hash) + BLOG_FIELD_NUMBER;
      hash = (53 * hash) + getBlog().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.proto.calculator.UpdateBlogResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.UpdateBlogResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.UpdateBlogResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.UpdateBlogResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.UpdateBlogResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.proto.calculator.UpdateBlogResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.proto.calculator.UpdateBlogResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.calculator.UpdateBlogResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.calculator.UpdateBlogResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.proto.calculator.UpdateBlogResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.proto.calculator.UpdateBlogResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.proto.calculator.UpdateBlogResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.proto.calculator.UpdateBlogResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code calculator.UpdateBlogResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:calculator.UpdateBlogResponse)
      com.proto.calculator.UpdateBlogResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.proto.calculator.BlogOuterClass.internal_static_calculator_UpdateBlogResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.proto.calculator.BlogOuterClass.internal_static_calculator_UpdateBlogResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.proto.calculator.UpdateBlogResponse.class, com.proto.calculator.UpdateBlogResponse.Builder.class);
    }

    // Construct using com.proto.calculator.UpdateBlogResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (blogBuilder_ == null) {
        blog_ = null;
      } else {
        blog_ = null;
        blogBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.proto.calculator.BlogOuterClass.internal_static_calculator_UpdateBlogResponse_descriptor;
    }

    @java.lang.Override
    public com.proto.calculator.UpdateBlogResponse getDefaultInstanceForType() {
      return com.proto.calculator.UpdateBlogResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.proto.calculator.UpdateBlogResponse build() {
      com.proto.calculator.UpdateBlogResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.proto.calculator.UpdateBlogResponse buildPartial() {
      com.proto.calculator.UpdateBlogResponse result = new com.proto.calculator.UpdateBlogResponse(this);
      if (blogBuilder_ == null) {
        result.blog_ = blog_;
      } else {
        result.blog_ = blogBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.proto.calculator.UpdateBlogResponse) {
        return mergeFrom((com.proto.calculator.UpdateBlogResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.proto.calculator.UpdateBlogResponse other) {
      if (other == com.proto.calculator.UpdateBlogResponse.getDefaultInstance()) return this;
      if (other.hasBlog()) {
        mergeBlog(other.getBlog());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getBlogFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private com.proto.calculator.Blog blog_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.calculator.Blog, com.proto.calculator.Blog.Builder, com.proto.calculator.BlogOrBuilder> blogBuilder_;
    /**
     * <code>.calculator.Blog blog = 1;</code>
     * @return Whether the blog field is set.
     */
    public boolean hasBlog() {
      return blogBuilder_ != null || blog_ != null;
    }
    /**
     * <code>.calculator.Blog blog = 1;</code>
     * @return The blog.
     */
    public com.proto.calculator.Blog getBlog() {
      if (blogBuilder_ == null) {
        return blog_ == null ? com.proto.calculator.Blog.getDefaultInstance() : blog_;
      } else {
        return blogBuilder_.getMessage();
      }
    }
    /**
     * <code>.calculator.Blog blog = 1;</code>
     */
    public Builder setBlog(com.proto.calculator.Blog value) {
      if (blogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blog_ = value;
        onChanged();
      } else {
        blogBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.calculator.Blog blog = 1;</code>
     */
    public Builder setBlog(
        com.proto.calculator.Blog.Builder builderForValue) {
      if (blogBuilder_ == null) {
        blog_ = builderForValue.build();
        onChanged();
      } else {
        blogBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.calculator.Blog blog = 1;</code>
     */
    public Builder mergeBlog(com.proto.calculator.Blog value) {
      if (blogBuilder_ == null) {
        if (blog_ != null) {
          blog_ =
            com.proto.calculator.Blog.newBuilder(blog_).mergeFrom(value).buildPartial();
        } else {
          blog_ = value;
        }
        onChanged();
      } else {
        blogBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.calculator.Blog blog = 1;</code>
     */
    public Builder clearBlog() {
      if (blogBuilder_ == null) {
        blog_ = null;
        onChanged();
      } else {
        blog_ = null;
        blogBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.calculator.Blog blog = 1;</code>
     */
    public com.proto.calculator.Blog.Builder getBlogBuilder() {
      
      onChanged();
      return getBlogFieldBuilder().getBuilder();
    }
    /**
     * <code>.calculator.Blog blog = 1;</code>
     */
    public com.proto.calculator.BlogOrBuilder getBlogOrBuilder() {
      if (blogBuilder_ != null) {
        return blogBuilder_.getMessageOrBuilder();
      } else {
        return blog_ == null ?
            com.proto.calculator.Blog.getDefaultInstance() : blog_;
      }
    }
    /**
     * <code>.calculator.Blog blog = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.proto.calculator.Blog, com.proto.calculator.Blog.Builder, com.proto.calculator.BlogOrBuilder> 
        getBlogFieldBuilder() {
      if (blogBuilder_ == null) {
        blogBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.proto.calculator.Blog, com.proto.calculator.Blog.Builder, com.proto.calculator.BlogOrBuilder>(
                getBlog(),
                getParentForChildren(),
                isClean());
        blog_ = null;
      }
      return blogBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:calculator.UpdateBlogResponse)
  }

  // @@protoc_insertion_point(class_scope:calculator.UpdateBlogResponse)
  private static final com.proto.calculator.UpdateBlogResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.proto.calculator.UpdateBlogResponse();
  }

  public static com.proto.calculator.UpdateBlogResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateBlogResponse>
      PARSER = new com.google.protobuf.AbstractParser<UpdateBlogResponse>() {
    @java.lang.Override
    public UpdateBlogResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<UpdateBlogResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateBlogResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.proto.calculator.UpdateBlogResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

