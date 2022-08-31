package ejercicio_4.servicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import ejercicio_4.entidades.Pelicula;

public class ServiciosPelicula {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();

    public void crearPelicula() {
        String respuesta;
        do {
            System.out.println("Ingrese el nombre de la pelicula: ");
            String nombre = scanner.nextLine();
            System.out.println("Ingrese el director: ");
            String director = scanner.nextLine();
            System.out.println("Ingrese la duracion: ");
            Float duracion = Float.parseFloat(scanner.nextLine());
            peliculas.add(new Pelicula(nombre, director, duracion));

            while (true) {
                System.out.println("Desea ingresar otra pelicula? (s/n)");
                respuesta = scanner.nextLine();
                if (respuesta.equals("s") || respuesta.equals("n")) {
                    break;
                } else {
                    System.out.println("Ingrese una respuesta valida");
                }
            }
        } while (!respuesta.equals("n"));
    }

    public void mostrarPeliculas() {
        System.out.println("\nMostrando todas las peliculas");
        for (Pelicula pelicula : peliculas) {
            System.out.println("Titulo: " + pelicula.getTitulo() + " - Director: " + pelicula.getDirector() + " - Duración: " + pelicula.getDuracion());
        }
    }

    public void mostrarPeliculasDuracion(int duracion){
        System.out.println("\nPeliculas con duracion mayor a " + duracion + " horas:");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getDuracion() > duracion) {
                System.out.println("Titulo: " + pelicula.getTitulo() + " - Director: " + pelicula.getDirector() + " - Duración: " + pelicula.getDuracion());
            }
        }
    }

    public void ordenarPeliculasDuracion(Boolean ascendente){
        if (ascendente) {
            System.out.println("\nPeliculas ordenadas por duracion ascendente...");
        } else {
            System.out.println("\nPeliculas ordenadas por duracion descendente...");
        }

        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                if (ascendente) {
                    return o1.getDuracion().compareTo(o2.getDuracion());
                } else {
                    return o2.getDuracion().compareTo(o1.getDuracion());
                }
            }
        });
    }

    public void ordenarPeliculasTitulo(){
        System.out.println("\nPeliculas ordenadas por titulo ascendente...");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return o1.getTitulo().compareTo(o2.getTitulo());
            }
        });
    }

    public void ordenarPeliculasDirector(){
        System.out.println("\nPeliculas ordenadas por director ascendente...");
        Collections.sort(peliculas, new Comparator<Pelicula>() {
            @Override
            public int compare(Pelicula o1, Pelicula o2) {
                return o1.getDirector().compareTo(o2.getDirector());
            }
        });
    }

}
