package herencia_ejercicio1extra.servicios;

import java.util.Calendar;
import java.util.Scanner;

import herencia_ejercicio1extra.entidades.Alquiler;
import herencia_ejercicio1extra.entidades.Barco;
import herencia_ejercicio1extra.entidades.BarcoAMotor;
import herencia_ejercicio1extra.entidades.Velero;
import herencia_ejercicio1extra.entidades.YateDeLujo;

public class Creador {
    private static final Scanner scanner = new Scanner(System.in);

    public static Alquiler crearAlquiler(int posicion) {
        System.out.println("Ingrese nombre");
        String nombre = scanner.nextLine();
        System.out.println(("Ingrese documento"));
        int documento = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese fecha de entrada (dd-MM-yy)");
        Calendar fecha_inicio = Utilidades.StringToCalendar(scanner.nextLine(), "dd-MM-yy");
        System.out.println("Ingrese fecha de salida (dd-MM-yy)");
        Calendar fecha_fin = Utilidades.StringToCalendar(scanner.nextLine(), "dd-MM-yy");
        Barco barco = crearBarco();
        return new Alquiler(nombre, documento, fecha_inicio, fecha_fin, posicion, barco);
    }

    public static Barco crearBarco() {
        System.out.println("Seleccion el tipo de barco:");
        System.out.println("1-Velero");
        System.out.println("2-Barco a motor");
        System.out.println("3-Yate de lujo");
        int opcion = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese matricula");
        String matricula = scanner.nextLine();
        System.out.println("Ingrese largo de eslora");
        int eslora = Integer.parseInt(scanner.nextLine());
        System.out.println("Ingrese año de fabricacion");
        int año_fabricacion = Integer.parseInt(scanner.nextLine());

        Barco barco = new Barco();
        switch (opcion) {
            case 1:
                System.out.println("Ingrese cantidad de mastiles");
                int mastiles = Integer.parseInt(scanner.nextLine());
                barco = new Velero(matricula, eslora, año_fabricacion, mastiles);
                break;
            case 2:
                System.out.println("Ingrese potencia en CV");
                int cv = Integer.parseInt(scanner.nextLine());
                barco = new BarcoAMotor(matricula, eslora, año_fabricacion, cv);
                break;
            case 3:
                System.out.println("Ingrese potencia en CV");
                int cv2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Ingrese cantidad de camarotes");
                int camarotes = Integer.parseInt(scanner.nextLine());
                barco = new YateDeLujo(matricula, eslora, año_fabricacion, cv2, camarotes);
                break;
        }
        return barco;
    }

}
