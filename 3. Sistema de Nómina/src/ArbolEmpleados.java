/*El Problema: El sistema debe poder ubicar al empleado con la cédula más baja (el más antiguo en el 
registro) y al de cédula más alta (el más reciente), y también reportar la altura actual del árbol 
para verificar que las búsquedas siguen siendo eficientes.
Reto: Implementa buscarMinimo() y buscarMaximo(), que recorran el BST siguiendo siempre el subárbol 
izquierdo o derecho respectivamente hasta llegar a una hoja e impriman los datos del empleado 
encontrado. Implementa también reporteEficiencia() que imprima la altura actual del árbol y el 
número total de hojas (contarHojas()). */
public class ArbolEmpleados {

    private Empleado raiz;

    public ArbolEmpleados() {
        this.raiz = null;
    }

    public boolean isEmpty() {
        return raiz == null;
    }

    private Empleado insertar(Empleado nodo, long cedula, String nombreCompleto, String cargo, double salario) {

        if (nodo == null)
            return new Empleado(cedula, nombreCompleto, cargo, salario);

        if (cedula < nodo.cedula)
            nodo.izquierdo = insertar(nodo.izquierdo, cedula, nombreCompleto, cargo, salario);

        else if (cedula > nodo.cedula)
            nodo.derecho = insertar(nodo.derecho, cedula, nombreCompleto, cargo, salario);

        else
            System.out.println("Ya existe un empleado con esa cédula.");

        return nodo;
    }

    public void insertar(long cedula, String nombreCompleto, String cargo, double salario) {

        raiz = insertar(raiz, cedula, nombreCompleto, cargo, salario);
    }

    private void inOrden(Empleado nodo) {

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
        System.out.println("  Empleados ordenados por cédula:");
        inOrden(raiz);
    }

    private Empleado buscarMinimo(Empleado nodo) {
        if (nodo == null)
            return null;

        while (nodo.izquierdo != null)
            nodo = nodo.izquierdo;
        return nodo;
    }

    public Empleado buscarMinimo() {
        return buscarMinimo(raiz);
    }

    private Empleado buscarMaximo(Empleado nodo) {

        if (nodo == null)
            return null;

        while (nodo.derecho != null)
            nodo = nodo.derecho;
        return nodo;
    }

    public Empleado buscarMaximo() {
        return buscarMaximo(raiz);
    }

    private int altura(Empleado nodo) {
        if (nodo == null)
            return -1;

        return 1 + Math.max(altura(nodo.izquierdo), altura(nodo.derecho));
    }

    public int altura() {
        return altura(raiz);
    }

    private int contarHojas(Empleado nodo) {
        if (nodo == null)
            return 0;

        if (nodo.izquierdo == null && nodo.derecho == null)
            return 1;
        return contarHojas(nodo.izquierdo) + contarHojas(nodo.derecho);
    }

    public int contarHojas() {
        return contarHojas(raiz);
    }

    public void reporteEficiencia() {
        System.out.println("\n--- REPORTE DE EFICIENCIA ---");
        System.out.println("Altura actual del árbol: " + altura());
        System.out.println("Número total de hojas: " + contarHojas());
    }
}
