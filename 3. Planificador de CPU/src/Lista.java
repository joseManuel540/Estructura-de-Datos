/*El Problema: El planificador debe recorrer la lista circular en bucle. En cada turno, 
descuenta el quantum del tiempoRestante del proceso actual. Cuando tiempoRestante <= 0, el 
proceso termina y se elimina de la lista.
Reto: Implementa el método ejecutar(int quantum) que simule el planificador. Imprime en cada 
turno cuál proceso se está ejecutando, cuánto tiempo le queda y si terminó. El ciclo debe 
terminar cuando la lista quede vacía. Al final, imprime el orden en que terminaron los procesos.*/
public class Lista {
    Proceso cabeza;
    Proceso cola;

    public Lista(){
        cabeza = null;
        cola = null;
    }

    public void agregarProceso(Proceso p){
        if (cabeza == null) {
            cabeza = p;
            cola = p;
            p.siguiente = cabeza; 
        } else {
            cola.siguiente = p; 
            p.siguiente = cabeza; 
            cola = p; 
        }
    }


    public void ejecutar(int quantum){
        if (cabeza == null) {
            System.out.println("No hay procesos.");
            return;
        }
        Proceso actual = cabeza;
        String ordenEliminados = "";

        while (cabeza != null) {

            System.out.println("\nEjecutando: " + actual.nombre);

            actual.tiempoRestante -= quantum;

            if (actual.tiempoRestante > 0) {
                System.out.println("Le quedan: " + actual.tiempoRestante);
                actual = actual.siguiente;
            } else {
                System.out.println("Proceso terminado: " + actual.nombre);

                ordenEliminados += actual.nombre + ", ";

                Proceso siguiente = actual.siguiente;
                eliminarProceso(actual);
                actual = siguiente;

                if (cabeza == null) 
                    break;
            }
        }

        System.out.println("\nOrden de eliminacion:");
        System.out.println(ordenEliminados);
    }

    public void mostrarProcesos(){
        if (cabeza == null) {
      System.out.println("No hay procesos registrados.");
      return;
    }
    Proceso actual = cabeza;
    do {
      System.out.println("Nombre: " + actual.nombre + ", pid: " + actual.pid + ", Tiempo restante: " + actual.tiempoRestante + ", Prioridad: " + actual.prioridad);
      actual = actual.siguiente;
    } while (actual != cabeza);
    }


    private void eliminarProceso(Proceso p) {
    if (cabeza == null || p == null) {
      return;
    }

    if (cabeza == p && cabeza == cola) {
        cabeza = null;
        cola = null;
    } else if (cabeza == p) {
      cabeza = cabeza.siguiente;
      cola.siguiente = cabeza;
    } else {
      Proceso actual = cabeza;
      while (actual.siguiente != p) {
        actual = actual.siguiente;
      }
      actual.siguiente = p.siguiente;
      if (cola == p) {
        cola = actual;
      }
    }
  }
}
