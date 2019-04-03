package com.som;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimHttpServerApplication {

	public static void main(String[] args) {

		String version="v.0.1  master v0.6 ";
		SpringApplication.run(SimHttpServerApplication.class, args);
	}

}
