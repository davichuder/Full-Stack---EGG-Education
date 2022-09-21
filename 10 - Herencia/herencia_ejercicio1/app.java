package herencia_ejercicio1;

import herencia_ejercicio1.entidades.Animal;
import herencia_ejercicio1.entidades.Caballo;
import herencia_ejercicio1.entidades.Gato;
import herencia_ejercicio1.entidades.Perro;

// Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.  
// La clase Animal tendrá como atributos el nombre, alimento, edad y raza del Animal. 
// Crear un método en la clase Animal a través del cual cada clase hija deberá mostrar luego un 
// mensaje por pantalla informando de que se alimenta. Generar una clase Main que realice lo 
// siguiente:

public class app {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Pepe", "Carne", 12, "Chihuahua");
        perro1.alimentarse();

        Animal perro2 = new Perro("Pepe2", "Carne2", 123, "Chihuahua2");
        perro2.alimentarse();

        Animal gato1 = new Gato("Bolas", "Pescado", 1, "Egipcia");
        gato1.alimentarse();

        Animal caballo1 = new Caballo("Jose", "Pasto", 10, "Pura");
        caballo1.alimentarse();

    }
}
