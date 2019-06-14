package com.mera.borisgk98.autoshowroom.server.grpc;

import com.mera.borisgk98.autoshowroom.grpc.Order;
import com.mera.borisgk98.autoshowroom.grpc.OrderSaveStatus;
import com.mera.borisgk98.autoshowroom.grpc.OrderServiceGrpc;
import com.mera.borisgk98.autoshowroom.server.services.OrderService;
import com.mera.borisgk98.autoshowroom.server.tool.Converter;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class OrderGrpcService extends OrderServiceGrpc.OrderServiceImplBase {

    @Autowired
    protected OrderService service;

    @Override
    public void save(Order request, StreamObserver<OrderSaveStatus> responseObserver) {
        try {
            service.create(Converter.convert(request, com.mera.borisgk98.autoshowroom.server.models.Order.class));
            responseObserver.onNext(OrderSaveStatus.newBuilder()
                    .setOrder(request)
                    .setStatus(OrderSaveStatus.Status.SUCCESS).build());
        }
        catch (Exception e) {
            System.err.println(e);
            responseObserver.onNext(OrderSaveStatus.newBuilder()
                    .setOrder(request)
                    .setStatus(OrderSaveStatus.Status.FAIL).build());
        }
        responseObserver.onCompleted();
    }
}
