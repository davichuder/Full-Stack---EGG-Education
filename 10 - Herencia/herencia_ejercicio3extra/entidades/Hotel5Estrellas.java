// Hotel ***** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio, 
// Nombre del Restaurante, Capacidad del Restaurante, Cantidad Salones de 
// Conferencia, Cantidad de Suites, Cantidad de Limosinas, Precio de las Habitaciones. 
package herencia_ejercicio3extra.entidades;

public class Hotel5Estrellas extends Hotel4Estrellas {
    private int cantidad_salon_conferencias;
    private int cantidad_suites;
    private int cantidad_limusinas;

    public Hotel5Estrellas(String nombre, String direccion, String localidad, String gerente, int cantidad_habitaciones,
            int n_camas, int cantidad_pisos, Gimnasio gimnasio, Restaurante restaurante,
            int cantidad_salon_conferencias, int cantidad_suites, int cantidad_limusinas) {
        super(nombre, direccion, localidad, gerente, cantidad_habitaciones, n_camas, cantidad_pisos,
                gimnasio, restaurante);
        this.cantidad_salon_conferencias = cantidad_salon_conferencias;
        this.cantidad_suites = cantidad_suites;
        this.cantidad_limusinas = cantidad_limusinas;
    }

    public int getCantidad_salon_conferencias() {
        return cantidad_salon_conferencias;
    }

    public void setCantidad_salon_conferencias(int cantidad_salon_conferencias) {
        this.cantidad_salon_conferencias = cantidad_salon_conferencias;
    }

    public int getCantidad_suites() {
        return cantidad_suites;
    }

    public void setCantidad_suites(int cantidad_suites) {
        this.cantidad_suites = cantidad_suites;
    }

    public int getCantidad_limusinas() {
        return cantidad_limusinas;
    }

    public void setCantidad_limusinas(int cantidad_limusinas) {
        this.cantidad_limusinas = cantidad_limusinas;
    }

    @Override
    public String toString() {
        return "Hotel 5 Estrellas{" +
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
                " cantidad_conferencias='" + getCantidad_salon_conferencias() + "'" +
                ", cantidad_suites='" + getCantidad_suites() + "'" +
                ", cantidad_limusinas='" + getCantidad_limusinas() + "'" +
                "}";
    }

    // PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por
    // restaurante) + (valor
    // agregado por gimnasio) + (valor agregado por limosinas).
    @Override
    public void calcularPrecio_habitacion() {
        super.calcularPrecio_habitacion();
        this.precio_habitacion = this.precio_habitacion + 15 * this.cantidad_limusinas;
    }
}