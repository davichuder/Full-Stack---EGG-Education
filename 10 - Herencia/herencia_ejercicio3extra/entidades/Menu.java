package herencia_ejercicio3extra.entidades;

import java.util.ArrayList;
import java.util.Scanner;

// import herencia_ejercicio3extra.enums.MenuAlojamiento;
import herencia_ejercicio3extra.enums.MenuPrincipal;
import herencia_ejercicio3extra.servicios.Utilidades;

public class Menu {
    private static ArrayList<Alojamiento> alojamientos = new ArrayList<Alojamiento>();
    private static Scanner scanner = new Scanner(System.in);

    public static void ejecutar() {
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
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    Utilidades.ingreseOpcionValidacion();
                    break;
            }
        } while (opcion != 0);
    }

    public static void agregarAlojamiento() {
        alojamientos.add(MenuAlojamiento.elegirAlojamiento());
    }
}
