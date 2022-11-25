package persistencia;

import java.util.List;

import entidades.Autor;

public class AutorDAO extends DAO<Autor> {
    public void guardar(Autor autor) {
        super.guardarDatos(autor);
    }

    public void eliminar(String id) {
        Autor autor = buscarPorId(id);
        super.eliminarDatos(autor);
    }

    public Autor buscarPorId(String id) {
        conectarDatabase();
        Autor autor = em.find(Autor.class, id);
        desconectarDatabase();
        return autor;
    }

    public List<Autor> listarTodos() {
        conectarDatabase();
        List<Autor> autores = em.createQuery("SELECT d FROM autor d")
                .getResultList();
        desconectarDatabase();
        return autores;
    }

    public Autor busquedaAutorPoNombre(String nombre) {
        try {
            conectarDatabase();
            Autor persona = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre LIKE :nombre")
                    .setParameter("nombre", nombre).getSingleResult();
            desconectarDatabase();
            return persona;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Problema DAO");
            desconectarDatabase();
            return null;
        }
    }
}
