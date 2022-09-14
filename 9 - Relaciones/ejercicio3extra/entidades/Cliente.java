// Nombre y apellido, documento, mail, domicilio, teléfono.  
package ejercicio3extra.entidades;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private String apellido;
    private int documento;
    private String email;
    private String domicilio;
    private String telefono;

    public Cliente(String nombre, String apellido, int documento, String email, String domicilio, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.domicilio = domicilio;
        this.telefono = telefono;
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

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDomicilio() {
        return this.domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "{" +
                " nombre='" + getNombre() + "'" +
                ", apellido='" + getApellido() + "'" +
                ", documento='" + getDocumento() + "'" +
                ", email='" + getEmail() + "'" +
                ", domicilio='" + getDomicilio() + "'" +
                ", telefono='" + getTelefono() + "'" +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) o;
        return Objects.equals(documento, cliente.documento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(documento);
    }
}