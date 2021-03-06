package com.cloud.tutorial.eurekaclient4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaClient4Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient4Application.class, args);
	}
}
