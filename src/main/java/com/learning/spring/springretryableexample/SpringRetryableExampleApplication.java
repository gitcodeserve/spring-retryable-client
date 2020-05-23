package com.learning.spring.springretryableexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@EnableRetry
@SpringBootApplication
public class SpringRetryableExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRetryableExampleApplication.class, args);
	}

}
