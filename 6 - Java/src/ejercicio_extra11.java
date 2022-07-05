/* Escribir un programa que lea un número entero y devuelva el número de dígitos que 
componen ese número. Por ejemplo, si introducimos el número 12345, el programa 
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador 
de división. Nota: recordar que las variables de tipo entero truncan los números o 
resultados.
*/

import java.util.Scanner;

public class ejercicio_extra11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int numero = scanner.nextInt();
        scanner.close();

        int digitos = 0;
        while (numero > 0) {
            numero /= 10;
            digitos++;
        }

        System.out.println("La cantidad de digitos es: " + digitos);
    } 
}