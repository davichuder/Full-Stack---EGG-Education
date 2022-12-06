package com.david.biblioteca.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.david.biblioteca.entidades.Editorial;
import com.david.biblioteca.excepciones.ValidacionExcepcion;
import com.david.biblioteca.repositorios.EditorialRepositorio;

@Service
public class EditorialServicio {
    @Autowired
    private EditorialRepositorio editorialRepositorio;

    @Autowired
    ValidacionServicio validacion;

    @Transactional
    public void crearEditorial(String nombre) throws ValidacionExcepcion {
        validacion.validarNombre(nombre);
        Editorial editorial = new Editorial();
        editorial.setNombre(nombre);
        editorialRepositorio.save(editorial);
    }

    public List<Editorial> listarEditoriales() {
        List<Editorial> editoriales = new ArrayList();
        editoriales = editorialRepositorio.findAll();
        return editoriales;
    }

    @Transactional
    public void modificarEditorial(String id, String nombre) throws ValidacionExcepcion {
        validacion.validarTodoEditorial(id, nombre);
        Optional<Editorial> respuesta = editorialRepositorio.findById(id);
        if (respuesta.isPresent()) {
            Editorial editorial = respuesta.get();
            editorial.setNombre(nombre);
            editorialRepositorio.save(editorial);
        }
    }
}
