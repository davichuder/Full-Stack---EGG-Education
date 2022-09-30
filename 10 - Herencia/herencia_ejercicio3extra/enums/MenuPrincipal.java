package herencia_ejercicio3extra.enums;

import java.util.Scanner;

import herencia_ejercicio3extra.servicios.Utilidades;

public enum MenuPrincipal {
    OPCION0("0-Salir"),
    OPCION1("1-Agregar alojamiento"),
    OPCION2("2-Eliminar alojamiento"),
    OPCION3("3-Mostrar todos los alojamientos"),
    OPCION4("4-Mostrar con filtros");

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