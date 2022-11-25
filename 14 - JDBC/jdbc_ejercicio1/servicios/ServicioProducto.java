package jdbc_ejercicio1.servicios;

import java.util.ArrayList;
import java.util.HashMap;

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

    public ArrayList<String> listarTodosNombresProductos() throws Exception {
        try {
            return dao.listarTodosNombresProductos();
        } catch (Exception e) {
            throw e;
        }
    }

    public HashMap<String, Double> listarTodosNombresPreciosProductos() throws Exception {
        try {
            return dao.listarTodosNombresPreciosProductos();
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<Producto> filtrarProductosEntrePrecios(int minimo, int maximo) throws Exception {
        try {
            return dao.filtrarProductosEntrePrecios(minimo, maximo);
        } catch (Exception e) {
            throw e;
        }
    }

    public ArrayList<Producto> listarPortatiles() throws Exception {
        try {
            return dao.listarPortatiles();
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }

    public HashMap<String, Double> masBaratoNombrePrecioProducto() throws Exception {
        try {
            return dao.masBaratoNombrePrecioProducto();
        } catch (Exception e) {
            e.printStackTrace();
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

    public void modificarProducto(int codigo_viejo, int codigo_nuevo, String nombre, double precio,
            int codigo_fabricante) throws Exception {
        try {
            dao.modificarProducto(codigo_viejo, codigo_nuevo, nombre, precio, codigo_fabricante);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}