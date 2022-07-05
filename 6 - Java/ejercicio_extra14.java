/* Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de 
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad 
de hijos para averiguar la media de edad de los hijos de todas las familias
*/
import java.util.Scanner;

public class ejercicio_extra14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias: ");
        int familias = scanner.nextInt();
        
        float suma = 0;
        int cantidad = 0;
        int hijos = 0;

        for (int i = 0; i < familias; i++){
            System.out.println("Ingrese la cantidad de hijos de la familia " + (i + 1) + ": ");
            hijos = scanner.nextInt();
            for (int j = 0; j < hijos; j++) {
                System.out.println("Ingrese la edad del hijo " + (j + 1) + " de la familia " + (i + 1) + ": ");
                suma += scanner.nextInt();
                cantidad++;
            }
        }

        System.out.println("La media de edad de los hijos de todas las familias es: " + suma/cantidad);
        scanner.close();
    } 
}