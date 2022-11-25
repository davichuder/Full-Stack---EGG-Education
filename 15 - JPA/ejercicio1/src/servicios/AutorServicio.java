package servicios;

import entidades.Autor;
import persistencia.AutorDAO;

public class AutorServicio {
    AutorDAO dao;

    public AutorServicio() {
        this.dao = new AutorDAO();
    }

    public Autor busquedaAutorPoNombre(String nombre) {
        try {
            return dao.busquedaAutorPoNombre(nombre);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error en servicio");
            dao.desconectarDatabase();
            return null;
        }
    }
}
