// En cuanto a los estudiantes, se requiere almacenar el curso en el que están matriculados.
package herencia_ejercicio4extra.entidades;

import herencia_ejercicio4extra.enums.EstadoCivil;

public class Estudiante extends Persona {
    private String curso;

    public Estudiante(String nombre, String apellido, int documento, EstadoCivil estado_civil, String curso) {
        super(nombre, apellido, documento, estado_civil);
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "Estudiante {" +
                " nombre='" + getNombre() + "'" +
                ", apellido='" + getApellido() + "'" +
                ", documento='" + getDocumento() + "'" +
                ", estado_civil='" + getEstado_civil() + "'" +
                " curso='" + getCurso() + "'" +
                "}";
    }
}
