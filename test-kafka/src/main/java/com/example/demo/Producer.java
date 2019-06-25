//package com.example.demo;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.stereotype.Component;
//
//@Component
//public class Producer {
//    @Autowired
//    private KafkaTemplate<String, String> kafkaTemplate;
//
//    private final String topic = "test";
//
//    void send(String message) {
//        kafkaTemplate.send(topic, message);
//    }
//}
