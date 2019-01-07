package com.example.forumsapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class ForumsApiApplication {
	public static void main(String[] args) {
		SpringApplication.run(ForumsApiApplication.class, args);
	}
}