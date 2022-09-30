package herencia_ejercicio2extra.entitdades;

public abstract class Edificio {
    public int ancho;
    public int largo;
    public int alto;

    public Edificio() {
    }

    public Edificio(int ancho, int largo, int alto) {
        this.ancho = ancho;
        this.largo = largo;
        this.alto = alto;
    }

    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();

    public int getAncho() {
        return this.ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getLargo() {
        return this.largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAlto() {
        return this.alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    @Override
    public String toString() {
        return "{" +
                " ancho='" + getAncho() + "'" +
                ", largo='" + getLargo() + "'" +
                ", alto='" + getAlto() + "'" +
                "}";
    }
}