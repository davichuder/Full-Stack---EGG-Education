package jdbc_ejercicio1;

import java.util.ArrayList;

import jdbc_ejercicio1.entidades.Producto;
import jdbc_ejercicio1.servicios.ServicioProducto;

public class app {
    public static void main(String[] args) {
        ServicioProducto servicioProducto = new ServicioProducto();

        Producto producto;
        try {
            producto = servicioProducto.buscarProductoPorCodigo("9546");
            System.out.println(producto);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }

        ArrayList<String> nombres;
        try {
            nombres = servicioProducto.todosNombresProductos();
            for (String string : nombres) {
                System.out.println(string);
            }
        } catch (Exception e) {
            System.out.println("Error nombres");
        }

        try {
            servicioProducto.agregarProducto(1995, "David", 10.5, 2);
            System.out.println("Cargado correctamente");
        } catch (Exception e) {
            System.out.println("Eror al ingresar");
        }
    }
}