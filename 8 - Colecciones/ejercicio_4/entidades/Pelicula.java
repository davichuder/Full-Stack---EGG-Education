package ejercicio_4.entidades;

public class Pelicula {
    // Atributos
    private String titulo;
    private String director;
    private Float duracion;

    // Constructor
    public Pelicula(String titulo, String director, Float duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    // Constructor por defecto
    public Pelicula() {
    }

    // Getters y setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }
}
