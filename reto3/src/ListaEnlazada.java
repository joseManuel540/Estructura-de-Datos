public class ListaEnlazada {
    Nodo cabeza;

    public ListaEnlazada(){
        cabeza = null;
    }
    public void agregar(Nodo nuevoNodo){
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevoNodo;
        }
    }

    public int calcularCantidad(){
        int cantidad = 0;
        Nodo actual = cabeza;
        while (actual !=null) {
            cantidad = cantidad + 1;
            actual  = actual.siguiente;
        }
        return cantidad;
    }
}
