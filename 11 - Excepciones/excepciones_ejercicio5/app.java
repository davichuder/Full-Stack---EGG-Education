// Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora 
// debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para 
// ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el 
// número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando 
// consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario 
// ha  intentado  adivinar  el  número.  Si  el  usuario  introduce  algo  que  no  es  un  número,  se  debe 
// controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el 
// carácter fallido como un intento.
package excepciones_ejercicio5;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el numero entre 1 y 500");
        int intentos = 0;
        int adivinar = 1 + (int) (Math.random() * 500);
        int numero = -1;
        while (true) {
            System.out.println("Intentos: " + intentos);
            System.out.println("Ingrese un numero");
            try {
                numero = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("No ingreso un numero");
            }
            intentos++;
            if (numero == adivinar)
                break;
        }
        System.out.println("FELICITACIONES");
        System.out.println("Lo adivino en " + intentos + " intentos");
    }
}
