package com.example.AgentesApi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class AgentesApiApplication {
	private static final Logger log = LoggerFactory.getLogger(AgentesApiApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AgentesApiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder) {
		return restTemplateBuilder
				.defaultHeader("X-RapidAPI-Key","cbfc2adb43msh2a9ff355895315ap1a8a99jsn2b64a6b29783")
				.build();
	}
}
