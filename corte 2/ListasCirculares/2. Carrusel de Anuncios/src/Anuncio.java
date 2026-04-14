/*La Clase Anuncio (Nodo): Debe contener titulo (String), duracionSegundos (int), vecesRepetido 
(int) y categoria (String - ej: "Oferta", "Marca", "Evento"). */
public class Anuncio {
    String titulo;
    int duracionSegundos;
    int vecesRepetido;
    String categoria;
    Anuncio siguiente;

    public Anuncio(String titulo, int duracionSegundos, String categoria){
        this.titulo = titulo;
        this.duracionSegundos = duracionSegundos;
        this.vecesRepetido = 0;
        this.categoria = categoria;
    }
}
