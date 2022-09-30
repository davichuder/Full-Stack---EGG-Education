// Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de 
// acuerdo a las prestaciones observadas
package herencia_ejercicio3extra.enums;

import java.util.Scanner;

public enum ClaseGimnasio {
    A("A"), B("B");

    private final String texto;
    private static final Scanner scanner = new Scanner(System.in);

    private ClaseGimnasio(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return this.texto;
    }

    public static ClaseGimnasio elegirOpcion() {
        System.out.println("Elija el tipo de gimnasio:\t");
        for (ClaseGimnasio opcion : ClaseGimnasio.values()) {
            System.out.print(opcion + "\t");
        }
        System.out.println();
        return ClaseGimnasio.valueOf(scanner.nextLine());
    }
}
