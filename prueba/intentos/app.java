package intentos;

import java.util.ArrayList;

public class app {
    public static void main(String[] args) {
        ArrayList<Padre> lista = new ArrayList<Padre>();
        lista.add(new Hijo1(1, 2));
        lista.add(new Hijo2(3, 4));

        for (Padre aux : lista) {
            System.out.println(aux.getClass());
        }

        Hijo1 hijo1 = (Hijo1) lista.get(0);

        for (Padre posicion : lista) {
            if (posicion instanceof Hijo1) {
                ((Hijo1) posicion).funcionHijo1();
            }
            if (posicion instanceof Hijo2) {
                ((Hijo2) posicion).funcionHijo2();
            }
        }
    }
}
