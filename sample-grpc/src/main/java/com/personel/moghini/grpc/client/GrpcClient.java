package com.personel.moghini.grpc.client;

import com.personel.moghini.grpc.server.GreetingServiceImpl;
import com.proto.dummy.DummyServiceGrpc;
import com.proto.greeting.Greeting;
import com.proto.greeting.GreetingRequest;
import com.proto.greeting.GreetingResponse;
import com.proto.greeting.GreetingServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient {
    public static void main(String[] args) {
        System.out.println("Hello I'm gRPC client");
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",50010)
                .usePlaintext()
                .build();
        //DummyServiceGrpc.DummyServiceBlockingStub syncClient =
        //        DummyServiceGrpc.newBlockingStub(managedChannel);

        GreetingServiceGrpc.GreetingServiceBlockingStub greetingClient =
                GreetingServiceGrpc.newBlockingStub(managedChannel);
        Greeting greeting = Greeting.newBuilder()
                .setFirstName("masoud")
                .setLastName("moghini")
                .build();
        GreetingRequest greetingRequest = GreetingRequest
                .newBuilder()
                .setGreeting(greeting)
                .build();

        GreetingResponse greetingResponse = greetingClient.greet(greetingRequest);

        System.out.println(greetingResponse.getResult());
        System.out.println("shutting down channel");
        managedChannel.shutdown();
    }
}
