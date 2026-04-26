/*El Problema: El editor mantiene un puntero capaActiva a la capa seleccionada. El usuario puede moverse entre capas, alternar la 
visibilidad de la activa y eliminarla (el foco pasa a la siguiente).
Reto: Implementa los métodos subirCapa(), bajarCapa(), toggleVisibilidad(), eliminarActiva() y mostrarCapas(). mostrarCapas() imprime 
todas las capas marcando la activa con [✓] e indicando si cada una es visible. Simula: crea 4 capas, activa la del medio, sube una vez, 
oculta la activa, elimínala y muestra el estado final. */
public class Editor {
    Capa cabeza;
    Capa cola;
    Capa capaActiva;

    public Editor(){
        this.cabeza = null;
        this.cola = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregarCapa(String nombre, String tipo) {
        boolean visible = true;
        Capa nueva = new Capa(nombre, visible, tipo);
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
        this.capaActiva = nueva;
    }

    public void mostrarCapaActual(){
        if (estaVacia()) {
            System.out.println("No hay capas");
        }else{
            
            System.out.println("la capa actual es: " + this.capaActiva.nombre);
        }
    }


    public void mostrarCapas() {
    if (estaVacia()) {
        System.out.println("No hay capas");
        return;
    }
    System.out.println("=== editor de capas ===");
    Capa actual = cabeza;
    int numero = 1;
    do {
        if (actual == this.capaActiva) {
            System.out.println("[✓] " + numero + ". " + actual.nombre
                    + "  [Visible: " + actual.visible + "]"
                    + "  [Tipo: " + actual.tipo + "]");
        } else {
            System.out.println("    " + numero + ". " + actual.nombre
                    + "  [Visible: " + actual.visible + "]"
                    + "  [Tipo: " + actual.tipo + "]");
        }
        actual = actual.siguiente;
        numero++;
    } while (actual != cabeza);
    System.out.println("  (regresa a " + cabeza.nombre + ")");
}


    public void subirCapa(){
        if (estaVacia()) {
            System.out.println("No hay capas");
        } else {
            System.out.println("Usted esta ahora en la capa: " + this.capaActiva.siguiente.nombre);
        }
        this.capaActiva = capaActiva.siguiente;
    }


    public void bajarCapa(){
        if (estaVacia()) {
            System.out.println("No hay capas");
        } else {
            System.out.println("Usted esta ahora en la capa: " + this.capaActiva.anterior.nombre);
        }
        this.capaActiva = capaActiva.anterior;
    }

    public void eliminarActiva(){
        Capa actual = this.capaActiva;
        if (estaVacia()) {
            System.out.println("No hay capas");
        }else if (actual == cabeza && actual == cola) {
            actual.siguiente = null;
            actual.anterior = null;
            cola = cabeza = null;
            this.capaActiva = null;
        }else if (actual == cabeza) {
            actual.siguiente.anterior = cola;
            cola.siguiente = actual.siguiente;
            this.capaActiva = actual.siguiente;
            cabeza = actual.siguiente;
        }else if (actual == cola) {
            actual.anterior.siguiente = cabeza;
            cabeza.anterior = actual.anterior;
            this.capaActiva = actual.siguiente;
            cola = actual.anterior;
        }else{
            actual.siguiente.anterior = actual.anterior;
            actual.anterior.siguiente = actual.siguiente;
            this.capaActiva = actual.siguiente;
        }
    }

    public void toggleVisibilidad(){
        if (this.capaActiva.visible) {
            this.capaActiva.visible = false;
        }else{
            this.capaActiva.visible = true;
        }

        System.out.println("Se cambio la visibilidad de la capa: " + this.capaActiva.nombre + " a " + this.capaActiva.visible);
    }
}
