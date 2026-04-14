/*La Clase Proceso (Nodo): Debe contener nombre (String), pid (int), tiempoRestante (int) y 
prioridad (int - del 1 al 3). */
public class Proceso {
    String nombre;
    int pid;
    int tiempoRestante;
    int prioridad;
    Proceso siguiente;

    public Proceso(String nombre, int pid, int tiempoRestante, int prioridad){
        this.nombre = nombre;
        this.pid = pid;
        this.tiempoRestante = tiempoRestante;
        this.prioridad = prioridad;
    }
}
