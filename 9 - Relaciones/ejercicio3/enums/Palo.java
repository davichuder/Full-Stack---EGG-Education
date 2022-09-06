package ejercicio3.enums;

public enum Palo {
    ORO("Oro"), ESPADA("Espada"), BASTO("Basto"), COPA("Copa");

    private String nombre;

    private Palo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
}
