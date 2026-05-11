/*Un centro de logística urbana tiene un muelle de carga ubicado al final de un callejón muy estrecho. Los camiones
 de reparto entran uno tras otro y quedan "atrapados" en el orden de llegada. El último camión en entrar debe ser
  obligatoriamente el primero en salir para permitir que los demás se retiren.

La Clase Camion (Nodo): Debe contener placa (String), conductor (String) y cargaToneladas (double).
El Problema: El supervisor necesita saber cuánta carga total hay en el callejón sin mover los camiones físicamente
 (solo consultando la estructura).
Reto: Implementa un método que recorra la pila (sin destruirla permanentemente, o reconstruyéndola) y calcule la
 suma total de cargaToneladas de todos los camiones estacionados. */

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Supervisor lista = new Supervisor();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n--- SISTEMA DE GESTIÓN DE LOGISTICA (PILAS) ---");
            System.out.println("1. Ver camiones en el muelle");
            System.out.println("2. Registrar nuevo camion (Push)");
            System.out.println("3. Retirar camion del tope (Pop)");
            System.out.println("4. Carga en toneladas total de los camiones");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("\nEstado actual de la pila:");
                    lista.imprimir();
                    break;
                case 2:
                    System.out.print("Placa: "); String p = scanner.nextLine();
                    System.out.print("Conductor: "); String c = scanner.nextLine();
                    System.out.print("Peso (t): "); double peso = scanner.nextDouble();
                    scanner.nextLine();
                    lista.push(new Camion(p, c, peso));
                    System.out.println("Camion apilado correctamente.");
                    break;
                case 3:
                    Camion retirado = lista.pop();
                    if (retirado != null) {
                        System.out.println("Se ha retirado: " + retirado);
                    } else {
                        System.out.println("El muelle está vacío.");
                    }
                    break;
                case 4:
                    System.out.println("La carga total en toneladas es de: " + lista.CalcularCargaToneladas());
                    break;
                case 5:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}
