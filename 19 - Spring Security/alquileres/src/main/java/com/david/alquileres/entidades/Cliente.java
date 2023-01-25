package com.david.alquileres.entidades;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Cliente extends Usuario {
    String nombre;
    String calle;
    Integer numero;
    String codPostal;
    String ciudad;
    String pais;
}
