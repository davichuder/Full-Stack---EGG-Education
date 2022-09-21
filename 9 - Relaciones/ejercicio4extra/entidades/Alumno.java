// una clase llamada Alumno con los siguientes atributos: 
// nombre completo, DNI y cantidad de votos.
package ejercicio4extra.entidades;

public class Alumno {
    public String nombre_completo;
    private int dni;
    private int cantidad_votos;

    public Alumno() {
    }

    public Alumno(String nombre_completo, int dni, int cantidad_votos) {
        this.nombre_completo = nombre_completo;
        this.dni = dni;
        this.cantidad_votos = cantidad_votos;
    }

    public Alumno(String nombre_completo, int dni) {
        this.nombre_completo = nombre_completo;
        this.dni = dni;
    }

    public String getNombre_completo() {
        return this.nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public int getDni() {
        return this.dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getCantidad_votos() {
        return this.cantidad_votos;
    }

    public void setCantidad_votos(int cantidad_votos) {
        this.cantidad_votos = cantidad_votos;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre_completo='" + getNombre_completo() + "'" +
                ", dni='" + getDni() + "'" +
                ", cantidad_votos='" + getCantidad_votos() + "'" +
                "}";
    }
}