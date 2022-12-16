package com.egg.noticias.servicios;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.egg.noticias.entidades.Noticia;
import com.egg.noticias.excepciones.ValidacionExcepcion;
import com.egg.noticias.repositorios.NoticiaRepositorio;

@Service
public class NoticiaServicio {
    @Autowired
    private NoticiaRepositorio noticiaRepositorio;

    @Autowired
    private ValidacionServicio validacion;

    public Noticia getOne(String id) {
        return noticiaRepositorio.getOne(id);
    }

    @Transactional
    public void crearNoticia(String titulo, String cuerpo) throws ValidacionExcepcion {
        validacion.validarNoticia(titulo, cuerpo);
        Noticia noticia = new Noticia();
        noticia.setTitulo(titulo);
        noticia.setCuerpo(cuerpo);
        noticia.setAlta(new Date());
        // noticia.setAlta(Calendar.getInstance());
        // noticia.setAlta(LocalDate.now());
        noticiaRepositorio.save(noticia);
    }

    @Transactional
    public void modificarNoticia(String id, String titulo, String cuerpo) throws ValidacionExcepcion {
        validacion.validarIdNoticia(id);
        validacion.validarNoticia(titulo, cuerpo);
        Optional<Noticia> respuesta = noticiaRepositorio.findById(id);

        if (respuesta.isPresent()) {
            Noticia noticia = respuesta.get();
            noticia.setTitulo(titulo);
            noticia.setCuerpo(cuerpo);
            noticia.setAlta(new Date());
            // noticia.setAlta(Calendar.getInstance());
            // noticia.setAlta(LocalDate.now());
            noticiaRepositorio.save(noticia);
        }
    }

    @Transactional
    public void eliminarNoticia(String id) throws ValidacionExcepcion {
        validacion.validarIdNoticia(id);
        Noticia noticia = noticiaRepositorio.getById(id);
        noticiaRepositorio.delete(noticia);
    }

    public List<Noticia> listarNoticiasFechaDescendente() {
        List<Noticia> noticias = new ArrayList();
        // noticias = noticiaRepositorio.findAll(Sort.by(Sort.Direction.ASC, "alta"));
        noticias = noticiaRepositorio.todosDescendente();
        return noticias;
    }
}
