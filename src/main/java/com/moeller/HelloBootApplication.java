package com.moeller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Class: HelloBootApplication
@EnableAutoConfiguration
@RestController
@ComponentScan
public class HelloBootApplication {

	@RequestMapping("/hello")
	String home() {
		return "Hello World";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloBootApplication.class, args);
	}
}
