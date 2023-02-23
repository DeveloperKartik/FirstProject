package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
@EnableEurekaClient
@SpringBootApplication
public class AdharCardOfficeConsumerCenterApplication {

	public static void main(String[] args) {
		System.out.println("This is Adhar Card Office Consumer Center Application");
		SpringApplication.run(AdharCardOfficeConsumerCenterApplication.class, args);
	}

	@Bean
	@LoadBalanced
	public RestTemplate rTemp()	{
		return new RestTemplate();
	}
	
}
