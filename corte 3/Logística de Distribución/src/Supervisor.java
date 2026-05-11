/*El Problema: El supervisor necesita saber cuánta carga total hay en el callejón sin mover los camiones físicamente
 (solo consultando la estructura).
Reto: Implementa un método que recorra la pila (sin destruirla permanentemente, o reconstruyéndola) y calcule la
 suma total de cargaToneladas de todos los camiones estacionados. */

public class Supervisor {
    private Camion tope;
    private int tamanio;

    public Supervisor() {
        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void push(Camion nuevo) {
        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public Camion pop() {
        if (estaVacia()) {
            return null;
        }
        Camion aux = tope;
        tope = tope.siguiente;
        tamanio--;
        aux.siguiente = null; 
        return aux;
    }

    public Camion peek() {
        return tope;
    }

    public void imprimir() {
        if (estaVacia()) {
            System.out.println("Pila vacía.");
            return;
        }
        Camion actual = tope;
        System.out.println("=== ESTADO DEL MUELLE (De Tope a Base) ===");
        while (actual != null) {
            if (actual == tope) {
                System.out.print("  TOPE -> ");
            } else {
                System.out.print("          ");
            }
            System.out.println(actual.toString());
            actual = actual.siguiente;
        }
        System.out.println("===========================================");
    }
    public double CalcularCargaToneladas() {

        double peso = 0;
        Camion actual = tope;
        while (actual != null) {
            peso = peso + actual.cargaToneladas;
            actual = actual.siguiente;
        }
        return peso;
    }
}
