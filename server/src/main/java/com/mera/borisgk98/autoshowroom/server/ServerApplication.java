package com.mera.borisgk98.autoshowroom.server;

import com.mera.borisgk98.autoshowroom.server.config.Config;
import io.micrometer.core.instrument.Metrics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.Random;

@SpringBootApplication
@Import( {
		Config.class
//		PrometheusConfig.class
})
@EnableKafka
@EnableScheduling
public class ServerApplication {

	@Autowired
	@Qualifier("mt")
	private Thread mt;

	public static void main(String[] args) {
		new SpringApplicationBuilder(ServerApplication.class).profiles("prometheus").run(args);
	}

	@Bean(name = "mt")
	public Thread metricThread() {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					Metrics.counter("x").increment();
					System.out.println("Increment x");
					Random random = new Random();
					Integer r = random.nextInt() % 5;
					if (r == 0) {
						Metrics.counter("y").increment();
						System.out.println("Increment y");
					}
					try {
						Thread.sleep(30_000);
					}
					catch (Exception e){}
				}
			}
		});
		thread.start();
		return thread;
	}
}
