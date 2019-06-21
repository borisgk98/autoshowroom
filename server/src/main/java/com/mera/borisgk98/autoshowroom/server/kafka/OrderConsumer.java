package com.mera.borisgk98.autoshowroom.server.kafka;


import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.mera.borisgk98.autoshowroom.server.models.Order;
import com.mera.borisgk98.autoshowroom.server.services.OrderService;
import io.micrometer.core.annotation.Timed;
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

    @Autowired
    private ObjectMapper om;
    @Autowired
    private OrderService orderService;

    @KafkaListener(topics = "order", groupId = "server-java")
    public void receive(String payload) {
        test();
        System.out.println("Receive payload:");
        System.out.println(payload);
        Order order = null;
        try {
            order = om.readValue(payload, Order.class);
        }
        catch (Exception e) {
            System.err.println("Error while deserialize order object from payload");
            return;
        }
        orderService.create(order);
        System.out.println("Successfully save order: ");
        System.out.println(order);
//        latch.countDown();
    }


    @Timed(value = "kafka_requests")
    public void test() {
        System.out.println(1);
    }
}
