package POO_7.ejercicio9.entidades;

public class Matematica {
    //Parametros
    private double numero1;
    private double numero2;

    //Getters y Setters
    public double getNumero1() {
        return this.numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return this.numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    //Constructor por defecto
    public Matematica() {}

    //Constructor parametrizado
    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //toString
    @Override
    public String toString() {
        return "Matematica{" +
                "numero1=" + numero1 +
                ", numero2=" + numero2 +
                '}';
    }

    //Metodo devolverMayor
    public double devolverMayor() {
        if (this.numero1 > this.numero2) {
            return this.numero1;
        } else {
            return this.numero2;
        }
    }

    //Metodo devolverMenor
    private double devolverMenor() {
        if (this.numero1 < this.numero2) {
            return this.numero1;
        } else {
            return this.numero2;
        }
    }

    //Metodo calcularPotencia
    public double calcularPotencia() {
        return Math.pow(Math.round(this.devolverMayor()), Math.round(devolverMenor()));
    }

    //Metodo calculaRaiz
    public double calculaRaiz() {
        return Math.sqrt(Math.abs(this.devolverMenor()));
    }
}
