package herencia_ejercicio1.entidades;

public class Perro extends Animal {
    protected String alimento;
    protected String raza;

    public Perro(String nombre, String alimento, int edad, String raza) {
        super(nombre, edad);
        this.alimento = alimento;
        this.raza = raza;
    }

    @Override
    public void alimentarse() {
        System.out.println("El perro " + this.nombre + " se alimenta de " + this.alimento);
    }
}
