// Por cada persona, se debe conocer, al menos, su nombre y apellidos, su número de 
// identificación y su estado civil.
package herencia_ejercicio4extra.entidades;

import herencia_ejercicio4extra.enums.EstadoCivil;

public class Persona {
    protected String nombre;
    protected String apellido;
    protected int documento;
    protected EstadoCivil estado_civil;

    public Persona(String nombre, String apellido, int documento, EstadoCivil estado_civil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.estado_civil = estado_civil;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return this.documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public EstadoCivil getEstado_civil() {
        return this.estado_civil;
    }

    public void setEstado_civil(EstadoCivil estado_civil) {
        this.estado_civil = estado_civil;
    }
}
