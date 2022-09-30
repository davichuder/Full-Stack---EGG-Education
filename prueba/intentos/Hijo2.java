package intentos;

public class Hijo2 extends Padre {
    public int atributo3;

    public Hijo2(int atributo1, int atributo3) {
        super(atributo1);
        this.atributo3 = atributo3;
    }

    public int getAtributo3() {
        return this.atributo3;
    }

    public void setAtributo3(int atributo3) {
        this.atributo3 = atributo3;
    }

    @Override
    public String toString() {
        return "{" +
                " atributo1='" + getAtributo1() + "'" +
                " atributo3='" + getAtributo3() + "'" +
                "}";
    }

    public void funcionHijo2() {
        System.out.println("funcionHijo2");
    }

}