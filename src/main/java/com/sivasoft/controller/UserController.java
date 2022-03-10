package com.sivasoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
//@RequestMapping("/rest")
public class UserController {

	@Autowired
	private RestTemplate template;
	
	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@GetMapping("/invoke")
	public String invokeChatBook() {
	String url="http://chatbook1/chatbook-application/chat";
	return template.getForObject(url, String.class);	
	}	
}
