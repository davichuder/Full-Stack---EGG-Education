package intentos;

public class Padre {
    public int atributo1;

    public Padre() {
    }

    public Padre(int atributo1) {
        this.atributo1 = atributo1;
    }

    @Override
    public String toString() {
        return "{" +
                " atributo1='" + getAtributo1() + "'" +
                "}";
    }

    public int getAtributo1() {
        return this.atributo1;
    }

    public void setAtributo1(int atributo1) {
        this.atributo1 = atributo1;
    }

    public void funcionPAdre() {

    }

}