package com.egg.noticias.entidades;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Noticia {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String cuerpo;

    @Temporal(TemporalType.TIMESTAMP)
    private Date alta;
    // private Calendar alta;
    // private LocalDate alta;

    public Noticia() {
    }

    public String getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCuerpo() {
        return cuerpo;
    }

    public Date getAlta() {
        return alta;
    }

    // public Calendar getAlta() {
    // return alta;
    // }

    // public LocalDate getAlta() {
    // return alta;
    // }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCuerpo(String cuerpo) {
        this.cuerpo = cuerpo;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    // public void setAlta(Calendar alta) {
    // this.alta = alta;
    // }

    // public void setAlta(LocalDate alta) {
    // this.alta = alta;
    // }
}
