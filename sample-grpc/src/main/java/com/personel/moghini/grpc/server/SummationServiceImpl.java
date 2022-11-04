package com.personel.moghini.grpc.server;

import com.proto.calculator.CalculatorRequest;
import com.proto.calculator.CalculatorResponse;
import com.proto.calculator.Parameters;
import com.proto.calculator.SummationGrpc;
import io.grpc.stub.StreamObserver;

public class SummationServiceImpl extends SummationGrpc.SummationImplBase {
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
