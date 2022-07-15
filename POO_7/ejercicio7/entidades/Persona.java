package POO_7.ejercicio7.entidades;

public class Persona {
    //Parametros
    //nombre, edad, sexo, peso y altura
    private String nombre;
    private int edad;
    private char sexo;
    private float peso;
    private float altura;

    //Getters y Setters
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //Constructor por defecto
    public Persona() {}

    //Constructor completo
    public Persona(String nombre, int edad, char sexo, float peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //toString
    @Override
    public String toString(){return "nombre: " + this.nombre + " edad: " + this.edad + " sexo: " + this.sexo + " peso: " + this.peso + " altura: " + this.altura;}

    //Funcion de IMC
    public float calcularIMC() {
        float imc = this.peso / (this.altura * this.altura);
        System.out.println(this.nombre+" >>> IMC: "+imc);
        if (imc<20){return -1;}
        else if (imc>25){return 1;}
        else {return 0;}
    }

    //Funcion mayor de edad
    public boolean esMayorDeEdad() {return this.edad >= 18;}
    
}
