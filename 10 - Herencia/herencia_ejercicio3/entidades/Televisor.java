package herencia_ejercicio3.entidades;

import java.util.Scanner;

public class Televisor extends Electrodomestico {
    private Scanner scanner = new Scanner(System.in);
    protected int resolucion;
    protected boolean sintonizador;

    public Televisor() {
    }

    // Un constructor con la resolución, sintonizador TDT y el resto de los
    // atributos heredados.
    // Recuerda que debes llamar al constructor de la clase padre.
    public Televisor(float precio, String color, char consumo, int peso, int resolucion, boolean sintonizador) {
        super(precio, color, consumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return this.consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getResolucion() {
        return this.resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    @Override
    public String toString() {
        return "Televisor {" +
                " precio='" + getPrecio() + "'" +
                ", color='" + getColor() + "'" +
                ", consumo='" + getConsumo() + "'" +
                ", peso='" + getPeso() + "'" +
                ", resolución='" + getResolucion() + "'" +
                "}";
    }

    // Método crearTelevisor(): este método llama a crearElectrodomestico() de la
    // clase
    // padre, lo utilizamos para llenar los atributos heredados del padre y después
    // llenamos los atributos del televisor
    public void crearTelevisor() {
        System.out.println("Creando televisor");
        crearElectrodomestico();
        System.out.println("Ingrese la resolucion del televisor");
        this.resolucion = Integer.parseInt(scanner.nextLine());
        System.out.println("Tiene sintonizador TVT (true - false)");
        this.sintonizador = scanner.nextBoolean();
    }

    // Método precioFinal(): este método será heredado y se le sumará la siguiente
    // funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    // incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
    // aumentará $500.
    // Recuerda que las condiciones que hemos visto en la clase
    // Electrodomestico también deben afectar al precio.
    @Override
    public void precioFinal() {
        super.precioFinal();
        precio = (float) (this.precio +
                (this.resolucion > 40 ? this.precio * 0.3 : 0) +
                (this.sintonizador ? 500 : 0));
    }
}
