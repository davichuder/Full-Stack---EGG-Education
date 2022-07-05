/* Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
tratamientos. 
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
real que represente el costo del tratamiento (previo al descuento) y determine el 
importe en efectivo a pagar por dicho socio.
*/

import java.util.Scanner;

public class ejercicio_extra5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character clase;
        do{
        System.out.println("Ingrese una letra (carácter) que representa la clase de un socio: ");
        clase = scanner.nextLine().charAt(0);
        } while (clase.equals("A") && clase.equals("B") && clase.equals("C"));

        System.out.println("Ingrese el costo del tratamiento (previo al descuento): ");
        double costo = scanner.nextDouble();
        scanner.close();

        switch (clase){
            case 'A':
                System.out.println("El importe a pagar por el socio es: " + (costo * 0.5));
                break;
            case 'B':
                System.out.println("El importe a pagar por el socio es: " + (costo * 0.35));
                break;
            case 'C':
                System.out.println("El importe a pagar por el socio es: " + costo);
                break;
        }
    } 
}