package herencia_ejercicio2.entidades;

import java.util.Scanner;

public class Lavadora extends Electrodomestico {
    private Scanner scanner = new Scanner(System.in);
    protected int carga;

    public Lavadora() {
    }

    // Un constructor con la carga y el resto de los atributos heredados. Recuerda
    // que debes llamar al constructor de la clase padre.
    public Lavadora(float precio, String color, char consumo, int peso, int carga) {
        super(precio, color, consumo, peso);
        this.carga = carga;
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

    public int getCarga() {
        return this.carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "{" +
                " precio='" + getPrecio() + "'" +
                ", color='" + getColor() + "'" +
                ", consumo='" + getConsumo() + "'" +
                ", peso='" + getPeso() + "'" +
                ", carga='" + getCarga() + "'" +
                "}";
    }

    // Método crearLavadora (): este método llama a crearElectrodomestico() de la
    // clase padre,
    // lo utilizamos para llenar los atributos heredados del padre y después
    // llenamos el atributo propio de la lavadora.
    public void crearLavadora() {
        System.out.println("Creando lavadora");
        crearElectrodomestico();
        System.out.println("Ingrese la carga de la lavadora");
        this.carga = Integer.parseInt(scanner.nextLine());
    }

    // Método precioFinal(): este método será heredado y se le sumará la siguiente
    // funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en
    // $500, si la
    // carga es menor o igual, no se incrementará el precio. Este método debe llamar
    // al
    // método padre y añadir el código necesario. Recuerda que las condiciones que
    // hemos
    // visto en la clase Electrodoméstico también deben afectar al precio.
    @Override
    public void precioFinal() {
        super.precioFinal();
        precio = this.precio + ((30 < this.carga) ? 500 : 0);
    }
}
