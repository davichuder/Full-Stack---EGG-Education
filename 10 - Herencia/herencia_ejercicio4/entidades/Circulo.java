package herencia_ejercicio4.entidades;

import herencia_ejercicio4.interfaces.calculosFormas;

public class Circulo implements calculosFormas {
    public int radio;

    public Circulo() {
    }

    public Circulo(int radio) {
        this.radio = radio;
    }

    @Override
    public void calcularPerimetro() {
        float perimetro = 2 * PI * this.radio;
        System.out.println("El perimetro del circulo es: " + perimetro);
    }

    @Override
    public void calcularArea() {
        float area = PI * this.radio * this.radio;
        System.out.println("El area del circulo es: " + area);
    }

}
