package com.assessment.directtv;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DirecttvApplication {

	@Value("${basic.auth.username}")
	private String username;

	@Value("${basic.auth.password}")
	private String password;

	public static void main(String[] args) {
		SpringApplication.run(DirecttvApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.basicAuthentication(username, password).build();
	}


}
