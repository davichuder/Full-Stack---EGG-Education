package herencia_ejercicio4extra.entidades;

import java.util.ArrayList;
import java.util.Scanner;

import herencia_ejercicio4extra.enums.Departamento;
import herencia_ejercicio4extra.enums.EstadoCivil;
import herencia_ejercicio4extra.enums.MenuPrincipal;
import herencia_ejercicio4extra.enums.Seccion;
import herencia_ejercicio4extra.servicios.Utilidades;

public class Menu {
    private static ArrayList<Persona> personas;
    final static Scanner scanner = new Scanner(System.in);

    public static void ejecutar(ArrayList<Persona> personas_aux) {
        personas = personas_aux;
        int opcion;
        do {
            opcion = MenuPrincipal.elegirOpcion();
            switch (opcion) {
                case 0:
                    return;
                case 1:
                    System.out.println("Agregar funcion si tengo tiempo como extra");
                    Utilidades.presionarEnter();
                    break;
                case 2:
                    System.out.println("Agregar funcion si tengo tiempo como extra");
                    Utilidades.presionarEnter();
                    break;
                case 3:
                    mostrarPersonas();
                    break;
                case 4:
                    cambiarEstadoCivil();
                    break;
                case 5:
                    reasignarDespacho();
                    break;
                case 6:
                    matricularEstudiante();
                    break;
                case 7:
                    cambioDepartamentoProfesor();
                    break;
                case 8:
                    trasladoSeccionPersonal();
                    break;
                default:
                    Utilidades.ingreseOpcionValida();
                    break;
            }
        } while (opcion != 0);
    }

    private static void mostrarPersonas() {
        personas.stream().forEach(x -> System.out.println(x));
        Utilidades.presionarEnter();
    }

    public static void cambiarEstadoCivil() {
        System.out.println("Ingrese documento de la persona a modificar");
        int documento = Integer.parseInt(scanner.nextLine());

        try {
            Persona persona = (Persona) personas.stream()
                    .filter(x -> x.getDocumento() == documento)
                    .toArray()[0];
            persona.setEstado_civil(EstadoCivil.elegirEstadoCivil());
        } catch (Exception e) {
            System.out.println("El documento no existe");
            Utilidades.presionarEnter();
        }
    }

    public static void reasignarDespacho() {
        System.out.println("Ingrese documento de la persona a modificar");
        int documento = Integer.parseInt(scanner.nextLine());

        try {
            Empleado empleado = (Empleado) personas.stream()
                    .filter(x -> x.getDocumento() == documento
                            && (x instanceof Profesor || x instanceof PersonalDeServicio))
                    .toArray()[0];
            System.out.println("Ingrese numero de despacho");
            int despacho = Integer.parseInt(scanner.nextLine());
            empleado.setN_despacho(despacho);
        } catch (Exception e) {
            System.out.println("No existe empleado con ese documento");
            Utilidades.presionarEnter();
        }
    }

    public static void matricularEstudiante() {
        System.out.println("Ingrese documento de la persona a modificar");
        int documento = Integer.parseInt(scanner.nextLine());

        try {
            Estudiante estudiante = (Estudiante) personas.stream()
                    .filter(x -> x.getDocumento() == documento && x instanceof Estudiante)
                    .toArray()[0];
            System.out.println("Ingrese nombre del curso");
            String curso = scanner.nextLine();
            estudiante.setCurso(curso);
        } catch (Exception e) {
            System.out.println("No existe alumno con ese documento");
            Utilidades.presionarEnter();
        }
    }

    public static void cambioDepartamentoProfesor() {
        System.out.println("Ingrese documento de la persona a modificar");
        int documento = Integer.parseInt(scanner.nextLine());

        try {
            Profesor profesor = (Profesor) personas.stream()
                    .filter(x -> x.getDocumento() == documento && x instanceof Profesor)
                    .toArray()[0];
            profesor.setDepartamento(Departamento.elegirDepartamento());
        } catch (Exception e) {
            System.out.println("No existe profesor con ese documento");
            Utilidades.presionarEnter();
        }
    }

    public static void trasladoSeccionPersonal() {
        System.out.println("Ingrese documento de la persona a modificar");
        int documento = Integer.parseInt(scanner.nextLine());

        try {
            PersonalDeServicio personal = (PersonalDeServicio) personas.stream()
                    .filter(x -> x.getDocumento() == documento && x instanceof PersonalDeServicio)
                    .toArray()[0];
            personal.setSeccion(Seccion.elegirSeccion());
        } catch (Exception e) {
            System.out.println("No existe personal de servicio con ese documento");
            Utilidades.presionarEnter();
        }
    }
}
