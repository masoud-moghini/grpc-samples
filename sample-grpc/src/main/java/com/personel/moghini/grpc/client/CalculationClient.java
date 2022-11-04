package com.personel.moghini.grpc.client;

import com.proto.calculator.CalculatorRequest;
import com.proto.calculator.CalculatorResponse;
import com.proto.calculator.Parameters;
import com.proto.calculator.SummationGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class CalculationClient {
    public static void main(String[] args) {
        ManagedChannel managedChannel= ManagedChannelBuilder.forAddress("localhost",50010)
                .usePlaintext()
                .build();
        SummationGrpc.SummationBlockingStub summationBlockingStub =  SummationGrpc.
                newBlockingStub(managedChannel);

        Parameters parameters = Parameters.newBuilder()
                .setFirstItem(150)
                .setSecondItem(981545)
                .build();
        CalculatorRequest request = CalculatorRequest.newBuilder().setParams(parameters).build();
        CalculatorResponse calculatorResponse = summationBlockingStub.sum(request);
        System.out.println("result of summation is :"+calculatorResponse.getResult());
    }
}
