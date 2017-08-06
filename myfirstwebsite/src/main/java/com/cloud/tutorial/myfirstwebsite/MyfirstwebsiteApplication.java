package com.cloud.tutorial.myfirstwebsite;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MyfirstwebsiteApplication {

	@Value("${greeting}")
	String greeting;
	public static void main(String[] args) {
		SpringApplication.run(MyfirstwebsiteApplication.class, args);
	}
	
	
	@GetMapping("/greeting")
	public String greeting(){
		
		return "{greeting:"+ greeting+"}";
		
	}
}
