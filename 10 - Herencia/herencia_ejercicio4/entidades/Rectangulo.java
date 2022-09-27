package herencia_ejercicio4.entidades;

import herencia_ejercicio4.interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {
    public float base;
    public float altura;

    public Rectangulo() {
    }

    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void calcularPerimetro() {
        float perimetro = 2 * this.base + 2 * this.altura;
        System.out.println("El perimetro del cuadrado es: " + perimetro);
    }

    @Override
    public void calcularArea() {
        float area = this.base * this.altura;
        System.out.println("El area del rectangulo es: " + area);
    }

}
