package ejercicio2.entidades;

public class Jugador {
    private static final int JUGADORES_MAXIMOS = 6;
    // id (representa el número del
    // jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y
    // mojado (indica
    // si está mojado o no el jugador). El número de jugadores será decidido por el
    // usuario, pero
    // debe ser entre 1 y 6. Si no está en este rango, por defecto será 6
    private int id;
    private String nombre;
    private boolean mojado;

    public Jugador(int id) {
        if ((1 <= id) & (id <= JUGADORES_MAXIMOS)) {
            this.id = id;
        } else {
            this.id = 6;
        }
        this.nombre = "Jugador " + this.id;
        this.mojado = false;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isMojado() {
        return this.mojado;
    }

    public boolean getMojado() {
        return this.mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    // • disparo(Revolver r): el método, recibe el revolver de agua y llama a los
    // métodos de mojar() y siguienteChorro() de Revolver.
    // El jugador se apunta, aprieta el gatillo y si el
    // revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y
    // el método devuelve true, sino false.
    public boolean disparo(Revolver revolver) {
        System.out.println("Jugador " + this.nombre + " disparando");
        if (revolver.mojar()) {
            this.mojado = true;
            return true;
        }
        revolver.siguienteChorro();
        return false;
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nombre='" + getNombre() + "'" +
                ", mojado='" + isMojado() + "'" +
                "}";
    }
}
