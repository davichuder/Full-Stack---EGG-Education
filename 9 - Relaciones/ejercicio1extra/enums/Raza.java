package ejercicio1extra.enums;

public enum Raza {
    CANICHE("Caniche"), CHIHUAHUA("Chihuahua"), ROTTWEILER("Rottweiler"), SALCHICHA("Salchicha"), SHIBAINU("Shiba Inu"),
    GRANDANES("Gran Danes"), GALGO("Galgo");

    private String nombre;

    private Raza(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
