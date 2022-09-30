package herencia_ejercicio3extra.entidades;

import java.util.Scanner;

import herencia_ejercicio3extra.enums.MenuPrincipal;
import herencia_ejercicio3extra.servicios.Utilidades;

public class MenuAlojamiento {
    String[] lista = { Hotel4Estrellas.class.getSimpleName(), Hotel5Estrellas.class.getSimpleName(),
            Camping.class.getSimpleName(), Residencia.class.getSimpleName() };

    private static final Scanner scanner = new Scanner(System.in);

    public static Alojamiento elegirAlojamiento() {
        Utilidades.limpiarPantalla();
        System.out.println("Seleccione un alojamiento:");
        for (int i = 0; i < MenuPrincipal.values().length; i++) {
            System.out.print(i + "-" + MenuPrincipal.values()[i]);
        }
        int opcion = Integer.parseInt(scanner.nextLine());

        System.out.println("Ingrese nombre del alojamiento");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese direccion del alojamiento");
        String direccion = scanner.nextLine();
        System.out.println("Ingrese localidad del alojamiento");
        String localidad = scanner.nextLine();
        System.out.println("Ingrese gerente del alojamiento");
        String gerente = scanner.nextLine();

        switch (opcion) {
            case 0:

        }

        return new Alojamiento();
    }

    public MenuAlojamiento() {
    }

    public MenuAlojamiento(String[] lista) {
        this.lista = lista;
    }

}
