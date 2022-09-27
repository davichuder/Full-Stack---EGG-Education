package herencia_ejercicio2;

import herencia_ejercicio2.entidades.Electrodomestico;
import herencia_ejercicio2.entidades.Lavadora;
import herencia_ejercicio2.entidades.Televisor;

public class app {
    public static void main(String[] args) {
        System.out.println("Creando electrodomestico");
        Electrodomestico electrodomestico = new Electrodomestico();
        electrodomestico.crearElectrodomestico();
        electrodomestico.precioFinal();
        System.out.println(electrodomestico);

        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        lavadora.precioFinal();
        System.out.println(lavadora);

        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        televisor.precioFinal();
        System.out.println(televisor);
    }
}
