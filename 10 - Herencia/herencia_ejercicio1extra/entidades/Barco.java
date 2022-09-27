// Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación.  
package herencia_ejercicio1extra.entidades;

public class Barco {
    public String matricula;
    public int eslora;
    private int año_fabricacion;

    public Barco() {
    }

    public Barco(String matricula, int eslora, int año_fabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.año_fabricacion = año_fabricacion;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return this.eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAño_fabricacion() {
        return this.año_fabricacion;
    }

    public void setAño_fabricacion(int año_fabricacion) {
        this.año_fabricacion = año_fabricacion;
    }

    @Override
    public String toString() {
        return "{" +
                " matricula='" + getMatricula() + "'" +
                ", eslora='" + getEslora() + "'" +
                ", año_fabricacion='" + getAño_fabricacion() + "'" +
                "}";
    }

    public int calcularModulo() {
        return 10 * this.eslora;
    }
}