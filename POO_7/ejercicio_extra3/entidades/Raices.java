package POO_7.ejercicio_extra3.entidades;

public class Raices {
    //Parametros
    private double a;
    private double b;
    private double c;

    //Getters y Setters
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getC() {
        return c;
    }
    public void setC(double c) {
        this.c = c;
    }

    //Constructor
    public Raices(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //Metodo getDiscriminante() = (b^2)-4*a*c  
    public double getDiscriminante() {return (Math.pow(b, 2) - (4 * a * c));}

    //Metodo tieneRaices()
    public boolean tieneRaices(){
        return (getDiscriminante() > 0);
    }

    //Metodo tieneRaiz()
    public boolean tieneRaiz(){
        return (getDiscriminante() == 0);
    }

    //Metodo obtenerRaices()
    public void obtenerRaices(){
        if (tieneRaices()){
            System.out.println("La primer raiz es: " + ((-b + Math.sqrt(getDiscriminante())) / (2 * a)));
            System.out.println("La segunda raiz es: " + ((-b - Math.sqrt(getDiscriminante())) / (2 * a)));
        } else {
            System.out.println("No tiene raices");
        }
    }

    //Metodo obtenerRaiz()
    public void obtenerRaiz(){
        if (tieneRaiz()){
            System.out.println("La raiz doble es: " + ((-b + Math.sqrt(getDiscriminante())) / (2 * a)));
        } else {
            System.out.println("No tiene raices");
        }
    }

    //Metodo calcular()
    public void calcular(){
        if (tieneRaices()){
            obtenerRaices();
        } else if (tieneRaiz()){
            obtenerRaiz();
        } else {
            System.out.println("No tiene raices");
        }
    }
}
