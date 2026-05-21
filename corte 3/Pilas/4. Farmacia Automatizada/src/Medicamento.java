/*La Clase Medicamento (Nodo): Debe contener nombre (String), lote (String) y diasParaVencer (int). */
public class Medicamento {
    String nombre;
    String lote;
    int diasParaVencer;
    Medicamento siguiente;

    public Medicamento(String nombre, String lote, int diasParaVencer) {
        this.nombre = nombre;
        this.lote = lote;
        this.diasParaVencer = diasParaVencer;
        this.siguiente = null;
    }

    @Override
    public String toString() {
        return "[" + nombre + " | " + lote + " | " + diasParaVencer + "]";
    }
}
