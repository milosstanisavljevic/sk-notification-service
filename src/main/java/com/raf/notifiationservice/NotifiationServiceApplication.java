package com.raf.notifiationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class NotifiationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(NotifiationServiceApplication.class, args);
	}

}
