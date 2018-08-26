package com.karol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@EnableEurekaServer
public class ConhubEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConhubEurekaServerApplication.class, args);
	}
}
