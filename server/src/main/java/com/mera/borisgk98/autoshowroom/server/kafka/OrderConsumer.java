package com.mera.borisgk98.autoshowroom.server.kafka;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mera.borisgk98.autoshowroom.server.models.Order;
import com.mera.borisgk98.autoshowroom.server.prometheus.annotations.Counter;
import com.mera.borisgk98.autoshowroom.server.services.OrderService;
import io.micrometer.core.annotation.Timed;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.concurrent.CountDownLatch;

@Component
public class OrderConsumer {
//    private CountDownLatch latch = new CountDownLatch(1);
//
//    public CountDownLatch getLatch() {
//        return latch;
//    }

    private Logger logger = LoggerFactory.getLogger(OrderConsumer.class);

    @Autowired
    private ObjectMapper om;
    @Autowired
    private OrderService orderService;

    @KafkaListener(topics = "order", groupId = "server-java")
    @Counter(metrics = { "kafka_requests", "requests" } )
    public void receive(String payload) {
        logger.info("Receive payload:");
        logger.info(payload);
        Order order = null;
        try {
            order = om.readValue(payload, Order.class);
        }
        catch (Exception e) {
            logger.error("Error while deserialize order object from payload");
            return;
        }
        orderService.create(order);
        logger.info("Successfully save order: ");
        logger.info(order.toString());
//        latch.countDown();
    }
}
