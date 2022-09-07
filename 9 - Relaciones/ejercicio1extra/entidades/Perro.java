// Perro, que tendrá como atributos: nombre, raza, edad y tamaño
package ejercicio1extra.entidades;

import java.util.Objects;

import ejercicio1extra.enums.Raza;

public class Perro {
    // Atributos
    private String nombre;
    private Raza raza;
    private int edad;
    private float tamaño;
    private Persona dueño;

    // Constructor
    public Perro() {
    }

    public Perro(String nombre, Raza raza, int edad, float tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    // Getters and setters

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return this.raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    public Persona getDueño() {
        return this.dueño;
    }

    public void setDueño(Persona dueño) {
        this.dueño = dueño;
    }

    // toString
    @Override
    public String toString() {
        String base = "nombre=" + getNombre() + ", raza=" + getRaza() + ", edad=" + getEdad() + ", tamaño="
                + getTamaño();
        if (Objects.isNull(dueño)) {
            return base + ", dueño=SIN DUEÑO";
        }
        return base + ", dueño=" + dueño.getNombre() + " " + dueño.getApellido() + ", documento="
                + dueño.getDocumento();
    }

}
