package ejercicio2.entidades;

import java.util.Scanner;

public class Circunferencia {
    // Creo parametros parametros
    // radio
    private Double radio;

    // Getters y setters
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }

    // Constructor vacio
    public Circunferencia() {
    }

    // toString
    @Override
    public String toString() {
        return "radio=" + radio;
    }

    // Funcion para crear circunferencia
    public void crearCircunferencia() {
        // Creo scanner
        Scanner scanner = new Scanner(System.in);
        // Pido radio
        System.out.println("Ingrese radio: ");
        radio = scanner.nextDouble();
        // Cierro scanner
        scanner.close();
    }

    // Funcion para calcular perimetro
    public Double perimetro() {
        // Retorno perimetro
        return 2 * Math.PI * radio;
    }

    // Funcion para calcular area
    public Double area() {
        // Retorno area
        return Math.PI * Math.pow(this.radio, 2);
    }
}
