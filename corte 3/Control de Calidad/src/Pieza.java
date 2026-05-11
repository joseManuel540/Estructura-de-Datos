/*La Clase Pieza (Nodo): Debe contener nombrePieza (String), numeroSerie (String) y esDefectuosa (boolean).
El Problema: Si el sensor detecta una pieza defectuosa, la línea de producción debe detenerse inmediatamente. */
public class Pieza {
    String nombrePieza;
    String numeroSerie;
    boolean esDefectuosa;
    Pieza siguiente;

    public Pieza(String nombrePieza, String numeroSerie, boolean esDefectuosa) {
        this.nombrePieza = nombrePieza;
        this.numeroSerie = numeroSerie;
        this.esDefectuosa = esDefectuosa;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "[" + nombrePieza + " | " + numeroSerie + " | " + esDefectuosa + "]";
    }
}
