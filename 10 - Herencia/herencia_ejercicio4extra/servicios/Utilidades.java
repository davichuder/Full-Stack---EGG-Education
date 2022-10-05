package herencia_ejercicio4extra.servicios;

import java.util.Scanner;

public class Utilidades {
    private static final Scanner scanner = new Scanner(System.in);

    public static void limpiarPantalla() {
        System.out.println("\033[H\033[2J");
    }

    public static String stringLimpiarPantalla() {
        return "\033[H\033[2J";
    }

    public static void presionarEnter() {
        while (true) {
            System.out.println("Presione enter para continuar");
            if (scanner.nextLine().equals(""))
                break;
        }
    }

    public static void ingreseOpcionValida() {
        System.out.println("ERROR: Ingrese una opcion valida");
        Utilidades.presionarEnter();
    }
}
