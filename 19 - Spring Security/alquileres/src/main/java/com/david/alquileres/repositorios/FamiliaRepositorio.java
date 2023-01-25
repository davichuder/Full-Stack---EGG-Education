package com.david.alquileres.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.david.alquileres.entidades.Familia;

// @Repository
public interface FamiliaRepositorio extends JpaRepository<Familia, String> {
    @Query("SELECT f FROM Familia f WHERE f.email = :email")
    public Familia buscarPorEmail(@Param("email") String email);
}
