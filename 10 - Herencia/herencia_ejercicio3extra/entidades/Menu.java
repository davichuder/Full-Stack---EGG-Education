package herencia_ejercicio3extra.entidades;

import java.util.ArrayList;
import java.util.Scanner;

import herencia_ejercicio3extra.enums.MenuPrincipal;
import herencia_ejercicio3extra.servicios.Utilidades;

public class Menu {
    private static ArrayList<Alojamiento> alojamientos;

    final static Scanner scanner = new Scanner(System.in);

    public static void ejecutar(ArrayList<Alojamiento> alojamientos_param) {
        alojamientos = alojamientos_param;
        int opcion;
        do {
            opcion = MenuPrincipal.elegirOpcion();
            switch (opcion) {
                case 0:
                    return;
                case 1:
                    agregarAlojamiento();
                    break;
                case 2:
                    eliminarAlojamiento();
                    break;
                case 3:
                    mostrarTodosAlojamientos();
                    break;
                case 4:
                    mostrarHotelesPrecioDescendente();
                    break;
                case 5:
                    mostrarCampingRestaurante();
                    break;
                case 6:
                    mostrarResidenciaDescuento();
                    break;
                default:
                    Utilidades.ingreseOpcionValidacion();
                    break;
            }
        } while (opcion != 0);
    }

    public static void agregarAlojamiento() {
        alojamientos.add(MenuAlojamiento.elegirAlojamiento());
        if (alojamientos.get(alojamientos.size() - 1) instanceof Hotel4Estrellas) {
            ((Hotel4Estrellas) alojamientos.get(alojamientos.size() - 1)).calcularPrecio_habitacion();
            ;
        }
        if (alojamientos.get(alojamientos.size() - 1) instanceof Hotel5Estrellas) {
            ((Hotel5Estrellas) alojamientos.get(alojamientos.size() - 1)).calcularPrecio_habitacion();
            ;
        }
    }

    public static void mostrarTodosAlojamientos() {
        alojamientos.stream().forEach(x -> System.out.println(x));
        Utilidades.presionarEnter();
    }

    public static void eliminarAlojamiento() {
        System.out.println("Ingrese direccion a eliminar");
        String direccion = scanner.nextLine();

        for (int i = 0; i < alojamientos.size(); i++) {
            if (alojamientos.get(i).getDireccion().equals(direccion)) {
                alojamientos.remove(i);
                System.out.println("Se elimino correctamente");
                Utilidades.presionarEnter();
                return;
            }
        }
        System.out.println("No existe esa direccion para eliminar");
        Utilidades.presionarEnter();
    }

    public static void mostrarHotelesPrecioDescendente() {
        alojamientos.stream()
                .filter(x -> x instanceof Hotel)
                .sorted((o1, o2) -> ((Hotel) o2).getPrecio_habitacion().compareTo(((Hotel) o1).getPrecio_habitacion()))
                .forEach(x -> System.out.println(x));
        Utilidades.presionarEnter();
    }

    public static void mostrarCampingRestaurante() {
        alojamientos.stream()
                .filter(x -> x instanceof Camping)
                .filter(x -> ((Camping) x).isRestaurante())
                .forEach(x -> System.out.println(x));
        Utilidades.presionarEnter();
    }

    public static void mostrarResidenciaDescuento() {
        alojamientos.stream()
                .filter(x -> x instanceof Residencia)
                .filter(x -> ((Residencia) x).isDescuentos())
                .forEach(x -> System.out.println(x));
        Utilidades.presionarEnter();
    }
}
