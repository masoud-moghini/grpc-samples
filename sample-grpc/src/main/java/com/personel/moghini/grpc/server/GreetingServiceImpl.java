package com.personel.moghini.grpc.server;

import com.proto.greeting.Greeting;
import com.proto.greeting.GreetingRequest;
import com.proto.greeting.GreetingResponse;
import com.proto.greeting.GreetingServiceGrpc;
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
}
