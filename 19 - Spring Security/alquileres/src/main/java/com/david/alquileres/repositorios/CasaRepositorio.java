package com.david.alquileres.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.david.alquileres.entidades.Casa;

@Repository
public interface CasaRepositorio extends JpaRepository<Casa, String> {
}
