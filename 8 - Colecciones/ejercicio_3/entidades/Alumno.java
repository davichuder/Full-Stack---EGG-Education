package ejercicio_3.entidades;

public class Alumno {
    private String nombre;
    private Integer[] notas;

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer[] getNotas() {
        return notas;
    }

    public void setNotas(Integer[] notas) {
        this.notas = notas;
    }

    // Constructor
    public Alumno(String nombre, Integer[] notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public Alumno() {
    }
}
