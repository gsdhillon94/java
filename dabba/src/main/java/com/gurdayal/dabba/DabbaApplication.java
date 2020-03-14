package com.gurdayal.dabba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.gurdayal.controller"})
public class DabbaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DabbaApplication.class, args);
	}

}
