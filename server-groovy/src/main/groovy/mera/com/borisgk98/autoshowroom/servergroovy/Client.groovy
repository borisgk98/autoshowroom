package mera.com.borisgk98.autoshowroom.servergroovy

import com.mera.borisgk98.autoshowroom.grpc.Customer
import com.mera.borisgk98.autoshowroom.grpc.Order
import com.mera.borisgk98.autoshowroom.grpc.OrderServiceGrpc
import io.grpc.ManagedChannel
import io.grpc.ManagedChannelBuilder

class Client {
    static void main(String[] args) {
        def grpcClient = OrderServiceGrpc.newBlockingStub(ManagedChannelBuilder
                .forAddress("localhost", 6565).usePlaintext().build());
        def order = Order.newBuilder()
                        .setCustomer(Customer.newBuilder()
                                    .setName("Boris")
                                    .setSurname("K")
                                    .build())
                        .build()
        println grpcClient.save(order)
    }
}
