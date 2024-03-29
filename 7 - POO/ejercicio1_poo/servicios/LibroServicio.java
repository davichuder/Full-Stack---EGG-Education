package ejercicio1_poo.servicios;

import java.util.Scanner;

import ejercicio1_poo.entidades.Libro;

public class LibroServicio {
    // Creo scanner para pedir datos
    Scanner scanner = new Scanner(System.in);

    // Funcion para crear libro
    public Libro crearLibro() {
        // Ingreso datos
        System.out.println("Ingrese ISBN: ");
        String isbn = scanner.nextLine();
        System.out.println("Ingrese titulo: ");
        String titulo = scanner.nextLine();
        System.out.println("Ingrese autor: ");
        String autor = scanner.nextLine();
        System.out.println("Ingrese numero de paginas: ");
        int numeroPaginas = scanner.nextInt();
        // Retorno libro
        return new Libro(isbn, titulo, autor, numeroPaginas);
    }

}
