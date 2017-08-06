package com.cloud.tutorial.eurekaclient5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClient5Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient5Application.class, args);
	}
}
