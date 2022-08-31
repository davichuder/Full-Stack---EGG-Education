/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima 
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad 
actual de café que hay en la cafetera). Implemente, al menos, los siguientes métodos:   
• Constructor predeterminado o vacío  
• Constructor con la capacidad máxima y la cantidad actual  
• Métodos getters y setters. 
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.   
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el 
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la 
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El 
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en 
cuanto quedó la taza. 
• Método vaciarCafetera(): pone la cantidad de café actual en cero.   
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo 
recibe y se añade a la cafetera la cantidad de café indicada
*/

package ejercicio6;

import ejercicio6.entidades.Cafetera;
import ejercicio6.servicios.CafeteraServicios;

public class app {
    public static void main(String[] args) {
    //Creo objeto de servicio de cafetera
    CafeteraServicios cafeteraServicios = new CafeteraServicios();
    //Creo cafetera
    Cafetera cafetera = cafeteraServicios.crearCafetera();
    System.out.println(cafetera);
    //Lleno cafetera
    cafetera.llenarCafetera();
    System.out.println(cafetera);
    //Sirvo una taza
    cafetera.servirTaza();
    System.out.println(cafetera);
    //Vacio cafetera
    cafetera.vaciarCafetera();
    System.out.println(cafetera);
    //Agrego cafe
    cafetera.agregarCafe(50);
    System.out.println(cafetera);
    }
}
