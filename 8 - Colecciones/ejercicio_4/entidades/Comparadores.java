package ejercicio_4.entidades;

import java.util.Comparator;

public class Comparadores {
    public static Comparator<Pelicula> ordenarDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };
}
