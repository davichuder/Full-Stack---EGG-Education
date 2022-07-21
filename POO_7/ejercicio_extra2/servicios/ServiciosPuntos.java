package POO_7.ejercicio_extra2.servicios;

import java.util.Scanner;

import POO_7.ejercicio_extra2.entidades.Puntos;

public class ServiciosPuntos {
    private Scanner scanner = new Scanner(System.in);
    
    //Metodo crearPuntos
    public Puntos crearPuntos(){
        System.out.println("Ingrese X");
        int x = scanner.nextInt();
        System.out.println("Ingrese Y");
        int y = scanner.nextInt();
        return new Puntos(x, y);
    }

    //Metodo calcularDistancia
    public double calcularDistancia(Puntos punto1, Puntos punto2){
        int base = Math.abs(punto2.getX() - punto1.getX());
        int altura = Math.abs(punto2.getY() - punto1.getY());
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
}
