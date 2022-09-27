// Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos 
// para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados. 
// Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se 
// deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los 
// televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del 
// precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 
// 2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para 
// electrodomésticos, 2000 para lavadora y 5000 para televisor.

package herencia_ejercicio3;

import java.util.ArrayList;

import herencia_ejercicio3.entidades.Electrodomestico;
import herencia_ejercicio3.entidades.Lavadora;
import herencia_ejercicio3.entidades.Televisor;

public class app {
    public static void main(String[] args) {
        ArrayList<Electrodomestico> lista = new ArrayList<Electrodomestico>();

        for (int i = 0; i < 4; i++) {
            if (i % 2 == 0) {
                Lavadora lavadora = new Lavadora();
                lavadora.crearLavadora();
                lista.add(lavadora);
            } else {
                Televisor televisor = new Televisor();
                televisor.crearTelevisor();
                lista.add(televisor);
            }
        }

        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).precioFinal();
            System.out.println(lista.get(i));
        }

        float total_lavadora = 0;
        float total_televisor = 0;
        String nombre;
        for (int i = 0; i < lista.size(); i++) {
            nombre = lista.get(i).getClass().getSimpleName();
            total_lavadora = total_lavadora + (nombre.equals("Lavadora") ? lista.get(i).getPrecio() : 0);
            total_televisor = total_televisor + (nombre.equals("Televisor") ? lista.get(i).getPrecio() : 0);
        }
        System.out.println("El total de lavadoras es: " + total_lavadora);
        System.out.println("El total de televisores es: " + total_televisor);
        System.out.println("EL total general es: " + (total_lavadora + total_televisor));
    }
}
