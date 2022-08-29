package com.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Application {
	
	@GetMapping("/msg")
	public String home() {
		return "Hello World!";
	}
	@GetMapping("/msg1")
	public String message() {
		return "Welcome to Azure Windows Virtual Machine";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
