package ejercicio12.servicios;

import java.util.Date;
import java.util.Scanner;

import ejercicio12.entidades.Persona;

public class PersonaServicio {
    public Persona crearPersona() {
        // Creo variables
        String nombre;
        Date fechaNacimiento;
        int dia, mes, anio;
        Scanner scanner = new Scanner(System.in);
        // Pido datos
        System.out.println("Introduce el nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Introduce la fecha de nacimiento: ");
        System.out.println("Introduce el dia: ");
        dia = scanner.nextInt();
        System.out.println("Introduce el mes: ");
        mes = scanner.nextInt();
        System.out.println("Introduce el anio: ");
        anio = scanner.nextInt();
        // Creo fecha
        fechaNacimiento = new Date(anio - 1900, mes - 1, dia);
        // Creo persona
        Persona persona = new Persona(nombre, fechaNacimiento);
        scanner.close();
        return persona;
    }
}
