// • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas 
// por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y 
// los atributos del padre.
// De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el 
// usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso 
// (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre 
// cuantas personas entrarían en un piso y cuantas en todo el edificio
package herencia_ejercicio2extra.entitdades;

public class EdificioDeOficinas extends Edificio {
    public int n_oficinas;
    public int n_personas_por_oficina;
    public int n_pisos;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(int ancho, int largo, int alto, int n_oficinas, int n_personas_por_oficina, int n_pisos) {
        super(ancho, largo, alto);
        this.n_oficinas = n_oficinas;
        this.n_personas_por_oficina = n_personas_por_oficina;
        this.n_pisos = n_pisos;
    }

    public int getN_oficinas() {
        return n_oficinas;
    }

    public void setN_oficinas(int n_oficinas) {
        this.n_oficinas = n_oficinas;
    }

    public int getN_personas_por_oficina() {
        return n_personas_por_oficina;
    }

    public void setN_personas_por_oficina(int n_personas_por_oficina) {
        this.n_personas_por_oficina = n_personas_por_oficina;
    }

    public int getN_pisos() {
        return n_pisos;
    }

    public void setN_pisos(int n_pisos) {
        this.n_pisos = n_pisos;
    }

    @Override
    public String toString() {
        return "{" +
                " ancho='" + getAncho() + "'" +
                ", largo='" + getLargo() + "'" +
                ", alto='" + getAlto() + "'" +
                " n_oficinas='" + getN_oficinas() + "'" +
                ", n_personas_por_oficina='" + getN_personas_por_oficina() + "'" +
                ", n_pisos='" + getN_pisos() + "'" +
                "}";
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("La superficie del edificio de oficinas es " + (getAncho() * getLargo()));
    }

    @Override
    public void calcularVolumen() {
        System.out.println(
                "El volumen del edificio de oficinas es " + (getAncho() * getLargo() * getAlto()));
    }

    public void cantPersonas() {
        System.out.println("En un piso de oficinas entran " + getN_personas_por_oficina() + " personas");
        System.out.println(
                "En todo el edificion entran " + (getN_oficinas() * getN_personas_por_oficina()) + " personas");
    }
}
