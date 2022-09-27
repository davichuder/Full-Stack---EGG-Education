// Electrodoméstico con los siguientes atributos: precio, color, 
// consumo energético (letras entre A y F) y peso.  
// Los constructores que se deben implementar son los siguientes: 
// • Un constructor vacío. 
// • Un constructor con todos los atributos pasados por parámetro. 
// Los métodos a implementar son:  
// • Métodos getters y setters de todos los atributos. 
// • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta, 
// sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el 
// objeto y no será visible. 
// • Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, 
// usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son 
// blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en 
// minúsculas. Este método se invocará al crear el objeto y no será visible.
// • Metodo crearElectrodomestico(): le pide la información al usuario y llena el 
// electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al 
// precio se le da un valor base de $1000. 
// • Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del 
// precio. Esta es la lista de precios: 
package herencia_ejercicio3.entidades;

import java.util.Scanner;

public class Electrodomestico {
    private Scanner scanner = new Scanner(System.in);
    protected float precio;
    protected String color;
    protected char consumo;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(float precio, String color, char consumo, int peso) {
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
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

    @Override
    public String toString() {
        return "{" +
                " precio='" + getPrecio() + "'" +
                ", color='" + getColor() + "'" +
                ", consumo='" + getConsumo() + "'" +
                ", peso='" + getPeso() + "'" +
                "}";
    }

    // • Método comprobarConsumoEnergetico(char letra): comprueba que la letra es
    // correcta, sino es correcta usara la letra F por defecto.
    // Este método se debe invocar al crear el objeto y no será visible.
    private void comprobarConsumoEnergetico(char letra) {
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E') {
            this.consumo = letra;
            return;
        }
        this.consumo = 'F';
    }

    // Método comprobarColor(String color): comprueba que el color es correcto, y si
    // no lo es,
    // usa el color blanco por defecto. Los colores disponibles para los
    // electrodomésticos son
    // blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas
    // o en minúsculas. Este método se invocará al crear el objeto y no será
    // visible.
    private void comprobarColor(String color) {
        String color_normalizado = color.toLowerCase();
        if (color_normalizado.equals("negro") ||
                color_normalizado.equals("rojo") ||
                color_normalizado.equals("azul") ||
                color_normalizado.equals("gris")) {
            this.color = color_normalizado;
            return;
        }
        this.color = "blanco";
    }

    // Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    // electrodoméstico, también llama los métodos para comprobar el color y el
    // consumo. Al precio se le da un valor base de $1000.
    public void crearElectrodomestico() {
        System.out.println("Ingrese letra de consumo energético");
        this.comprobarConsumoEnergetico(scanner.nextLine().charAt(0));
        System.out.println("Ingrese el color del electrodoméstico");
        this.comprobarColor(scanner.nextLine());
        System.out.println("Ingrese peso del electrodoméstico");
        this.peso = Integer.parseInt(scanner.nextLine());
        this.precio = 1000;
    }

    // Método precioFinal(): según el consumo energético y su tamaño, aumentará el
    // valor del precio. Esta es la lista de precios:
    public void precioFinal() {
        this.precio = this.precio +
                (this.consumo == 'A' ? 1000 : 0) +
                (this.consumo == 'B' ? 800 : 0) +
                (this.consumo == 'C' ? 600 : 0) +
                (this.consumo == 'D' ? 500 : 0) +
                (this.consumo == 'E' ? 300 : 0) +
                (this.consumo == 'F' ? 100 : 0) +
                (1 <= this.peso && this.peso <= 19 ? 100 : 0) +
                (20 <= this.peso && this.peso <= 49 ? 500 : 0) +
                (50 <= this.peso && this.peso <= 79 ? 800 : 0) +
                (80 <= this.peso ? 1000 : 0);
    }
}