package com.personel.moghini.grpc.client;

import com.proto.calculator.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class CalculationClient {
    private void findMaximum(ManagedChannel channel){
        SummationGrpc.SummationStub summationStub = SummationGrpc.newStub(channel);
        CountDownLatch latch = new CountDownLatch(1);
        StreamObserver<CalculatorResponse> responseStreamObserver = new StreamObserver<CalculatorResponse>() {
            @Override
            public void onNext(CalculatorResponse value) {
                System.out.println(new StringBuffer().append("maximum until now ")
                .append(value).append('\n'));
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("last response fetched");
                latch.countDown();
            }
        };
        StreamObserver<MaximumNumberRequest> requestStreamObserver = summationStub.findMax(responseStreamObserver);
        requestStreamObserver.onNext(MaximumNumberRequest.newBuilder().setNumber(15).build());
        requestStreamObserver.onNext(MaximumNumberRequest.newBuilder().setNumber(1).build());
        requestStreamObserver.onNext(MaximumNumberRequest.newBuilder().setNumber(155).build());
        requestStreamObserver.onNext(MaximumNumberRequest.newBuilder().setNumber(159).build());
        try {
            latch.await(3,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
    public void run(){
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",50010)
                .usePlaintext()
                .build();
        findMaximum(managedChannel);
    }
    public static void main(String[] args) {

        CalculationClient client = new CalculationClient();
        client.run();
        //BLOCKING STUB
        /*
        SummationGrpc.SummationBlockingStub summationBlockingStub =  SummationGrpc.
                newBlockingStub(managedChannel);

        Parameters parameters = Parameters.newBuilder()
                .setFirstItem(150)
                .setSecondItem(981545)
                .build();
        CalculatorRequest request = CalculatorRequest.newBuilder().setParams(parameters).build();
        CalculatorResponse calculatorResponse = summationBlockingStub.sum(request);
        System.out.println("result of summation is :"+calculatorResponse.getResult());
         */
        /*
        SummationGrpc.SummationBlockingStub summationGrpc = SummationGrpc.newBlockingStub(managedChannel);
        PrimeNumberRequest number = PrimeNumberRequest.newBuilder().setPrimeNumber(15478L).build();
        var decompositionResult = summationGrpc.decompose(number);
        decompositionResult.forEachRemaining(calculatorResponse -> {
            System.out.println("hello result is : "+calculatorResponse.getResult()+"\n");
        });

         */
        /*
        SummationGrpc.SummationStub grpcClient = SummationGrpc.newStub(managedChannel);
        CountDownLatch latch = new CountDownLatch(5);
        StreamObserver<CalculatorResponse> averageNumberRequestStreamObserver = new StreamObserver<CalculatorResponse>() {
            @Override
            public void onNext(CalculatorResponse value) {
                System.out.println("response has been sent front server");
                System.out.println(value.getResult());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                System.out.println("end of getting responses");
            }
        };
        StreamObserver<AverageNumberRequest> primeNumberRequestStreamObserver = grpcClient.average(averageNumberRequestStreamObserver);
        primeNumberRequestStreamObserver.onNext(AverageNumberRequest.newBuilder().setNumber(154).build());
        primeNumberRequestStreamObserver.onNext(AverageNumberRequest.newBuilder().setNumber(984).build());
        primeNumberRequestStreamObserver.onNext(AverageNumberRequest.newBuilder().setNumber(1024).build());
        primeNumberRequestStreamObserver.onNext(AverageNumberRequest.newBuilder().setNumber(574).build());
        primeNumberRequestStreamObserver.onCompleted();
        try {
            latch.await(3, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        */
    }
}
