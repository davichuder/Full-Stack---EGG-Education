// Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos 
// números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer, 
// para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar 
// una división con los dos numeros y mostrar el resultado.
package excepciones_ejercicio3y4;

import java.util.InputMismatchException;
import java.util.Scanner;

import excepciones_ejercicio3y4.entidades.DivisionNumero;

public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Ingrese el numero 1");
            int num1 = scanner.nextInt();
            System.out.println("Ingrese el numero 2");
            int num2 = scanner.nextInt();
            DivisionNumero.dividir(num1, num2);
        } catch (InputMismatchException q) {
            System.out.println("Falla de tipo de entrada");
        } catch (ArithmeticException w) {
            System.out.println("No se puede dividir por 0");
        } catch (Exception e) {
            System.out.println("No se que fallo");
        }
    }
}
