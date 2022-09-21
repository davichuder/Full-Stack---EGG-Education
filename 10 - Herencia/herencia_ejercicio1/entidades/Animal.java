package herencia_ejercicio1.entidades;

// nombre, alimento, edad y raza del Animal
public class Animal {
    protected String nombre;
    protected int edad;

    Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Animal() {
    }

    public void alimentarse() {
    }
}