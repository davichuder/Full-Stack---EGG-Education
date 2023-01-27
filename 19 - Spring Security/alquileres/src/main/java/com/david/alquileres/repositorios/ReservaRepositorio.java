package com.david.alquileres.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.david.alquileres.entidades.Reserva;

@Repository
public interface ReservaRepositorio extends JpaRepository<Reserva, String> {
}