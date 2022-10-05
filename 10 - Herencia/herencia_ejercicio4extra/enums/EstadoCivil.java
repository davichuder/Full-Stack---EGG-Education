package herencia_ejercicio4extra.enums;

import java.util.Scanner;

public enum EstadoCivil {
    SOLTERO, CASADO, VIUDO, DIVORCIADO;

    private static final Scanner scanner = new Scanner(System.in);

    public static EstadoCivil elegirEstadoCivil() {
        for (int i = 0; i < EstadoCivil.values().length; i++) {
            System.out.println(i + "-" + EstadoCivil.values()[i]);
        }
        int posicion = Integer.parseInt(scanner.nextLine());
        return EstadoCivil.values()[posicion];
    }
}
