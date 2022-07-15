package POO_7.ejercicio5.servicios;

import java.util.Scanner;

import POO_7.ejercicio5.entidades.Cuenta;

public class CuentaServicio {
    //Creo Scanner
    private Scanner scanner = new Scanner(System.in);

    //Metodo crearCuenta
    public Cuenta crearCuenta(){
        System.out.println("Ingrese el numero de cuenta");
        int numeroCuenta = scanner.nextInt();
        System.out.println("Ingrese el DNI");
        long dni = scanner.nextLong();
        System.out.println("Ingrese el saldo");
        int saldo = scanner.nextInt();
        return new Cuenta(numeroCuenta, dni, saldo);
    }
}
