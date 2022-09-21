// • Una vez hecho esto debemos generar una clase Voto, esta clase tendrá como atributos, 
// un objeto Alumno que será el alumno que vota y una lista de los alumnos a los que votó. 
package ejercicio4extra.entidades;

import java.util.ArrayList;

public class Voto {
    private Alumno alumno;
    private ArrayList<Alumno> votos;

    public Voto() {
    }

    public Voto(Alumno alumno, ArrayList<Alumno> votos) {
        this.alumno = alumno;
        this.votos = votos;
    }

    public Alumno getAlumno() {
        return this.alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Alumno> getVotos() {
        return this.votos;
    }

    public void setVotos(ArrayList<Alumno> votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "{" +
                " alumno='" + getAlumno() + "'" +
                ", votos='" + getVotos() + "'" +
                "}";
    }
}