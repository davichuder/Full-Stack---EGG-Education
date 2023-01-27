package com.david.alquileres.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.david.alquileres.excepciones.MiExcepcion;
import com.david.alquileres.servicios.FamiliaServicio;

@Controller
@RequestMapping("/familias")
public class FamiliaControlador {
    @Autowired
    private FamiliaServicio familiaServicio;

    @GetMapping("")
    public String index() {
        return "indexFamilia.html";
    }

    @GetMapping("/registro")
    public String registro() {
        return "registroFamilia.html";
    }

    @PostMapping("/registrar")
    public String registrar(@RequestParam String alias, @RequestParam String email,
            @RequestParam String clave1, @RequestParam String clave2,
            ModelMap modelo) {
        try {

            familiaServicio.crearFamilia(alias, email, clave1, clave2);

            modelo.put("exito", "La familia fue creada correctamente!");

            return "index.html";
        } catch (MiExcepcion ex) {

            modelo.put("error", ex.getMessage());
            modelo.put("alias", alias);
            modelo.put("email", email);

            return "redirect:/registro";
        }
    }
}
