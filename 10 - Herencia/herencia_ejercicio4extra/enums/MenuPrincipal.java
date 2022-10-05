package herencia_ejercicio4extra.enums;

import java.util.Scanner;

import herencia_ejercicio4extra.servicios.Utilidades;

public enum MenuPrincipal {
    OPCION0("0-Salir"),
    OPCION1("1-Agregar persona"),
    OPCION2("2-Eliminar persona"),
    OPCION3("3-Mostrar personas"),
    OPCION4("4-Cambio del estado civil de una persona."),
    OPCION5("5-Reasignación de despacho a un empleado."),
    OPCION6("6-Matriculación de un estudiante en un nuevo curso."),
    OPCION7("7-Cambio de departamento de un profesor."),
    OPCION8("8-Traslado de sección de un empleado del personal de servicio");

    private String texto;
    private static final Scanner scanner = new Scanner(System.in);

    private MenuPrincipal(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.texto;
    }

    public static int elegirOpcion() {
        Utilidades.limpiarPantalla();
        System.out.println("MENU PRINCIPAL");
        for (MenuPrincipal opcion : MenuPrincipal.values()) {
            System.out.println(opcion);
        }
        return scanner.nextInt();
    }

}
