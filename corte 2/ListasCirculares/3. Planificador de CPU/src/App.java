/*Los sistemas operativos usan el algoritmo Round Robin para repartir el tiempo del procesador 
entre varios procesos de forma justa: cada proceso recibe un pequeño intervalo de tiempo 
llamado quantum. Si no termina, espera su siguiente turno.

La Clase Proceso (Nodo): Debe contener nombre (String), pid (int), tiempoRestante (int) y 
prioridad (int - del 1 al 3).
El Problema: El planificador debe recorrer la lista circular en bucle. En cada turno, 
descuenta el quantum del tiempoRestante del proceso actual. Cuando tiempoRestante <= 0, el 
proceso termina y se elimina de la lista.
Reto: Implementa el método ejecutar(int quantum) que simule el planificador. Imprime en cada 
turno cuál proceso se está ejecutando, cuánto tiempo le queda y si terminó. El ciclo debe 
terminar cuando la lista quede vacía. Al final, imprime el orden en que terminaron los procesos.
 */
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Lista lista = new Lista();

        do {
            System.out.println("\n==============================================");
            System.out.println("   Procesos — Menú Principal");
            System.out.println("==============================================");
            System.out.println("1. Agregar Procesos");
            System.out.println("2. Mostrar Procesos");
            System.out.println("3. realizar ejecucion");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre: ");
                    String nombre = sc.next();

                    System.out.println("PID: ");
                    int pid = sc.nextInt();

                    System.out.println("Tiempo restante: ");
                    int tiempo = sc.nextInt();

                    System.out.println("Prioridad (1-3): ");
                    int prioridad = sc.nextInt();

                    lista.agregarProceso(new Proceso(nombre, pid, tiempo, prioridad));
                    break;

                case 2:
                    lista.mostrarProcesos();
                    break;

                case 3:
                    System.out.print("Quantum: ");
                    int q = sc.nextInt();
                    lista.ejecutar(q);
                    break;
            }

        } while (opcion != 0);

        sc.close();
    }
}
