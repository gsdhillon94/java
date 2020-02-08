package com.example.springbootfirstwebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.ayebye.contollers"})
public class SpringbootFirstWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFirstWebappApplication.class, args);
	}

}
