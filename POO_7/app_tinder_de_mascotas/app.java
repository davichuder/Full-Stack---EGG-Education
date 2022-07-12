package POO_7.app_tinder_de_mascotas;

public class app {
    /*
     * Pongo esto para quizas poder usarlo en el futuro
     */
    public static void main(String[] args) {
        Mascota mascota1 = new Mascota("Ruben", "625", "Koala", "Amarillo", 0, true, "Extraterrestre");
        mascota1.setEdad(1);
        
        System.out.println(mascota1.getNombre()+" tiene "+mascota1.getEdad()+" años");

        System.out.println(mascota1);
    }
}
