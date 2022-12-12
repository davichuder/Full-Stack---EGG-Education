package com.david.biblioteca.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.david.biblioteca.entidades.Autor;
import com.david.biblioteca.excepciones.ValidacionExcepcion;
import com.david.biblioteca.repositorios.AutorRepositorio;

@Service
public class AutorServicio {
    @Autowired
    private AutorRepositorio autorRepositorio;

    @Autowired
    private ValidacionServicio validacion;

    @Transactional
    public void crearAutor(String nombre) throws ValidacionExcepcion {
        validacion.validarNombre(nombre);
        Autor autor = new Autor();
        autor.setNombre(nombre);
        autorRepositorio.save(autor);
    }

    public List<Autor> listarAutores() {
        List<Autor> autores = new ArrayList();
        autores = autorRepositorio.findAll();
        return autores;
    }

    @Transactional
    public void modificarAutor(String id, String nombre) throws ValidacionExcepcion {
        validacion.validarTodoAutor(id, nombre);
        Optional<Autor> respuesta = autorRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Autor autor = respuesta.get();
            autor.setNombre(nombre);
            autorRepositorio.save(autor);
        }
    }

    public Autor getOne(String id) {
        return autorRepositorio.getOne(id);
    }
}
