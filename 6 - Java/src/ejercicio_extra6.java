/* Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por 
debajo de 1.60 mts. y el promedio de estaturas en general.
*/

import java.util.Scanner;

public class ejercicio_extra6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad = 0;
        double altura;
        int n = 0;
        double suma = 0;
        double suma_cantidad = 0;

        System.out.println("Ingrese la cantidad de personas: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese la altura de la persona " + (i + 1) + ": ");
            altura = scanner.nextDouble();
            suma += altura;
            if (altura < 1.60) {
                cantidad++;
                suma_cantidad += altura;
            }

        }

        scanner.close();
        System.out.println("El promedio de la estatura general es :"+(suma/n));
        System.out.println("El promedio de la estatura por debajo de 1.60 mts es: "+(suma_cantidad/cantidad));
    } 
}