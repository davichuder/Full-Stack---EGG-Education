package ejercicio2.servicios;

import java.util.ArrayList;

import ejercicio2.entidades.Juego;
import ejercicio2.entidades.Jugador;
import ejercicio2.entidades.Revolver;

public class Creador {
    private static final int JUGADORES_MAXIMOS = 3;

    // Crear lista de jugadores
    public static ArrayList<Jugador> crearJugadores() {
        ArrayList<Jugador> listaJugadores = new ArrayList<Jugador>();
        for (int i = 1; i < JUGADORES_MAXIMOS + 1; i++) {
            listaJugadores.add(new Jugador(i));
        }
        System.out.println("Se crearon " + JUGADORES_MAXIMOS + " jugadores");
        return listaJugadores;
    }

    // Crear revolver
    public static Revolver crearRevolver() {
        return new Revolver();
    }

    // Crear juego
    public static Juego crearJuego() {
        return new Juego();
    }
}
