package com.address;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class InventorySalesAddressApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventorySalesAddressApplication.class, args);
	}

}
