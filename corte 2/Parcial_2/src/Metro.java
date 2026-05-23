public class Metro {
    Estacion cabeza;
    Estacion cola;

    public Metro() {
        this.cabeza = null;
        this.cola = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregarAlFinal(String nombre) {
        Estacion nueva = new Estacion(nombre);
        if (cabeza == null) {
            nueva.siguiente = nueva;
            nueva.anterior = nueva;
            cabeza = nueva;
            cola = nueva;
        } else {
            cola.siguiente = nueva;
            nueva.anterior = cola;
            nueva.siguiente = cabeza;
            cabeza.anterior = nueva;
            cola = nueva;
        }
    }

    public void RutaIda() {
        if (estaVacia()) {
            System.out.println("No hay estaciones en la línea.");
            return;
        }
        System.out.println("=== Línea de Metro (ruta ida) ===");
        Estacion actual = cabeza;
        int numero = 1;
        do {
            System.out.println("  " + numero + ". " + actual.nombre);
            actual = actual.siguiente;
            numero++;
        } while (actual != cabeza);
        System.out.println("  (regresa a la cabeza: " + cabeza.nombre + ")");
    }

    public void RutaRegreso() {
        if (estaVacia()) {
            System.out.println("No hay estaciones en la línea.");
            return;
        }
        System.out.println("=== Línea de Metro (ruta regreso) ===");
        Estacion actual = cola;
        int numero = 1;
        do {
            System.out.println("  " + numero + ". " + actual.nombre);
            actual = actual.anterior;
            numero++;
        } while (actual != cola);
        System.out.println("  (regresa a la cola: " + cola.nombre + ")");
    }

    public void ConsultarEstacion(String nombre){
        Estacion actual = cabeza;
        do {
            if (actual.nombre.equals(nombre)) {
                System.out.println("Se encontro la estacion: " + actual.nombre);
                System.out.println("Estacion siguiente: " + actual.siguiente.nombre);
                System.out.println("Estacion anterior: " + actual.anterior.nombre);
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println("No se encontro la estacion");
    }

    public void eliminar(Estacion actual){
        if (estaVacia()) {
            System.out.println("No hay estaciones");
        }else if (actual == cabeza && actual == cola) {
            actual.siguiente = null;
            actual.anterior = null;
            cola = cabeza = null;
        }else if (actual == cabeza) {
            actual.siguiente.anterior = cola;
            cola.siguiente = actual.siguiente;
            cabeza = actual.siguiente;
        }else if (actual == cola) {
            actual.anterior.siguiente = cabeza;
            cabeza.anterior = actual.anterior;
            cola = actual.anterior;
        }else{
            actual.siguiente.anterior = actual.anterior;
            actual.anterior.siguiente = actual.siguiente;
        }
    }

    public void EliminarParada(String nombre){
        Estacion actual = cabeza;
        do {
            if (actual.nombre.equals(nombre)) {
                System.out.println("Se elimino la estacion: " + actual.nombre);
                eliminar(actual);
                return;
            }
            actual = actual.siguiente;
        } while (actual != cabeza);
        System.out.println("No se encontro la estacion");
    }

}
