package com.mera.borisgk98.autoshowroom.soapclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({
        "com.mera.borisgk98.autoshowroom.client",
        "com.mera.borisgk98.autoshowroom.soapclient.service"
})
public class Application  {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}