package ejercicio_extra4.servicios;

import java.util.Scanner;

import ejercicio_extra4.entidades.NIF;

public class ServicioNIF {
    // Scanner de clase
    private Scanner scanner = new Scanner(System.in);

    public NIF crearNif() {
        // Ingreso de datos
        System.out.println("Ingrese el numero de DNI: ");
        long dni = scanner.nextLong();
        return new NIF(dni);
    }

}
