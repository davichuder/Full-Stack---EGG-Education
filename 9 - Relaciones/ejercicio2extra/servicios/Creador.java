package ejercicio2extra.servicios;

import java.util.Scanner;

import ejercicio2extra.entidades.Espectador;
import ejercicio2extra.entidades.Sala;

public class Creador {
    public static Scanner scanner = new Scanner(System.in);

    public static Espectador crearEspectador() {
        System.out.println("Ingrese nombre");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese edad");
        int edad = Integer.valueOf(scanner.nextLine());
        System.out.println("Ingrese el dinero");
        int dinero = Integer.valueOf(scanner.nextLine());
        return new Espectador(nombre, edad, dinero);
    }

    public static Espectador crearEspectadorRandom(int minimo, int maximo) {
        String nombre = "Espectador " + aleatorio(1, minimo * maximo);
        return new Espectador(nombre, aleatorio(1, 100), aleatorio(0, 5000));
    }

    public static int aleatorio(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static void agregarEspectadoresRandom(Sala sala, int cantidad_personas) {
        Espectador espectador;
        int filas = sala.getAsientos().length;
        int columnas = sala.getAsientos()[0].length;
        int n_fila, n_columna;
        boolean ocupado;

        for (int i = 0; i < cantidad_personas; i++) {
            espectador = crearEspectadorRandom(filas, columnas);
            if (espectador.getEdad() < sala.getPelicula().getEdadMinima()) {
                System.out.println(
                        espectador.getNombre() + " tiene " + espectador.getEdad() + " años y no cumple la edad minima");
                continue;
            }
            if (espectador.getDinero() < sala.getPrecio()) {
                System.out.println(
                        espectador.getNombre() + " tiene " + espectador.getEdad()
                                + " pesos y no alcanza a pagar la entrada");
                continue;
            }
            System.out.println("\tIntentando ubicar a " + espectador.getNombre());
            do {
                n_fila = Creador.aleatorio(0, filas - 1);
                n_columna = Creador.aleatorio(0, columnas - 1);
                ocupado = sala.getAsientos()[n_fila][n_columna];
                if (ocupado)
                    System.out.println("\tEl asiento esta ocupado, reubicando...");
            } while (ocupado);
            System.out.println(
                    espectador.getNombre() + "\tfue ubicado en la\tfila " + (n_fila + 1) + "\tcolumna "
                            + ((char) (65 + n_columna)));
            sala.setAsiento(n_fila, n_columna, true);
        }
    }
}
