package mera.com.borisgk98.autoshowroom.servergroovy

import com.fasterxml.jackson.databind.ObjectMapper
import io.grpc.ManagedChannelBuilder
import org.springframework.beans.factory.annotation.Value
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

	@Value('${java-server.host}')
	String host
	@Value('${java-server.port}')
	Integer port

	@Bean('client')
	com.mera.borisgk98.autoshowroom.grpc.OrderServiceGrpc.OrderServiceBlockingStub client() {
		return com.mera.borisgk98.autoshowroom.grpc.OrderServiceGrpc.newBlockingStub(ManagedChannelBuilder
				.forAddress(host, port).usePlaintext().build())
	}
}
