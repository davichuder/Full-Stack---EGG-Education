package ejercicio_extra6.entidades;

import java.util.Scanner;

public class Ahorcado {
    // Parametros
    private String[] palabra;
    private int letras_encontradas;
    private int jugadas_maximas;
    private Scanner scanner = new Scanner(System.in);

    // Adicional no lo pide el ejercicio
    private String[] letras_acertadas;

    // Constructor por defecto
    public Ahorcado() {
    }

    // Constructor con parametros
    public Ahorcado(String[] palabra, int letras_encontradas, int jugadas_maximas) {
        this.palabra = palabra;
        this.letras_encontradas = letras_encontradas;
        this.jugadas_maximas = palabra.length;
    }

    // Metodo crearJuego
    public void crearJuego() {
        System.out.println("Ingrese una palabra: ");
        String palabra_ingresada = scanner.nextLine();
        palabra = new String[palabra_ingresada.length()];
        letras_encontradas = 0;
        System.out.println("Ingrese la cantidad de jugadas maximas: ");
        jugadas_maximas = scanner.nextInt();
        for (int i = 0; i < palabra_ingresada.length(); i++) {
            palabra[i] = palabra_ingresada.substring(i, i + 1);
        }

        // Adicional no lo pide el ejercicio
        letras_acertadas = new String[palabra_ingresada.length()];
        for (int i = 0; i < palabra_ingresada.length(); i++) {
            letras_acertadas[i] = "_ ";
        }
    }

    // Metodo longitud
    public void longitud() {
        System.out.println("Longitud de la palabra: " + palabra.length);
    }

    // Metodo buscar
    public void buscar(char letra) {
        boolean letra_encontrada = false;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equals(String.valueOf(letra))) {
                letra_encontrada = true;
                break;
            }
        }
        if (letra_encontrada) {
            System.out.println("La letra pertenece a la palabra");
        } else {
            System.out.println("La letra no pertenece a la palabra");
        }
    }

    // Metodo encontradas
    public boolean encontradas(char letra) {
        int cantidad_letras_encontradas = 0;
        for (int i = 0; i < palabra.length; i++) {
            if (palabra[i].equals(String.valueOf(letra))) {
                cantidad_letras_encontradas++;
                // Adicional no lo pide el ejercicio
                letras_acertadas[i] = String.valueOf(letra) + " ";
            }
        }
        if (cantidad_letras_encontradas == 0) {
            jugadas_maximas -= 1;
        }
        letras_encontradas += cantidad_letras_encontradas;
        System.out.println("Letras totales encontradas: " + letras_encontradas + " Letras faltantes: "
                + (palabra.length - letras_encontradas));

        // Adicional no lo pide el ejercicio
        System.out.println("Letras acertadas: " + String.join("", letras_acertadas));

        return cantidad_letras_encontradas > 0;
    }

    // Metodo intento
    public void intento() {
        System.out.println("Quedan " + jugadas_maximas + " intentos");
    }

    // Metodo juego
    public void juego() {
        crearJuego();
        longitud();
        do {
            System.out.println("Ingrese una letra: ");
            char letra = scanner.next().charAt(0);
            buscar(letra);
            encontradas(letra);
            intento();
            System.out.println("----------------------------------------------------");
        } while (jugadas_maximas > 0 && letras_encontradas < palabra.length);
        if (letras_encontradas == palabra.length) {
            System.out.println("Ganaste");
        } else {
            System.out.println("Perdiste");
        }
    }
}
