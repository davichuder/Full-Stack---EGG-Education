package com.egg.noticias.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.egg.noticias.entidades.Noticia;

@Repository
public interface NoticiaRepositorio extends JpaRepository<Noticia, String> {
    @Query("SELECT n FROM Noticia n ORDER BY n.alta DESC")
    public List<Noticia> todosDescendente();
}
