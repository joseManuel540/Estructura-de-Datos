/*El Problema: Para la ronda de clasificación, el director fija un rango mínimo y máximo de ELO 
(por ejemplo, entre 1800 y 2200). Todos los jugadores en ese rango deben ser listados de menor a 
mayor ELO para armar los emparejamientos.
Reto: Implementa el método listarEnRango(int eloMin, int eloMax) que recorra el árbol e imprima los 
datos de todos los jugadores cuyo elo esté dentro del rango [eloMin, eloMax] en orden ascendente. 
Usa la propiedad del BST para podar: si el nodo actual es menor que eloMin, solo explora el 
subárbol derecho; si es mayor que eloMax, solo explora el izquierdo. */

public class ArbolJugadores {

    private Jugador raiz;

    public ArbolJugadores() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    private Jugador insertar(Jugador nodo, int elo, String nombreUsuario, String pais, int partidasJugadas) {

        if (nodo == null)
            return new Jugador(elo, nombreUsuario, pais, partidasJugadas);

        if (elo < nodo.elo)
            nodo.izquierdo = insertar(nodo.izquierdo, elo, nombreUsuario, pais, partidasJugadas);

        else if (elo > nodo.elo)
            nodo.derecho = insertar(nodo.derecho, elo, nombreUsuario, pais, partidasJugadas);

        else
            System.out.println("Ya existe un jugador con ese ELO.");

        return nodo;
    }

    public void insertar(int elo, String nombreUsuario, String pais, int partidasJugadas) {

        raiz = insertar(raiz, elo, nombreUsuario, pais, partidasJugadas);
    }

    private void inOrden(Jugador nodo) {

        if (nodo != null) {
            inOrden(nodo.izquierdo);
            System.out.println("  " + nodo);
            inOrden(nodo.derecho);
        }
    }

    public void inOrden() {

        if (isEmpty()) {
            System.out.println("  [ Árbol vacío ]");
            return;
        }
        System.out.println("  Jugadores ordenados por ELO:");
        inOrden(raiz);
    }

    private void listarEnRango(Jugador nodo, int eloMin, int eloMax) {

        if (nodo == null)
            return;

        if (nodo.elo > eloMin)
            listarEnRango(nodo.izquierdo, eloMin, eloMax);

        if (nodo.elo >= eloMin && nodo.elo <= eloMax)
            System.out.println("  " + nodo);

        if (nodo.elo < eloMax)
            listarEnRango(nodo.derecho, eloMin, eloMax);
    }

    public void listarEnRango(int eloMin, int eloMax) {

        if (isEmpty()) {
            System.out.println("  [ Árbol vacío ]");
            return;
        }
        listarEnRango(raiz, eloMin, eloMax);
    }
}
