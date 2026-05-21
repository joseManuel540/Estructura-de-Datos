/*El Problema: Para salir de la cueva, el equipo debe seguir las estaciones en el orden inverso al que fueron
colocadas (de la más profunda a la entrada).
Reto: Implementa el método retrocederASuperficie(). Este debe mostrar el nombre de cada estación a medida
que se desapila. Importante: Si en alguna estación el nivelOxigeno es inferior al 18%, el sistema debe imprimir
una alerta de "Uso de Tanque de Emergencia Requerido" al pasar por ese punto. */

public class Rescatistas {
    private Estacion tope;
    private int tamanio;

    public Rescatistas() {
        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void push(Estacion nuevo) {
        nuevo.siguiente = tope;
        tope = nuevo;
        tamanio++;
    }

    public Estacion pop() {
        if (estaVacia()) {
            return null;
        }
        Estacion aux = tope;
        tope = tope.siguiente;
        tamanio--;
        aux.siguiente = null; 
        return aux;
    }

    public Estacion peek() {
        return tope;
    }

    public void imprimir() {
        if (estaVacia()) {
            System.out.println("Pila vacía.");
            return;
        }
        Estacion actual = tope;
        System.out.println("=== ESTADO DE LAS BALIZAS ===");
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

    public void retrocederASuperficie(){
        if (estaVacia()) {
            System.out.println("Pila vacía.");
            return;
        }
        Estacion actual = tope;
        System.out.println("=== RETROCEDIENDO A SUPERFICIE ===");
        while (actual != null) {
            if (actual.nivelOxigeno < 0.18) {
                System.out.println("Nivel de oxigeno bajo");
            }
            System.out.print("          ");
            System.out.println(actual.toString());
            actual = actual.siguiente;
            pop();
        }
        System.out.println("===========================================");   
    }
}
