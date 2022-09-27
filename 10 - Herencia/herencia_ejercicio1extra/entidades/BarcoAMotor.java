// Potencia en CV para barcos a motor. 
package herencia_ejercicio1extra.entidades;

public class BarcoAMotor extends Barco {
    private int cv;

    public BarcoAMotor() {
    }

    public BarcoAMotor(String matricula, int eslora, int año_fabricacion, int cv) {
        super(matricula, eslora, año_fabricacion);
        this.cv = cv;
    }

    public int getCv() {
        return this.cv;
    }

    public void setCv(int cv) {
        this.cv = cv;
    }

    @Override
    public String toString() {
        return "{" +
                " matricula='" + getMatricula() + "'" +
                ", eslora='" + getEslora() + "'" +
                ", año_fabricacion='" + getAño_fabricacion() + "'" +
                " cv='" + getCv() + "'" +
                "}";
    }

    @Override
    public int calcularModulo() {
        return this.cv + super.calcularModulo();
    }
}