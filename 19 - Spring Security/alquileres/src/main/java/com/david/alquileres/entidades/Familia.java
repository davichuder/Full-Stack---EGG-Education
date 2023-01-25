package com.david.alquileres.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Familia extends Usuario {
    String nombre;
    Integer edadMinima;
    Integer edadMaxima;
    Integer numHijos;

    @OneToOne
    Casa casa;
}
