package mera.com.borisgk98.autoshowroom.servergroovy.kafka

import com.fasterxml.jackson.databind.ObjectMapper
import mera.com.borisgk98.autoshowroom.servergroovy.model.Order
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component

@Component
class OrderSender implements Sender<Order> {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate
    @Autowired
    private ObjectMapper om

    private final String topic = "order"

    void send(Order model) {
        kafkaTemplate.send(topic, om.writeValueAsString(model))
    }
}
