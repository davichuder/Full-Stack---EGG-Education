// Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños 
// disponibles y si posee o no un restaurante dentro de las instalaciones. 
package herencia_ejercicio3extra.entidades;

public class Camping extends ExtraHotelero {
    private int cantidad_maxima_carpas;
    private int cantidad_baños;
    private boolean restaurante;

    public Camping(String nombre, String direccion, String localidad, String gerente, boolean privado,
            int metros_cuadrados, int cantidad_maxima_carpas, int cantidad_baños, boolean restaurante) {
        super(nombre, direccion, localidad, gerente, privado, metros_cuadrados);
        this.cantidad_maxima_carpas = cantidad_maxima_carpas;
        this.cantidad_baños = cantidad_baños;
        this.restaurante = restaurante;
    }

    public int getCantidad_maxima_carpas() {
        return cantidad_maxima_carpas;
    }

    public void setCantidad_maxima_carpas(int cantidad_maxima_carpas) {
        this.cantidad_maxima_carpas = cantidad_maxima_carpas;
    }

    public int getCantidad_baños() {
        return cantidad_baños;
    }

    public void setCantidad_baños(int cantidad_baños) {
        this.cantidad_baños = cantidad_baños;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public String toString() {
        return "Camping {" +
                " nombre='" + getNombre() + "'" +
                ", direccion='" + getDireccion() + "'" +
                ", localidad='" + getLocalidad() + "'" +
                ", gerente='" + getGerente() + "'" +
                " privado='" + isPrivado() + "'" +
                ", metros_cuadrados='" + getMetros_cuadrados() + "'" +
                " cantidad_maxima_carpas='" + getCantidad_maxima_carpas() + "'" +
                ", cantidad_baños='" + getCantidad_baños() + "'" +
                ", restaurante='" + isRestaurante() + "'" +
                "}";
    }
}
