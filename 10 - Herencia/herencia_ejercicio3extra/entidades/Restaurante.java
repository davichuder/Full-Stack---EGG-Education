// Nombre del Restaurante, Capacidad del Restaurante
package herencia_ejercicio3extra.entidades;

public class Restaurante {
    public String nombre;
    private int capacidad;

    public Restaurante(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return this.capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Restaurante {" +
                " nombre='" + getNombre() + "'" +
                ", capacidad='" + getCapacidad() + "'" +
                "}";
    }

    // $10 si la capacidad del restaurante es de menos de 30 personas.
    // • $30 si está entre 30 y 50 personas.
    // • $50 si es mayor de 50
    public int calcularValorAgregado() {
        if (this.capacidad < 30)
            return 10;
        if (30 <= this.capacidad && this.capacidad <= 50)
            return 30;
        return 50;
    }
}