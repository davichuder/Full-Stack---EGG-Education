package herencia_ejercicio4extra.enums;

import java.util.Scanner;

public enum Seccion {
    BIBLIOTECA, DECANATO, SECRETARIA, LIMPIEZA, MANTENIMIENTO;

    private static Scanner scanner = new Scanner(System.in);

    public static Seccion elegirSeccion() {
        for (int i = 0; i < Seccion.values().length; i++) {
            System.out.println(i + "-" + Seccion.values()[i]);
        }
        int posicion = Integer.parseInt(scanner.nextLine());
        return Seccion.values()[posicion];
    }
}
