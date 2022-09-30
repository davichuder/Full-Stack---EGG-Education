// • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o 
// Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.  
package herencia_ejercicio2extra.entitdades;

public class Polideportivo extends Edificio {
    public String nombre;
    public boolean techo;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techo, int ancho, int largo, int alto) {
        super(ancho, largo, alto);
        this.nombre = nombre;
        this.techo = techo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTecho() {
        return this.techo;
    }

    public boolean getTecho() {
        return this.techo;
    }

    public void setTecho(boolean techo) {
        this.techo = techo;
    }

    @Override
    public String toString() {
        return "{" +
                " ancho='" + getAncho() + "'" +
                " largo='" + getLargo() + "'" +
                " alto='" + getAlto() + "'" +
                " nombre='" + getNombre() + "'" +
                ", techo='" + isTecho() + "'" +
                "}";
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del polideportivo " + getNombre() + " es " + (getAncho() * getLargo()));
    }

    @Override
    public void calcularVolumen() {
        System.out.println(
                "El volumen del polideportivo " + getNombre() + " es " + (getAncho() * getLargo() * getAlto()));
    }
}
