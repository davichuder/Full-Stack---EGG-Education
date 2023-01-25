package com.david.alquileres.entidades;

import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Casa {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    String calle;
    Integer numero;
    String codPostal;
    String ciudad;
    String pais;
    Date fechaDesde;
    Date fechaHasta;
    Integer minDias;
    Integer maxDias;
    Double precio;
    String tipoVivienda;
}
