/*La Clase Capa (Nodo): Debe contener nombre (String), visible (boolean) y tipo (String — "fondo", "objeto", "texto"). */
public class Capa {
    String nombre;
    boolean visible;
    String tipo;
    Capa siguiente;
    Capa anterior;

    public Capa(String nombre, boolean visible, String tipo){
        this.nombre = nombre;
        this.visible = visible;
        this.tipo = tipo;
        this.siguiente = null;
        this.anterior = null;
    }
}
