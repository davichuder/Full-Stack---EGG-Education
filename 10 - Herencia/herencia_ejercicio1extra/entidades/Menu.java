package herencia_ejercicio1extra.entidades;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import herencia_ejercicio1extra.enums.MenuPrincipal;
import herencia_ejercicio1extra.servicios.Creador;
import herencia_ejercicio1extra.servicios.Utilidades;

public class Menu {
    private static ArrayList<Amarre> amarres = new ArrayList<Amarre>();
    private static Scanner scanner = new Scanner(System.in);

    public static void ejecutar(int n_amarres) {
        for (int i = 0; i < n_amarres; i++)
            amarres.add(new Amarre(i));

        int opcion;
        do {
            opcion = MenuPrincipal.elegirOpcion();
            switch (opcion) {
                case 0:
                    return;
                case 1:
                    agregarAlquiler();
                    break;
                case 2:
                    eliminarAlquiler();
                    break;
                case 3:
                    mostrarAlquileres();
                    break;
                default:
                    Utilidades.ingreseOpcionValidacion();
                    break;
            }
        } while (opcion != 0);
    }

    private static boolean verificarLleno() {
        for (Amarre amarre_aux : amarres) {
            if (Objects.isNull(amarre_aux.getAlquiler()))
                return false;
        }
        return true;
    }

    private static void agregarAlquiler() {
        if (verificarLleno()) {
            System.out.println("No se pueden agregar mas amarres, el puerto esta lleno");
            return;
        }

        System.out.println("Elija un amarre disponible:\n");
        amarres.stream()
                .filter(x -> Objects.isNull(x.getAlquiler()))
                .forEach(p -> System.out.print(p.ubicacion + "\t"));
        System.out.println();

        int posicion = Integer.parseInt(scanner.nextLine());

        amarres.get(posicion).setAlquiler(Creador.crearAlquiler(posicion));
    }

    private static void mostrarAlquileres() {
        amarres.stream().forEach(x -> System.out.println(x));
        Utilidades.presionarEnter();
    }

    private static void eliminarAlquiler() {
        System.out.println("Lista de amarres ocupados:");
        amarres.stream()
                .filter(x -> !Objects.isNull(x.getAlquiler()))
                .forEach(System.out::println);

        System.out.println("Ingrese la posicion que quiere eliminar (-1 para cancelar)");
        int posicion = Integer.parseInt(scanner.nextLine());
        if (posicion == -1)
            return;

        amarres.stream()
                .filter(x -> x.getUbicacion() == posicion)
                .forEach(y -> y.desalojarAmarre());
    }
}
