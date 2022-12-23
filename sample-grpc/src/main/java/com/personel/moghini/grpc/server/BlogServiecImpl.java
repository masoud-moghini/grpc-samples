package com.personel.moghini.grpc.server;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.proto.calculator.*;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;

import org.bson.Document;
import org.bson.types.ObjectId;

import static com.mongodb.client.model.Filters.eq;


public class BlogServiecImpl extends BlogServiceGrpc.BlogServiceImplBase {

    MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017");
    MongoDatabase mongoDatabase = mongoClient.getDatabase("mydb");
    MongoCollection<Document> collection = mongoDatabase.getCollection("blog");
    @Override
    public void createBlog(CreateBlogRequest request, StreamObserver<CreateBlogResponse> responseObserver) {
        Blog blog = request.getBlog();
        System.out.println("start saving blog");
        Document doc = new Document("author_id",blog.getAuthorId())
                .append("title",blog.getTitle())
                .append("content",blog.getContent());
        collection.insertOne(doc);
        System.out.println("end saving blog");

        String blogId = doc.getObjectId("_id").toString();
        responseObserver.onNext(CreateBlogResponse.newBuilder()
                .setBlog(blog.toBuilder().setId(blogId).build()).build()
        );
        responseObserver.onCompleted();
    }

    @Override
    public void readBlog(ReadBlogRequest request, StreamObserver<ReadBlogResponse> responseObserver) {
        String blogId = request.getBlogId();
        System.out.println("start reading blog");
        Document result = collection.find(eq("_id",new ObjectId((blogId))))
            .first();
        System.out.println("end of finding blog");
        if (result ==null){
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("blog with corresponding id not found")
                            .asRuntimeException()
            );
            responseObserver.onCompleted();
        }
        else {
            responseObserver.onNext(ReadBlogResponse.newBuilder().setBlog(makeBlogFromDocument(blogId, result))
                .build());
            responseObserver.onCompleted();
        }
    }

    @Override
    public void updateBlog(UpdateBlogRequest request, StreamObserver<UpdateBlogResponse> responseObserver) {
        String blogId = request.getBlog().getId();
        Blog blog = request.getBlog();
        Document result = collection.find(eq("_id",new ObjectId((blogId))))
                .first();
        System.out.println("end of finding blog");
        if (result ==null){
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("blog with corresponding id not found")
                            .asRuntimeException()
            );
            responseObserver.onCompleted();
        }
        else {
            Document doc = new Document("author_id",blog.getAuthorId())
                    .append("title",blog.getTitle())
                    .append("content",blog.getContent());
            collection.replaceOne(eq("_id",new ObjectId(blogId)),doc);
            responseObserver.onNext(UpdateBlogResponse.newBuilder().setBlog(makeBlogFromDocument(blogId, result))
                    .build());

            responseObserver.onCompleted();
        }
    }

    @Override
    public void deleteBlog(DeleteBlogRequest request, StreamObserver<DeleteBlogResponse> responseObserver) {
        String blogId = request.getBlogId();
        var deleteResult = collection.deleteOne(eq("_id",new ObjectId(blogId)));
        if(deleteResult.getDeletedCount()==0){
            responseObserver.onError(
                    Status.NOT_FOUND
                            .withDescription("blog with corresponding id not found")
                            .asRuntimeException()
            );
            responseObserver.onCompleted();
        }
        responseObserver.onNext(DeleteBlogResponse.newBuilder().setBlogId(blogId).build());
        responseObserver.onCompleted();
    }

    @Override
    public void listBlog(ListBlogRequest request, StreamObserver<ListBlogResponse> responseObserver) {
        collection.find().iterator().forEachRemaining(blog->{
            responseObserver.onNext(ListBlogResponse.newBuilder().setBlog(
                    makeBlogFromDocument(blog.getObjectId("_id").toString(),blog)
            ).build());
        });
        responseObserver.onCompleted();
    }

    private Blog makeBlogFromDocument(String blogId, Document result) {
        return Blog.newBuilder()
                .setId(blogId)
                .setTitle(result.getString("title"))
                .setAuthorId(result.getString("author_id"))
                .setContent(result.getString("content"))
                .build();
    }
}
