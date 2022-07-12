package POO_7.app_tinder_de_mascotas;

public class Mascota {
    // atributos
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;

    // setters y getters
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApodo() {
        return this.apodo;
    }
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getEdad() {
        return this.edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public boolean isCola() {
        return this.cola;
    }
    public void setCola(boolean cola) {
        this.cola = cola;
    }
    public String getRaza() {
        return this.raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    // constructores
    public Mascota(){}

    public Mascota(String nombre, String apodo, String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
    }
    
    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza){
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }

    // to string
    public String toString(){
        return "Nombre: "+this.nombre+"\nApodo: "+this.apodo+"\nTipo: "+this.tipo+"\nColor: "+this.color+"\nEdad: "+this.edad+"\nCola: "+this.cola+"\nRaza: "+this.raza;
    }

    
}