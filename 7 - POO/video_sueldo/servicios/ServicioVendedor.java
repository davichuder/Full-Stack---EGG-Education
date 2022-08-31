package video_sueldo.servicios;

import java.util.Date;
import java.util.Scanner;

import video_sueldo.entidades.Vendedor;

public class ServicioVendedor {
    // Creo scanner para leer datos
    private Scanner scanner = new Scanner(System.in);

    // Funcion de alta de vendedor
    public Vendedor altaVendedor() {
        // Pido los datos del vendedor
        System.out.println("Ingrese los datos del vendedor");
        System.out.println("Ingrese el nombre");
        String nombre = scanner.next();
        System.out.println("Ingrese el dni");
        String dni = scanner.next();
        System.out.println("Ingrese el sueldo basico");
        Double sueldoBasico = scanner.nextDouble();
        System.out.println("Ingrese el año de ingreso");
        int anioIngreso = scanner.nextInt();
        System.out.println("Ingrese el mes de ingreso");
        int mesIngreso = scanner.nextInt();
        System.out.println("Ingrese el dia de ingreso");
        int diaIngreso = scanner.nextInt();
        Date fechaIngreso = new Date(anioIngreso - 1900, mesIngreso - 1, diaIngreso);
        // Creo el vendedor
        return new Vendedor(nombre, dni, sueldoBasico, fechaIngreso);
    }

    // Funcion para calcular sueldo mensual
    public void calcularSueldoMensual(Vendedor vendedor) {
        // Creo porcentaje de comisiones
        Double porcentajeComisiones = 0.15;
        // Ingreso comisiones
        System.out.println("Ingrese las ventas del mes");
        Double ventas = scanner.nextDouble();
        vendedor.setComisiones(ventas * porcentajeComisiones);
        // Calculo sueldo mensual
        vendedor.setSueldoMensual(vendedor.getSueldoBasico() + vendedor.getComisiones());
        // Muestro sueldo mensual
        System.out.println("El sueldo mensual es: " + vendedor.getSueldoMensual());
    }

    // Funcion para calcular las vacaciones
    public void calcularVacaciones(Vendedor vendedor) {
        // Creo variable con la fecha actual
        Date fechaActual = new Date();
        // Calculo antiguedad
        int antiguedad = fechaActual.getYear() - vendedor.getFechaIngreso().getYear();
        // Calculo vacaciones
        if (antiguedad >= 20) {
            System.out.println("El vendedor tiene 35 dias de vacaciones");
        } else if (antiguedad >= 10) {
            System.out.println("El vendedor tiene 28 dias de vacaciones");
        } else if (antiguedad >= 5) {
            System.out.println("El vendedor tiene 21 dias de vacaciones");
        } else if (antiguedad >= 1) {
            System.out.println("El vendedor tiene 14 dias de vacaciones");
        } else {
            System.out.println("El vendedor tiene vacaciones proporcionales");
        }
    }

}
