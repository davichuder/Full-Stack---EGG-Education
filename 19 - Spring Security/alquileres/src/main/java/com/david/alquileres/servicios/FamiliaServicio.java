package com.david.alquileres.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.david.alquileres.entidades.Familia;
import com.david.alquileres.enums.Rol;
import com.david.alquileres.excepciones.MiExcepcion;
import com.david.alquileres.repositorios.FamiliaRepositorio;

import jakarta.transaction.Transactional;

@Service
public class FamiliaServicio {
    @Autowired
    private FamiliaRepositorio familiaRepositorio;

    @Autowired
    private AuxiliarServicio auxiliarServicio;

    @Transactional
    public void crearFamilia(String alias, String email,
            String clave1, String clave2) throws MiExcepcion {

        auxiliarServicio.validarUsuario(alias, email, clave1, clave2);

        Familia familia = new Familia();

        familia.setAlias(alias);
        familia.setEmail(email);
        familia.setClave(new BCryptPasswordEncoder().encode(clave1));
        familia.setRol(Rol.USUARIO);

        familiaRepositorio.save(familia);
    }
}
