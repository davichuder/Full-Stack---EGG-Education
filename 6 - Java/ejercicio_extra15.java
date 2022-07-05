/* Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, 
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main. 
*/
import java.util.Scanner;

public class ejercicio_extra15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();
        

        System.out.println("Seleccione la operacion a realizar");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        int opcion = scanner.nextInt();
        scanner.close();

        switch (opcion) {
            case 1:
                System.out.println("La suma de los numeros es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("La resta de los numeros es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
                break;
            case 4:
                System.out.println("La division de los numeros es: " + (num1 / num2));
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    } 

    public static void sumar(int num1, int num2) {
        System.out.println("La suma de los numeros es: " + (num1 + num2));
    }

    public static void restar(int num1, int num2) {
        System.out.println("La resta de los numeros es: " + (num1 - num2));
    }

    public static void multiplicar(int num1, int num2) {
        System.out.println("La multiplicacion de los numeros es: " + (num1 * num2));
    }

    public static void dividir(int num1, int num2) {
        System.out.println("La division de los numeros es: " + (num1 / num2));
    }
}