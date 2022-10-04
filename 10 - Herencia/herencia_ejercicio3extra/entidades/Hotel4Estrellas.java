// Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
// Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones. 
package herencia_ejercicio3extra.entidades;

public class Hotel4Estrellas extends Hotel {
    protected Gimnasio gimnasio;
    public Restaurante restaurante;

    public Hotel4Estrellas(String nombre, String direccion, String localidad, String gerente, int cantidad_habitaciones,
            int n_camas, int cantidad_pisos, Gimnasio gimnasio, Restaurante restaurante) {
        super(nombre, direccion, localidad, gerente, cantidad_habitaciones, n_camas, cantidad_pisos);
        this.gimnasio = gimnasio;
        this.restaurante = restaurante;
    }

    public Gimnasio getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(Gimnasio gimnasio) {
        this.gimnasio = gimnasio;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Hotel 4 Estrellas {" +
                " nombre='" + getNombre() + "'" +
                ", direccion='" + getDireccion() + "'" +
                ", localidad='" + getLocalidad() + "'" +
                ", gerente='" + getGerente() + "'" +
                " cantidad_habitaciones='" + getCantidad_habitaciones() + "'" +
                ", n_camas='" + getN_camas() + "'" +
                ", cantidad_pisos='" + getCantidad_pisos() + "'" +
                ", precio_habitacion='" + getPrecio_habitacion() + "'" +
                " gimnasio='" + getGimnasio() + "'" +
                ", restaurante='" + getRestaurante() + "'" +
                "}";
    }

    // PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
    // restaurante) + (valor agregado por gimnasio)
    @Override
    public void calcularPrecio_habitacion() {
        super.calcularPrecio_habitacion();
        this.precio_habitacion = this.precio_habitacion + this.restaurante.calcularValorAgregado()
                + this.gimnasio.calcularValorAgregado();
    }
}