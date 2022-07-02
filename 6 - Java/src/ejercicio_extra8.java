/* Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe 
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares y 
la cantidad de números impares. Al igual que en el ejercicio anterior los números 
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
*/

import java.util.Scanner;

public class ejercicio_extra8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int leidos = 0;
        int pares = 0;
        int impares = 0;
        
        do{
            System.out.println("Ingrese la cantidad de numeros, debe ser mayor a 0");
            n = scanner.nextInt();
            if (n>0){
                leidos++;
                if (n%2==0 && n!=0){
                    pares++;
                }
                if (n%2==1 && n!=0){
                    impares++;
                }
            }
        } while (n%5 != 0);

        System.out.println("La cantidad de numeros leidos es: " + leidos);
        System.out.println("La cantidad de numeros pares es: " + pares);
        System.out.println("La cantidad de numeros impares es: " + impares);

        scanner.close();
    } 
}