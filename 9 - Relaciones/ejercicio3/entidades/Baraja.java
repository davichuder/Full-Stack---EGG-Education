package ejercicio3.entidades;

import java.util.ArrayList;
import java.util.Collections;
import ejercicio3.enums.Numero;
import ejercicio3.enums.Palo;

public class Baraja {
    private ArrayList<Carta> mazo = new ArrayList<Carta>();
    private ArrayList<Carta> repartidas = new ArrayList<Carta>();

    public Baraja() {
        for (Numero num_aux : Numero.values()) {
            for (Palo palo_aux : Palo.values()) {
                this.mazo.add(new Carta(num_aux, palo_aux));
            }
        }
    }

    // • barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar() {
        Collections.shuffle(this.mazo);
    }

    // • siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando
    // no haya más o
    // se haya llegado al final, se indica al usuario que no hay más cartas.
    public Carta siguienteCarta() {
        Carta siguiente_carta = this.mazo.get(0);
        this.mazo.remove(0);
        this.repartidas.add(siguiente_carta);
        if (this.cartasDisponibles() == 0) {
            System.out.println("No hay mas cartas para repartir");
        }
        return siguiente_carta;
    }

    // • cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public int cartasDisponibles() {
        return this.mazo.size();
    }

    // • darCartas(): dado un número de cartas que nos pidan, le devolveremos ese
    // número de cartas.
    // En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
    // debemos indicárselo al usuario.
    public ArrayList<Carta> darCartas(int cantidad) {
        if (this.cartasDisponibles() >= cantidad) {
            ArrayList<Carta> reparto = new ArrayList<Carta>();
            for (int i = 0; i < cantidad; i++) {
                reparto.add(this.siguienteCarta());
            }
            return reparto;
        }
        System.out.println("Se pidio mas cartas de las que hay disponibles");
        return new ArrayList<Carta>();
    }

    // • cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha
    // salido ninguna indicárselo al usuario
    public void cartasMonton() {
        if (this.repartidas.size() == 0) {
            System.out.println("No hay cartas repartidas");
            return;
        }
        System.out.println("Las cartas repartidas fueron:");
        for (Carta carta_aux : this.repartidas) {
            System.out.println(carta_aux);
        }
    }

    // • mostrarBaraja(): muestra todas las cartas hasta el final.
    // Es decir, si se saca una carta y luego se llama al método, este no mostrara
    // esa primera carta.
    public void mostrarCartas() {
        if (this.mazo.size() == 0) {
            System.out.println("No hay cartas en el mazo");
            return;
        }
        System.out.println("Las cartas en el mazo eran:");
        for (Carta carta_aux : this.mazo) {
            System.out.println(carta_aux);
        }
    }
}
