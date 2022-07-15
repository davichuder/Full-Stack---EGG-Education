package POO_7.ejercicio3.entidades;

public class Operacion {
    //Parametros
    //numero1, numero 2
    private float numero1;
    private float numero2;

    //Getters y Setters
    public float getNumero1() {
        return this.numero1;
    }

    public void setNumero1(float numero1) {
        this.numero1 = numero1;
    }

    public float getNumero2() {
        return this.numero2;
    }

    public void setNumero2(float numero2) {
        this.numero2 = numero2;
    }

    
    //Constructor por defecto
    public Operacion() {}

    //Constructor completo
    public Operacion(float numero1, float numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //toString
    @Override
    public String toString(){return "numero1: " + numero1 + ", numero2: " + numero2;}

    //Metodo crearOperacion
    public void crearOperacion() {
        System.out.println("Introduce el primer numero");
        this.numero1 = Float.parseFloat(System.console().readLine());
        System.out.println("Introduce el segundo numero");
        this.numero2 = Float.parseFloat(System.console().readLine());
    }

    //Metodo sumar
    public float sumar() {return this.numero1 + this.numero2;}

    //Metodo restar
    public float restar() {return this.numero1 - this.numero2;}

    //Metodo multiplicar
    public float multiplicar() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Se esta multiplicando por cero");
            return 0;
        } else {
            return this.numero1 * this.numero2;
        }
    }

    //Metodo dividir
    public float dividir() {
        if (this.numero1 == 0 || this.numero2 == 0) {
            System.out.println("Se esta dividiendo por cero");
            return 0;
        } else {
            return this.numero1 / this.numero2;
        }
    }
}
