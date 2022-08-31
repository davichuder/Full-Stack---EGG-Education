/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, 
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un 
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y 
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el 
numero de páginas.
 */
package ejercicio1;

import ejercicio1.entidades.Libro;
import ejercicio1.servicios.LibroServicio;

public class app {

    public static void main(String[] args) {
        // Creo servicio de libro
        LibroServicio libroServicio = new LibroServicio();
        // Creo libro
        Libro libro = libroServicio.crearLibro();
        // Imprimo datos
        System.out.println(libro);
    }

}
