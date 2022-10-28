package com.personel.moghini;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("hello fro gRPC");

        Server server = ServerBuilder.forPort(50010).build();

        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(()->{
            System.out.println("got shutdown hook now");
            server.shutdown();
            System.out.println("server shut down");
        }));

        server.awaitTermination();
    }
}
