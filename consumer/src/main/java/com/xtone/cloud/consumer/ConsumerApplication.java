package com.xtone.cloud.consumer;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ConsumerApplication.class, args);
		new SpringApplicationBuilder(ConsumerApplication.class).web(true).run(args);
	}
}
