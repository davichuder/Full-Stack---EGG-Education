package excepciones_ejercicio1.servicios;

import java.util.Scanner;

import excepciones_ejercicio1.entidades.Persona;

public class PersonaServicio {
    // Creo Scanner
    private Scanner scanner = new Scanner(System.in);

    // Funcion para crear persona
    public Persona crearPersona() {
        System.out.println("Ingrese nombre");
        String nombre = scanner.nextLine();
        int edad;
        try {
            System.out.println("Ingrese edad");
            edad = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            System.out.println("No se ingreso un numero, se seteara la edad en 0");
            edad = 0;
        }

        char sexo;
        do {
            System.out.println("Ingrese sexo (H/M/O)");
            sexo = scanner.next().charAt(0);
            if (sexo != 'H' && sexo != 'M' && sexo != 'O') {
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
