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
package herencia_ejercicio2.entidades;

import herencia_ejercicio2.enums.Color;
import herencia_ejercicio2.enums.ConsumoEnergetico;

public class Electrodomestico {
    protected float precio;
    protected Color color;
    protected ConsumoEnergetico consumo;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(float precio, Color color, ConsumoEnergetico consumo, int peso) {
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

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ConsumoEnergetico getConsumo() {
        return this.consumo;
    }

    public void setConsumo(ConsumoEnergetico consumo) {
        this.consumo = consumo;
    }

    public int getPeso() {
        return this.peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

}