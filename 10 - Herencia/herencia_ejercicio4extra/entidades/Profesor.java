// Por lo que se refiere a los profesores, es necesario gestionar a qué departamento 
// pertenecen (lenguajes, matemáticas, arquitectura, ...).
package herencia_ejercicio4extra.entidades;

import herencia_ejercicio4extra.enums.Departamento;
import herencia_ejercicio4extra.enums.EstadoCivil;

public class Profesor extends Empleado {
    private Departamento departamento;

    public Profesor(String nombre, String apellido, int documento, EstadoCivil estado_civil, int año_incorporacion,
            int n_despacho, Departamento departamento) {
        super(nombre, apellido, documento, estado_civil, año_incorporacion, n_despacho);
        this.departamento = departamento;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Profesor {" +
                " nombre='" + getNombre() + "'" +
                ", apellido='" + getApellido() + "'" +
                ", documento='" + getDocumento() + "'" +
                ", estado_civil='" + getEstado_civil() + "'" +
                " año_incorporacion='" + getAño_incorporacion() + "'" +
                ", n_despacho='" + getN_despacho() + "'" +
                " departamento='" + getDepartamento() + "'" +
                "}";
    }
}