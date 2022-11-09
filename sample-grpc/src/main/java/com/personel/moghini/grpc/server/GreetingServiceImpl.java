package com.personel.moghini.grpc.server;

import com.proto.greeting.*;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {

    @Override
    public void greet(GreetingRequest request, StreamObserver<GreetingResponse> responseObserver) {
        Greeting greeting = request.getGreeting();
        String firstName = greeting.getFirstName();

        String result = "hello dear "+firstName;
        GreetingResponse greetingResponse =  GreetingResponse.newBuilder()
                .setResult(result).build();

        responseObserver.onNext(greetingResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void greetManyTimes(GreetingManyTimesRequest request, StreamObserver<GreetingManyTimesResponse> responseObserver) {
        var firstName = request.getFirstName();
        try {
            for (int i = 1;i<10 ;i++){
            var message = "hello dear "+firstName +"#"+i;
            var response = GreetingManyTimesResponse.newBuilder().setResult(message).build();
            responseObserver.onNext(response);
                Thread.sleep(1000L);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            responseObserver.onCompleted();
        }

    }
}
