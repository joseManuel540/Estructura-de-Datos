/*Los terminales guardan un historial de comandos. Al presionar flecha arriba el usuario retrocede al comando 
anterior; flecha abajo avanza al más reciente. El historial es circular: después del más antiguo vuelve al más nuevo.

La Clase Comando (Nodo): Debe contener texto (String), exitoso (boolean — si ejecutó sin errores) y directorio 
(String — el path desde donde se ejecutó).
El Problema: El historial mantiene un puntero cursor al comando que se está consultando. Navegar con "arriba" 
mueve el cursor al anterior (anterior); "abajo" lo mueve al siguiente (siguiente). El usuario puede eliminar el 
comando actual (para borrar contraseñas escritas por error), y el cursor pasa automáticamente al siguiente.
Reto: Implementa los métodos arriba(), abajo(), mostrarCursor() y eliminarActual(). Simula: agrega 5 comandos, 
navega 3 veces hacia arriba, elimina el comando actual, navega una vez hacia abajo y muestra el historial completo 
con el cursor marcado. */

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int opcion;
        Historial historial = new Historial();

        do {
            System.out.println("\n==============================================");
            System.out.println(" Terminal  — Menú Principal");
            System.out.println("==============================================");
            System.out.println("  [1] Agregar comando");
            System.out.println("  [2] Navegar hacia arriba");
            System.out.println("  [3] Navegar hacia abajo");
            System.out.println("  [4] Eliminar comando actual");
            System.out.println("  [5] Mostrar cursor actual");
            System.out.println("  [6] mostrar historial completo");
            System.out.println();
            System.out.println("  [0] Salir");
            System.out.println("==============================================");
            System.out.print("Elige una opción: ");

            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el texto: ");
                    String t = sc.nextLine();
                    System.out.println("Ingrese el direcotrio: ");
                    String d = sc.nextLine();
                    historial.agregarComando(t,d);
                    break;

                case 2:
                    historial.arriba();
                    break;

                case 3:
                    historial.abajo();
                    break;

                case 4:
                    historial.eliminarActual();
                    break;

                case 5:
                    historial.mostrarCursor();
                    break;

                case 6:
                    historial.mostrarHistorial();

                case 0:
                    System.out.println("¡Saliendo del módulo de Listas Dobles Circulares!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 0);

        sc.close();
    }
}
