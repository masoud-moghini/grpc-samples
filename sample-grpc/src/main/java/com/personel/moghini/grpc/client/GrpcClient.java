package com.personel.moghini.grpc.client;

import com.personel.moghini.grpc.server.GreetingServiceImpl;
import com.proto.dummy.DummyServiceGrpc;
import com.proto.greeting.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class GrpcClient {
    private void doBiDiRequest(ManagedChannel channel){
        GreetingServiceGrpc.GreetingServiceStub greetingServiceStub = GreetingServiceGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<GreetingToEveryoneRequest> greetingToEveryoneRequestStreamObserver = greetingServiceStub.greetingToEveryone(new StreamObserver<GreetingToEveryoneResponse>() {
            @Override
            public void onNext(GreetingToEveryoneResponse value) {
                System.out.println("response from server "+value.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("server completed sending data");
                latch.countDown();
            }
        });
        Arrays.asList("Masoud","Javad","John").forEach(name->{
            System.out.println("sending request of "+ name);
            greetingToEveryoneRequestStreamObserver.onNext(GreetingToEveryoneRequest.newBuilder().setGreeting(name).buildPartial());
        });
        try {
            latch.await(3,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void run(){
        System.out.println("Hello I'm gRPC client");
        ManagedChannel managedChannel = ManagedChannelBuilder.forAddress("localhost",50010)
                .usePlaintext()
                .build();
        this.doBiDiRequest(managedChannel);
    }
    public static void main(String[] args) {

        GrpcClient client = new GrpcClient();
        client.run();
        //DummyServiceGrpc.DummyServiceBlockingStub syncClient =
        //        DummyServiceGrpc.newBlockingStub(managedChannel);

        /*GreetingServiceGrpc.GreetingServiceBlockingStub greetingClient =
                GreetingServiceGrpc.newBlockingStub(managedChannel);
        */
        //UNARY
        /*
        Greeting greeting = Greeting.newBuilder()
                .setFirstName("masoud")
                .setLastName("moghini")
                .build();
        GreetingRequest greetingRequest = GreetingRequest
                .newBuilder()
                .setGreeting(greeting)
                .build();

        GreetingResponse greetingResponse = greetingClient.greet(greetingRequest);
        */

        //STREAMING RESPONSE
        /*
        var greetingManyTimesRequest =
                GreetingManyTimesRequest
                        .newBuilder()
                        .setFirstName("masoud")
                        .build();
        var greetingManyTimesResponses =
                greetingClient.greetManyTimes(greetingManyTimesRequest);
        greetingManyTimesResponses.forEachRemaining(greetingManyTimesResponse -> {
            System.out.println(greetingManyTimesResponse.getResult());
        });
        */
        //STREAMING REQUEST
        //        GreetingServiceGrpc.GreetingServiceStub asyncClient =  GreetingServiceGrpc.newStub(managedChannel);
        //        CountDownLatch latch = new CountDownLatch(1);
        //        var requestObserver = asyncClient.longGreeting(new StreamObserver<LongGreetingResponse>() {
        //            @Override
        //            public void onNext(LongGreetingResponse value) {
        //                System.out.println("received response from server");
        //                System.out.println(value.getGreetingResponse());
        //            }
        //
        //            @Override
        //            public void onError(Throwable t) {
        //
        //            }
        //
        //            @Override
        //            public void onCompleted() {
        //                System.out.println("server has completed response from server");
        //                latch.countDown();
        //            }
        //        });
        //        requestObserver.onNext(GreetingManyTimesRequest.newBuilder().setFirstName("Ali").setLastName("Rezaee").build());
        //        requestObserver.onNext(GreetingManyTimesRequest.newBuilder().setFirstName("Masoud").setLastName("Moghini").build());
        //        requestObserver.onNext(GreetingManyTimesRequest.newBuilder().setFirstName("Javad").setLastName("Komeili").build());
        //        requestObserver.onCompleted();
        //
        //        try {
        //            latch.await(3L, TimeUnit.MINUTES);
        //        } catch (InterruptedException e) {
        //            e.printStackTrace();
        //        }
        //
        //        System.out.println("shutting down channel");
        //        managedChannel.shutdown();

    }
}
