package ejercicio_extra1.entidades;

public class Cancion {
    // Parametros
    private String titulo;
    private String autor;

    // Getters y Setters
    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Constructor vacio
    public Cancion() {
        this.titulo = "";
        this.autor = "";
    }

    // Constructor con parametros
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

}
