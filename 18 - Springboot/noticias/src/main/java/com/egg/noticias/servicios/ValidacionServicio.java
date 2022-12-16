package com.egg.noticias.servicios;

import org.springframework.stereotype.Service;

import com.egg.noticias.excepciones.ValidacionExcepcion;

@Service
public class ValidacionServicio {
    public void validarIdNoticia(String idNoticia) throws ValidacionExcepcion {
        if (idNoticia.isEmpty() || idNoticia == null) {
            throw new ValidacionExcepcion("ID Noticia no puede ser vacio ni nulo");
        }
    }

    public void validarTitulo(String titulo) throws ValidacionExcepcion {
        if (titulo.isEmpty() || titulo == null) {
            throw new ValidacionExcepcion("Titulo no puede ser vacio ni nulo");
        }
    }

    public void validarCuerpo(String cuerpo) throws ValidacionExcepcion {
        if (cuerpo.isEmpty() || cuerpo == null) {
            throw new ValidacionExcepcion("Cuerpo no puede ser vacio ni nulo");
        }
    }

    public void validarNoticia(String titulo, String cuerpo) throws ValidacionExcepcion {
        validarTitulo(titulo);
        validarCuerpo(cuerpo);
    }
}
