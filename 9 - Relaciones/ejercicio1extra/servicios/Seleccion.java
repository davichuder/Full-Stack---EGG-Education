package ejercicio1extra.servicios;

import java.util.ArrayList;
import java.util.Scanner;

import ejercicio1extra.entidades.Perro;
import ejercicio1extra.entidades.Persona;
import ejercicio1extra.enums.Raza;
import ejercicio1extra.enums.Texto;

public class Seleccion {
    public static Scanner scanner = new Scanner(System.in);

    public static int seleccionarPerro(ArrayList<Perro> perros) {
        int contador = 0;
        for (Perro perro : perros) {
            System.out.println(contador + " " + perro);
            contador++;
        }
        int opcion;
        while (true) {
            opcion = Integer.parseInt(scanner.nextLine());
            if (opcion < contador)
                break;
            else
                System.out.println(Texto.NOVALIDO);
        }
        return opcion;
    }

    public static int seleccionarPersona(ArrayList<Persona> personas) {
        int contador = 0;
        for (Persona persona : personas) {
            System.out.println(contador + " " + persona);
            contador++;
        }
        int opcion;
        while (true) {
            opcion = Integer.parseInt(scanner.nextLine());
            if (opcion < contador)
                break;
            else
                System.out.println(Texto.NOVALIDO);
        }
        return opcion;
    }

    public static Raza seleccionarRaza() {
        int contador = 0;
        for (Raza raza : Raza.values()) {
            System.out.println(contador + " " + raza);
            contador++;
        }
        int opcion;
        while (true) {
            opcion = Integer.parseInt(scanner.nextLine());
            if (opcion < contador)
                break;
            else
                System.out.println(Texto.NOVALIDO);
        }
        return Raza.values()[opcion];
    }
}
