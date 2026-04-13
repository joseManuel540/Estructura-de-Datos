/*La Clase Fotografia (Nodo): Debe contener nombreArchivo (String), tamanoMB (double) y 
resolucion (String). */
public class Fotografia {
    String nombreArchivo;
    double tamañoMB;
    String resolucion;
    Fotografia siguiente;
    Fotografia anterior;

    public Fotografia(String nombreArchivo, double tamañoMB, String resolucion){
        this.nombreArchivo = nombreArchivo;
        this.tamañoMB = tamañoMB;
        this.resolucion = resolucion;
        this.siguiente = null;
        this.anterior = null;
    }
}
