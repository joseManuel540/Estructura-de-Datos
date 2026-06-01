/*El Problema: El administrador necesita dos reportes: el primero lista todos los repuestos en 
PreOrden (para poder reconstruir el árbol en otro sistema con el mismo orden de inserción), y el 
segundo informa cuántos repuestos son hojas del árbol (sin variantes relacionadas).
Reto: Implementa backupPreOrden() que imprima todos los repuestos en recorrido PreOrden con el 
formato [codigoRef] descripcion - marca (stock uds). Implementa también reporteRepuestosUnicos() 
que use contarHojas() e imprima un mensaje indicando cuántos repuestos no tienen variantes 
relacionadas en el catálogo. */
public class ArbolRepuestos {

    private Repuesto raiz;

    public ArbolRepuestos() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    private Repuesto insertar(Repuesto nodo, int codigoRef, String descripcion, String marca, int stock) {

        if (nodo == null)
            return new Repuesto(codigoRef, descripcion, marca, stock);

        if (codigoRef < nodo.codigoRef)
            nodo.izquierdo = insertar(nodo.izquierdo, codigoRef, descripcion, marca, stock);

        else if (codigoRef > nodo.codigoRef)
            nodo.derecho = insertar(nodo.derecho, codigoRef, descripcion, marca, stock);

        else
            System.out.println("Ya existe un repuesto con ese código.");

        return nodo;
    }

    public void insertar(int codigoRef, String descripcion, String marca, int stock) {

        raiz = insertar(raiz, codigoRef, descripcion, marca, stock);
    }

    private void preOrden(Repuesto nodo) {

        if (nodo != null) {
            System.out.println("  " + nodo);
            preOrden(nodo.izquierdo);
            preOrden(nodo.derecho);
        }
    }

    public void backupPreOrden() {

        if (isEmpty()) {
            System.out.println("  [ Árbol vacío ]");
            return;
        }
        System.out.println("  Backup PreOrden del inventario:");
        preOrden(raiz);
    }

    private int contarHojas(Repuesto nodo) {
        if (nodo == null)
            return 0;

        if (nodo.izquierdo == null && nodo.derecho == null)
            return 1;

        return contarHojas(nodo.izquierdo) + contarHojas(nodo.derecho);
    }

    public int contarHojas() {
        return contarHojas(raiz);
    }

    public void reporteRepuestosUnicos() {

        int hojas = contarHojas();

        System.out.println("\nCantidad de repuestos sin variantes relacionadas: " + hojas);
    }
}
