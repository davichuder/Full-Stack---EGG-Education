package com.david.alquileres.servicios;

import org.springframework.stereotype.Service;

import com.david.alquileres.excepciones.MiExcepcion;

@Service
public class AuxiliarServicio {
    public void validarUsuario(String alias, String email, String clave, String clave2) throws MiExcepcion {

        if (alias.isEmpty() || alias == null) {
            throw new MiExcepcion("el alias no puede ser nulo o estar vacío");
        }
        if (email.isEmpty() || email == null) {
            throw new MiExcepcion("el email no puede ser nulo o estar vacio");
        }
        if (clave.isEmpty() || clave == null || clave.length() <= 5) {
            throw new MiExcepcion("La contraseña no puede estar vacía, y debe tener más de 5 dígitos");
        }
        if (!clave.equals(clave2)) {
            throw new MiExcepcion("Las contraseñas ingresadas deben ser iguales");
        }
    }
}
