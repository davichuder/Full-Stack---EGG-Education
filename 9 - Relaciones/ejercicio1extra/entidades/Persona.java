package ejercicio1extra.entidades;

public class Persona {
    // Atributos
    public String nombre;
    public String apellido;
    private int edad;
    private int documento;
    private Perro perro;

    // Constructor
    public Persona(String nombre, String apellido, int edad, int documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public Persona(String nombre, String apellido, int edad, int documento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }

    public Persona() {
    }

    // Getters and setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDocumento() {
        return this.documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Perro getPerro() {
        return this.perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    // toString
    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", apellido='" + getApellido() + "'" +
                ", edad='" + getEdad() + "'" +
                ", documento='" + getDocumento() + "'" +
                ", perro='" + getPerro() + "'" +
                "}";
    }

}