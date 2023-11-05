package com.redhat.microservicesregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class MicroservicesRegistryApplication {
	public static void main(String[] args) {
		SpringApplication.run(MicroservicesRegistryApplication.class, args);
	}
}
