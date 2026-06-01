/*La Clase Libro (Nodo): Debe contener isbn (long, clave del BST), titulo (String), autor (String) y
anioPublicacion (int). */
public class Libro {

    long isbn;
    String titulo;
    String autor;
    int anioPublicacion;

    Libro izquierdo;
    Libro derecho;

    public Libro(long isbn, String titulo, String autor, int anioPublicacion) {

        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;

        this.izquierdo = null;
        this.derecho = null;
    }

    @Override
    public String toString() {
        return isbn + " - " + titulo + " - " + autor;
    }
}
