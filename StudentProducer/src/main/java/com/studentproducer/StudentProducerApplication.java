package com.studentproducer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
@EnableDiscoveryClient
@SpringBootApplication
public class StudentProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentProducerApplication.class, args);
		System.out.println("Student producer start!!");
	}

}
