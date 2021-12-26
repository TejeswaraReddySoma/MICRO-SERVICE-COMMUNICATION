package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StockPriceApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockPriceApiApplication.class, args);
	}

}
