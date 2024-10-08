package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}

//TODO : THIS IS NOT CORRECT USE BUILDER
//	@Bean
//	WebClient myClient() {
//		return WebClient.create(); //spring automatically activates traceability
//	}
	@Bean
	WebClient webClient(WebClient.Builder webClientBuilder) {
		return webClientBuilder.build(); //CORRECT
	}
}
