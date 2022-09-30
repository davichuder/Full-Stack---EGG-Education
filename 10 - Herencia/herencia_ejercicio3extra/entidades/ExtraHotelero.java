// Por cada Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros cuadrados que ocupa. 
package herencia_ejercicio3extra.entidades;

public class ExtraHotelero extends Alojamiento {
    public boolean privado;
    protected int metros_cuadrados;

    public ExtraHotelero(String nombre, String direccion, String localidad, String gerente, boolean privado,
            int metros_cuadrados) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.metros_cuadrados = metros_cuadrados;
    }

    public boolean isPrivado() {
        return this.privado;
    }

    public boolean getPrivado() {
        return this.privado;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public int getMetros_cuadrados() {
        return this.metros_cuadrados;
    }

    public void setMetros_cuadrados(int metros_cuadrados) {
        this.metros_cuadrados = metros_cuadrados;
    }

    @Override
    public String toString() {
        return "ExtraHotelero {" +
                " nombre='" + getNombre() + "'" +
                ", direccion='" + getDireccion() + "'" +
                ", localidad='" + getLocalidad() + "'" +
                ", gerente='" + getGerente() + "'" +
                " privado='" + isPrivado() + "'" +
                ", metros_cuadrados='" + getMetros_cuadrados() + "'" +
                "}";
    }

}
