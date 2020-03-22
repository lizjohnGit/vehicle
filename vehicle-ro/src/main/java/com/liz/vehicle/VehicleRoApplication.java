package com.liz.vehicle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
@SpringBootApplication
public class VehicleRoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleRoApplication.class, args);
	}

}
