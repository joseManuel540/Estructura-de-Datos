public class Lista {
    Vuelo cabeza;

    public Lista(){
        this.cabeza = null;
    }

    public void agregarVuelo(Vuelo nuevo) {
        if (nuevo.combustibleRestante < 10) {
            nuevo.siguiente = cabeza;
            cabeza = nuevo;
            System.out.println("Vuelo agregado con prioridad por poco combustible.");
        } 
        else {
            if (cabeza == null) {
                cabeza = nuevo;
            } else {
                Vuelo actual = cabeza;
                while (actual.siguiente != null) {
                    actual = actual.siguiente;
                }
                actual.siguiente = nuevo;
            }
        }
    }

    public void reportarEmergencia(String numeroVuelo) {
        if (cabeza == null) {
            System.out.println("No hay vuelos en la cola.");
            return;
        }
        Vuelo actual = cabeza;
        Vuelo anterior = null;

        while (actual != null) {
            if (actual.numeroVuelo.equals(numeroVuelo)) {
                if (anterior == null) {
                    System.out.println("El vuelo ya está en prioridad.");
                    return;
                }
                anterior.siguiente = actual.siguiente;
                actual.siguiente = cabeza;
                cabeza = actual;
                System.out.println("Vuelo " + numeroVuelo + " movido a prioridad.");
                return;
            }
            anterior = actual;
            actual = actual.siguiente;
        }
        System.out.println("Vuelo no encontrado.");
    }

    public void mostrarCola() {
        if (cabeza == null) {
            System.out.println("No hay vuelos.");
            return;
        }
        Vuelo actual = cabeza;
        while (actual != null) {
            System.out.println("Vuelo: " + actual.numeroVuelo + " | Aerolínea: " + actual.aerolinea + " | Combustible: " + actual.combustibleRestante + " | Pasajeros: " + actual.pasajeros);
            actual = actual.siguiente;
        }
    }
}
