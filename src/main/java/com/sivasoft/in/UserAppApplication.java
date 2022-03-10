package com.sivasoft.in;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


@EnableDiscoveryClient
@SpringBootApplication
@RibbonClient(name="chatbook1", configuration = RibbonConfiguration.class)
public class UserAppApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(UserAppApplication.class, args);
	}	
}
