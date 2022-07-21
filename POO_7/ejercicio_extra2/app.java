/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus 
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos 
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en 
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia 
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como 
calcular la distancia entre dos puntos consulte el siguiente link:  
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
*/

package POO_7.ejercicio_extra2;

import POO_7.ejercicio_extra2.entidades.Puntos;
import POO_7.ejercicio_extra2.servicios.ServiciosPuntos;

public class app {
    public static void main(String[] args){
        //Creo puntos
        ServiciosPuntos serviciosPuntos = new ServiciosPuntos();
        Puntos punto1 = serviciosPuntos.crearPuntos();
        Puntos punto2 = serviciosPuntos.crearPuntos();
        //Calculo distancia
        System.out.println("La distancia entre los puntos es: " + serviciosPuntos.calcularDistancia(punto1, punto2));
    }    
}
