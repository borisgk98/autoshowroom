package com.mera.borisgk98.autoshowroom.server.kafka;


import org.springframework.kafka.annotation.KafkaListener;

import java.util.concurrent.CountDownLatch;

public class OrderConsumer {
//    private CountDownLatch latch = new CountDownLatch(1);
//
//    public CountDownLatch getLatch() {
//        return latch;
//    }

    @KafkaListener(topics = "order")
    public void receive(String payload) {
        System.out.println("Receive " + payload);
//        latch.countDown();
    }
}
