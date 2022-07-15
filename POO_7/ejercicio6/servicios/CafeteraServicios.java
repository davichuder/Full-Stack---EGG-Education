package POO_7.ejercicio6.servicios;

import java.util.Scanner;

import POO_7.ejercicio6.entidades.Cafetera;

public class CafeteraServicios {
    //Creo Scanner para leer los datos
    private Scanner scanner = new Scanner(System.in);

    //Funcion para crear una Cafetera
    public Cafetera crearCafetera() {
        System.out.println("Ingrese capacidad maxima");
        int capacidadMaxima = scanner.nextInt();
        System.out.println("Ingrese cantidad actual");
        int cantidadActual = scanner.nextInt();
        return new Cafetera(capacidadMaxima, cantidadActual);
    }
    
}
