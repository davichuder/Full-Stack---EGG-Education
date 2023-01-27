package com.david.alquileres.configuraciones;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
// @EntityScan(basePackages = "com.david.alquileres.entidades")
// @ComponentScan(basePackages = { "com.david.alquileres.servicios",
// "com.david.alquileres.repositorios" })
@EnableJpaRepositories(basePackages = { "com.david.alquileres.servicios", "com.david.alquileres.repositorios" })
public class Configuracion {

}
