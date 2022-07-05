/* Realice un programa para que el usuario adivine el resultado de una multiplicación entre 
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario 
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir 
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como 
utilizar la función Math.random() de Java
*/

import java.util.Scanner;

public class ejercicio_extra10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero;
        int aleatorio1 = (int) (10*Math.random());
        int aleatorio2 = (int) (10*Math.random());

        do {
            System.out.println("Ingrese el numero: ");
            numero = scanner.nextInt();

            if (numero == aleatorio1*aleatorio2) {
                System.out.println("Felicidades, adivinaste!\nEl resultado de "+aleatorio1+" * "+aleatorio2+" es: "+(aleatorio1*aleatorio2));
            } else {
                System.out.println("Lo siento, intenta nuevamente");
            }
        } while (numero != aleatorio1*aleatorio2);

        scanner.close();
    } 
}