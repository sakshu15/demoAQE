package com.example.AmdocsDemo1;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class AmdocsDemo1Application {

	@GetMapping("/message")
	public String getMessage() {
		return "welcome to jenkins CICD";
		
	}
	@GetMapping("/message1")
	public String getMessage1() {
		return "welcome to jenkins CICD new";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(AmdocsDemo1Application.class, args);
	}

}
