//package com.mera.borisgk98.autoshowroom.server.config;
//
//import com.sun.net.httpserver.HttpServer;
////import io.micrometer.prometheus.PrometheusMeterRegistry;
//import io.micrometer.core.instrument.MeterRegistry;
//import io.micrometer.prometheus.PrometheusMeterRegistry;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.io.IOException;
//import java.io.OutputStream;
//import java.net.InetSocketAddress;
//
//@Configuration
//public class PrometheusConfig {
//
////    @Bean
////    public MeterRegistry prometheusMeterRegistryBean() {
////        PrometheusMeterRegistry prometheusRegistry = new PrometheusMeterRegistry(io.micrometer.prometheus.PrometheusConfig.DEFAULT);
////
////        try {
////            HttpServer server = HttpServer.create(new InetSocketAddress(8090), 0);
////            server.createContext("/prometheus", httpExchange -> {
////                String response = prometheusRegistry.scrape();
////                httpExchange.sendResponseHeaders(200, response.getBytes().length);
////                try (OutputStream os = httpExchange.getResponseBody()) {
////                    os.write(response.getBytes());
////                }
////            });
////
////            new Thread(server::start).start();
////        } catch (IOException e) {
////            throw new RuntimeException(e);
////        }
////        return prometheusRegistry;
////    }
//
//}
