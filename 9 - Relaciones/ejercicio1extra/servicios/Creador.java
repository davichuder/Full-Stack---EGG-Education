package ejercicio1extra.servicios;

import java.util.Scanner;

import ejercicio1extra.entidades.Perro;
import ejercicio1extra.entidades.Persona;
import ejercicio1extra.enums.Raza;
import ejercicio1extra.enums.Texto;

public class Creador {
    private static Scanner scanner = new Scanner(System.in);

    public static Persona crearPersona() {
        System.out.println(Texto.INGRESENOMBRE);
        String nombre = scanner.nextLine();
        System.out.println(Texto.INGRESEAPELLIDO);
        String apellido = scanner.nextLine();
        System.out.println(Texto.INGRESEEDAD);
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println(Texto.INGRESEDOCUMENTO);
        int documento = Integer.parseInt(scanner.nextLine());
        return new Persona(nombre, apellido, edad, documento);
    }

    public static Perro crearPerro() {
        System.out.println(Texto.INGRESENOMBRE);
        String nombre = scanner.nextLine();
        System.out.println(Texto.INGRESEEDAD);
        int edad = Integer.parseInt(scanner.nextLine());
        System.out.println(Texto.INGRESETAMAÑO);
        float tamaño = Float.parseFloat(scanner.nextLine());
        System.out.println(Texto.INGRESERAZA);
        Raza raza = Seleccion.seleccionarRaza();
        return new Perro(nombre, raza, edad, tamaño);
    }

}
