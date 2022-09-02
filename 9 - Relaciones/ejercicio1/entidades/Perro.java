package ejercicio1.entidades;

public class Perro {
    // Atributos
    private String nombre;
    private String raza;
    private int edad;
    private float tamaño;

    // Constructor
    public Perro() {
    }

    public Perro(String nombre, String raza, int edad, float tamaño) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamaño = tamaño;
    }

    // Getters and setters

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getTamaño() {
        return this.tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    // toString
    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", raza='" + getRaza() + "'" +
                ", edad='" + getEdad() + "'" +
                ", tamaño='" + getTamaño() + "'" +
                "}";
    }

}
