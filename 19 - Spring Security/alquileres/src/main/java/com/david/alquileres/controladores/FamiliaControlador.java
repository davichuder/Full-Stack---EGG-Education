package com.david.alquileres.controladores;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.david.alquileres.entidades.Usuario;
import com.david.alquileres.excepciones.MiExcepcion;
import com.david.alquileres.servicios.FamiliaServicio;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/familias")
public class FamiliaControlador {
    @Autowired
    private FamiliaServicio familiaServicio;

    @PreAuthorize("hasAnyRole('ROLE_USUARIO', 'ROLE_ADMIN')")
    @GetMapping("")
    public String index(HttpSession session, ModelMap modelo) {

        Usuario logueado = (Usuario) session.getAttribute("usuariosession");
        modelo.put("usuario", logueado);

        if (logueado != null && logueado.getRol().toString().equals("ADMIN")) {
            return "redirect:/admin/dashboard";
        }

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

            return "redirect:/familias";
        } catch (MiExcepcion ex) {

            modelo.put("error", ex.getMessage());
            modelo.put("alias", alias);
            modelo.put("email", email);

            return "redirect:/registro";
        }
    }

    @GetMapping("/ingreso")
    public String ingreso(@RequestParam(required = false) String error, ModelMap modelo) {

        if (error != null) {
            modelo.put("error", "Usuario o Contraseña invalidos!");
        }

        return "ingresoFamilia.html";
    }

    @GetMapping("/formulario_casa")
    public String formularioCasa(HttpSession session, ModelMap modelo) {
        Usuario logueado = (Usuario) session.getAttribute("usuariosession");
        modelo.put("usuario", logueado);
        return "formularioCasa.html";
    }

    // @PostMapping("/agregar_casa/{id}")
    // public String agregarCasa(
    // MultipartFile imagen, @RequestParam String calle, @RequestParam Double
    // numero, @RequestParam String codPostal,
    // @RequestParam String ciudad, @RequestParam String pais, @RequestParam Date
    // fechaDesde, @RequestParam Date fechaHasta,
    // @RequestParam Double minDias, @RequestParam Double maxDias, @RequestParam
    // Double precio, @RequestParam String tipoVivienda,
    // ModelMap modelo,
    // @PathVariable String id) {
    // try {
    // return "redirect:/familias";
    // } catch (Exception e) {
    // return "redirect:/formulario_casa";
    // }
    // }
    @PostMapping("/familias/agregar_casa/{idUsuario}")
    public String agregarCasa(@PathVariable Long idUsuario,
            @RequestParam("imagen") MultipartFile imagen,
            @RequestParam("calle") String calle,
            // @RequestParam("numero") Integer numero,
            @RequestParam("codPostal") String codPostal,
            @RequestParam("ciudad") String ciudad,
            @RequestParam("pais") String pais,
            @RequestParam("fechaDesde") Date fechaDesde,
            @RequestParam("fechaHasta") Date fechaHasta,
            // @RequestParam("minDias") Integer minDias,
            // @RequestParam("maxDias") Integer maxDias,
            // @RequestParam("precio") Double precio,
            @RequestParam("tipoVivienda") String tipoVivienda) {

        // aquí puedes procesar los datos enviados en el formulario y guardarlos en la
        // base de datos

        // ...

        // finalmente, redirige a la página que desees después de procesar el formulario
        return "redirect:/familias";
    }

}
