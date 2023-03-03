package com.boppo.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.boppo.task.entities"})
public class BoppoTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(BoppoTaskApplication.class, args);
		System.out.println("Started Boppo Task....");
	}

}
