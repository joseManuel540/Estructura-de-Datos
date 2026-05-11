/*El Problema: Si el sensor detecta una pieza defectuosa, la línea de producción debe detenerse inmediatamente.
Reto: Crea un método limpiarHastaDefecto() que extraiga (pop) todas las piezas de la pila hasta encontrar la
 primera que tenga esDefectuosa = true. El método debe imprimir el nombre de todas las piezas "buenas" que
  tuvieron que ser retiradas y descartadas antes de llegar a la pieza fallida. */
public class Sensor {
    private Pieza tope;
    private int tamanio;

    public Sensor() {
        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void push(Pieza nuevo) {
        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public Pieza pop() {
        if (estaVacia()) {
            return null;
        }
        Pieza aux = tope;
        tope = tope.siguiente;
        tamanio--;
        aux.siguiente = null;
        return aux;
    }

    public Pieza peek() {
        return tope;
    }

    public void imprimir() {
        if (estaVacia()) {
            System.out.println("Pila vacía.");
            return;
        }
        Pieza actual = tope;
        System.out.println("=== LINEA DE ENSAMBLAJE (De Tope a Base) ===");
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

    public void limpiarHastaDefectuoso() {
        if (estaVacia()) {
        System.out.println("La pila está vacía");
        return;
        }
        while (!estaVacia() && !peek().esDefectuosa) {
        Pieza eliminada = pop();
        System.out.println("Pieza buena retirada: " + eliminada.nombrePieza);
        }
        if (!estaVacia()) {
            System.out.println(
                "Se encontró una pieza defectuosa: " + peek().nombrePieza);
        }
    }
} 

