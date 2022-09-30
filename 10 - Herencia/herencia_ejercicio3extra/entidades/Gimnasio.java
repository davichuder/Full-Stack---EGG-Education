// Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, de 
// acuerdo a las prestaciones observadas
package herencia_ejercicio3extra.entidades;

import herencia_ejercicio3extra.enums.ClaseGimnasio;

public class Gimnasio {
    private ClaseGimnasio clase;

    public Gimnasio(ClaseGimnasio clase) {
        this.clase = clase;
    }

    public ClaseGimnasio getClase() {
        return this.clase;
    }

    public void setClase(ClaseGimnasio clase) {
        this.clase = clase;
    }

    // • $50 si el tipo del gimnasio es A.
    // • $30 si el tipo del gimnasio es B.
    public int calcularValorAgregado() {
        return this.clase.equals(ClaseGimnasio.A) ? 50 : 30;
    }

    @Override
    public String toString() {
        return "Gimnasio {" +
                " clase='" + getClase() + "'" +
                "}";
    }
}