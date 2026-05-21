/*El Problema: Por norma de seguridad, no se puede despachar un medicamento si le quedan menos de 10 días para vencer.
Reto: Implementa un método validarDespacho() que revise el medicamento en el tope. Si está a punto de vencer,
debe ser retirado automáticamente y el sistema debe revisar el siguiente. El proceso se repite hasta que el tope
 sea un medicamento seguro o la pila quede vacía. */
public class Farmacia {
    private Medicamento tope;
    private int tamanio;

    public Farmacia() {
        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void push(Medicamento nuevo) {
        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public Medicamento pop() {
        if (estaVacia()) {
            return null;
        }
        Medicamento aux = tope;
        tope = tope.siguiente;
        tamanio--;
        aux.siguiente = null; 
        return aux;
    }

    public Medicamento peek() {
        return tope;
    }

    public void imprimir() {
        if (estaVacia()) {
            System.out.println("Pila vacía.");
            return;
        }
        Medicamento actual = tope;
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
    public void validarDespacho() {

        if (estaVacia()) {
        System.out.println("La pila está vacía");
        return;
        }

        while (peek().diasParaVencer < 10) {
            Medicamento eliminada = pop();
            System.out.println("Medicamento casi vencido retirado: " + eliminada.nombre); 
        }
        if (!estaVacia()) {
            System.out.println("Se encontró un medicamento seguro: " + peek().nombre);
        }
    }
}
