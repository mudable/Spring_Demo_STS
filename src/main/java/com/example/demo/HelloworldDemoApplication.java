package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldDemoApplication {
	/*
	 * @SpringBootApplication:describs the start of spring project.
	 */
	public static void main(String[] args) {
		System.out.println("Hello from BridgeLabz");
		SpringApplication.run(HelloworldDemoApplication.class, args);
	}
}
