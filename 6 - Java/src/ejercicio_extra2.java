/* Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
*/

import java.util.Scanner;

public class ejercicio_extra2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A;
        int B;
        int C;
        int D;

        System.out.println("Introduce el valor de A: ");
        A = scanner.nextInt();
        System.out.println("Introduce el valor de B: ");
        B = scanner.nextInt();
        System.out.println("Introduce el valor de C: ");
        C = scanner.nextInt();
        System.out.println("Introduce el valor de D: ");
        D = scanner.nextInt();
        scanner.close();

        B = C;
        C = A;
        A = D;
        D = B;

        System.out.println("El valor de A es: " + A);
        System.out.println("El valor de B es: " + B);
        System.out.println("El valor de C es: " + C);
        System.out.println("El valor de D es: " + D);
    } 
}