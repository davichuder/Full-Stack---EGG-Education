package POO_7.ejercicio7.servicios;

import java.util.Scanner;

import POO_7.ejercicio7.entidades.Persona;

public class PersonaServicio {
    //Creo Scanner
    private Scanner scanner = new Scanner(System.in);
    //Funcion para crear persona
    public Persona crearPersona() {
        System.out.println("Ingrese nombre");
        String nombre = scanner.next();
        System.out.println("Ingrese edad");
        int edad = scanner.nextInt();
        
        char sexo;
        do {
        System.out.println("Ingrese sexo (H/M/O)");
        sexo = scanner.next().charAt(0);
        if (sexo != 'H' && sexo != 'M' && sexo != 'O'){
            System.out.println("Error, ingrese H/M/O");
        }
        } while (sexo != 'H' && sexo != 'M' && sexo != 'O');

        System.out.println("Ingrese peso");
        float peso = scanner.nextFloat();
        System.out.println("Ingrese altura");
        float altura = scanner.nextFloat();

        return new Persona(nombre, edad, sexo, peso, altura);
    }
    
}
