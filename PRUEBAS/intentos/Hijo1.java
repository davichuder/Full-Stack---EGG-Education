package intentos;

public class Hijo1 extends Padre {
    public int atributo2;

    public Hijo1(int atributo1, int atributo2) {
        super(atributo1);
        this.atributo2 = atributo2;
    }

    public int getAtributo2() {
        return this.atributo2;
    }

    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }

    @Override
    public String toString() {
        return "{" +
                " atributo1='" + getAtributo1() + "'" +
                " atributo2='" + getAtributo2() + "'" +
                "}";
    }

    public void funcionHijo1() {
        System.out.println("funcionHijo1");
    }

}
