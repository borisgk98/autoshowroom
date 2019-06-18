package com.mera.borisgk98.autoshowroom.server;

import com.mera.borisgk98.autoshowroom.server.config.Config;
import com.mera.borisgk98.autoshowroom.server.config.KafkaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@Import( {
		Config.class,
		KafkaConfig.class
})
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

}
