// Potencia en CV y número de camarotes para yates de lujo. 
package herencia_ejercicio1extra.entidades;

public class YateDeLujo extends BarcoAMotor {
    private int camarotes;

    public YateDeLujo() {
    }

    public YateDeLujo(String matricula, int eslora, int año_fabricacion, int cv, int camarotes) {
        super(matricula, eslora, año_fabricacion, cv);
        this.camarotes = camarotes;
    }

    public int getCamarotes() {
        return this.camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    @Override
    public String toString() {
        return "{" +
                " matricula='" + getMatricula() + "'" +
                ", eslora='" + getEslora() + "'" +
                ", año_fabricacion='" + getAño_fabricacion() + "'" +
                " cv='" + getCv() + "'" +
                " camarotes='" + getCamarotes() + "'" +
                "}";
    }

    @Override
    public int calcularModulo() {
        return this.camarotes + super.calcularModulo();
    }
}