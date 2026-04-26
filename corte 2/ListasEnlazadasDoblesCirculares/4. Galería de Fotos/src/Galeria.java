/*El Problema: La galería mantiene un puntero actual a la foto que se está viendo. Navegar con "siguiente" o "anterior" mueve ese puntero. 
Marcar como favorita simplemente alterna el campo esFavorita de la foto actual. Eliminar la foto actual desconecta el nodo en O(1) y 
mueve actual a la siguiente.
Reto: Implementa los métodos siguiente(), anterior(), toggleFavorita(), eliminarActual() y mostrarGaleria(). mostrarGaleria() recorre 
todas las fotos marcando con [★] las favoritas y con [▶] la foto actual. Simula: carga 5 fotos, avanza dos veces, marca la actual como 
favorita, retrocede una, elimina esa foto y muestra el estado final de la galería. */
public class Galeria {
    Foto cabeza;
    Foto cola;
    Foto fotoActual;

    public Galeria(){
        this.cabeza = null;
        this.cola = null;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregarFoto(String titulo, String fecha) {
        boolean esFavorita = false;
        Foto nueva = new Foto(titulo, fecha, esFavorita);
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
        this.fotoActual = nueva;
    }

    public void mostrarFotoActual(){
        if (estaVacia()) {
            System.out.println("No hay fotos");
        }else{
            
            System.out.println("la foto actual es: " + this.fotoActual.titulo);
        }
    }


    public void mostrarGaleria() {
    if (estaVacia()) {
        System.out.println("No hay fotos");
        return;
    }
    System.out.println("=== editor de fotos ===");
    Foto actual = cabeza;
    int numero = 1;
    do {
        String marcas = "";
        if (actual == this.fotoActual) {
            marcas = marcas + "[a▶]";
        }else{
            marcas = marcas + "    ";
        }
        if (actual.esFavorita) {
            marcas = marcas + "[f★]";
        }else{
            marcas = marcas + "    ";
        }
        System.out.println(marcas + " " + numero + ". " + actual.titulo
                + "  [Favorita: " + actual.esFavorita + "]"
                + "  [Fecha: " + actual.fecha + "]");
        actual = actual.siguiente;
        numero++;
    } while (actual != cabeza);
    System.out.println("  (regresa a " + cabeza.titulo + ")");
}


    public void siguiente(){
        if (estaVacia()) {
            System.out.println("No hay fotos");
        } else {
            System.out.println("Usted esta ahora en la foto: " + this.fotoActual.siguiente.titulo);
        }
        this.fotoActual = fotoActual.siguiente;
    }


    public void anterior(){
        if (estaVacia()) {
            System.out.println("No hay fotos");
        } else {
            System.out.println("Usted esta ahora en la foto: " + this.fotoActual.anterior.titulo);
        }
        this.fotoActual = fotoActual.anterior;
    }

    public void elimarActual(){
        Foto actual = this.fotoActual;
        if (estaVacia()) {
            System.out.println("No hay fotos");
        }else if (actual == cabeza && actual == cola) {
            actual.siguiente = null;
            actual.anterior = null;
            cola = cabeza = null;
            this.fotoActual = null;
        }else if (actual == cabeza) {
            actual.siguiente.anterior = cola;
            cola.siguiente = actual.siguiente;
            this.fotoActual = actual.siguiente;
            cabeza = actual.siguiente;
        }else if (actual == cola) {
            actual.anterior.siguiente = cabeza;
            cabeza.anterior = actual.anterior;
            this.fotoActual = actual.siguiente;
            cola = actual.anterior;
        }else{
            actual.siguiente.anterior = actual.anterior;
            actual.anterior.siguiente = actual.siguiente;
            this.fotoActual = actual.siguiente;
        }
    }

    public void toggleFavorita(){
        if (this.fotoActual.esFavorita) {
            System.out.println("La foto ya esta añadida a favoritas");
        }else{
            this.fotoActual.esFavorita = true;
            System.out.println("Se añadio a favoritos la foto: " + this.fotoActual.titulo);
        }
    }
}
