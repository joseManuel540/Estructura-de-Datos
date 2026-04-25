/*El Problema: El historial mantiene un puntero cursor al comando que se está consultando. Navegar con "arriba" 
mueve el cursor al anterior (anterior); "abajo" lo mueve al siguiente (siguiente). El usuario puede eliminar el 
comando actual (para borrar contraseñas escritas por error), y el cursor pasa automáticamente al siguiente.
Reto: Implementa los métodos arriba(), abajo(), mostrarCursor() y eliminarActual(). Simula: agrega 5 comandos, 
navega 3 veces hacia arriba, elimina el comando actual, navega una vez hacia abajo y muestra el historial completo 
con el cursor marcado. */
public class Historial {
    Comando cabeza;
    Comando cola;
    Comando cursor;

    public Historial(){
        this.cabeza = null;
        this.cola = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregarComando(String texto, boolean exitoso, String directorio) {
        exitoso = true;
        Comando nueva = new Comando(texto, exitoso, directorio);
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
        this.cursor = nueva;
    }

    public void mostrarCursor(){
        if (estaVacia()) {
            System.out.println("No hay comandos");
        }else{
            
            System.out.println("El cursor esta en el comando: " + this.cursor.texto);
        }
    }

    public void mostrarHistorial() {
        if (estaVacia()) {
            System.out.println("No hay Comandos");
            return;
        }
        System.out.println("=== historial de comandos ===");
        Comando actual = cabeza;
        int numero = 1;
        do {
            System.out.println("  " + numero + ". " + actual.texto
                    + "  [Exitoso " + actual.exitoso + "]"
                    + "  [Ruta " + actual.directorio + "]");
            actual = actual.siguiente;
            numero++;
        } while (actual != cabeza);
        System.out.println("  (regresa a " + cabeza.texto + ")");
    }

    public Comando arriba(){
        if (estaVacia()) {
            System.out.println("No hay comandos");
            return null;
        }else if (this.cursor.anterior == cabeza) {
            System.out.println("No hay mas comandos");
            return this.cursor;
        }
        return this.cursor.anterior;
    }


    public Comando abajo(){
        if (estaVacia()) {
            System.out.println("No hay comandos");
            return null;
        }else if (this.cursor.siguiente == cabeza) {
            System.out.println("No hay mas comandos");
            return this.cursor;
        }
        return this.cursor.siguiente;
    }

    public void eliminarActual(Comando actual){
        actual = this.cursor;
        if (estaVacia()) {
            System.out.println("No hay comandos");
        }else if (actual == cabeza && actual == cola) {
            actual.siguiente = null;
            actual.anterior = null;
            this.cursor = null;
        }else if (actual == cabeza) {
            actual.siguiente.anterior = cola;
            cola.siguiente = actual.siguiente;
            this.cursor = actual.siguiente;
            cabeza = actual.siguiente;
        }else if (actual == cola) {
            actual.anterior.siguiente = cabeza;
            cabeza.anterior = actual.anterior;
            this.cursor = actual.siguiente;
            cola = actual.anterior;
        }else{
            actual.siguiente.anterior = actual.anterior;
            actual.anterior.siguiente = actual.siguiente;
            this.cursor = actual.siguiente;
        }
    }
    
    
}
