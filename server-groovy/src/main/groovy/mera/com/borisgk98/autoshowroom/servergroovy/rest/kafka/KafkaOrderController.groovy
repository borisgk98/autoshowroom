package mera.com.borisgk98.autoshowroom.servergroovy.rest.kafka

import com.mera.borisgk98.autoshowroom.grpc.OrderSaveStatus
import com.mera.borisgk98.autoshowroom.grpc.OrderServiceGrpc.OrderServiceBlockingStub
import mera.com.borisgk98.autoshowroom.servergroovy.kafka.Sender
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
@RequestMapping("/kafka/order")
class KafkaOrderController {

    @Autowired
    OrderRepo repo
    @Autowired
    CassandraModelFactory factory
    @Autowired
    Sender<Order> orderSender


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

        orderSender.send(order)

        return orderCM.getModel()
    }
}
