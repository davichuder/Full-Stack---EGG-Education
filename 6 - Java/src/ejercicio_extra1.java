/* Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
*/

import java.util.Scanner;

public class ejercicio_extra1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutos;
        int horas;
        int dias;

        System.out.println("Introduce los minutos: ");
        minutos = scanner.nextInt();
        scanner.close();

        dias = minutos / (60*24);
        horas = minutos % (60*24) / 60;
        minutos = minutos - (dias * 60 * 24) - (horas * 60);
        System.out.println("Transcurrieron " + dias + " dias y " + horas + " horas y " + minutos + " minutos");
    } 
}