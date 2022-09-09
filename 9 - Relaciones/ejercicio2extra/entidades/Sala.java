package ejercicio2extra.entidades;

import ejercicio2extra.enums.Peliculas;

public class Sala {
    private int precio;
    public Peliculas pelicula;
    private boolean[][] asientos; // true es ocupado

    public Sala(int filas, int columnas, int precio, Peliculas pelicula) {
        this.asientos = new boolean[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
    }

    public int getPrecio() {
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean[][] getAsientos() {
        return this.asientos;
    }

    public void setAsientos(boolean[][] asientos) {
        this.asientos = asientos;
    }

    public Peliculas getPelicula() {
        return this.pelicula;
    }

    public void setPelicula(Peliculas pelicula) {
        this.pelicula = pelicula;
    }

    @Override
    public String toString() {
        return "Pelicula\n" + this.pelicula + "\nprecio=" + this.precio + " pesos";
    }

    public void mostrarAsientos() {
        // 65 = "A" segun esto https://elcodigoascii.com.ar/
        // Entonces (char) (65) me da la letra A
        for (int fila = this.asientos.length - 1; fila >= 0; fila--) {
            for (int columna = 0; columna < this.asientos[fila].length; columna++) {
                if (asientos[fila][columna]) {
                    System.out.print((fila + 1) + " " + ((char) (65 + columna)) + " X");
                } else {
                    System.out.print((fila + 1) + " " + ((char) (65 + columna)) + " O");
                }
                if (columna < this.asientos[fila].length - 1)
                    System.out.print(" |");
                if (columna == this.asientos[fila].length - 1)
                    System.out.println();
            }
        }
    }

    public void setAsiento(int fila, int columna, boolean ocupado) {
        this.asientos[fila][columna] = ocupado;
    }
}