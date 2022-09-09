package ejercicio1extra.servicios;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import ejercicio1extra.entidades.Perro;
import ejercicio1extra.entidades.Persona;
import ejercicio1extra.enums.Raza;
import ejercicio1extra.enums.Texto;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void menu(ArrayList<Persona> personas, ArrayList<Perro> perros) {
        int opcion;

        menu_loop: while (true) {
            System.out.println(Texto.MENU);
            opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 0:
                    break menu_loop;
                case 1:
                    mostrarPersonas(personas);
                    break;
                case 2:
                    mostrarPerros(perros);
                    break;
                case 3:
                    agregarPersona(personas);
                    break;
                case 4:
                    agregarPerro(perros);
                    break;
                case 5:
                    eliminarPersona(personas);
                    break;
                case 6:
                    eliminarPerro(perros);
                    break;
                case 7:
                    adoptarPerro(personas, perros);
                    break;
                case 8:
                    devolverPerro(personas, perros);
                    break;
                default:
                    System.out.println(Texto.NOVALIDO);
                    break;
            }
        }
    }

    private static void devolverPerro(ArrayList<Persona> personas, ArrayList<Perro> perros) {
        System.out.println(Texto.ELIJAPERRO);
        int posicion = Seleccion.seleccionarPerro(perros);
        Perro perro = perros.get(posicion);
        if (Objects.isNull(perro.getDueño())) {
            System.out.println(Texto.NOADOPTADO);
            return;
        }
        perro.getDueño().getPerros().remove(perro);
        perro.setDueño(null);
    }

    private static void adoptarPerro(ArrayList<Persona> personas, ArrayList<Perro> perros) {
        System.out.println(Texto.ELIJAPERRO);
        Perro perro = perros.get(Seleccion.seleccionarPerro(perros));
        if (!Objects.isNull(perro.getDueño())) {
            System.out.println(Texto.PERROYAADOPTADO);
            return;
        }
        System.out.println(Texto.ELIJAPERSONA);
        Persona persona = personas.get(Seleccion.seleccionarPersona(personas));
        persona.getPerros().add(perro);
        perro.setDueño(persona);
    }

    private static void eliminarPerro(ArrayList<Perro> perros) {
        System.out.println(Texto.ELIJAPERRO);
        int posicion = Seleccion.seleccionarPerro(perros);
        Perro perro = perros.get(posicion);
        perro.getDueño().getPerros().remove(perro);
        perros.remove(posicion);
    }

    private static void eliminarPersona(ArrayList<Persona> personas) {
        System.out.println(Texto.ELIJAPERSONA);
        Persona persona = personas.get(Seleccion.seleccionarPersona(personas));
        for (Perro perro : persona.getPerros()) {
            perro.setDueño(null);
        }
        personas.remove(persona);
    }

    private static void agregarPerro(ArrayList<Perro> perros) {
        perros.add(Creador.crearPerro());
    }

    private static void agregarPersona(ArrayList<Persona> personas) {
        personas.add(Creador.crearPersona());
    }

    private static void mostrarPerros(ArrayList<Perro> perros) {
        for (Perro perro : perros) {
            System.out.println(perro);
        }
    }

    private static void mostrarPersonas(ArrayList<Persona> personas) {
        for (Persona persona : personas) {
            System.out.println(persona);
        }
    }
}
