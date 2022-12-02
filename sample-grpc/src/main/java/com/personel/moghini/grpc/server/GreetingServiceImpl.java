package com.personel.moghini.grpc.server;

import com.proto.greeting.*;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {
    @Override
    public StreamObserver<GreetingManyTimesRequest> longGreeting(StreamObserver<LongGreetingResponse> responseObserver) {
        StreamObserver<GreetingManyTimesRequest> longGreetingRequestStreamObserver = new StreamObserver<GreetingManyTimesRequest>() {
            String result = "";

            @Override
            public void onNext(GreetingManyTimesRequest value) {
                System.out.println("request got in server "+ value.getFirstName());
                result += "hello "+value.getFirstName()+" ! ";
                System.out.println(result);
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(LongGreetingResponse.newBuilder().setGreetingResponse(result).build());
                responseObserver.onCompleted();
            }
        };
        return longGreetingRequestStreamObserver;
    }

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
    public StreamObserver<GreetingToEveryoneRequest> greetingToEveryone(StreamObserver<GreetingToEveryoneResponse> responseObserver) {
        StreamObserver<GreetingToEveryoneRequest> greetingToEveryoneRequestStreamObserver =
                new StreamObserver<GreetingToEveryoneRequest>() {
                    @Override
                    public void onNext(GreetingToEveryoneRequest value) {
                        var response = "Hello Dear " +value.getGreeting();
                        responseObserver.onNext(GreetingToEveryoneResponse.newBuilder().setResult(response).build());
                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onCompleted() {
                        responseObserver.onCompleted();
                    }
                };
        return greetingToEveryoneRequestStreamObserver;
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
