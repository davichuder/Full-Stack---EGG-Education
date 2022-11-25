import java.util.List;

import entidades.Autor;
import entidades.Libro;
import servicios.AutorServicio;
import servicios.LibroServicio;

public class App {
    public static void main(String[] args) {
        // AutorServicio autorServicio = new AutorServicio();
        // Autor a = autorServicio.busquedaAutorPoNombre("David Rolon");
        // System.out.println(a);

        LibroServicio libroServicio = new LibroServicio();
        List<Libro> libros = libroServicio.busquedaLibrosPorAutor("David Rolon");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }
}
