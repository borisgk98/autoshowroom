package mera.com.borisgk98.autoshowroom.servergroovy.rest

import com.mera.borisgk98.autoshowroom.grpc.OrderSaveStatus
import com.mera.borisgk98.autoshowroom.grpc.OrderServiceGrpc.OrderServiceBlockingStub
import mera.com.borisgk98.autoshowroom.servergroovy.model.Order
import mera.com.borisgk98.autoshowroom.servergroovy.model.cassandra.CassandraModelFactory
import mera.com.borisgk98.autoshowroom.servergroovy.model.cassandra.OrderCM
import mera.com.borisgk98.autoshowroom.servergroovy.repo.OrderRepo
import mera.com.borisgk98.autoshowroom.servergroovy.tool.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.client.HttpServerErrorException

@RestController
@RequestMapping("/order")
class OrderController {

    @Autowired
    OrderRepo repo
    @Autowired
    CassandraModelFactory factory
    @Autowired
    com.mera.borisgk98.autoshowroom.grpc.OrderServiceGrpc.OrderServiceBlockingStub client


    @RequestMapping(value = "",
            produces = "application/json",
            consumes = "application/json",
            method = RequestMethod.POST)
    Order save(@RequestBody Order order) {
        OrderCM orderCM = (OrderCM) factory.getModel(OrderCM.class)
        orderCM.setModel(Converter.convert(order,
                mera.com.borisgk98.autoshowroom.servergroovy.model.Order.class))
        orderCM.modelClass = mera.com.borisgk98.autoshowroom.servergroovy.model.Order.class
        orderCM.initStringData()
        orderCM.uuid = UUID.randomUUID()
        orderCM = repo.save(orderCM)

        // TODO communication with java server
        def res = BuilderConverter.convert(order, com.mera.borisgk98.autoshowroom.grpc.Order.class)
        OrderSaveStatus saveStatus = client.save(res)
        if (saveStatus.getStatus().equals(com.mera.borisgk98.autoshowroom.grpc.OrderSaveStatus.Status.FAIL)) {
            throw new Exception("Some error on java client")
        }

        return orderCM.getModel()
    }
}
