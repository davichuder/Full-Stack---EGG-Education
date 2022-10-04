// Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de 
// Pisos, Precio de Habitaciones. Y estos pueden ser de cuatro o cinco estrellas.
package herencia_ejercicio3extra.entidades;

public class Hotel extends Alojamiento {
    protected int cantidad_habitaciones;
    protected int n_camas;
    protected int cantidad_pisos;
    public Integer precio_habitacion;

    public Hotel(String nombre, String direccion, String localidad, String gerente, int cantidad_habitaciones,
            int n_camas, int cantidad_pisos) {
        super(nombre, direccion, localidad, gerente);
        this.cantidad_habitaciones = cantidad_habitaciones;
        this.n_camas = n_camas;
        this.cantidad_pisos = cantidad_pisos;
    }

    public int getCantidad_habitaciones() {
        return cantidad_habitaciones;
    }

    public void setCantidad_habitaciones(int cantidad_habitaciones) {
        this.cantidad_habitaciones = cantidad_habitaciones;
    }

    public int getN_camas() {
        return n_camas;
    }

    public void setN_camas(int n_camas) {
        this.n_camas = n_camas;
    }

    public int getCantidad_pisos() {
        return cantidad_pisos;
    }

    public void setCantidad_pisos(int cantidad_pisos) {
        this.cantidad_pisos = cantidad_pisos;
    }

    public Integer getPrecio_habitacion() {
        return precio_habitacion;
    }

    public void setPrecio_habitacion(int precio_habitacion) {
        this.precio_habitacion = precio_habitacion;
    }

    @Override
    public String toString() {
        return "Hotel {" +
                " nombre='" + getNombre() + "'" +
                ", direccion='" + getDireccion() + "'" +
                ", localidad='" + getLocalidad() + "'" +
                ", gerente='" + getGerente() + "'" +
                " cantidad_habitaciones='" + getCantidad_habitaciones() + "'" +
                ", n_camas='" + getN_camas() + "'" +
                ", cantidad_pisos='" + getCantidad_pisos() + "'" +
                ", precio_habitacion='" + getPrecio_habitacion() + "'" +
                "}";
    }

    // PrecioHabitación = $50 + ($1 x capacidad del hotel)
    public void calcularPrecio_habitacion() {
        this.precio_habitacion = 50 + this.cantidad_pisos * this.cantidad_habitaciones * this.n_camas;
    }
}