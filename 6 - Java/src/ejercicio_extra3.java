/* Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String
*/

import java.util.Scanner;

public class ejercicio_extra3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una letra: ");
        String letra = scanner.nextLine();
        scanner.close();

        if (letra.toLowerCase().equals("a") || letra.toLowerCase().equals("e") || letra.toLowerCase().equals("i") ||
            letra.toLowerCase().equals("o") || letra.equals("u")) {
            System.out.println("La letra " + letra + " es una vocal");
        } else {
            System.out.println("La letra " + letra + " no es una vocal");
        }
    } 
}