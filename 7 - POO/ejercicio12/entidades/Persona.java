package ejercicio12.entidades;

import java.util.Date;

public class Persona {
    // Parametros
    private String nombre;
    private Date fechaNacimiento;

    // Getters and Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    // Constructor por defecto
    public Persona() {
    }

    // Constructor parametrizado
    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Metodo calcularEdad
    public int calcularEdad() {
        Date fecha_actual = new Date();
        int diferencia = (int) ((fecha_actual.getTime() - fechaNacimiento.getTime()) / 1000 / 60 / 60 / 24 / 365);
        return diferencia;
    }

    // Metodo menorQue
    public boolean menorQue(int edad) {
        if (edad > this.calcularEdad()) {
            return true;
        } else {
            return false;
        }
    }

    // Metodo mostrarPersona
    public void mostrarPersona() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Fecha de nacimiento: " + this.fechaNacimiento);
    }
}
