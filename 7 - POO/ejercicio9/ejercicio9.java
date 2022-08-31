/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con 
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un 
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el 
Math.random para generar los dos números y se guardaran en el objeto con su 
respectivos set.  Deberá además implementar los siguientes métodos:  
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor 
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado 
al menor número. Previamente se deben redondear ambos valores. 
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. 
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */

package ejercicio9;

import ejercicio9.entidades.Matematica;

public class ejercicio9 {
    public static void main(String[] args) {
        // Creacion de objeto
        Matematica matematica = new Matematica();
        // Generacion de numeros
        matematica.setNumero1(Math.random() * 10);
        matematica.setNumero2(Math.random() * 10);
        // Muestro numeros
        System.out.println(matematica);
        // Muestro mayor
        System.out.println("El mayor es: " + matematica.devolverMayor());
        // Muestro potencia
        System.out.println("La potencia es: " + matematica.calcularPotencia());
        // Muestro raiz
        System.out.println("La raiz es: " + matematica.calculaRaiz());
    }

}
