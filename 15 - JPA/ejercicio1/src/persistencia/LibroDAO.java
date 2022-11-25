package persistencia;

import java.util.ArrayList;
import java.util.List;

import entidades.Libro;

public class LibroDAO extends DAO<Libro> {
    public void guardar(Libro libro) {
        super.guardarDatos(libro);
    }

    public void eliminar(String isbn) {
        Libro editorial = buscarPorISBN(isbn);
        super.eliminarDatos(editorial);
    }

    public Libro buscarPorISBN(String isbn) {
        conectarDatabase();
        Libro libro = em.find(Libro.class, isbn);
        desconectarDatabase();
        return libro;
    }

    public List<Libro> listarTodos() {
        conectarDatabase();
        List<Libro> libros = em.createQuery("SELECT d FROM autor d").getResultList();
        desconectarDatabase();
        return libros;
    }

    public Libro busquedaLibroPorISBN(Long isbn) {
        try {
            conectarDatabase();
            Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.isbn LIKE :isbn")
                    .setParameter("isbn", isbn).getSingleResult();
            desconectarDatabase();
            return libro;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Problema DAO");
            return null;
        }
    }

    public Libro busquedaLibroPorTitulo(String titulo) {
        try {
            conectarDatabase();
            Libro libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo LIKE :titulo")
                    .setParameter("titulo", titulo).getSingleResult();
            desconectarDatabase();
            return libro;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Problema DAO");
            return null;
        }
    }

    public List<Libro> busquedaLibrosPorAutor(String autor) {
        try {
            conectarDatabase();
            List<Libro> libro = em.createQuery("SELECT l FROM Libro l JOIN l.autor a WHERE a.nombre LIKE :autor")
                    .setParameter("autor", autor).getResultList();
            desconectarDatabase();
            return libro;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Problema DAO");
            return null;
        }
    }

    public List<Libro> busquedaLibrosPorEditorial(String editorial) {
        try {
            conectarDatabase();
            List<Libro> libro = em.createQuery("SELECT l FROM Libro l JOIN l.editorial e WHERE e.nombre LIKE :autor")
                    .setParameter("editorial", editorial).getResultList();
            desconectarDatabase();
            return libro;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Problema DAO");
            return null;
        }
    }
}
