package video_mascotas;

import video_mascotas.entidades.Mascota;
import video_mascotas.servicios.ServicioMascota;

public class app {
    /*
     * Pongo esto para quizas poder usarlo en el futuro
     */
    public static void main(String[] args) {
        // Creo variable de servicio de mascotas para
        ServicioMascota servicioMascota = new ServicioMascota();
        // Uso funcion para crear mascotas
        Mascota mascota1 = servicioMascota.crearMascota();
        // Imprimo datos de la mascota
        System.out.println(mascota1.toString());
    }
}
