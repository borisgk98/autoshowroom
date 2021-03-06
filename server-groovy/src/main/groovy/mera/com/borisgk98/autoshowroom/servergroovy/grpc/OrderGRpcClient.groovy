package mera.com.borisgk98.autoshowroom.servergroovy.grpc

import com.mera.borisgk98.autoshowroom.grpc.Order
import com.mera.borisgk98.autoshowroom.grpc.OrderServiceGrpc
import io.grpc.stub.StreamObserver
import mera.com.borisgk98.autoshowroom.servergroovy.model.cassandra.CassandraModelFactory
import mera.com.borisgk98.autoshowroom.servergroovy.model.cassandra.OrderCM
import mera.com.borisgk98.autoshowroom.servergroovy.repo.OrderRepo
import mera.com.borisgk98.autoshowroom.servergroovy.tool.Converter
import org.lognet.springboot.grpc.GRpcService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class OrderGRpcClient extends OrderServiceGrpc.OrderServiceImplBase {

    @Autowired
    OrderRepo orderRepo
    @Autowired
    CassandraModelFactory factory

    @Override
    void save(Order request, StreamObserver<Order> responseObserver) {
        OrderCM orderCM = (OrderCM) factory.getModel(OrderCM.class)
        orderCM.setModel(Converter.convert(request,
                mera.com.borisgk98.autoshowroom.servergroovy.model.Order.class))
        orderCM.modelClass = Order.class
        orderCM.initStringData()
        orderCM.uuid = UUID.randomUUID()
        orderCM = orderRepo.save(orderCM)
    }
}
