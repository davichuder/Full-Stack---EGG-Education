package servicios;

import java.util.List;

import entidades.Libro;
import persistencia.LibroDAO;

public class LibroServicio {
    LibroDAO dao;

    public LibroServicio() {
        this.dao = new LibroDAO();
    }

    public Libro busquedaLibroPorISBN(Long isbn) {
        try {
            return dao.busquedaLibroPorISBN(isbn);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en servicio");
            dao.desconectarDatabase();
            return null;
        }
    }

    public Libro busquedaLibroPorTitulo(String titulo) {
        try {
            return dao.busquedaLibroPorTitulo(titulo);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en servicio");
            dao.desconectarDatabase();
            return null;
        }
    }

    public List<Libro> busquedaLibrosPorAutor(String autor) {
        try {
            return dao.busquedaLibrosPorAutor(autor);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en servicio");
            dao.desconectarDatabase();
            return null;
        }
    }

    public List<Libro> busquedaLibrosPorEditorial(String editorial) {
        try {
            return dao.busquedaLibrosPorEditorial(editorial);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en servicio");
            dao.desconectarDatabase();
            return null;
        }
    }
}
