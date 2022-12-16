package com.egg.noticias.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.egg.noticias.entidades.Noticia;
import com.egg.noticias.servicios.NoticiaServicio;

@Controller
@RequestMapping("/admin")
public class PanelAdminControlador {
    @Autowired
    NoticiaServicio noticiaServicio;

    @GetMapping("")
    public String index(ModelMap modelo) {
        List<Noticia> noticias = noticiaServicio.listarNoticiasFechaDescendente();
        modelo.addAttribute("noticias", noticias);
        return "panelAdmin.html";
    }
}
