package ejercicio1.entidades;

public class Libro {
    // Defino parametros ISBN, titulo, autor, numero de paginas
    private String isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;

    // Getters y setters
    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

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

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // Creo constructor vacio
    public Libro() {
    }

    // Creo constructor con parametros
    public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // toString para mostrar datos
    @Override
    public String toString() {
        return "ISBN=" + this.isbn + " Titulo=" + this.titulo + " Autor=" + this.autor + " Numero de paginas="
                + this.numeroPaginas;
    }
}
