public class Vagon {
    String id;
    String contenido;
    double peso;
    Vagon siguiente;

    public Vagon(String id, String contenido, double peso){
        this.id = id;
        this.contenido = contenido;
        this.peso = peso;
        this.siguiente = null;
    }
}
