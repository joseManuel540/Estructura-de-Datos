/*La Clase Camion (Nodo): Debe contener placa (String), conductor (String) y cargaToneladas (double).
El Problema: El supervisor necesita saber cuánta carga total hay en el callejón sin mover los camiones físicamente
 (solo consultando la estructura). */
public class Camion {
    String placa;
    String conductor;
    double cargaToneladas;
    Camion siguiente;

    public Camion(String placa, String conductor, double cargaToneladas) {
        this.placa = placa;
        this.conductor = conductor;
        this.cargaToneladas = cargaToneladas;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "[" + placa + " | " + conductor + " | " + cargaToneladas + "]";
    }
}
