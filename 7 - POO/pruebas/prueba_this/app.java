package pruebas.prueba_this;

public class app {
    public static void main(String[] args) {
        Clase1 c1 = new Clase1();
        Clase1 c2 = new Clase1();

        System.out.println(c1.getNumero1());
        System.out.println(c2.getNumero1());

        c1.setNumero1(2);

        System.out.println(c1.getNumero1());
        System.out.println(c2.getNumero1());
    }
}