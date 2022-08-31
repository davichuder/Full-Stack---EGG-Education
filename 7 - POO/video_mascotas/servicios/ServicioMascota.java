package video_mascotas.servicios;

import java.util.Scanner;

import video_mascotas.entidades.Mascota;

public class ServicioMascota {

    // Creo funcion para crear mascota
    public Mascota crearMascota() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre de la mascota");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese apodo de la mascota");
        String apodo = scanner.next();
        System.out.println("Ingrese tipo de la mascota");
        String tipo = scanner.next();
        scanner.close();
        return new Mascota(nombre, apodo, tipo);
    }

}