// Definir  una  Clase  que  contenga  algún  tipo  de  dato  de  tipo  array  y  agregue  el  código  para 
// generar  y  capturar  una  excepción  ArrayIndexOutOfBoundsException  (índice  de  arreglo  fuera 
// de rango).
package excepciones_ejercicio2;

import excepciones_ejercicio2.entidades.Prueba;

public class app {
    public static void main(String[] args) {
        Prueba prueba = new Prueba();
        try {
            prueba.numeros[5] = 15;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("El indice es incorrecto");
        } catch (Exception e) {
            System.out.println("No se porque salio este error");
        }
    }
}
