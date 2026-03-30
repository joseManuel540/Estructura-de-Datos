public class ListaProductos {
    Producto cabeza;

    public ListaProductos(){
        this.cabeza = null;
    }

    public void agregarProducto(Producto nuevo) {
        if (nuevo.DiasParaVencer < 3) {

            nuevo.siguiente = cabeza;
            cabeza = nuevo;
        } else {
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                Producto actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
        }
    }

    public void mostrarPorVencer() {
        Producto actual = cabeza;

        while (actual != null) {
            if (actual.DiasParaVencer < 5) {
                System.out.println("Producto: " + actual.Nombre +
                        " | Cantidad: " + actual.Cantidad +
                        " | Días: " + actual.DiasParaVencer);
            }
            actual = actual.siguiente;
        }
    }
}
