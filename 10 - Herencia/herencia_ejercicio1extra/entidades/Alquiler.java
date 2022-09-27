// Para cada Alquiler se guarda: el 
// nombre, documento del cliente, la fecha de alquiler, fecha de devolución, la posición del 
// amarre y el barco que lo ocupará.
package herencia_ejercicio1extra.entidades;

import java.util.Calendar;

public class Alquiler {
    private String nombre;
    private int documento;
    private Calendar fecha_inicio;
    private Calendar fecha_fin;
    private int posición_amarre;
    private Barco barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, int documento, Calendar fecha_inicio, Calendar fecha_fin, int posición_amarre,
            Barco barco) {
        this.nombre = nombre;
        this.documento = documento;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.posición_amarre = posición_amarre;
        this.barco = barco;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDocumento() {
        return this.documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Calendar getFecha_inicio() {
        return this.fecha_inicio;
    }

    public void setFecha_inicio(Calendar fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public Calendar getFecha_fin() {
        return this.fecha_fin;
    }

    public void setFecha_fin(Calendar fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public int getPosición_amarre() {
        return this.posición_amarre;
    }

    public void setPosición_amarre(int posición_amarre) {
        this.posición_amarre = posición_amarre;
    }

    public Barco getBarco() {
        return this.barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", documento='" + getDocumento() + "'" +
                ", fecha_inicio='" + getFecha_inicio() + "'" +
                ", fecha_fin='" + getFecha_fin() + "'" +
                ", posición_amarre='" + getPosición_amarre() + "'" +
                ", barco='" + getBarco() + "'" +
                "}";
    }
}