package com.example.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "test", groupId = "foo")
    public void receive(String payload) {
        System.err.println("Test message: " + payload);
//        latch.countDown();
    }
}
