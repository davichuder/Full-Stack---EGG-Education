// Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos 
// clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con 
// atributos: nombre, apellido, edad, documento y Perro. 
// Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que 
// pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde 
// la clase Persona, la información del Perro y de la Persona.

// Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a 
// tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a 
// cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar 
// al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la 
// persona.  
// Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las 
// personas con sus respectivos perros.
// FALTA HACER
package ejercicio1extra;

import java.util.ArrayList;

import ejercicio1.entidades.Perro;
import ejercicio1.entidades.Persona;
import ejercicio1.servicios.Creador;

public class app {
    final static int CANTIDAD_DE_PERSONAS = 1;
    final static int CANTIDAD_DE_PERROS = 1;

    public static void main(String[] args) {
        Creador creador = new Creador();
        ArrayList<Persona> personas = new ArrayList<>();
        ArrayList<Perro> perros = new ArrayList<>();

        for (int i = 0; i < CANTIDAD_DE_PERSONAS; i++) {
            personas.add(creador.crearPersona());
            perros.add(creador.crearPerro());
            personas.get(i).setPerro(perros.get(i));
        }

        for (Persona p : personas) {
            System.out.println(p);
        }
    }
}
