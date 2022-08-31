package ejercicio_extra2.entidades;

public class Puntos {
    // Parametros
    private int x;
    private int y;

    // Getters y Setters
    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // toString
    @Override
    public String toString() {
        return "Puntos{" + "x=" + x + ", y=" + y + '}';
    }

    // Constructor por defecto
    public Puntos() {
    }

    // Constructor con parametros
    public Puntos(int x, int y) {
        this.x = x;
        this.y = y;
    }

}
