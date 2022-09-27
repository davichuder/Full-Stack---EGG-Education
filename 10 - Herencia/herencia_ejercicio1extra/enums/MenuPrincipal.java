package herencia_ejercicio1extra.enums;

import java.util.Scanner;

import herencia_ejercicio1extra.servicios.Utilidades;

public enum MenuPrincipal {
    OPCION0("0-Salir"),
    OPCION1("1-Agregar alquiler"),
    OPCION2("2-Eliminar alquiler"),
    OPCION3("3-Mostrar alquileres");

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
