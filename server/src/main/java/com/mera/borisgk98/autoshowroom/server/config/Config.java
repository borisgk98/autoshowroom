package com.mera.borisgk98.autoshowroom.server.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.mera.borisgk98.autoshowroom.server.repositories")
@ComponentScan({ "com.mera.borisgk98.autoshowroom.server" })
public class Config {
}
