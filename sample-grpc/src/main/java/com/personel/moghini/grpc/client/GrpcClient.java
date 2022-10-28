package com.personel.moghini.grpc.client;

import com.proto.dummy.DummyServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        System.out.println("Hello I'm gRPC client");
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",50010)
                .usePlaintext()
                .build();
        DummyServiceGrpc.DummyServiceBlockingStub syncClient =
                DummyServiceGrpc.newBlockingStub(managedChannel);

        System.out.println("shutting down channel");
        managedChannel.shutdown();
    }
}
