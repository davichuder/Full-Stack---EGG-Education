/* Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de 
las personas ingresadas por teclado e indique si son mayores o menores de edad. 
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”
*/
import java.util.Scanner;

public class ejercicio_extra16 {
    public static void main(String[] args) {

        pedir_nombres();
    } 

    public static void pedir_nombres() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de la persona");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese la edad de la persona");
        int edad = scanner.nextInt();
        System.out.print("El nombre de la persona es: " +nombre+" La edad de la persona es: " + edad);

        if (edad >= 18) {
            System.out.println(" y es mayor de edad");
        } else {
            System.out.println(" y es menor de edad");
        }
        // Limpiar pantalla
        

        String respuesta;
        do {
            System.out.println("Desea seguir ingresando personas? (Si/No)");
            respuesta = scanner.next();
            if (respuesta.toUpperCase().equals("SI")) {pedir_nombres();}
            else if (!respuesta.toUpperCase().equals("NO")) {System.out.println("Opcion no valida");}
        } while (!respuesta.toUpperCase().equals("NO") && !respuesta.toUpperCase().equals("SI"));
        scanner.close();        
    }
}