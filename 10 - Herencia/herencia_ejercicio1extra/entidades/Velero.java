// Número de mástiles para veleros.
package herencia_ejercicio1extra.entidades;

public class Velero extends Barco {
    public int mastiles;

    public Velero() {
    }

    public Velero(String matricula, int eslora, int año_fabricacion, int mastiles) {
        super(matricula, eslora, año_fabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return this.mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public String toString() {
        return "{" +
                " matricula='" + getMatricula() + "'" +
                ", eslora='" + getEslora() + "'" +
                ", año_fabricacion='" + getAño_fabricacion() + "'" +
                " mastiles='" + getMastiles() + "'" +
                "}";
    }

    @Override
    public int calcularModulo() {
        return this.mastiles + super.calcularModulo();
    }
}
