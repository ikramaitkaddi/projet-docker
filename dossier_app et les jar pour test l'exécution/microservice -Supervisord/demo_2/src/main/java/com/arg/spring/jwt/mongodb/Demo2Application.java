package com.arg.spring.jwt.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
@EnableDiscoveryClient
public class Demo2Application {
	
	@GetMapping("/")
	public String allAccess() {
	 return "hello";
	}
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
		
	}

}
