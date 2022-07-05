/* Simular la división usando solamente restas. Dados dos números enteros mayores que 
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: 
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este 
resultado es el residuo, y el número de restas realizadas es el cociente. 
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada 
37 – 13 = 24 dos restas realizadas 
24 – 13 = 11 tres restas realizadas 
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
*/

import java.util.Scanner;

public class ejercicio_extra9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el dividendo");
        int dividendo = scanner.nextInt();
        System.out.println("Ingrese el divisor");
        int divisor = scanner.nextInt();
        scanner.close();

        int divisiones = 0;

        while (dividendo >= divisor) {
            dividendo -= divisor;
            divisiones++;
        }
        
        System.out.println("El cociente es: " + divisiones);
        System.out.println("El residuo es: " + dividendo);
    } 
}