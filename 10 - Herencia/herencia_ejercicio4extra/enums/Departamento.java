package herencia_ejercicio4extra.enums;

import java.util.Scanner;

public enum Departamento {
    LENGUA, MATEMATICA, FISICA, HISTORIA, GEOGRAFIA, DEPORTE;

    private static Scanner scanner = new Scanner(System.in);

    public static Departamento elegirDepartamento() {
        for (int i = 0; i < Departamento.values().length; i++) {
            System.out.println(i + "-" + Departamento.values()[i]);
        }
        int posicion = Integer.parseInt(scanner.nextLine());
        return Departamento.values()[posicion];
    }
}
