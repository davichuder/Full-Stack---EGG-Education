package herencia_ejercicio1extra.servicios;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Utilidades {
    private static final Scanner scanner = new Scanner(System.in);

    public static void limpiarPantalla() {
        System.out.println("\033[H\033[2J");
    }

    public static String stringLimpiarPantalla() {
        return "\033[H\033[2J";
    }

    public static void presionarEnter() {
        while (true) {
            System.out.println("Presione enter para continuar");
            if (scanner.nextLine().equals(""))
                break;
        }
    }

    public static void ingreseOpcionValidacion() {
        System.out.println("ERROR: Ingrese una opcion valida");
        Utilidades.presionarEnter();
    }

    public static Calendar StringToCalendar(String time, String format) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat dateformat = new SimpleDateFormat(format);
        try {
            calendar.setTime(dateformat.parse(time));
            return calendar;
        } catch (Exception e) {
            return calendar;
        }
    }
}
