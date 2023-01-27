package com.david.alquileres.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.david.alquileres.entidades.Comentario;

@Repository
public interface ComentarioRepositorio extends JpaRepository<Comentario, String> {
}
