/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de 
tipo real. A continuación, se deben crear los siguientes métodos: 
a) Método constructor que inicialice el radio pasado como parámetro. 
b) Métodos get y set para el atributo radio de la clase Circunferencia. 
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto. 
d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚=𝛑∗𝐫𝐚𝐝𝐢𝐨𝟐). 
e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨=𝟐∗𝛑∗𝐫𝐚𝐝𝐢𝐨).
 */

package ejercicio2;

import ejercicio2.entidades.Circunferencia;

public class app {
    public static void main(String[] args) {
        // Creo circunferencia
        Circunferencia circunferencia = new Circunferencia();
        // Creo circunferencia por metodo
        circunferencia.crearCircunferencia();
        // Muestro circunferencia
        System.out.println("Circunferencia: " + circunferencia);
        // Muestro perimetro
        System.out.println("Perimetro: " + circunferencia.perimetro());
        // Muestro area
        System.out.println("Area: " + circunferencia.area());
    }
}
