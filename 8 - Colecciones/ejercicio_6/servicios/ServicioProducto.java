package ejercicio_6.servicios;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ServicioProducto {
    private Scanner scanner = new Scanner(System.in);
    private HashMap<String, Float> listaProductos = new HashMap<String, Float>();

    public void menu() {

        int opcion;
        while (true) {
            System.out.println("\nSeleccione una opcion");
            System.out.println("1. Ingresar producto");
            System.out.println("2. Modificar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            opcion = Integer.valueOf(scanner.nextLine());
            if (opcion == 1)
                this.ingresarProducto();
            if (opcion == 2)
                this.modificarProducto();
            if (opcion == 3)
                this.eliminarProducto();
            if (opcion == 4)
                this.mostrarProductos();
            if (opcion == 5)
                break;
            if (opcion < 1 || 5 < opcion)
                System.out.println("Ingrese una opcion valida");
        }
        scanner.close();
    }

    private void ingresarProducto() {
        System.out.println("Ingrese nombre del producto");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese precio del producto");
        Float precio = Float.valueOf(scanner.nextLine());
        this.listaProductos.put(nombre, precio);
    }

    private void modificarProducto() {
        System.out.println("Ingrese nombre del producto a modificar");
        String nombre = scanner.nextLine();
        if (this.listaProductos.keySet().contains(nombre)) {
            System.out.println("Ingrese nuevo precio");
            Float nuevo_precio = Float.valueOf(scanner.nextLine());
            this.listaProductos.put(nombre, nuevo_precio);
        } else {
            System.out.println("No existe ese producto");
        }
    }

    private void eliminarProducto() {
        System.out.println("Ingrese nombre del producto a eliminar");
        String nombre = scanner.nextLine();
        if (this.listaProductos.keySet().contains(nombre)) {
            System.out.println("Producto eliminado");
            listaProductos.remove(nombre);
        } else {
            System.out.println("No existe ese producto");
        }
    }

    private void mostrarProductos() {
        System.out.println("Lista de productos");
        for (Map.Entry<String, Float> datos : this.listaProductos.entrySet()) {
            System.out.println(datos.getKey() + "\t" + datos.getValue());
        }
    }
}
