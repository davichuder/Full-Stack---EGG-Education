/* Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio 
de n números (n>0). El valor de n se solicitará al principio del programa y los números 
serán introducidos por el usuario. Realice dos versiones del programa, una usando el 
bucle “while” y otra con el bucle “do - while”
*/

import java.util.Scanner;

public class ejercicio_extra7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de numeros, debe ser mayor a 0");
        int n = scanner.nextInt();
        int [] vector = new int[n];
        int i;
        int max;
        int min;
        double suma;

        //Version 1

        System.out.println("Ingrese el numero ");
        vector[n-1] = scanner.nextInt();
        max = vector[n-1];
        min = vector[n-1];
        suma = vector[n-1];
        i = n-1;

        while (i > 0) {
            System.out.println("Ingrese el numero ");
            vector[i] = scanner.nextInt();
            if (vector[i]>max) {
                max = vector[i];
            }
            if (vector[i]<min) {
                min = vector[i];
            }
            suma += vector[i];
            i--;
        }
        System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El promedio es: " + (suma/n));
        

        //Version 2
        System.out.println("Ingrese el numero ");
        n = scanner.nextInt();
        i = n-1;
        do {
            
            System.out.println("Ingrese el numero ");
            vector[i] = scanner.nextInt();
            if(i==n - 1){
                max = vector[n-1];
                min = vector[n-1];
                suma = 0;
            }
            if (vector[i]>max) {
                max = vector[i];
            }
            if (vector[i]<min) {
                min = vector[i];
            }
            suma += vector[i];
            
            i--;
        } while (i>=0);
        System.out.println("El valor maximo es: " + max);
        System.out.println("El valor minimo es: " + min);
        System.out.println("El promedio es: " + (suma/n));

        scanner.close();
    } 
}