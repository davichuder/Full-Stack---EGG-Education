package ejercicio_extra5.entidades;

import java.util.Scanner;

public class Mes {
    // Parametros
    private String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre",
            "octubre", "noviembre", "diciembre" };
    private Scanner scanner = new Scanner(System.in);
    private String mesSecreto = meses[(int) (Math.random() * 12)];
    private String mesUsuario;

    // Constructor por defecto
    public Mes() {
    }

    // Metodo para adivinar el mes secreto
    public void adivinarMesSecreto() {
        do {
            System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
            mesUsuario = scanner.nextLine();
            if (mesUsuario.equalsIgnoreCase(mesSecreto)) {
                System.out.println("¡Ha acertado!");
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes: ");
            }
        } while (!mesUsuario.equalsIgnoreCase(mesSecreto));
    }
}