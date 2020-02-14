package com.sucede.sb.app.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpringbootProductsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProductsServiceApplication.class, args);
	}

}
