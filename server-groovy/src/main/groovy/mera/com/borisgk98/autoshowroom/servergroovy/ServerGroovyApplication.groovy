package mera.com.borisgk98.autoshowroom.servergroovy

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@SpringBootApplication
@Configuration
class ServerGroovyApplication {

	static void main(String[] args) {
		SpringApplication.run(ServerGroovyApplication, args)
	}

}
