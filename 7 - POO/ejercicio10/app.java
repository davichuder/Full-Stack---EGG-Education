/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A 
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El 
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. 
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números 
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 
20. 
*/
package ejercicio10;

import java.util.Arrays;

public class app {
    public static void main(String[] args) {
        // Creo lista
        double[] arregloA = new double[50];
        double[] arregloB = new double[20];
        // Lleno listas
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = Math.random() * 10;
        }
        for (int i = 0; i < arregloB.length; i++) {
            arregloB[i] = Math.random() * 10;
        }
        // Muestro listas
        System.out.println("Lista A: ");
        System.out.println(Arrays.toString(arregloA));
        System.out.println("Lista B: ");
        System.out.println(Arrays.toString(arregloB));
        System.out.println("--------------------------");
        // Ordeno lista A
        Arrays.sort(arregloA);
        // Copio lista A a lista B
        for (int i = 0; i < arregloB.length; i++) {
            arregloB[i] = arregloA[i];
        }
        // Relleno lista B con 0.5
        Arrays.fill(arregloB, arregloB.length - 10, arregloB.length, 0.5);
        // Muestro listas
        System.out.println("Lista A ordenada: ");
        System.out.println(Arrays.toString(arregloA));
        System.out.println("Lista B combinado: ");
        System.out.println(Arrays.toString(arregloB));
    }
}
