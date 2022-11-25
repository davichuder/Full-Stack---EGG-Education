package jdbc_ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;

import jdbc_ejercicio1.entidades.Producto;
import jdbc_ejercicio1.servicios.ServicioFabricante;
import jdbc_ejercicio1.servicios.ServicioProducto;

public class app {
    public static void main(String[] args) {
        ServicioProducto servicioProducto = new ServicioProducto();
        ServicioFabricante servicioFabricante = new ServicioFabricante();

        // Producto producto;
        // try {
        // producto = servicioProducto.buscarProductoPorCodigo("9546");
        // System.out.println(producto);
        // } catch (Exception e) {
        // e.printStackTrace();
        // System.out.println("Error del sistema por \n" + e.getMessage());
        // }

        // ArrayList<String> nombres;
        // try {
        // nombres = servicioProducto.listarTodosNombresProductos();
        // for (String string : nombres) {
        // System.out.println(string);
        // }
        // } catch (Exception e) {
        // System.out.println("Error nombres");
        // }

        // HashMap<String, Double> mapa;
        // try {
        // mapa = servicioProducto.listarTodosNombresPreciosProductos();
        // mapa.forEach((key, value) -> System.out.println(key + ": " + value));
        // } catch (Exception e) {
        // System.out.println("Error mapa");
        // }

        // ArrayList<Producto> productos;
        // try {
        // productos = servicioProducto.filtrarProductosEntrePrecios(120, 202);
        // productos.forEach(x -> System.out.println(x));
        // } catch (Exception e) {
        // System.out.println("Error en productos");
        // }

        // ArrayList<Producto> portatiles;
        // try {
        // portatiles = servicioProducto.listarPortatiles();
        // portatiles.forEach(x -> System.out.println(x));
        // } catch (Exception e) {
        // System.out.println("Error en portatiles");
        // }

        // HashMap<String, Double> masBaratos;
        // try {
        // masBaratos = servicioProducto.masBaratoNombrePrecioProducto();
        // masBaratos.forEach((key, value) -> System.out.println(key + ": " + value));
        // } catch (Exception e) {
        // System.out.println("Error mas barato");
        // }

        // try {
        // servicioProducto.agregarProducto(1997, "Devid", 10.5, 1);
        // System.out.println("Cargado correctamente");
        // } catch (Exception e) {
        // System.out.println("Eror al ingresar");
        // }

        // try {
        // servicioFabricante.agregarFabricante(1995, "rolon");
        // System.out.println("Cargado correctamente");
        // } catch (Exception e) {
        // System.out.println("Eror al ingresar");
        // }

        try {
            servicioProducto.modificarProducto(1997, 2001, "Elias", 21.2, 1);
            ;
        } catch (Exception e) {
            System.out.println("Error modificando");
        }
    }
}