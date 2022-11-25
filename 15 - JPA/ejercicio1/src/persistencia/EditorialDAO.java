package persistencia;

import java.util.List;

import entidades.Editorial;

public class EditorialDAO extends DAO<Editorial> {
    public void guardar(Editorial editorial) {
        super.guardarDatos(editorial);
    }

    public void eliminar(String id) {
        Editorial editorial = buscarPorId(id);
        super.eliminarDatos(editorial);
    }

    public Editorial buscarPorId(String id) {
        conectarDatabase();
        Editorial editorial = em.find(Editorial.class, id);
        desconectarDatabase();
        return editorial;
    }

    public List<Editorial> listarTodos() {
        conectarDatabase();
        List<Editorial> editoriales = em.createQuery("SELECT d FROM autor d")
                .getResultList();
        desconectarDatabase();
        return editoriales;
    }
}
