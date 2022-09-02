package ejercicio2.entidades;

import java.util.ArrayList;
import java.util.HashSet;

public class Juego {
    // Jugadores (conjunto de Jugadores) y Revolver
    private HashSet<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = new HashSet<Jugador>(jugadores);
        this.revolver = revolver;
    }

    public HashSet<Jugador> getJugadores() {
        return this.jugadores;
    }

    public void setJugadores(HashSet<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return this.revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }

    // • llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe
    // los jugadores
    // y el revolver para guardarlos en los atributos del juego.
    // • ronda(): cada ronda consiste en un jugador que se apunta con el revolver de
    // agua y aprieta el gatillo.
    // Sí el revolver tira el agua el jugador se moja y se
    // termina el juego, sino se moja, se pasa al siguiente jugador hasta que uno se
    // moje.
    // Si o si alguien se tiene que mojar.
    // Al final del juego, se debe mostrar que jugador se mojó.
    // Pensar la lógica necesaria para realizar esto, usando los atributos de la
    // clase Juego.
    public void ronda() {
        boolean mojado = false;
        do {
            for (Jugador jugador : this.jugadores) {
                if (jugador.disparo(this.revolver)) {
                    System.out.println("El jugador mojado fue el " + jugador.getNombre());
                    mojado = true;
                    break;
                }
            }
        } while (!mojado);
    }

    // Muestro jugadores
    public void mostrarJugadores() {
        for (Jugador jugador : jugadores) {
            System.out.println(jugador);
        }
    }

}
