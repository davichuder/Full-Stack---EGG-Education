package video_sueldo.entidades;

import java.util.Date;

public class Vendedor {
    // Defino parametros de la clase
    // nombre, dni, sueldoBasico, comisiones, sueldoMensual, fechaIngreso
    private String nombre;
    private String dni;
    private Double sueldoBasico;
    private Double comisiones;
    private Double sueldoMensual;
    private Date fechaIngreso;

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Double getSueldoBasico() {
        return this.sueldoBasico;
    }

    public void setSueldoBasico(Double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public Double getComisiones() {
        return this.comisiones;
    }

    public void setComisiones(Double comisiones) {
        this.comisiones = comisiones;
    }

    public Double getSueldoMensual() {
        return this.sueldoMensual;
    }

    public void setSueldoMensual(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public Date getFechaIngreso() {
        return this.fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    // Constructor de la clase por defecto
    public Vendedor() {
    }

    // Constructor de la clase con parametros
    public Vendedor(String nombre, String dni, Double sueldoBasico, Double comisiones, Double sueldoMensual,
            Date fechaIngreso) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.comisiones = comisiones;
        this.sueldoMensual = sueldoMensual;
        this.fechaIngreso = fechaIngreso;
    }

    // Constructor de la clase con nombre, dni, sueldoBasico, fechaIngreso
    public Vendedor(String nombre, String dni, Double sueldoBasico, Date fechaIngreso) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldoBasico = sueldoBasico;
        this.fechaIngreso = fechaIngreso;
    }

    // toString de la clase
    @Override
    public String toString() {
        return "Nombre: " + this.nombre + "\nDNI: " + this.dni + "\nSueldo Basico: " + this.sueldoBasico
                + "\nComisiones: " + this.comisiones + "\nSueldo Mensual: " + this.sueldoMensual + "\nFecha Ingreso: "
                + this.fechaIngreso;
    }

}
