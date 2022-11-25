package persistencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DAO<T> {
    protected final EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAPU");
    protected EntityManager em;

    protected void conectarDatabase() {
        if (em == null || !em.isOpen()) {
            this.em = emf.createEntityManager();
        }
    }

    public void desconectarDatabase() {
        if (em.isOpen()) {
            em.close();
        }
    }

    protected void guardarDatos(T objeto) {
        conectarDatabase();
        em.getTransaction().begin();
        em.persist(objeto);
        em.getTransaction().commit();
        desconectarDatabase();
    }

    protected void editarDatos(T objeto) {
        conectarDatabase();
        em.getTransaction().begin();
        em.merge(objeto);
        em.getTransaction().commit();
        desconectarDatabase();
    }

    protected void eliminarDatos(T objeto) {
        conectarDatabase();
        em.getTransaction().begin();
        em.remove(objeto);
        em.getTransaction().commit();
        desconectarDatabase();
    }
}
