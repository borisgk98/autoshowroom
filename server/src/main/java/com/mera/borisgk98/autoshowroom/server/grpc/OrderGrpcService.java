package com.mera.borisgk98.autoshowroom.server.grpc;

import com.mera.borisgk98.autoshowroom.grpc.Order;
import com.mera.borisgk98.autoshowroom.grpc.OrderSaveStatus;
import com.mera.borisgk98.autoshowroom.grpc.OrderServiceGrpc;
import com.mera.borisgk98.autoshowroom.server.prometheus.annotations.Counter;
import com.mera.borisgk98.autoshowroom.server.services.OrderService;
import com.mera.borisgk98.autoshowroom.server.tool.Converter;
import io.grpc.stub.StreamObserver;
import io.micrometer.core.annotation.Timed;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@GRpcService
public class OrderGrpcService extends OrderServiceGrpc.OrderServiceImplBase {

    @Autowired
    protected OrderService service;

    private Logger logger = LoggerFactory.getLogger(OrderGrpcService.class);

    @Override
    @Counter(metrics = { "grpc_requests", "requests" } )
    public void save(Order request, StreamObserver<OrderSaveStatus> responseObserver) {
        try {
            service.create(Converter.convert(request, com.mera.borisgk98.autoshowroom.server.models.Order.class));
            responseObserver.onNext(OrderSaveStatus.newBuilder()
                    .setOrder(request)
                    .setStatus(OrderSaveStatus.Status.SUCCESS).build());
        }
        catch (Exception e) {
            logger.error(e.getMessage());
            responseObserver.onNext(OrderSaveStatus.newBuilder()
                    .setOrder(request)
                    .setStatus(OrderSaveStatus.Status.FAIL).build());
        }
        responseObserver.onCompleted();
    }
}
