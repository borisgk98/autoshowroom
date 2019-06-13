package mera.com.borisgk98.autoshowroom.servergroovy.rest

import mera.com.borisgk98.autoshowroom.servergroovy.model.Order
import mera.com.borisgk98.autoshowroom.servergroovy.model.cassandra.CassandraModelFactory
import mera.com.borisgk98.autoshowroom.servergroovy.model.cassandra.OrderCM
import mera.com.borisgk98.autoshowroom.servergroovy.repo.OrderRepo
import mera.com.borisgk98.autoshowroom.servergroovy.tool.Converter
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.repository.CrudRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/order")
class OrderController {

    @Autowired
    OrderRepo repo
    @Autowired
    CassandraModelFactory factory


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

        return orderCM.getModel()
    }
}
