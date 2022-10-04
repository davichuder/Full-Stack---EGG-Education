package herencia_ejercicio3extra.entidades;

import java.util.Scanner;

import herencia_ejercicio3extra.enums.ClaseGimnasio;
import herencia_ejercicio3extra.servicios.Utilidades;

public class MenuAlojamiento {
    static String[] lista = { Hotel4Estrellas.class.getSimpleName(), Hotel5Estrellas.class.getSimpleName(),
            Camping.class.getSimpleName(), Residencia.class.getSimpleName() };

    private static final Scanner scanner = new Scanner(System.in);

    public static Alojamiento elegirAlojamiento() {
        Utilidades.limpiarPantalla();
        System.out.println("Seleccione un alojamiento:");
        for (int i = 0; i < lista.length; i++) {
            System.out.print(i + "-" + lista[i] + "\t");
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

        int cantidad_habitaciones = 0;
        int cantidad_camas = 0;
        int cantidad_pisos = 0;
        Gimnasio gimnasio = null;
        Restaurante restaurante = null;
        int cantidad_salon_conferencia = 0;
        int cantidad_suites = 0;
        int cantidad_limusinas = 0;
        int metros_cuadrados = 0;
        int cantidad_carpas = 0;
        int cantidad_habitaciones_residencia = 0;
        int baños = 0;
        boolean privado = false;
        boolean restaurante_bool = false;
        boolean descuentos = false;
        boolean campo_deportivo = false;

        if (opcion == 0 || opcion == 1) {
            System.out.println("Ingrese cantidad de habitaciones");
            cantidad_habitaciones = Integer.parseInt(scanner.nextLine());
            System.out.println(("Ingrese cantidad de camas"));
            cantidad_camas = Integer.parseInt(scanner.nextLine());
            System.out.println("Ingrese cantidad de pisos");
            cantidad_pisos = Integer.parseInt(scanner.nextLine());
            gimnasio = new Gimnasio(ClaseGimnasio.elegirOpcion());
            restaurante = Restaurante.crearRestaurante();
        }
        if (opcion == 1) {
            System.out.println("Ingrese cantidad de salones de conferencia");
            cantidad_salon_conferencia = Integer.parseInt(scanner.nextLine());
            System.out.println("Ingrese cantidad de suites");
            cantidad_suites = Integer.parseInt(scanner.nextLine());
            System.out.println("Ingrese cantidad de limusinas");
            cantidad_limusinas = Integer.parseInt(scanner.nextLine());
        }
        if (opcion == 2 || opcion == 3) {
            System.out.println("Es privado? (true - false");
            privado = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("Ingrese metros cuadrados");
            metros_cuadrados = Integer.parseInt(scanner.nextLine());
        }
        if (opcion == 2) {
            System.out.println("Ingrese cantidad maxima de carpas");
            cantidad_carpas = Integer.parseInt(scanner.nextLine());
            System.out.println("Ingrese cantidad de baños");
            baños = Integer.parseInt(scanner.nextLine());
            System.out.println("Tiene restaurante? (true - false)");
            restaurante_bool = Boolean.parseBoolean(scanner.nextLine());
        }
        if (opcion == 3) {
            System.out.println("Ingrese cantidad de habitaciones");
            cantidad_habitaciones_residencia = Integer.parseInt(scanner.nextLine());
            System.out.println("Tiene descuentos? (true - false)");
            descuentos = Boolean.parseBoolean(scanner.nextLine());
            System.out.println("Tiene campo deportivo? (true - false");
            campo_deportivo = Boolean.parseBoolean(scanner.nextLine());
        }
        switch (opcion) {
            case 0:
                return new Hotel4Estrellas(nombre, direccion, localidad, gerente, cantidad_habitaciones, cantidad_camas,
                        cantidad_pisos, gimnasio, restaurante);
            case 1:
                return new Hotel5Estrellas(nombre, direccion, localidad, gerente, cantidad_habitaciones, cantidad_camas,
                        cantidad_pisos, gimnasio, restaurante, cantidad_salon_conferencia, cantidad_suites,
                        cantidad_limusinas);
            case 2:
                return new Camping(nombre, direccion, localidad, gerente, privado, metros_cuadrados,
                        cantidad_carpas, baños, restaurante_bool);
            case 3:
                return new Residencia(nombre, direccion, localidad, gerente, privado, metros_cuadrados,
                        cantidad_habitaciones_residencia, descuentos, campo_deportivo);
            default:
                return new Alojamiento();
        }
    }
}
