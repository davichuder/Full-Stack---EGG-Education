// Crear una superclase llamada Edificio con los siguientes atributos: ancho, alto y largo. La clase 
// edificio tendrá como métodos: 
// • Método calcularSuperficie(): calcula la superficie del edificio. 
// • Método calcularVolumen(): calcula el volumen del edifico.  
// Estos métodos serán abstractos y los implementarán las siguientes clases:  
// • Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o 
// Abierto, esta clase implementará los dos métodos abstractos y los atributos del padre.  
// • Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas 
// por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y 
// los atributos del padre.
// De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el 
// usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso 
// (suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre 
// cuantas personas entrarían en un piso y cuantas en todo el edificio
// Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList debe contener 
// dos polideportivos y dos edificios de oficinas. Luego, recorrer este array y ejecutar los 
// métodos calcularSuperficie y calcularVolumen en cada Edificio. Se deberá mostrar la 
// superficie y el volumen de cada edificio.
// Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos son 
// techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al método 
// cantPersonas() y mostrar los resultados de cada edificio de oficinas
package herencia_ejercicio2extra;

import java.util.ArrayList;

import herencia_ejercicio2extra.entitdades.Edificio;
import herencia_ejercicio2extra.entitdades.EdificioDeOficinas;
import herencia_ejercicio2extra.entitdades.Polideportivo;

public class app {
    public static void main(String[] args) {
        ArrayList<Edificio> edificios = new ArrayList<>();
        edificios.add(new Polideportivo("San Martin", true, 10, 20, 30));
        edificios.add(new Polideportivo("Jesus", false, 40, 50, 60));
        edificios.add(new EdificioDeOficinas(70, 80, 90, 100, 110, 120));
        edificios.add(new EdificioDeOficinas(130, 140, 150, 160, 170, 180));

        edificios.stream().forEach(x -> x.calcularSuperficie());
        edificios.stream().forEach(x -> x.calcularVolumen());

        long techados = edificios.stream()
                .filter(x -> x instanceof Polideportivo && ((Polideportivo) x).getTecho())
                .count();

        long no_techados = edificios.stream()
                .filter(x -> x instanceof Polideportivo && !((Polideportivo) x).getTecho())
                .count();

        System.out.println("Hay " + techados + " polideportivos techados, y " + no_techados + " no techados");

        edificios.stream()
                .filter(x -> x instanceof EdificioDeOficinas)
                .forEach(y -> ((EdificioDeOficinas) y).cantPersonas());
    }
}
