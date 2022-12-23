package com.personel.moghini.grpc.client;

import com.proto.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.concurrent.CountDownLatch;

public class BlogClient {
    private void createBlog(ManagedChannel channel){
        BlogServiceGrpc.BlogServiceBlockingStub blogStub = BlogServiceGrpc.newBlockingStub(channel);

        try {
            var response = blogStub.createBlog(CreateBlogRequest.newBuilder().build().newBuilder().setBlog(Blog.newBuilder()
                        .setAuthorId("masoud")
                        .setTitle("physics")
                        .setContent("hello world")
                        .build())
                    .build());
            System.out.println(response.toString());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    private void updateBlog(ManagedChannel channel){
        BlogServiceGrpc.BlogServiceBlockingStub blogStub = BlogServiceGrpc.newBlockingStub(channel);

        try {
            var response = blogStub.updateBlog(UpdateBlogRequest.newBuilder().build().newBuilder().setBlog(Blog.newBuilder()
                        .setId("63a59977c4fa4b3a28ccc316")
                        .setAuthorId("masoudd")
                        .setTitle("physics")
                        .setContent("hello world")
                        .build())
                    .build());
            System.out.println(response.toString());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    private void readBlog(ManagedChannel channel){
        BlogServiceGrpc.BlogServiceBlockingStub blogStub = BlogServiceGrpc.newBlockingStub(channel);

        try {
            var response = blogStub.readBlog(ReadBlogRequest.newBuilder().setBlogId("63a59987c4fa4b3a28ccc316")
                    .build());
            System.out.println(response.toString());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    private void deleteBlog(ManagedChannel channel){
        BlogServiceGrpc.BlogServiceBlockingStub blogStub = BlogServiceGrpc.newBlockingStub(channel);

        try {
            var response = blogStub.deleteBlog(DeleteBlogRequest.newBuilder().setBlogId("63a599ddc4fa4b3a28ccc317")
                    .build());
            System.out.println(response.toString());
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    private void listBlogs(ManagedChannel channel){
        BlogServiceGrpc.BlogServiceBlockingStub blogStub = BlogServiceGrpc.newBlockingStub(channel);

        try {
            var response = blogStub.listBlog(ListBlogRequest.newBuilder()
                    .build());
            response.forEachRemaining(listBlogResponse -> {
                System.out.println(listBlogResponse.toString());
            });
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    public void run(){
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",50010)
                .usePlaintext()
                .build();
        //createBlog(managedChannel);
        //readBlog(managedChannel);
        //updateBlog(managedChannel);
        //deleteBlog(managedChannel);
        listBlogs(managedChannel);
    }
    public static void main(String[] args) {

        BlogClient client = new BlogClient();
        client.run();
    }
}
