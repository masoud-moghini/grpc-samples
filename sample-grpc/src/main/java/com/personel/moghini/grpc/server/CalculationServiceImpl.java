package com.personel.moghini.grpc.server;

import com.proto.calculator.*;
import io.grpc.stub.StreamObserver;
import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CalculationServiceImpl extends SummationGrpc.SummationImplBase {
    @Override
    public void decompose(PrimeNumberRequest request, StreamObserver<CalculatorResponse> responseObserver) {
        Long primeNumber = request.getPrimeNumber();

        short k = 2;
        try{
            while (primeNumber > 1){
                if (primeNumber%k ==0){
                    responseObserver.onNext(CalculatorResponse.newBuilder().setResult(k).build());
                    primeNumber /= k;
                }else {
                    k++;
                }
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    public StreamObserver<AverageNumberRequest> average(StreamObserver<CalculatorResponse> responseObserver) {
        List<Long> numbers=new ArrayList<>();
        StreamObserver<AverageNumberRequest> requestStreamObserver = new StreamObserver<AverageNumberRequest>() {
            @Override
            public void onNext(AverageNumberRequest value) {
                numbers.add(value.getNumber());
            }

            @Override
            public void onError(Throwable t) {

            }

            @Override
            public void onCompleted() {
                var average = numbers.stream().collect(Collectors.averagingLong(num->  num));
                responseObserver.onNext(CalculatorResponse.newBuilder().setResult(average).build());
                responseObserver.onCompleted();
            }
        };
        return requestStreamObserver;
    }

    @Override
    public void sum(CalculatorRequest request, StreamObserver<CalculatorResponse> responseObserver) {
        Parameters params = request.getParams();
        var firstItem = params.getFirstItem();
        var secondItem = params.getSecondItem();
        System.out.println(String.format("first parameter is %d and second one is %d ",firstItem,secondItem));
        var response = CalculatorResponse.newBuilder().setResult(
            Long.sum(firstItem,secondItem)
        ).build();
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
