package com.sai.microservices.currencyconvertionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
public class CurrencyConvertionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConvertionServiceApplication.class, args);
	}

}
