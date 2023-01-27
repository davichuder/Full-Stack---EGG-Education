package com.david.alquileres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class AlquileresApplication {
	public static void main(String[] args) {
		SpringApplication.run(AlquileresApplication.class, args);
	}
}
