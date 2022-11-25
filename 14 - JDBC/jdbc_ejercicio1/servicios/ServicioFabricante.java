package jdbc_ejercicio1.servicios;

import jdbc_ejercicio1.persistencia.FabricanteDAO;

public class ServicioFabricante {
    private FabricanteDAO dao;

    public ServicioFabricante() {
        this.dao = new FabricanteDAO();
    }

    public void agregarFabricante(int codigo, String nombre) throws Exception {
        try {
            dao.agregarFabricante(codigo, nombre);
        } catch (Exception e) {
            throw e;
        }
    }
}
