// clase Persona con atributos: nombre, apellido, edad, documento y Perro.
package ejercicio1extra.entidades;

import java.util.ArrayList;

public class Persona {
    // Atributos
    public String nombre;
    public String apellido;
    private int edad;
    private int documento;
    private ArrayList<Perro> perros;

    // Constructor
    public Persona() {

    }

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perros = new ArrayList<Perro>();
    }

    // Getters and setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return this.documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public ArrayList<Perro> getPerros() {
        return this.perros;
    }

    public void setPerros(ArrayList<Perro> perros) {
        this.perros = perros;
    }

    // toString
    @Override
    public String toString() {
        return "nombre=" + getNombre() + ", apellido=" + getApellido() + ", edad='" + getEdad() + ", documento='"
                + getDocumento() +
                ",\n\tperros='" + getPerros();
    }

}