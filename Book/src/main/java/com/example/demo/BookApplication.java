package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EnableAutoConfiguration
@EntityScan(basePackages={"com.example.demo.entity"})
@SpringBootApplication
public class BookApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

}
