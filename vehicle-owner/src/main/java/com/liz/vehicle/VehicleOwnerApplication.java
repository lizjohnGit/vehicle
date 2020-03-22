package com.liz.vehicle;

import com.liz.vehicle.remote.RoRemote;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
@EnableHystrix
@EnableCircuitBreaker
@EnableFeignClients

@SpringBootApplication
public class VehicleOwnerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehicleOwnerApplication.class, args);
	}
}
