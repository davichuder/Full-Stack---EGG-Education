package explicacion;

import explicacion.entidades.Producto;
import explicacion.servicios.ProductoServicio;

public class app {
    public static void main(String[] args) {
        ProductoServicio productoServicio = new ProductoServicio();

        Producto producto;
        try {
            producto = productoServicio.buscarProductoPorCodigo("5");
            System.out.println(producto);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error del sistema por \n" + e.getMessage());
        }

    }
}
