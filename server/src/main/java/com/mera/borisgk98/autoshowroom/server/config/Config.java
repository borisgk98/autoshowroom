package com.mera.borisgk98.autoshowroom.server.config;

import com.mera.borisgk98.autoshowroom.server.soap.*;
import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.xml.ws.Endpoint;

@Configuration
@EnableJpaRepositories("com.mera.borisgk98.autoshowroom.server.repositories")
@ComponentScan({ "com.mera.borisgk98.autoshowroom.server" })
public class Config {

    @Bean
    public SpringBus cxf() {
        return new SpringBus();
    }


    @Bean
    public Endpoint autoEndpoint(
            @Autowired SpringBus springBus,
            @Autowired AutoWebService service
    ) {
        EndpointImpl endpoint = new EndpointImpl(springBus, service);
        endpoint.publish("/auto");
        return endpoint;
    }

    @Bean
    public Endpoint autooptionEndpoint(
            @Autowired SpringBus springBus,
            @Autowired AutoOptionWebService service
    ) {
        EndpointImpl endpoint = new EndpointImpl(springBus, service);
        endpoint.publish("/autooption");
        return endpoint;
    }

    @Bean
    public Endpoint orderEndpoint(
            @Autowired SpringBus springBus,
            @Autowired OrderWebService service
    ) {
        EndpointImpl endpoint = new EndpointImpl(springBus, service);
        endpoint.publish("/order");
        return endpoint;
    }

    @Bean
    public Endpoint customerEndpoint(
            @Autowired SpringBus springBus,
            @Autowired CustomerWebService service
    ) {
        EndpointImpl endpoint = new EndpointImpl(springBus, service);
        endpoint.publish("/customer");
        return endpoint;
    }

    @Bean
    public Endpoint automodelEndpoint(
            @Autowired SpringBus springBus,
            @Autowired AutoModelWebService service
    ) {
        EndpointImpl endpoint = new EndpointImpl(springBus, service);
        endpoint.publish("/automodel");
        return endpoint;
    }

    @Bean
    public Endpoint sellerEndpoint(
            @Autowired SpringBus springBus,
            @Autowired SellerWebService service
    ) {
        EndpointImpl endpoint = new EndpointImpl(springBus, service);
        endpoint.publish("/seller");
        return endpoint;
    }

    @Bean
    public Endpoint automarkEndpoint(
            @Autowired SpringBus springBus,
            @Autowired AutoMarkWebService service
    ) {
        EndpointImpl endpoint = new EndpointImpl(springBus, service);
        endpoint.publish("/automark");
        return endpoint;
    }


}
