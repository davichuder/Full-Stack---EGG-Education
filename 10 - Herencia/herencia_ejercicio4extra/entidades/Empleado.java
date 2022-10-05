// Con respecto a los empleados, sean del tipo que sean, hay que saber su año de 
// incorporación a la facultad y qué número de despacho tienen asignado. 
package herencia_ejercicio4extra.entidades;

import herencia_ejercicio4extra.enums.EstadoCivil;

public class Empleado extends Persona {
    protected int año_incorporacion;
    protected int n_despacho;

    public Empleado(String nombre, String apellido, int documento, EstadoCivil estado_civil, int año_incorporacion,
            int n_despacho) {
        super(nombre, apellido, documento, estado_civil);
        this.año_incorporacion = año_incorporacion;
        this.n_despacho = n_despacho;
    }

    public int getAño_incorporacion() {
        return año_incorporacion;
    }

    public void setAño_incorporacion(int año_incorporacion) {
        this.año_incorporacion = año_incorporacion;
    }

    public int getN_despacho() {
        return n_despacho;
    }

    public void setN_despacho(int n_despacho) {
        this.n_despacho = n_despacho;
    }
}
