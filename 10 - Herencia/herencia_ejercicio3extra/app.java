package herencia_ejercicio3extra;

import java.util.ArrayList;

import herencia_ejercicio3extra.entidades.Alojamiento;
import herencia_ejercicio3extra.entidades.Menu;
import herencia_ejercicio3extra.enums.ClaseGimnasio;

import herencia_ejercicio3extra.entidades.Camping;
import herencia_ejercicio3extra.entidades.Gimnasio;
import herencia_ejercicio3extra.entidades.Restaurante;
import herencia_ejercicio3extra.entidades.Hotel4Estrellas;
import herencia_ejercicio3extra.entidades.Hotel5Estrellas;
import herencia_ejercicio3extra.entidades.Residencia;

public class app {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("Lorenzo", 10);
        Gimnasio gimnasio = new Gimnasio(ClaseGimnasio.A);

        Hotel4Estrellas hotel4estrellas = new Hotel4Estrellas("Prexey", "Moreno 375",
                "Ezeiza", "Fabian Morales", 10, 3,
                5, gimnasio, restaurante);
        hotel4estrellas.calcularPrecio_habitacion();

        Hotel5Estrellas hotel5estrellas = new Hotel5Estrellas("Prexey2", "Perito 375",
                "Ezeiza", "Fabian Morales", 10, 3, 5,
                new Gimnasio(ClaseGimnasio.A), new Restaurante("Lorenzo", 10), 1, 10, 10);
        hotel5estrellas.calcularPrecio_habitacion();

        Camping camping = new Camping("Prexey4", "Curuzu", "Ezeiza",
                "Fabian Morales", true,
                200, 100, 3, true);

        Residencia residencia = new Residencia("Prexey5", "Cuatia",
                "Ezeiza", "Fabian Morales", true,
                200, 100, false, true);

        ArrayList<Alojamiento> alojamientos = new ArrayList<Alojamiento>();
        alojamientos.add(hotel4estrellas);
        alojamientos.add(hotel5estrellas);
        alojamientos.add(camping);
        alojamientos.add(residencia);
        Menu.ejecutar(alojamientos);
    }
}
