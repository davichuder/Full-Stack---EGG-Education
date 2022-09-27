package herencia_ejercicio1extra.entidades;

import java.util.concurrent.TimeUnit;

public class Amarre {
    public int ubicacion;
    private Integer precio;
    private Alquiler alquiler;

    public Amarre() {
    }

    public Amarre(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    public Amarre(Alquiler alquiler) {
        this.setAlquiler(alquiler);
    }

    public Integer getPrecio() {
        return this.precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Alquiler getAlquiler() {
        return this.alquiler;
    }

    public void setAlquiler(Alquiler alquiler) {
        this.alquiler = alquiler;

        int modulo = this.alquiler.getBarco().calcularModulo();
        long milisegundos = this.alquiler.getFecha_fin().getTimeInMillis()
                - this.alquiler.getFecha_inicio().getTimeInMillis();
        int dias = (int) TimeUnit.MILLISECONDS.toDays(milisegundos);

        this.precio = dias * modulo;
    }

    public int getUbicacion() {
        return this.ubicacion;
    }

    public void setUbicacion(int ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "{" +
                " ubicacion='" + getUbicacion() + "'" +
                ", precio='" + getPrecio() + "'" +
                ", alquiler='" + getAlquiler() + "'" +
                "}";
    }

    public void desalojarAmarre() {
        this.precio = null;
        this.alquiler = null;
    }
}