package com.mera.borisgk98.autoshowroom.server.config;

import com.mera.borisgk98.autoshowroom.server.soap.AutoModelWebService;
import com.mera.borisgk98.autoshowroom.server.soap.AutoModelWebServiceImpl;
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
    public Endpoint autoModelEndpoint(
            @Autowired SpringBus springBus,
            @Autowired AutoModelWebService service
    ) {
        EndpointImpl endpoint = new EndpointImpl(springBus, service);
        endpoint.publish("/autoModel");
        return endpoint;
    }

//    @Bean
//    public Jaxb2Marshaller marshaller() {
//        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
//        String[] packagesToScan= {"com.mera.borisgk98.autoshowroom.server.models"};
//        marshaller.setPackagesToScan(packagesToScan);
//        return marshaller;
//    }
}
