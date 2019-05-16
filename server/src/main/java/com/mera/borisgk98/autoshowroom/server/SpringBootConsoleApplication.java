package com.mera.borisgk98.autoshowroom.server;

import com.mera.borisgk98.autoshowroom.server.config.Config;
import com.mera.borisgk98.autoshowroom.server.models.Auto;
import com.mera.borisgk98.autoshowroom.server.models.AutoMark;
import com.mera.borisgk98.autoshowroom.server.models.AutoModel;
import com.mera.borisgk98.autoshowroom.server.models.AutoOption;
import com.mera.borisgk98.autoshowroom.server.services.AutoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@SpringBootApplication
public class SpringBootConsoleApplication
        implements CommandLineRunner {

    @Autowired
    protected AutoService autoService;

    private static Logger LOG = LoggerFactory
            .getLogger(SpringBootConsoleApplication.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(SpringBootConsoleApplication.class, args);
        LOG.info("APPLICATION FINISHED");
    }

    @Override
    public void run(String... args) {
        autoService.create(new Auto());
    }
}