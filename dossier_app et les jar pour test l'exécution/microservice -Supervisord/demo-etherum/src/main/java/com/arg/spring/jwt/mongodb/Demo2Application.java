package com.arg.spring.jwt.mongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arg.spring.jwt.mongodb.controllers.EtherumController;


@SpringBootApplication
@EnableDiscoveryClient
public class Demo2Application {
	
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Demo2Application.class, args);
		//System.out.println("constract addrrujjhh" + EtherumController.deployContract(EtherumController.web3j, EtherumController.credentials));
				System.out.println("constract addrr" + EtherumController.CONTRACT_ADDRESS);
				try {
					EtherumController.addressContract =EtherumController.loadContract(EtherumController.CONTRACT_ADDRESS, 	EtherumController.web3j, EtherumController.credentials);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("constract addrr" + EtherumController.addressContract);
	}

}
