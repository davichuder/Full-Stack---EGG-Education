package jdbc_ejercicio1.servicios;

import java.util.ArrayList;

import jdbc_ejercicio1.entidades.Producto;
import jdbc_ejercicio1.persistencia.ProductoDAO;

public class ServicioProducto {
    private ProductoDAO dao;

    public ServicioProducto() {
        this.dao = new ProductoDAO();
    }

    public Producto buscarProductoPorCodigo(String codigo) throws Exception {
        try {
            int numero;
            try {
                numero = Integer.parseInt(codigo);
            } catch (Exception e) {
                throw new Exception("No se ingreso un numero");
            }

            return dao.buscarProductoPorCodigo(numero);
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<String> todosNombresProductos() throws Exception {
        try {
            return dao.todosNombresProductos();
        } catch (Exception e) {
            throw e;
        }
    }

    public void agregarProducto(int codigo, String nombre, double precio, int codigo_fabricante) throws Exception {
        try {
            dao.agregarProducto(codigo, nombre, precio, codigo_fabricante);
        } catch (Exception e) {
            throw e;
        }
    }
}