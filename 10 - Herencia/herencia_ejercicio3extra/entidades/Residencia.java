// Para las residencias se indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios y si posee o no campo deportivo. 
package herencia_ejercicio3extra.entidades;

public class Residencia extends ExtraHotelero {
    private int cantidad_habitaciones;
    private boolean descuentos;
    private boolean campo_deportivo;

    public Residencia(String nombre, String direccion, String localidad, String gerente, boolean privado,
            int metros_cuadrados, int cantidad_habitaciones, boolean descuentos, boolean campo_deportivo) {
        super(nombre, direccion, localidad, gerente, privado, metros_cuadrados);
        this.cantidad_habitaciones = cantidad_habitaciones;
        this.descuentos = descuentos;
        this.campo_deportivo = campo_deportivo;
    }

    public int getCantidad_habitaciones() {
        return cantidad_habitaciones;
    }

    public void setCantidad_habitaciones(int cantidad_habitaciones) {
        this.cantidad_habitaciones = cantidad_habitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public boolean isCampo_deportivo() {
        return campo_deportivo;
    }

    public void setCampo_deportivo(boolean campo_deportivo) {
        this.campo_deportivo = campo_deportivo;
    }

    @Override
    public String toString() {
        return "Residencia {" +
                " nombre='" + getNombre() + "'" +
                ", direccion='" + getDireccion() + "'" +
                ", localidad='" + getLocalidad() + "'" +
                ", gerente='" + getGerente() + "'" +
                " privado='" + isPrivado() + "'" +
                ", metros_cuadrados='" + getMetros_cuadrados() + "'" +
                " cantidad_habitaciones='" + getCantidad_habitaciones() + "'" +
                ", descuentos='" + isDescuentos() + "'" +
                ", campo_deportivo='" + isCampo_deportivo() + "'" +
                "}";
    }
}