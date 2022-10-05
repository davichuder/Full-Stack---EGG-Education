// Sobre el personal de servicio, hay que conocer a qué sección están asignados 
// (biblioteca, decanato, secretaría, ...).
package herencia_ejercicio4extra.entidades;

import herencia_ejercicio4extra.enums.EstadoCivil;
import herencia_ejercicio4extra.enums.Seccion;

public class PersonalDeServicio extends Empleado {
    private Seccion seccion;

    public PersonalDeServicio(String nombre, String apellido, int documento, EstadoCivil estado_civil,
            int año_incorporacion, int n_despacho, Seccion seccion) {
        super(nombre, apellido, documento, estado_civil, año_incorporacion, n_despacho);
        this.seccion = seccion;
    }

    public Seccion getSeccion() {
        return seccion;
    }

    public void setSeccion(Seccion seccion) {
        this.seccion = seccion;
    }

    @Override
    public String toString() {
        return "PersonalDeServicio {" +
                " nombre='" + getNombre() + "'" +
                ", apellido='" + getApellido() + "'" +
                ", documento='" + getDocumento() + "'" +
                ", estado_civil='" + getEstado_civil() + "'" +
                " año_incorporacion='" + getAño_incorporacion() + "'" +
                ", n_despacho='" + getN_despacho() + "'" +
                " seccion='" + getSeccion() + "'" +
                "}";
    }
}