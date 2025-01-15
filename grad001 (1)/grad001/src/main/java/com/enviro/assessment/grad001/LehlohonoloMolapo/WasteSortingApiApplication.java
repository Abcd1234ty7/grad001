package com.enviro.assessment.grad001.LehlohonoloMolapo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // Marks this class as the entry point for the Spring Boot application and enables component scanning, auto-configuration, and property support
public class WasteSortingApiApplication {

	public static void main(String[] args) {
		// Starts the Spring Boot application by calling the run() method and passing the application class and command-line arguments
		SpringApplication.run(WasteSortingApiApplication.class, args);
	}
}
