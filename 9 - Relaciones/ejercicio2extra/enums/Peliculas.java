package ejercicio2extra.enums;

public enum Peliculas {
    AVENGERS("Avengers", 3, "D1", 13),
    TITANIC("Titanic", 3, "D2", 13),
    SHREK("Shrek", 1.5, "D3", 1),
    TERMINATOR("Terminator", 2, "D4", 18),
    PINOCHO("Pinocho", 1, "D5", 1),
    LASIRENITA("La Sirenita", 2, "D6", 1),
    BUZZLIGHTYEAR("Buzz Lightyear", 2, "D7", 1),
    XMEN("X-men", 2.5, "D8", 18);

    private String titulo;
    private Double duracion;
    private String director;
    private int edad_minima;

    private Peliculas(String titulo, Double duracion, String director, int edad_minima) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.director = director;
        this.edad_minima = edad_minima;
    }

    private Peliculas(String titulo, int duracion, String director, int edad_minima) {
        this.titulo = titulo;
        this.duracion = (double) duracion;
        this.director = director;
        this.edad_minima = edad_minima;
    }

    @Override
    public String toString() {
        return "Titulo=" + this.titulo + " -> Duracion=" + this.duracion + " Director=" + this.director
                + " Edad Minima=" + this.edad_minima;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEdadMinima() {
        return edad_minima;
    }
}
