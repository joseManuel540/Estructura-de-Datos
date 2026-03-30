/*La Clase Producto (Nodo): Debe contener nombre (String), cantidad (int) y diasParaVencer (int). */
public class Producto {
    String Nombre;
    int Cantidad;
    int DiasParaVencer;
    Producto siguiente;

    public Producto(String nombre, int cantidad, int diasParaVencer){
        this.Nombre = nombre;
        this.Cantidad = cantidad;
        this.DiasParaVencer = diasParaVencer;
        this.siguiente = null;
    }
}
