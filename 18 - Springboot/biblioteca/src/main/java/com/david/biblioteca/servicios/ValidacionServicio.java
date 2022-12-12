package com.david.biblioteca.servicios;

import org.springframework.stereotype.Service;

import com.david.biblioteca.excepciones.ValidacionExcepcion;

@Service
public class ValidacionServicio {
    public void validarNombre(String nombre) throws ValidacionExcepcion {
        if (nombre.isEmpty() || nombre == null) {
            throw new ValidacionExcepcion("Nombre no puede ser vacio ni nulo");
        }
    }

    public void validarIdAutor(String idAutor) throws ValidacionExcepcion {
        if (idAutor.isEmpty() || idAutor == null) {
            throw new ValidacionExcepcion("ID Autor no puede ser vacio ni nulo");
        }
    }

    public void validarIdEditorial(String idEditorial) throws ValidacionExcepcion {
        if (idEditorial.isEmpty() || idEditorial == null) {
            throw new ValidacionExcepcion("ID Editorial no puede ser vacio ni nulo");
        }
    }

    public void validarIsbn(Long isbn) throws ValidacionExcepcion {
        if (isbn == null) {
            throw new ValidacionExcepcion("ISBN no puede ser  nulo");
        }
    }

    public void validarEjemplares(Integer ejemplares) throws ValidacionExcepcion {
        if (ejemplares == null) {
            throw new ValidacionExcepcion("Ejemplares no puede ser nulo");
        }
    }

    public void validarTitulo(String titulo) throws ValidacionExcepcion {
        if (titulo.isEmpty() || titulo == null) {
            throw new ValidacionExcepcion("Titu no puede ser vacio ni nulo");
        }
    }

    public void validarTodoAutor(String id, String nombre) throws ValidacionExcepcion {
        validarIdAutor(id);
        validarNombre(nombre);
    }

    public void validarTodoEditorial(String id, String nombre) throws ValidacionExcepcion {
        validarIdEditorial(id);
        validarNombre(nombre);
    }

    public void validarTodoLibro(Long isbn, String titulo, Integer ejemplares, String idAutor, String idEditorial)
            throws ValidacionExcepcion {
        validarIsbn(isbn);
        validarTitulo(titulo);
        validarEjemplares(ejemplares);
        validarIdAutor(idAutor);
        validarIdEditorial(idEditorial);
    }
}
